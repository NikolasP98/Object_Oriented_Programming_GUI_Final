/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.time.Year;
import java.util.Random;
import javax.swing.JOptionPane;
import paquete.interfaces.*;

/**
 *
 * @author Nikolas
 */
public class Docente extends Persona implements Educacion, Sueldo{
    private int  cur, totalHrs;
    private double sueldo;
    private String[] cursos;
    private int[] horas;
    
    
    public Docente(String nombre, String distrito, int cur) {
        super(nombre, distrito);
        this.cur = cur;
        this.cursos = new String[10];
        this.horas = new int[10];
    }

    public int getCur() {
        return cur;
    }

    public void setCur(int cur) {
        this.cur = cur;
    }

    public int getTotalHrs() {
        return totalHrs;
    }

    public void setTotalHrs(int totalHrs) {
        this.totalHrs = totalHrs;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public int[] getHoras() {
        return horas;
    }

    public void setHoras(int[] horas) {
        this.horas = horas;
    }
    
    
    
    
    
    
    @Override
    public void GenerarCodigo() {
        Random rand = new Random();
        int x = rand.nextInt(2020-1995+1) + 1995;
        this.tiempo = Year.now().getValue() - x;
        this.codigo = "P" + x + "" + (rand.nextInt(9999-1000+1)+1000);
    }
    
    
    
    @Override
    public void SolicitarHoras() {
        
        Random rand = new Random();
        int totHoras = 0;
        
        
        for(int i=0; i<cur; i++){
            
            cursos[i] = JOptionPane.showInputDialog("Ingresar nombre de curso #" + (i+1));
            
            horas[i] = rand.nextInt(7)+2;

            totHoras += horas[i];
        }
        
        this.totalHrs = totHoras;

    }

    @Override
    public void CalcularSueldo() {
        this.sueldo = totalHrs * pagoHora_Docente * 4.0;
    }

    @Override
    public void SolicitarCursos() {
    }
    
}
