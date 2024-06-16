
package Database;

/**
 *
 * @author jflg2
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dba {
    
    private String host;
    private String dbName;
    private String user;
    private String password;
    private String port;

    public Connection conexion;
    public Statement query;
    
    public Dba() {
    }
    
    public Dba(String host, String dbName, String user, String password, String port) {
        this.host = host;
        this.dbName = dbName;
        this.user = user;
        this.password = password;
        this.port = port;
    }

    public String getDbName() {
        return dbName;
    }

    public String getPort() {
        return port;
    }
    
    public void conectar(){
        try {
            if(port.equals("1433")){ // SQL SERVER
                String url = "jdbc:sqlserver://" + this.host + ":" + this.port + 
                            ";databaseName=" + this.dbName + 
                            ";user=" + this.user + ";password=" + this.password + ";encrypt=true;trustServerCertificate=true;loginTimeout=30";
                conexion = DriverManager.getConnection(url);
            } else{ // POSTGRESQL
                String url = "jdbc:postgresql://"+ this.host +":" + this.port + "/" + this.dbName;
                conexion = DriverManager.getConnection(url, this.user, this.password);
            }
            query = conexion.createStatement();
            //System.out.println("Conexion exitosa!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void desconectar(){
        try{
            query.close();
            conexion.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
