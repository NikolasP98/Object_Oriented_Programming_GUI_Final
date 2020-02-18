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
public class Tabla_Data extends DefaultTableModel{

    public Tabla_Data(String a) {
        
        if(a.equals("Alumno")){
            
            this.addColumn("Curso");
            this.addColumn("Nota Ciclo 1");
            this.addColumn("Nota Ciclo 2");
            this.addColumn("Promedio");
            
        } else if(a.equals("Docente")){
            
            this.addColumn("Curso");
            this.addColumn("Horas");
            this.addColumn("Sueldo Curso");
        
        } else if(a.equals("Staff")){
            
            this.addColumn("Responsabilidad");
            this.addColumn("Horas");
            this.addColumn("Sueldo Resp.");
            
        }
    }
}