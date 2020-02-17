/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;
import paquete.interfaces.*;

/**
 *
 * @author Nikolas
 */
public class Docente extends Persona implements Educacion, Sueldo{
    private int tiempo, cur, totalHrs;
    private double sueldo;
    private String[] cursos;
    private int[] horas;
    
    
    public Docente(String nombre, String distrito, int cur) {
        super(nombre, distrito);
        this.cur = cur;
        this.cursos = new String[10];
        this.horas = new int[10];
    }
    
    
    
    
    
    
    @Override
    public void GenerarCodigo() {
        Random rand = new Random();
        int x = rand.nextInt(2020-1995+1) + 1995;
        this.tiempo = Year.now().getValue() - x;
        this.codigo = "P" + x + "" + (rand.nextInt(9999-1000+1)+1000);
    }
    
    
    
    public void SolicitarHoras() {
        int ver, totHoras = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Recuperando horas totales...");
        
        for(int i=0; i<cur; i++){
                horas[i] = rand.nextInt(7)+2;
                
                totHoras += horas[i];
        }
        
        this.totalHrs = totHoras;
        
        try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {}
        
        System.out.println("Horas cargadas!");
        

        
        System.out.println("Desea ver las horas por curso del último año?\n1. Sí\n2. No");
        ver = sc.nextInt();
        
        if (ver == 1){

            
            String cad = "\tHrs semanales\n";
            
            for(int i=0; i<cur; i++){
                cad += cursos[i] + "\t|\t" + horas[i] + "\n";
            }
            
            cad += "TOTAL\t|\t" + totalHrs;
            
            System.out.println(cad);
            
        }
        

    }

    @Override
    public void CalcularSueldo() {
        this.sueldo = this.totalHrs * pagoHora * 4.0;
    }

    @Override
    public void SolicitarCursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
