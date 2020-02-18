/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nikolas
 */
public class Tabla extends DefaultTableModel{

    public Tabla(String a) {
        
        this.addColumn("Nombre");
        this.addColumn("Código");
        this.addColumn("Distrito");
        
        if(a.equalsIgnoreCase("Alumno")){
            
            this.addColumn("# Cursos");
            this.addColumn("Promedio");
            
        } else if(a.equalsIgnoreCase("Docente")){
            
            this.addColumn("# Cursos");
            this.addColumn("Total Horas");
            
        } else if (a.equalsIgnoreCase("Staff")){
            
            
            
        }
        
        
        
    }
}
