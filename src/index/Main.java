
package index;

import Database.Dba;
import javax.swing.DefaultListModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jflg2
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        jl_tablas_destino.setModel(new DefaultListModel<>());
        jl_tablas_origen.setModel(new DefaultListModel<>());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tp_main = new javax.swing.JTabbedPane();
        panel_configuracion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pf_password_origen = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        tf_usuario_origen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_puerto_origen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre_bd_origen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_instancia_origen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_instancia_destino = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_nombre_bd_destino = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_puerto_destino = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_usuario_destino = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pf_password_destino = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        bt_probar_conexion_bd_origen = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bt_probar_conexion_bd_destino = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bt_guardar_config = new javax.swing.JButton();
        panel_replicacion = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_tablas_origen = new javax.swing.JList<>();
        jb_mover_a_replicar = new javax.swing.JButton();
        jb_mover_a_sin_replicar = new javax.swing.JButton();
        jb_ejecutar_replicacion = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_tablas_destino = new javax.swing.JList<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tp_main.setBackground(new java.awt.Color(255, 255, 255));
        tp_main.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tp_mainStateChanged(evt);
            }
        });

        panel_configuracion.setBackground(new java.awt.Color(153, 204, 0));
        panel_configuracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("British Shorthair", 1, 65)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Bases de Datos");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(430, 10, 440, 100);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Neo Sans Std", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Configuración de");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 20, 386, 58);

        jLabel7.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel7.setText("Password");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(46, 301, 51, 16);

        pf_password_origen.setText("admin123");
        jPanel2.add(pf_password_origen);
        pf_password_origen.setBounds(166, 301, 180, 20);

        jLabel6.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel6.setText("Nombre usuario");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(46, 261, 82, 16);

        tf_usuario_origen.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_usuario_origen.setText("sa");
        jPanel2.add(tf_usuario_origen);
        tf_usuario_origen.setBounds(166, 261, 180, 20);

        jLabel5.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel5.setText("Puerto");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(46, 221, 36, 16);

        tf_puerto_origen.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_puerto_origen.setText("1433");
        jPanel2.add(tf_puerto_origen);
        tf_puerto_origen.setBounds(166, 221, 180, 20);

        jLabel4.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel4.setText("Nombre Base Datos");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(46, 181, 103, 16);

        tf_nombre_bd_origen.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_nombre_bd_origen.setText("TestFinal");
        jPanel2.add(tf_nombre_bd_origen);
        tf_nombre_bd_origen.setBounds(166, 181, 180, 20);

        jLabel3.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel3.setText("Nombre Instancia");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(46, 141, 91, 16);

        tf_instancia_origen.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_instancia_origen.setText("localhost");
        jPanel2.add(tf_instancia_origen);
        tf_instancia_origen.setBounds(166, 141, 180, 20);

        jLabel1.setFont(new java.awt.Font("Neo Sans Std", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BASE DE DATOS DE ORIGEN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(46, 101, 310, 30);

        jLabel9.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel9.setText("Nombre Instancia");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(582, 148, 91, 16);

        tf_instancia_destino.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_instancia_destino.setText("localhost");
        jPanel2.add(tf_instancia_destino);
        tf_instancia_destino.setBounds(692, 148, 180, 20);

        jLabel10.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel10.setText("Nombre Base Datos");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(582, 188, 103, 16);

        tf_nombre_bd_destino.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_nombre_bd_destino.setText("TestDB");
        jPanel2.add(tf_nombre_bd_destino);
        tf_nombre_bd_destino.setBounds(692, 188, 180, 20);

        jLabel11.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel11.setText("Puerto");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(582, 228, 36, 16);

        tf_puerto_destino.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_puerto_destino.setText("5432");
        jPanel2.add(tf_puerto_destino);
        tf_puerto_destino.setBounds(692, 228, 180, 20);

        jLabel12.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel12.setText("Nombre usuario");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(582, 268, 82, 16);

        tf_usuario_destino.setFont(new java.awt.Font("Neo Sans Std Light", 0, 12)); // NOI18N
        tf_usuario_destino.setText("postgres");
        jPanel2.add(tf_usuario_destino);
        tf_usuario_destino.setBounds(692, 268, 180, 20);

        jLabel13.setFont(new java.awt.Font("Neo Sans Std", 0, 12)); // NOI18N
        jLabel13.setText("Password");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(582, 308, 51, 16);

        pf_password_destino.setText("z3WZzaWq0O2E68L");
        jPanel2.add(pf_password_destino);
        pf_password_destino.setBounds(692, 308, 180, 20);

        bt_probar_conexion_bd_origen.setFont(new java.awt.Font("Neo Sans Std", 1, 14)); // NOI18N
        bt_probar_conexion_bd_origen.setText("Probar");
        bt_probar_conexion_bd_origen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_probar_conexion_bd_origen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bt_probar_conexion_bd_origen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_probar_conexion_bd_origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_probar_conexion_bd_origenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(bt_probar_conexion_bd_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(bt_probar_conexion_bd_origen)
                .addGap(17, 17, 17))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 90, 340, 300);

        bt_probar_conexion_bd_destino.setFont(new java.awt.Font("Neo Sans Std", 1, 14)); // NOI18N
        bt_probar_conexion_bd_destino.setText("Probar");
        bt_probar_conexion_bd_destino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_probar_conexion_bd_destino.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bt_probar_conexion_bd_destino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_probar_conexion_bd_destino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_probar_conexion_bd_destinoMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Neo Sans Std", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BASE DE DATOS DE DESTINO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(bt_probar_conexion_bd_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(bt_probar_conexion_bd_destino)
                .addGap(25, 25, 25))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(570, 90, 340, 310);

        bt_guardar_config.setFont(new java.awt.Font("Neo Sans Std", 1, 24)); // NOI18N
        bt_guardar_config.setText("GUARDAR");
        bt_guardar_config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_guardar_config.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bt_guardar_config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardar_configMouseClicked(evt);
            }
        });
        jPanel2.add(bt_guardar_config);
        bt_guardar_config.setBounds(380, 360, 170, 50);

        panel_configuracion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 420));

        tp_main.addTab("Configuración", panel_configuracion);

        panel_replicacion.setBackground(new java.awt.Color(255, 255, 255));
        panel_replicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Sin Replicar");
        panel_replicacion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Replicando");
        panel_replicacion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jScrollPane2.setViewportView(jl_tablas_origen);

        panel_replicacion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 212, 233));

        jb_mover_a_replicar.setText(">>");
        jb_mover_a_replicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_mover_a_replicarMouseClicked(evt);
            }
        });
        panel_replicacion.add(jb_mover_a_replicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 155, -1, 33));

        jb_mover_a_sin_replicar.setText("<<");
        jb_mover_a_sin_replicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_mover_a_sin_replicarMouseClicked(evt);
            }
        });
        panel_replicacion.add(jb_mover_a_sin_replicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 206, -1, 37));

        jb_ejecutar_replicacion.setText("Guardar");
        jb_ejecutar_replicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ejecutar_replicacionMouseClicked(evt);
            }
        });
        panel_replicacion.add(jb_ejecutar_replicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 39));

        jButton4.setText("Cancelar");
        panel_replicacion.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 39));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Tablas BD Origen");
        panel_replicacion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jScrollPane3.setViewportView(jl_tablas_destino);

        panel_replicacion.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 210, 230));

        tp_main.addTab("Replicación", panel_replicacion);

        getContentPane().add(tp_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_probar_conexion_bd_origenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_probar_conexion_bd_origenMouseClicked
        // Probar conexion origen
        String host = tf_instancia_origen.getText();
        String dbName = tf_nombre_bd_origen.getText();
        String port = tf_puerto_origen.getText();
        String user = tf_usuario_origen.getText();
        String password = pf_password_origen.getText();
        
        //Limpiar listas
        jl_tablas_origen.setModel(new DefaultListModel<>());
        DefaultListModel modeloOrigen = (DefaultListModel) jl_tablas_origen.getModel();
        
        //conexion origen
        try {
        origen = new Dba(host, dbName, user, password, port);
        
            origen.conectar();
            if(origen.getPort().equals("1433")){
                origen.query.execute("SELECT TABLE_NAME FROM "  + origen.getDbName() + ".INFORMATION_SCHEMA.TABLES"
                    + " WHERE TABLE_TYPE = 'BASE TABLE'");
                ResultSet rs = origen.query.getResultSet();
                String table_name;
                while(rs.next()){
                    table_name = rs.getString(1);
                    if(!table_name.equals("Bitacora") && !table_name.equals("TablasReplicar")){
                        modeloOrigen.addElement(table_name);
                    }
                }
                jl_tablas_origen.setModel(modeloOrigen);
            } else{
                // POSTRESQL
                origen.query.execute("SELECT tablename FROM pg_tables WHERE schemaname = 'public'");
                ResultSet rs = origen.query.getResultSet();
                String table_name;
                while(rs.next()){
                    table_name = rs.getString(1);
                    if(!table_name.equals("Bitacora") && !table_name.equals("TablasReplicar")){
                        modeloOrigen.addElement(table_name);
                    }
                }
                jl_tablas_origen.setModel(modeloOrigen);
            }
            boolean flag = hasBitacora();
            createBitacoraIfNotExists(flag);
            JOptionPane.showMessageDialog(this, "Conexión exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error!");
            e.printStackTrace();
        }
        origen.desconectar();
    }//GEN-LAST:event_bt_probar_conexion_bd_origenMouseClicked

    private void tp_mainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tp_mainStateChanged
        int tab = tp_main.getSelectedIndex();
        if(tab==1){
            if(origen != null && destino != null){
                //validar existencia de triggers y crearlos si no existen
                //validar que existe bitacora y si no crearla
                try {
                    origen.conectar();
                    DefaultListModel modelo = (DefaultListModel) jl_tablas_origen.getModel();
                    if(origen.getPort().equals("1433")){
                        for (int i = 0; i < modelo.getSize(); i++) {
                            String tableName = modelo.getElementAt(i).toString();
                            if(verifyTriggers(tableName)){
                                createTriggersSQLServer(tableName);
                            }
                        }
                    } else{
                        for (int i = 0; i < modelo.getSize(); i++) {
                            String tableName = modelo.getElementAt(i).toString();
                            if(verifyTriggers(tableName)){
                                createTriggersPOSTRESQL(tableName);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
            
            
                try {
                    destino.conectar();
            
                    //Drop tables if necesary
                    //////////////////
                    DefaultListModel m = (DefaultListModel) jl_tablas_destino.getModel();
                    DefaultListModel m2 = (DefaultListModel) jl_tablas_origen.getModel();
                    ArrayList<String> names = new ArrayList<>();
                    names_delete = new ArrayList<>();
                    for (int i = 0; i < m.getSize(); i++) {
                        if(!m2.contains(m.getElementAt(i))){
                            names.add(m.getElementAt(i).toString());
                        }
                    }
                    names_delete=names;
                    for (String p : names) {
                        m.removeElement(p);
                    }
                    jl_tablas_destino.setModel(m);
                    
                    ///////////////////
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                /////Comparar tablas
                ArrayList<String> tablas_iguales = new ArrayList<>();
                DefaultListModel mod1 = (DefaultListModel) jl_tablas_origen.getModel();
                DefaultListModel mod2 = (DefaultListModel) jl_tablas_destino.getModel();
                for (int i = 0; i < mod1.getSize(); i++) {
                    if(mod2.contains(mod1.getElementAt(i))){
                        tablas_iguales.add(mod1.getElementAt(i).toString());
                    }
                }
                
                //System.out.println(tablas_iguales);
                for (String s : tablas_iguales) {
                    if(!comparar_tablas(s)){
                        names_delete.add(s);
                        mod2.removeElement(s);
                    }
                }
                jl_tablas_destino.setModel(mod2);
                ///////////////////
                
                origen.desconectar();
                destino.desconectar();
            } else{
                JOptionPane.showMessageDialog(this, "Debe probar la conexiones!");
                tp_main.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tp_mainStateChanged

    private void bt_probar_conexion_bd_destinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_probar_conexion_bd_destinoMouseClicked
        String host = tf_instancia_destino.getText();
        String dbName = tf_nombre_bd_destino.getText();
        String port = tf_puerto_destino.getText();
        String user = tf_usuario_destino.getText();
        String password = pf_password_destino.getText();
        
        //Limpiar lista
        jl_tablas_destino.setModel(new DefaultListModel<>());
        DefaultListModel modeloDestino = (DefaultListModel) jl_tablas_destino.getModel();
        
        //conexion destino
        destino = new Dba(host, dbName, user, password, port);
        try {
            destino.conectar();
            if(destino.getPort().equals("1433")){
                destino.query.execute("SELECT TABLE_NAME FROM "  + destino.getDbName() + ".INFORMATION_SCHEMA.TABLES"
                    + " WHERE TABLE_TYPE = 'BASE TABLE'");
                ResultSet rs = destino.query.getResultSet();
                String table_name;
                while(rs.next()){
                    table_name = rs.getString(1);
                    if(!table_name.equals("Bitacora")){
                        modeloDestino.addElement(table_name);
                    }
                }
                jl_tablas_destino.setModel(modeloDestino);
            } else{
                destino.query.execute("SELECT tablename FROM pg_tables WHERE schemaname = 'public'");
                ResultSet rs = destino.query.getResultSet();
                String table_name;
                while(rs.next()){
                    table_name = rs.getString(1);
                    if(!table_name.equals("Bitacora") ){
                        modeloDestino.addElement(table_name);
                    }
                }
                jl_tablas_destino.setModel(modeloDestino);
            }
            JOptionPane.showMessageDialog(this, "Conexión exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error!");
            e.printStackTrace();
        }
        destino.desconectar();
    }//GEN-LAST:event_bt_probar_conexion_bd_destinoMouseClicked

    private void jb_mover_a_replicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_mover_a_replicarMouseClicked
        if(jl_tablas_origen.getSelectedIndex() != -1){
            ArrayList<String> tablas = (ArrayList<String>) jl_tablas_origen.getSelectedValuesList();
            if(!tablas.isEmpty()){
                DefaultListModel modeloOrigen = (DefaultListModel) jl_tablas_origen.getModel();
                DefaultListModel modeloDestino = (DefaultListModel) jl_tablas_destino.getModel();
                
                /////////////////////
                ArrayList<String> tables = new ArrayList<>();
                for (String t : tablas) {
                    if(modeloDestino.contains(t)){
                        tables.add(t);
                    }
                }
                
                for (String t : tables) {
                    tablas.remove(t);
                }
                /////////////////////////
                
                
                
                for (String t : tablas) {
                    modeloOrigen.removeElement(t);
                    modeloDestino.addElement(t);
                }
                jl_tablas_origen.setModel(modeloOrigen);
                jl_tablas_destino.setModel(modeloDestino);
            }
        }
    }//GEN-LAST:event_jb_mover_a_replicarMouseClicked

    private void jb_ejecutar_replicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ejecutar_replicacionMouseClicked
        destino.conectar();
            for (String p : names_delete) {
                dropTable(p);
            }
        destino.desconectar();
        
        if(jl_tablas_destino.getModel().getSize() > 0){
            
            
            DefaultListModel sin_fk = tablas_sin_fk();
            for (int i = 0; i < sin_fk.getSize(); i++) {
                String tableName = sin_fk.getElementAt(i).toString();
                if(origen.getPort().equals("1433")){
                    createTableIfNotExistsPostgre(tableName);
                }else{
                    createTableIfNotExistsSQLServer(tableName);
                }
            }
            
            DefaultListModel con_fk = tablas_con_fk();
            for (int i = 0; i < con_fk.getSize(); i++) {
                String tableName = con_fk.getElementAt(i).toString();
                if(origen.getPort().equals("1433")){
                    createTableWithFkPostgre(tableName);
                }else{
                    createTableWithFkSQLServer(tableName);
                }
            }
           
            DefaultListModel modelo = (DefaultListModel) jl_tablas_destino.getModel();
            for (int i = 0; i < modelo.getSize(); i++) {
                String tableName = modelo.getElementAt(i).toString();
                if(origen.getPort().equals("1433")){
                    replicarAPostgreSql(tableName);
                } else{
                    replicarASQLServer(tableName);
                }
            }
            
        }
//                    DefaultListModel sin_fk = tablas_sin_fk();
//                    DefaultListModel con_fk = tablas_con_fk();
//                    System.out.println(sin_fk);
//                    System.out.println(con_fk);
    }//GEN-LAST:event_jb_ejecutar_replicacionMouseClicked

    private void jb_mover_a_sin_replicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_mover_a_sin_replicarMouseClicked
        if(jl_tablas_destino.getSelectedIndex() != -1){
            ArrayList<String> tablas = (ArrayList<String>) jl_tablas_destino.getSelectedValuesList();
            if(!tablas.isEmpty()){
                DefaultListModel modeloOrigen = (DefaultListModel) jl_tablas_origen.getModel();
                DefaultListModel modeloDestino = (DefaultListModel) jl_tablas_destino.getModel();
                
                /////////////////////
                ArrayList<String> tables = new ArrayList<>();
                for (String t : tablas) {
                    if(modeloOrigen.contains(t)){
                        tables.add(t);
                    }
                }
                
                for (String t : tables) {
                    tablas.remove(t);
                }
                /////////////////////////
                
                for (String t : tablas) {
                    modeloDestino.removeElement(t);
                    modeloOrigen.addElement(t);
                }
                jl_tablas_origen.setModel(modeloOrigen);
                jl_tablas_destino.setModel(modeloDestino);
            }
        }
    }//GEN-LAST:event_jb_mover_a_sin_replicarMouseClicked

    private void bt_guardar_configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardar_configMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_guardar_configMouseClicked

    private boolean verifyTriggers(String tableName){
        origen.conectar();
        if(origen.getPort().equals("1433")){
            try {
                origen.query.execute("SELECT name AS TriggerName FROM sys.triggers WHERE parent_id = OBJECT_ID('" + tableName + "') AND"
                        + " parent_class = 1;");
                ResultSet rs = origen.query.getResultSet();
                if(!rs.next()){
                    return true; // No tiene triggers
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else{
            // Verificar triggers postgreSQL
            try {
                origen.query.execute("SELECT trigger_name AS TriggerName FROM information_schema.triggers WHERE event_object_table='" + tableName + "'");
                ResultSet rs = origen.query.getResultSet();
                if(!rs.next()){
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        origen.desconectar();
        return false;
    }
    
    private void createTriggersSQLServer(String tableName){
        String atributos = "";
        String valores = "";
        origen.conectar();
        try {
            //obtenemos los nombres de los atributos de la tabla
            //origen.query.execute("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '" + tableName + "'");
            Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
            ResultSet rs = stmt.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '" + tableName + "'");
            while (rs.next()) {
                if(rs.isLast()){
                    atributos += rs.getString(1);
                } else{
                    atributos += rs.getString(1) + ",";
                }
            }
            
            //Obtener los valores
            rs = stmt.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '" + tableName + "'");
            while (rs.next()) {                
                if(rs.isLast()){
                    valores += "QUOTENAME(CONVERT(NVARCHAR(MAX), ISNULL(" + rs.getString(1) + ", '')), '''')";
                }else{
                    valores += "QUOTENAME(CONVERT(NVARCHAR(MAX), ISNULL(" + rs.getString(1) + ", '')), '''') + ', ' + \n";
                }
            }
            
            // Crear triggers
            String trigger_insert = "Create TRIGGER tgr_" + tableName + "_Insert \n"
                + "ON " + tableName + "\n AFTER INSERT \n AS \n BEGIN \n"
                + "DECLARE @valores NVARCHAR(MAX); \n \n"
                + "SELECT @valores = STRING_AGG( \n" + valores + ", ', ') \n"
                + "FROM inserted; \n"
                + "INSERT INTO Bitacora(accion, tabla, atributos, olddatos, newdatos, replicado) \n"
                + "VALUES('INSERT INTO','" + tableName + "','" + atributos + "', null, @valores, 0); \n"
                + "END;";
            origen.query.execute(trigger_insert);
            
            String trigger_update = "Create TRIGGER tgr_" + tableName + "_Update \n"
                    + "ON " + tableName + "\n AFTER UPDATE \n AS \n BEGIN \n"
                    + "DECLARE @olddatos NVARCHAR(MAX); \n"
                    + "DECLARE @newdatos NVARCHAR(MAX); \n"
                    + "SELECT @olddatos = STRING_AGG( \n" + valores + ", ', ') \n"
                    + "FROM deleted; \n"
                    + "SELECT @newdatos = STRING_AGG( \n" + valores + ", ', ') \n"
                    + "FROM inserted; \n"
                    + "INSERT INTO Bitacora(accion, tabla, atributos, olddatos, newdatos, replicado) \n"
                    + "VALUES('UPDATE','" + tableName + "','" + atributos + "', @olddatos, @newdatos, 0); \n"
                    + "END;";
            origen.query.execute(trigger_update);
            
            String trigger_delete = "Create TRIGGER tgr_" + tableName + "_Delete \n"
                    + "ON " + tableName + "\n AFTER DELETE \n AS \n BEGIN \n"
                    + "DECLARE @olddatos NVARCHAR(MAX); \n"
                    + "SELECT @olddatos = STRING_AGG( \n" + valores + ", ', ') \n"
                    + "FROM deleted; \n"
                    + "INSERT INTO Bitacora(accion, tabla, atributos, olddatos, newdatos, replicado) \n"
                    + "VALUES('DELETE','" + tableName + "','" + atributos + "', @olddatos, null, 0); \n"
                    + "END;";
            origen.query.execute(trigger_delete);
        } catch (Exception e) {
            e.printStackTrace();
        }
        origen.desconectar();
    }
    
    private void createTriggersPOSTRESQL(String tableName){
        String atributos = "";
        String valores = "";
        String olddatos = "";
        origen.conectar();
        try {
            //obtenemos los nombres de los atributos de la tabla
            //origen.query.execute("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '" + tableName + "'");
            Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
            ResultSet rs = stmt.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = '" + tableName + "'");
            while (rs.next()) {
                if(rs.isLast()){
                    atributos += rs.getString(1);
                } else{
                    atributos += rs.getString(1) + ",";
                }
            }
            
            //Obtener los valores
            rs = stmt.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = '" + tableName + "'");
            while (rs.next()) {
                String column = rs.getString(1);
                if(rs.isLast()){
                    valores += " || NEW.\"" + column + "\" \n || '''';\n";
                    olddatos += " || OLD.\"" + column + "\" \n || '''';\n";
                }else{
                    valores += " || NEW.\"" + column + "\" || ''','''\n";
                    olddatos += " || OLD.\"" + column + "\" || ''','''\n";
                }
            }
            
            // Crear triggers
            String trigger_insert = "CREATE OR REPLACE FUNCTION public.\"trg_" + tableName + "_Insert_Fn\"()\n"
                    + "RETURNS TRIGGER AS $$ \n"
                    + "DECLARE\n"
                    + "newdatos TEXT;\n"
                    + "BEGIN\n"
                    + "newdatos := ''''\n" + valores
                    + "INSERT INTO public.\"Bitacora\"(accion, tabla, atributos, olddatos, newdatos, replicado) \n"
                    + "VALUES('INSERT INTO','" + tableName + "','" + atributos + "', null, newdatos, 0); \n"
                    + "RETURN NEW;\n"
                    + "END;\n"
                    + "$$ LANGUAGE plpgsql;\n\n"
                    + "CREATE TRIGGER \"trg_"+tableName+"_Insert\"\n"
                    + "AFTER INSERT ON public.\"" + tableName + "\"\n"
                    + "FOR EACH ROW\n"
                    + "EXECUTE FUNCTION public.\"trg_"+tableName+"_Insert_Fn\"();";
            //System.out.println(trigger_insert);
            origen.query.execute(trigger_insert);
            
            String trigger_update = "CREATE OR REPLACE FUNCTION public.\"trg_" + tableName + "_Update_Fn\"()\n"
                    + "RETURNS TRIGGER AS $$ \n"
                    + "DECLARE\n"
                    + "newdatos TEXT;\n"
                    + "olddatos TEXT;\n"
                    + "BEGIN\n"
                    + "newdatos := ''''\n" + valores
                    + "olddatos := ''''\n" + olddatos
                    + "INSERT INTO public.\"Bitacora\"(accion, tabla, atributos, olddatos, newdatos, replicado) \n"
                    + "VALUES('UPDATE','" + tableName + "','" + atributos + "', olddatos, newdatos, 0); \n"
                    + "RETURN NEW;\n"
                    + "END;\n"
                    + "$$ LANGUAGE plpgsql;\n\n"
                    + "CREATE TRIGGER \"trg_"+tableName+"_Update\"\n"
                    + "AFTER UPDATE ON public.\"" + tableName + "\"\n"
                    + "FOR EACH ROW\n"
                    + "EXECUTE FUNCTION public.\"trg_"+tableName+"_Update_Fn\"();";
            //System.out.println(trigger_update);
            origen.query.execute(trigger_update);
            
            String trigger_delete = "CREATE OR REPLACE FUNCTION public.\"trg_" + tableName + "_Delete_Fn\"()\n"
                    + "RETURNS TRIGGER AS $$ \n"
                    + "DECLARE\n"
                    + "olddatos TEXT;\n"
                    + "BEGIN\n"
                    + "olddatos := ''''\n" + olddatos
                    + "INSERT INTO public.\"Bitacora\"(accion, tabla, atributos, olddatos, newdatos, replicado) \n"
                    + "VALUES('DELETE','" + tableName + "','" + atributos + "', olddatos, null, 0); \n"
                    + "RETURN NEW;\n"
                    + "END;\n"
                    + "$$ LANGUAGE plpgsql;\n\n"
                    + "CREATE TRIGGER \"trg_"+tableName+"_Delete\"\n"
                    + "AFTER DELETE ON public.\"" + tableName + "\"\n"
                    + "FOR EACH ROW\n"
                    + "EXECUTE FUNCTION public.\"trg_"+tableName+"_Delete_Fn\"();";
            //System.out.println(trigger_delete);
            origen.query.execute(trigger_delete);
        } catch (Exception e) {
            e.printStackTrace();
        }
        origen.desconectar();
    }
    
    private void createTableIfNotExistsPostgre(String tableName){
        destino.conectar();
        origen.conectar();
        String createTable = "";
        try {
            destino.query.execute("SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_schema='public' AND table_name='" + tableName + "');");
            ResultSet rs = destino.query.getResultSet();
            while(rs.next()){
                if(!rs.getBoolean(1)){
                    //obtener schema de la tabla
                    String query = "SELECT \n" +
                        "    c.COLUMN_NAME,\n" +
                        "    c.DATA_TYPE,\n" +
                        "    c.NUMERIC_PRECISION,\n" +
                        "    c.CHARACTER_MAXIMUM_LENGTH,\n" +
                        "    c.IS_NULLABLE,\n" +
                        "    tc.CONSTRAINT_TYPE\n" +
                        "FROM \n" +
                        "    information_schema.columns c\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.key_column_usage kcu\n" +
                        "    ON c.TABLE_NAME = kcu.TABLE_NAME\n" +
                        "    AND c.COLUMN_NAME = kcu.COLUMN_NAME\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.table_constraints tc\n" +
                        "    ON kcu.CONSTRAINT_NAME = tc.CONSTRAINT_NAME\n" +
                        "WHERE \n" +
                        "    c.TABLE_NAME = '" + tableName + "';";
                    Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
                    ResultSet schema = stmt.executeQuery(query);
                    String columnas = "";
                    
                    while(schema.next()){ ///////
                        String column_name = schema.getString(1);
                        String data_type = schema.getString(2);
                        int numeric_precision = schema.getInt(3);
                        int character_maximum_length = schema.getInt(4);
                        String is_nullable = schema.getString(5);
                        String constraint_type = schema.getString(6);
                        //System.out.println(column_name + ", " + data_type + ", " + numeric_precision + ", " + character_maximum_length + ", " + is_nullable + ", " + constraint_type);
                        if(!schema.isLast()){
                            if(data_type.equals("numeric")){
                                columnas += "\"" +column_name + "\" " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("varchar") || data_type.equals("nvarchar") || data_type.equals("nchar")){
                                columnas += "\"" +column_name + "\" " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("int")){
                                columnas += "\"" +column_name + "\" " + "integer ";
                            } else if(data_type.equals("smallint")){
                                columnas += column_name + " " + "smallint ";
                            } else if(data_type.equals("date")){
                                columnas += column_name + " " + "date ";
                            } else if(data_type.equals("text")){
                                columnas += column_name + " " + "text ";
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas += ",\n";
                        } else{
                            if(data_type.equals("numeric")){
                                columnas += "\"" +column_name + "\" " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("varchar") || data_type.equals("nvarchar") || data_type.equals("nchar")){
                                columnas += "\"" +column_name + "\" " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("int")){
                                columnas += "\"" +column_name + "\" " + "integer " ;
                            } else if(data_type.equals("smallint")){
                                columnas += column_name + " " + "smallint ";
                            } else if(data_type.equals("date")){
                                columnas += column_name + " " + "date ";
                            } else if(data_type.equals("text")){
                                columnas += column_name + " " + "text ";
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas+= "\n";
                        }
                    } ////////
                    createTable += "CREATE TABLE public.\"" + tableName +"\"( \n"
                            + columnas
                            + ");\n";
                }
            }
            //System.out.println(createTable);
            destino.query.execute(createTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        destino.desconectar();
        origen.desconectar();
    }
    
    private void createTableIfNotExistsSQLServer(String tableName){
        destino.conectar();
        origen.conectar();
        String createTable = "";
        try {
            destino.query.execute("IF EXISTS ( SELECT 1 FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME = '"+ tableName + "') SELECT 'true' AS RESULTADO; \n ELSE \n SELECT 'false' AS RESULTADO;");
            ResultSet rs = destino.query.getResultSet();
            while(rs.next()){
                if(rs.getString(1).equals("false")){
                    String query = "SELECT \n" +
                         "    c.column_name,\n" +
                         "    c.data_type,\n" +
                         "    c.numeric_precision,\n" +
                         "    c.character_maximum_length,\n" +
                         "    c.is_nullable,\n" +
                         "    tc.constraint_type\n" +
                         "FROM \n" +
                         "    information_schema.columns c\n" +
                         "LEFT JOIN \n" +
                         "    information_schema.key_column_usage kcu\n" +
                         "    ON c.table_name = kcu.table_name\n" +
                         "    AND c.column_name = kcu.column_name\n" +
                         "    AND c.table_schema = kcu.table_schema\n" +
                         "LEFT JOIN \n" +
                         "    information_schema.table_constraints tc\n" +
                         "    ON kcu.constraint_name = tc.constraint_name\n" +
                         "    AND c.table_schema = tc.table_schema\n" +
                         "WHERE \n" +
                         "    c.table_name = '" + tableName + "' \n" + 
                         "    AND c.table_schema = 'public';"; 
                    
                    //                    while(schema.next()){
//                        System.out.println(schema.getString(1) +" ," + schema.getString(2)+ " ,"+ schema.getInt(3) + " ," + schema.getInt(4) + " ,"+ schema.getString(5) + " ,"+ schema.getString(6));
//                    }
                    
                    Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
                    ResultSet schema = stmt.executeQuery(query);
                    String columnas = "";
                    while(schema.next()){
                        String column_name = schema.getString(1);
                        String data_type = schema.getString(2);
                        int numeric_precision = schema.getInt(3);
                        int character_maximum_length = schema.getInt(4);
                        String is_nullable = schema.getString(5);
                        String constraint_type = schema.getString(6);
                        //System.out.println(column_name + ", " + data_type + ", " + numeric_precision + ", " + character_maximum_length + ", " + is_nullable + ", " + constraint_type);
                        if(!schema.isLast()){
                            if(data_type.equals("numeric")){
                                columnas += column_name + " " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("character")){
                                columnas += column_name + " " + "character" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("integer")){
                                columnas += column_name + " " + "integer ";
                            } else if(data_type.equals("character varying")){
                                columnas += column_name + " " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("smallint")){
                                columnas += column_name + " " + "smallint ";
                            } else if(data_type.equals("date")){
                                columnas += column_name + " " + "date ";
                            } else if(data_type.equals("text")){
                                columnas += column_name + " " + "text ";
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas += ",\n";
                        } else{
                            if(data_type.equals("numeric")){
                                columnas += column_name + " " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("character")){
                                columnas += column_name + " " + "character" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("integer")){
                                columnas += column_name + " " + "integer " ;
                            } else if(data_type.equals("character varying")){
                                columnas += column_name + " " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("smallint")){
                                columnas += column_name + " " + "smallint ";
                            } else if(data_type.equals("date")){
                                columnas += column_name + " " + "date ";
                            } else if(data_type.equals("text")){
                                columnas += column_name + " " + "text ";
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas+= "\n";
                        }
                    }
                    createTable += "CREATE TABLE " + tableName +" ( \n"
                            + columnas
                            + ");\n";
                }
            }
            //System.out.println(createTable);
            destino.query.execute(createTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        destino.desconectar();
        origen.desconectar();
    }
    
    private void replicarAPostgreSql(String tableName){
        origen.conectar();
        destino.conectar();
        try {
            Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
            ResultSet rs = stmt.executeQuery("SELECT id,accion,tabla,atributos,olddatos,newdatos FROM Bitacora WHERE replicado = 0 AND tabla='"+ tableName +"'");
            //System.out.println("hfdfff");
            while(rs.next()){
                int id = rs.getInt(1);
                String accion = rs.getString(2);
                String tabla = rs.getString(3);
                String strAtributos = rs.getString(4);
                String strOlddatos = rs.getString(5);
                String strNewdatos = rs.getString(6);
                if(strOlddatos == null){
                    strOlddatos = "";
                }
                if(strNewdatos == null){
                    strNewdatos = "";
                }
                String[] atributos = strAtributos.split(",");
                
                for (int i = 0; i < atributos.length; i++) {
                    String cad = "\"" + atributos[i] + "\"";
                    atributos[i]=cad;
                }
                
                String[] olddatos = strOlddatos.split(",");
                String[] newdatos = strNewdatos.split(",");
                //System.out.println(id + ", " + accion + ", " + tabla + ", " +strAtributos + ", " + strOlddatos + ", " + strNewdatos);
                //Replicar
                String query = "";
                //System.out.println(query);
                if(accion.equals("INSERT INTO")){
                    query += "INSERT INTO public.\"" + tabla + "\" (";// + strAtributos + ") VALUES(" + strNewdatos + ")";
                    for (int i = 0; i < atributos.length; i++) {
                        String atributo = atributos[i];
                        query+= atributo;
                        if(i != atributos.length-1){
                            query+= " ,";
                        }
                    }
                    query+= ") VALUES(" + strNewdatos + ")";
                } else if(accion.equals("UPDATE")){
                    query += "UPDATE public.\"" + tabla + "\" SET ";
                    for (int i = 0; i < atributos.length; i++) {
                        String atributo = atributos[i];
                        String newdato = newdatos[i];
                        query += atributo + "=" + newdato;
                        if (i != atributos.length - 1) {
                            query += ",";
                        }
                    }
                    query += " WHERE ";
                    for (int i = 0; i < atributos.length; i++) {
                        String atributo = atributos[i];
                        String olddato = olddatos[i];
                        query += atributo + "=" + olddato;
                        if (i != atributos.length - 1) {
                            query += " AND ";
                        }
                    }
                } else{
                    query += "DELETE FROM public.\"" + tabla + "\" WHERE ";
                    for (int i = 0; i < atributos.length; i++) {
                        String atributo = atributos[i];
                        String olddato = olddatos[i];
                        query += atributo + "=" + olddato;
                        if(i != atributos.length-1){
                            query += " AND ";
                        }
                    }
                }
                //System.out.println(query);
                destino.query.execute(query);
                origen.conexion.createStatement().executeUpdate("UPDATE Bitacora SET replicado=1 WHERE id=" +id);
            }
            JOptionPane.showMessageDialog(this, tableName + " replicado exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        origen.desconectar();
        destino.desconectar();
    }
    
    private void replicarASQLServer(String tableName){
        origen.conectar();
        destino.conectar();
        try {
            Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
            ResultSet rs = stmt.executeQuery("SELECT id,accion,tabla,atributos,olddatos,newdatos FROM public.\"Bitacora\" WHERE replicado = 0 AND tabla='"+ tableName +"'");
            //System.out.println("hfdfff");
            while(rs.next()){
                int id = rs.getInt(1);
                String accion = rs.getString(2);
                String tabla = rs.getString(3);
                String strAtributos = rs.getString(4);
                String strOlddatos = rs.getString(5);
                String strNewdatos = rs.getString(6);
                if(strOlddatos == null){
                    strOlddatos = "";
                }
                if(strNewdatos == null){
                    strNewdatos = "";
                }
                String[] atributos = strAtributos.split(",");
                
                
//                for (int i = 0; i < atributos.length; i++) {
//                    String cad = "\"" + atributos[i] + "\"";
//                    atributos[i]=cad;
//                }
                
                String[] olddatos = strOlddatos.split(",");
                String[] newdatos = strNewdatos.split(",");
                //System.out.println(id + ", " + accion + ", " + tabla + ", " +strAtributos + ", " + strOlddatos + ", " + strNewdatos);
                //Replicar
                String query = "";
                //System.out.println(query);
                if(accion.equals("INSERT INTO")){
                    query += "INSERT INTO " + tabla + " (" + strAtributos + ") VALUES(" + strNewdatos + ")";
//                    for (int i = 0; i < atributos.length; i++) {
//                        String atributo = atributos[i];
//                        query += atributo;
//                        if (i != atributos.length - 1) {
//                            query += ",";
//                        }
//                    }
//                    query +=  ") VALUES(" + strNewdatos + ")";
                } else if(accion.equals("UPDATE")){
                    query += "UPDATE " + tabla + " SET ";
                    for (int i = 0; i < atributos.length; i++) {
                        String atributo = atributos[i];
                        String newdato = newdatos[i];
                        query += atributo + "=" + newdato;
                        if (i != atributos.length - 1) {
                            query += ",";
                        }
                    }
                    query += " WHERE ";
                    for (int i = 0; i < atributos.length; i++) {
                        String atributo = atributos[i];
                        String olddato = olddatos[i];
                        query += atributo + "=" + olddato;
                        if (i != atributos.length - 1) {
                            query += " AND ";
                        }
                    }
                } else{
                    query += "DELETE FROM " + tabla + " WHERE ";
                    for (int i = 0; i < atributos.length; i++) {
                        String atributo = atributos[i];
                        String olddato = olddatos[i];
                        query += atributo + "=" + olddato;
                        if(i != atributos.length-1){
                            query += " AND ";
                        }
                    }
                }
                //System.out.println(query);
                destino.query.execute(query);
                origen.conexion.createStatement().executeUpdate("UPDATE public.\"Bitacora\" SET replicado=1 WHERE id=" +id);
            }
            JOptionPane.showMessageDialog(this, tableName + " replicado exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        origen.desconectar();
        destino.desconectar();
    }
    
    private DefaultListModel tablas_sin_fk(){
        origen.conectar();
        DefaultListModel tablas_without_fk = new DefaultListModel();
        if(origen.getPort().equals("1433")){
            DefaultListModel modelo = (DefaultListModel) jl_tablas_destino.getModel();
            for (int i = 0; i < modelo.getSize(); i++) {
                String tableName = modelo.getElementAt(i).toString();
                String query = "SELECT \n" +
                "    tc.CONSTRAINT_TYPE\n" +
                "FROM \n" +
                "    information_schema.columns c\n" +
                "LEFT JOIN \n" +
                "    information_schema.key_column_usage kcu\n" +
                "    ON c.TABLE_NAME = kcu.TABLE_NAME\n" +
                "    AND c.COLUMN_NAME = kcu.COLUMN_NAME\n" +
                "LEFT JOIN \n" +
                "    information_schema.table_constraints tc\n" +
                "    ON kcu.CONSTRAINT_NAME = tc.CONSTRAINT_NAME\n" +
                "WHERE \n" +
                "    c.TABLE_NAME = '" + tableName + "';";
                try {
                    origen.query.execute(query);
                    ResultSet rs = origen.query.getResultSet();
                    boolean flag = false;
                    while(rs.next()){
                        String is_fk = rs.getString(1);
                        if(is_fk != null && is_fk.equals("FOREIGN KEY")){
                            flag = true;
                        }
                    }
                    if(!flag){
                        tablas_without_fk.addElement(tableName);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else{
            DefaultListModel modelo = (DefaultListModel) jl_tablas_destino.getModel();
            for (int i = 0; i < modelo.getSize(); i++) {
                String tableName = modelo.getElementAt(i).toString();
                String query = "SELECT \n" +
                    "    tc.constraint_type\n" +
                    "FROM \n" +
                    "    information_schema.columns c\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.key_column_usage kcu\n" +
                    "    ON c.table_name = kcu.table_name\n" +
                    "    AND c.column_name = kcu.column_name\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.table_constraints tc\n" +
                    "    ON kcu.constraint_name = tc.constraint_name\n" +
                    "WHERE \n" +
                    "    c.table_name = '"+tableName+"';";
                try {
                    origen.query.execute(query);
                    ResultSet rs = origen.query.getResultSet();
                    boolean flag = false;
                    while(rs.next()){
                        String is_fk = rs.getString(1);
                        if(is_fk != null && is_fk.equals("FOREIGN KEY")){
                            flag = true;
                        }
                    }
                    if(!flag){
                        tablas_without_fk.addElement(tableName);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        origen.desconectar();
        return tablas_without_fk;
    }
    
    private DefaultListModel tablas_con_fk(){
        origen.conectar();
        DefaultListModel tablas_with_fk = new DefaultListModel();
        if(origen.getPort().equals("1433")){
            DefaultListModel modelo = (DefaultListModel) jl_tablas_destino.getModel();
            for (int i = 0; i < modelo.getSize(); i++) {
                String tableName = modelo.getElementAt(i).toString();
                String query = "SELECT \n" +
                "    tc.CONSTRAINT_TYPE\n" +
                "FROM \n" +
                "    information_schema.columns c\n" +
                "LEFT JOIN \n" +
                "    information_schema.key_column_usage kcu\n" +
                "    ON c.TABLE_NAME = kcu.TABLE_NAME\n" +
                "    AND c.COLUMN_NAME = kcu.COLUMN_NAME\n" +
                "LEFT JOIN \n" +
                "    information_schema.table_constraints tc\n" +
                "    ON kcu.CONSTRAINT_NAME = tc.CONSTRAINT_NAME\n" +
                "WHERE \n" +
                "    c.TABLE_NAME = '" + tableName + "';";
                try {
                    origen.query.execute(query);
                    ResultSet rs = origen.query.getResultSet();
                    boolean flag = false;
                    while(rs.next()){
                        String is_fk = rs.getString(1);
                        if(is_fk != null && is_fk.equals("FOREIGN KEY")){
                            flag = true;
                        }
                    }
                    if(flag){
                        tablas_with_fk.addElement(tableName);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else {
            DefaultListModel modelo = (DefaultListModel) jl_tablas_destino.getModel();
            for (int i = 0; i < modelo.getSize(); i++) {
                String tableName = modelo.getElementAt(i).toString();
                String query = "SELECT \n" +
                    "    tc.constraint_type\n" +
                    "FROM \n" +
                    "    information_schema.columns c\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.key_column_usage kcu\n" +
                    "    ON c.table_name = kcu.table_name\n" +
                    "    AND c.column_name = kcu.column_name\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.table_constraints tc\n" +
                    "    ON kcu.constraint_name = tc.constraint_name\n" +
                    "WHERE \n" +
                    "    c.table_name = '"+tableName+"';";
                try {
                    origen.query.execute(query);
                    ResultSet rs = origen.query.getResultSet();
                    boolean flag = false;
                    while(rs.next()){
                        String is_fk = rs.getString(1);
                        if(is_fk != null && is_fk.equals("FOREIGN KEY")){
                            flag = true;
                        }
                    }
                    if(flag){
                        tablas_with_fk.addElement(tableName);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        origen.desconectar();
        return tablas_with_fk;
    }
    
    private void createTableWithFkPostgre(String tableName){
        destino.conectar();
        origen.conectar();
        String createTable = "";
        try {
            destino.query.execute("SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_schema='public' AND table_name='" + tableName + "');");
            ResultSet rs = destino.query.getResultSet();
            while(rs.next()){
                if(!rs.getBoolean(1)){
                    //obtener schema de la tabla
                    String query = "SELECT \n" +
                        "    c.COLUMN_NAME,\n" +
                        "    c.DATA_TYPE,\n" +
                        "    c.NUMERIC_PRECISION,\n" +
                        "    c.CHARACTER_MAXIMUM_LENGTH,\n" +
                        "    c.IS_NULLABLE,\n" +
                        "    tc.CONSTRAINT_TYPE\n" +
                        "FROM \n" +
                        "    information_schema.columns c\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.key_column_usage kcu\n" +
                        "    ON c.TABLE_NAME = kcu.TABLE_NAME\n" +
                        "    AND c.COLUMN_NAME = kcu.COLUMN_NAME\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.table_constraints tc\n" +
                        "    ON kcu.CONSTRAINT_NAME = tc.CONSTRAINT_NAME\n" +
                        "WHERE \n" +
                        "    c.TABLE_NAME = '" + tableName + "';";
                    Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
                    ResultSet schema = stmt.executeQuery(query);
                    String columnas = "";
                    
                    while(schema.next()){ ///////
                        String column_name = schema.getString(1);
                        String data_type = schema.getString(2);
                        int numeric_precision = schema.getInt(3);
                        int character_maximum_length = schema.getInt(4);
                        String is_nullable = schema.getString(5);
                        String constraint_type = schema.getString(6);
                        //System.out.println(column_name + ", " + data_type + ", " + numeric_precision + ", " + character_maximum_length + ", " + is_nullable + ", " + constraint_type);
                        if(!schema.isLast()){
                            if(data_type.equals("numeric")){
                                columnas += "\"" +column_name + "\" " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("varchar") || data_type.equals("nvarchar") || data_type.equals("nchar")){
                                columnas += "\"" + column_name + "\" " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("int")){
                                columnas += "\"" + column_name + "\" " + "integer ";
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas += ",\n";
                        } else{
                            if(data_type.equals("numeric")){
                                columnas += "\""+ column_name + "\" " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("varchar") || data_type.equals("nvarchar") || data_type.equals("nchar")){
                                columnas += "\"" + column_name + "\" " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("int")){
                                columnas += "\"" + column_name + "\" " + "integer " ;
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas+= ",\n";
                        }
                    } ////////
                    
                    String query2 = "SELECT \n" +
                    "    c.COLUMN_NAME,\n" +
                    "    tc.CONSTRAINT_TYPE,\n" +
                    "    kcu2.TABLE_NAME AS REFERENCED_TABLE_NAME,\n" +
                    "    kcu2.COLUMN_NAME AS REFERENCED_COLUMN_NAME\n" +
                    "FROM \n" +
                    "    information_schema.columns c\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.key_column_usage kcu\n" +
                    "    ON c.TABLE_NAME = kcu.TABLE_NAME\n" +
                    "    AND c.COLUMN_NAME = kcu.COLUMN_NAME\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.table_constraints tc\n" +
                    "    ON kcu.CONSTRAINT_NAME = tc.CONSTRAINT_NAME\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.referential_constraints rc\n" +
                    "    ON tc.CONSTRAINT_NAME = rc.CONSTRAINT_NAME\n" +
                    "LEFT JOIN \n" +
                    "    information_schema.key_column_usage kcu2\n" +
                    "    ON rc.UNIQUE_CONSTRAINT_NAME = kcu2.CONSTRAINT_NAME\n" +
                    "    AND kcu.ORDINAL_POSITION = kcu2.ORDINAL_POSITION\n" +
                    "WHERE \n" +
                    "    c.TABLE_NAME = '"+tableName+"'\n" +
                    "    AND tc.CONSTRAINT_TYPE = 'FOREIGN KEY';";
                    ResultSet rs2 = stmt.executeQuery(query2);
                    String fks = "";
                    while(rs2.next()){
                        String column_name = rs2.getString(1);
                        String a = rs2.getString(2);
                        String ref_table = rs2.getString(3);
                        String ref_column = rs2.getString(4);
                        if(ref_table != null){
                            if(!rs2.isLast()){
                                fks += "CONSTRAINT \""+column_name+"\" FOREIGN KEY (\"" +column_name+"\") REFERENCES public.\""+ref_table+"\" (\""+ref_column+"\") MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE NOT VALID,\n" ;
                            } else {
                                fks += "CONSTRAINT \""+column_name+"\" FOREIGN KEY (\"" +column_name+"\") REFERENCES public.\""+ref_table+"\" (\""+ref_column+"\") MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE NOT VALID" ;
                            }
                        }
                    }
                    
                    createTable += "CREATE TABLE public.\"" + tableName +"\"( \n"
                            + columnas
                            + fks + "\n"
                            + ");\n";
                }
            }
            //System.out.println(createTable);
            destino.query.execute(createTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        destino.desconectar();
        origen.desconectar();
    }
    
    private void createTableWithFkSQLServer(String tableName){
        destino.conectar();
        origen.conectar();
        String createTable = "";
        try {
            destino.query.execute("IF EXISTS ( SELECT 1 FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME = '"+ tableName + "') SELECT 'true' AS RESULTADO; \n ELSE \n SELECT 'false' AS RESULTADO;");
            ResultSet rs = destino.query.getResultSet();
            while(rs.next()){
                if(rs.getString(1).equals("false")){
                    String query = "SELECT \n" +
                         "    c.column_name,\n" +
                         "    c.data_type,\n" +
                         "    c.numeric_precision,\n" +
                         "    c.character_maximum_length,\n" +
                         "    c.is_nullable,\n" +
                         "    tc.constraint_type\n" +
                         "FROM \n" +
                         "    information_schema.columns c\n" +
                         "LEFT JOIN \n" +
                         "    information_schema.key_column_usage kcu\n" +
                         "    ON c.table_name = kcu.table_name\n" +
                         "    AND c.column_name = kcu.column_name\n" +
                         "    AND c.table_schema = kcu.table_schema\n" +
                         "LEFT JOIN \n" +
                         "    information_schema.table_constraints tc\n" +
                         "    ON kcu.constraint_name = tc.constraint_name\n" +
                         "    AND c.table_schema = tc.table_schema\n" +
                         "WHERE \n" +
                         "    c.table_name = '" + tableName + "' \n" + 
                         "    AND c.table_schema = 'public';"; 
                    
                    //                    while(schema.next()){
//                        System.out.println(schema.getString(1) +" ," + schema.getString(2)+ " ,"+ schema.getInt(3) + " ," + schema.getInt(4) + " ,"+ schema.getString(5) + " ,"+ schema.getString(6));
//                    }
                    
                    Statement stmt = origen.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // Para utilizar isLast()
                    ResultSet schema = stmt.executeQuery(query);
                    String columnas = "";
                    while(schema.next()){
                        String column_name = schema.getString(1);
                        String data_type = schema.getString(2);
                        int numeric_precision = schema.getInt(3);
                        int character_maximum_length = schema.getInt(4);
                        String is_nullable = schema.getString(5);
                        String constraint_type = schema.getString(6);
                        //System.out.println(column_name + ", " + data_type + ", " + numeric_precision + ", " + character_maximum_length + ", " + is_nullable + ", " + constraint_type);
                        if(!schema.isLast()){
                            if(data_type.equals("numeric")){
                                columnas += column_name + " " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("character")){
                                columnas += column_name + " " + "character" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("integer")){
                                columnas += column_name + " " + "integer ";
                            } else if(data_type.equals("character varying")){
                                columnas += column_name + " " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("smallint")){
                                columnas += column_name + " " + "smallint ";
                            } else if(data_type.equals("date")){
                                columnas += column_name + " " + "date ";
                            } else if(data_type.equals("text")){
                                columnas += column_name + " " + "text ";
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas += ",\n";
                        } else{
                            if(data_type.equals("numeric")){
                                columnas += column_name + " " + data_type + " (" + numeric_precision + ")";
                            } else if(data_type.equals("character")){
                                columnas += column_name + " " + "character" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("integer")){
                                columnas += column_name + " " + "integer " ;
                            } else if(data_type.equals("character varying")){
                                columnas += column_name + " " + "varchar" + " (" + character_maximum_length + ")";
                            } else if(data_type.equals("smallint")){
                                columnas += column_name + " " + "smallint ";
                            } else if(data_type.equals("date")){
                                columnas += column_name + " " + "date ";
                            } else if(data_type.equals("text")){
                                columnas += column_name + " " + "text ";
                            }
                            
                            if(is_nullable.equals("NO")){
                                columnas += " NOT NULL";
                            }
                            
                            if(constraint_type != null){
                                if(constraint_type.equals("PRIMARY KEY")){
                                    columnas += " PRIMARY KEY";
                                }
                            }
                            columnas+= ",\n";
                        }
                    }///////// 
                    String query2 = "SELECT \n" +
                        "    c.column_name,\n" +
                        "    tc.constraint_type,\n" +
                        "    ccu.table_name AS referenced_table_name,\n" +
                        "    ccu.column_name AS referenced_column_name\n" +
                        "FROM \n" +
                        "    information_schema.columns c\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.key_column_usage kcu\n" +
                        "    ON c.table_name = kcu.table_name\n" +
                        "    AND c.column_name = kcu.column_name\n" +
                        "    AND c.table_schema = kcu.table_schema\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.table_constraints tc\n" +
                        "    ON kcu.constraint_name = tc.constraint_name\n" +
                        "    AND c.table_schema = tc.table_schema\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.referential_constraints rc\n" +
                        "    ON tc.constraint_name = rc.constraint_name\n" +
                        "LEFT JOIN \n" +
                        "    information_schema.constraint_column_usage ccu\n" +
                        "    ON rc.unique_constraint_name = ccu.constraint_name\n" +
                        "WHERE \n" +
                        "    c.table_name = '"+tableName+"'\n" +
                        "    AND c.table_schema = 'public'\n" +
                        "    AND tc.constraint_type = 'FOREIGN KEY';";
                    ResultSet rs2 = stmt.executeQuery(query2);
                    String fks = "";
                    while(rs2.next()){
                        String column_name = rs2.getString(1);
                        String a = rs2.getString(2);
                        String ref_table = rs2.getString(3);
                        String ref_column = rs2.getString(4);
                        if(ref_table != null){
                            if(!rs2.isLast()){
                                fks += "FOREIGN KEY ("+column_name+") REFERENCES " + ref_table + " ("+ref_column+") ON UPDATE CASCADE ON DELETE CASCADE,\n" ;
                            } else {
                                fks += "FOREIGN KEY ("+column_name+") REFERENCES " + ref_table + " ("+ref_column+") ON UPDATE CASCADE ON DELETE CASCADE\n" ;
                            }
                        }
                    }
                    
                    createTable += "CREATE TABLE " + tableName +"( \n"
                            + columnas
                            + fks
                            + ");\n";
                }
            }
            //System.out.println(createTable);
            destino.query.execute(createTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
        destino.desconectar();
        origen.desconectar();
    }
    
    private boolean hasBitacora(){
        boolean flag = false;
        try {
            if(origen.getPort().equals("1433")){
                origen.query.execute("SELECT TABLE_NAME FROM "  + origen.getDbName() + ".INFORMATION_SCHEMA.TABLES"+ " WHERE TABLE_TYPE = 'BASE TABLE'");
            } else{
                origen.query.execute("SELECT tablename FROM pg_tables WHERE schemaname = 'public'");
            }
            ResultSet rs = origen.query.getResultSet();
            while(rs.next()){
                if(rs.getString(1).equals("Bitacora")){
                    flag = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    private void createBitacoraIfNotExists(boolean flag){
        if(!flag){
            String query;
            try {
                if(origen.getPort().equals("1433")){
                    query = "CREATE TABLE Bitacora (\n" +
                        "    id INT IDENTITY PRIMARY KEY,\n" +
                        "    accion NVARCHAR(50),\n" +
                        "    tabla NVARCHAR(50),\n" +
                        "    atributos NVARCHAR(MAX),\n" +
                        "    olddatos NVARCHAR(MAX),\n" +
                        "    newdatos NVARCHAR(MAX),\n" +
                        "    replicado BIT DEFAULT 0\n" +
                        ");";
                } else{
                    query = "CREATE TABLE public.\"Bitacora\"\n" +
                        "(\n" +
                        "    id serial,\n" +
                        "    accion text,\n" +
                        "    tabla text,\n" +
                        "    atributos text,\n" +
                        "    olddatos text,\n" +
                        "    newdatos text,\n" +
                        "    replicado integer,\n" +
                        "    PRIMARY KEY (id)\n" +
                        ");";
                }
                //System.out.println(query);
                origen.query.execute(query);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void dropTable(String tableName){
        try {
            if(destino.getPort().equals("1433")){
                destino.query.execute("DROP TABLE " + tableName);
            } else{
                destino.query.execute("DROP TABLE public.\"" + tableName + "\"");
                //System.out.println("DROP TABLE public.\"" + tableName + "\"");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private boolean comparar_tablas(String tableName){
        origen.conectar();
        destino.conectar();
        boolean flag = true;
        try {
            String query1;
            String query2;
            if(origen.getPort().equals("1433")){
                query1 = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+tableName+"'";
            } else{
                query1 = "SELECT column_name FROM information_schema.columns WHERE table_name = '"+tableName+"'";
            }
            
            if(destino.getPort().equals("1433")){
                query2 = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+tableName+"'";
            }else{
                query2 = "SELECT column_name FROM information_schema.columns WHERE table_name = '"+tableName+"'";
            }
            
            origen.query.execute(query1);
            destino.query.execute(query2);
            ResultSet rs = origen.query.getResultSet();
            ResultSet rs2 = destino.query.getResultSet();
                    
            ArrayList<String> tablas1 = new ArrayList();
            ArrayList<String> tablas2 = new ArrayList();
            while(rs.next()){
                tablas1.add(rs.getString(1));
            }
            while(rs2.next()){
                tablas2.add(rs2.getString(1));
            }
            if(!tablas1.equals(tablas2)){
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_guardar_config;
    private javax.swing.JButton bt_probar_conexion_bd_destino;
    private javax.swing.JButton bt_probar_conexion_bd_origen;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_ejecutar_replicacion;
    private javax.swing.JButton jb_mover_a_replicar;
    private javax.swing.JButton jb_mover_a_sin_replicar;
    private javax.swing.JList<String> jl_tablas_destino;
    private javax.swing.JList<String> jl_tablas_origen;
    private javax.swing.JPanel panel_configuracion;
    private javax.swing.JPanel panel_replicacion;
    private javax.swing.JPasswordField pf_password_destino;
    private javax.swing.JPasswordField pf_password_origen;
    private javax.swing.JTextField tf_instancia_destino;
    private javax.swing.JTextField tf_instancia_origen;
    private javax.swing.JTextField tf_nombre_bd_destino;
    private javax.swing.JTextField tf_nombre_bd_origen;
    private javax.swing.JTextField tf_puerto_destino;
    private javax.swing.JTextField tf_puerto_origen;
    private javax.swing.JTextField tf_usuario_destino;
    private javax.swing.JTextField tf_usuario_origen;
    private javax.swing.JTabbedPane tp_main;
    // End of variables declaration//GEN-END:variables

    private Dba origen;
    private Dba destino;
    ArrayList<String> names_delete;
}
