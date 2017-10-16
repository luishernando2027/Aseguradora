/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menubasedatos;

import Db_Academia.ConexionAseguradora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Castillo
 */
public class TablaAseguradora extends javax.swing.JFrame {
    ConexionAseguradora con=new ConexionAseguradora();
    Connection conx2=con.conxdatabase();
    PreparedStatement ps=null;
    ResultSet rs=null;

    
    public TablaAseguradora() {
        initComponents();
        cargatabla();
        cargatabla2();
        cargatabla3();
        cargatabla4();
        cargatabla5();
        cargatabla6();
        
    }
    
    public void cargatabla(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documentos");
        tab.addColumn("Nombre Usuario");
        tab.addColumn("Clave");
        TablaUsuario.setModel(tab);
        String datos[]=new String[3];
        
        try {
            ps=conx2.prepareStatement("SELECT *FROM Usuario");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla2(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Nit Compañia");
        tab.addColumn("Nombre Compañia");
        tab.addColumn("Años fundacion de compañia");
        tab.addColumn("Representante Legal Compañia");
        TablaCompa.setModel(tab);
        String datos[]=new String[4];
        
        try {
            ps=conx2.prepareStatement("SELECT *FROM Companhia");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
        public void cargatabla3(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("ID TipoAutomotores");
        tab.addColumn("Nombre TipoAutomotores");
        TablaTipoAut.setModel(tab);
        String datos[]=new String[2];
        
        try {
            ps=conx2.prepareStatement("SELECT *FROM TipAutomotores");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla4(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Placa Automotores");
        tab.addColumn("Marca Automotores");
        tab.addColumn("Tipo Automotores");
        tab.addColumn("Modelo Automotores");
        tab.addColumn("Num. pasajeros Automotores");
        tab.addColumn("Cilindraje Automotores");
        tab.addColumn("Num. Chasis Automotores");
        TablaAutomo.setModel(tab);
        String datos[]=new String[7];
        
        try {
            ps=conx2.prepareStatement("SELECT *FROM Automotores");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla5(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("ID. Aseguradora");
        tab.addColumn("Fech. Ini. Aseguradora");
        tab.addColumn("Fech. Exp. Aseguradora");
        tab.addColumn("valor Asegurado Aseguradora");
        tab.addColumn("Estado Aseguradora");
        tab.addColumn("Costo Aseguradora");
        tab.addColumn("Placa Aseguradora");
        TablaAseguram.setModel(tab);
        String datos[]=new String[7];
        
        try {
            ps=conx2.prepareStatement("SELECT *FROM Aseguramientos");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
        }
        public void cargatabla6(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Codigo Incidentes");
        tab.addColumn("Fecha Incidentes");
        tab.addColumn("Placa Incidentes");
        tab.addColumn("Lugar Incidentes");
        tab.addColumn("Cant. Heridos Incidentes");
        tab.addColumn("Cant. Fatales Incidentes");
        tab.addColumn("Cant Autoinvolucrados Incidentes");
        TablaIncidentes.setModel(tab);
        String datos[]=new String[7];
        
        try {
            ps=conx2.prepareStatement("SELECT *FROM Incidentes");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCompa = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaTipoAut = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaAutomo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaAseguram = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaIncidentes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 20, 963, 42);

        TablaCompa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaCompa);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 80, 963, 75);

        TablaTipoAut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaTipoAut);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 173, 963, 73);

        TablaAutomo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaAutomo);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 264, 963, 75);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABLAS DE ASEGURADORAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(454, 0, 138, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPAÑIA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 63, 80, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIPOS DE AUTOMOTORES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 156, 160, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AUTOMOTORES");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 247, 100, 14);

        TablaAseguram.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaAseguram);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(0, 357, 963, 75);

        jLabel5.setText("ASEGURAMIENTOS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 340, 110, 14);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(759, 544, 184, 54);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUARIO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 80, 14);

        TablaIncidentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TablaIncidentes);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(0, 450, 963, 76);

        jLabel7.setText("INCIDENTES");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 434, 90, 14);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menubasedatos/Aseguradora.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 970, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MENUS men=new MENUS();
        men.setVisible(true);
        men.setSize(920,570);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaAseguradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaAseguradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaAseguradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaAseguradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TablaAseguradora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAseguram;
    private javax.swing.JTable TablaAutomo;
    private javax.swing.JTable TablaCompa;
    private javax.swing.JTable TablaIncidentes;
    private javax.swing.JTable TablaTipoAut;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
