/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.GUI;

import javax.swing.table.DefaultTableModel;
import paquete.clases.*;
import paquete.gestion.Gestion;
import static paquete.interfaces.Sueldo.*;

/**
 *
 * @author Nikolas
 */
public class Datos extends javax.swing.JFrame {
    
    Tabla_Data tabla;
    Persona[] arreglo;
    int fila;
    
    /**
     * Creates new form Datos
     * @param gp
     * @param tipo
     * @param fila
     */
    public Datos(Gestion gp, String tipo, int fila) {
        
        
        this.fila = fila;
        
        tabla = new Tabla_Data(tipo);
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
        arreglo = gp.getArreglo();
        
        this.nombre_.setText(arreglo[fila].getNombre());
        
        this.codigo_.setText(arreglo[fila].getCodigo());
        
        
        if(tipo.equalsIgnoreCase("Staff")){
            this.tipo_usuario1.setText("Tipo de usuario: " + tipo + ": " + ((Staff)arreglo[fila]).getPuesto());
            
        } else {
            this.tipo_usuario1.setText("Tipo de usuario: " + tipo);
            
        }
        
        
        this.tiempo_enU.setText("Tiempo en la Universidad: " + String.valueOf(arreglo[fila].getTiempo()) + " Años");
        
        
        
        
        //if(tipo.equalsIgnoreCase("Alumno")){
            this.Datos_Adicionales.setModel(tabla);
            PoblarTabla(tabla, tipo, fila);
        //}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo_Extra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos_Adicionales = new javax.swing.JTable();
        nombre_ = new javax.swing.JLabel();
        codigo_ = new javax.swing.JLabel();
        tiempo_enU = new javax.swing.JLabel();
        tipo_usuario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 60, 64));

        Titulo_Extra.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        Titulo_Extra.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Extra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Extra.setText("Información Adicional");

        Datos_Adicionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Datos_Adicionales);

        nombre_.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        nombre_.setForeground(new java.awt.Color(255, 255, 255));
        nombre_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre_.setText("NOMBRE COMPLETO");

        codigo_.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        codigo_.setForeground(new java.awt.Color(255, 255, 255));
        codigo_.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        codigo_.setText("Codigo Alumno");

        tiempo_enU.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        tiempo_enU.setForeground(new java.awt.Color(255, 255, 255));
        tiempo_enU.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tiempo_enU.setText("Tiempo");

        tipo_usuario1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        tipo_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        tipo_usuario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tipo_usuario1.setText("A/S/D");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Titulo_Extra)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codigo_)
                        .addGap(52, 52, 52))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tipo_usuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tiempo_enU)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Titulo_Extra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_)
                    .addComponent(nombre_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempo_enU)
                    .addComponent(tipo_usuario1))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Datos_Adicionales;
    private javax.swing.JLabel Titulo_Extra;
    private javax.swing.JLabel codigo_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre_;
    private javax.swing.JLabel tiempo_enU;
    private javax.swing.JLabel tipo_usuario1;
    // End of variables declaration//GEN-END:variables

    private void PoblarTabla(DefaultTableModel mod, String abc, int fil){
        
        int cont = mod.getRowCount();
        
        for(int i=0;i<cont;i++){
            mod.removeRow(0);
        }
        
        String[] datos = new String[10];
        
        if(abc.equalsIgnoreCase("Alumno")){
            
            String[] curs = ((Alumno)arreglo[fil]).getCursos();
            int[][] not = ((Alumno)arreglo[fil]).getNotas();
            double[] prom = ((Alumno)arreglo[fil]).getPromedios();

            
            
            for(int i=0; i<((Alumno)arreglo[fil]).getCur(); i++){
                
                datos[0] = curs[i];
                datos[1] = String.valueOf(not[i][0]);
                datos[2] = String.valueOf(not[i][1]);
                datos[3] = String.valueOf(prom[i]);
                
                mod.addRow(datos);
            }
        } else if(abc.equalsIgnoreCase("Docente")){
            
            String[] curs = ((Docente)arreglo[fila]).getCursos();
            int[] hors = ((Docente)arreglo[fila]).getHoras();
            
            for(int i=0; i<((Docente)arreglo[fil]).getCur(); i++){
                
                datos[0] = curs[i];
                datos[1] = String.valueOf(hors[i]);
                
                double sueld = hors[i] * pagoHora_Docente;
                
                datos[2] = String.valueOf(sueld);
                
                mod.addRow(datos);
                
            }
            
        } else if(abc.equalsIgnoreCase("Staff")){
            
            String[] resp = ((Staff)arreglo[fila]).getResponsabilidad();
            int[] hors = ((Staff)arreglo[fila]).getHoras();
            
            for(int i=0; i<((Staff)arreglo[fil]).getResp(); i++){
                
                datos[0] = resp[i];
                datos[1] = String.valueOf(hors[i]);
                
                double sueld = hors[i] * pagoHora_Staff;
                
                datos[2] = String.valueOf(sueld);
                
                mod.addRow(datos);
                
            }
            
        }
        
    }
}
