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
    double sueldo;
    private String[] cursos;
    private int[] horas;
    
    
    public Docente() {
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

    @Override
    public void SolicitarCursos() {
        Scanner sc = new Scanner(System.in);
        int ver = 0;
        
        while(ver != 1){
            System.out.println(sep);
            
            System.out.println("Ingrese número de cursos inscritos del Docente: ");
            cur = sc.nextInt();
            sc.nextLine();
            
            System.out.println(sep);
            
            for(int i=0; i<cur; i++){
                System.out.println("Ingresar nombre de curso #" + (i+1) + ": ");
                cursos[i] = sc.nextLine();
            }
            
            String cad = "";
            
            for(int i=0; i<cur; i++){
                cad += (i+1) + ". " + cursos[i] + "\n";
            }
            
            System.out.println(sep);
            System.out.println("Cursos ingresados: \n" + cad);
            
            System.out.println(sep);
            
            System.out.println("Es correcto? \n1. Sí \n2. No");
            
            ver = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(sep);
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
        
        System.out.println(sep);
        
        System.out.println("Desea ver las horas por curso del último año?\n1. Sí\n2. No");
        ver = sc.nextInt();
        
        if (ver == 1){
            System.out.println(sep);
            
            String cad = "\tHrs semanales\n";
            
            for(int i=0; i<cur; i++){
                cad += cursos[i] + "\t|\t" + horas[i] + "\n";
            }
            
            cad += "TOTAL\t|\t" + totalHrs;
            
            System.out.println(cad);
            
        }
        
        System.out.println(sep);
    }

    @Override
    public void CalcularSueldo() {
        double i = totalHrs * 4;
        this.sueldo = i * pagoHora;
    }
    
    
    @Override
    public String VerInfo() {
        return super.VerInfo() + "\nAños siendo Docente: " + this.tiempo +
                "\nHoras semanasles: " + this.totalHrs +
                "\nSueldo mensual: " + this.sueldo; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
