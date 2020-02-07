/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;
import java.util.Scanner;
import paquete.interfaces.Educacion;

/**
 *
 * @author L46374
 */
public class Alumno extends Persona implements Educacion{
    protected int[][] notas;
    protected String[] cursos;
    protected double[] promedio;
    protected int cur;

    public Alumno() {
        notas = new int[10][2];
        cursos = new String[10];
        promedio = new double[10];
    }

    public int[][] getNotas() {
        return notas;
    }

    public void setNotas(int[][] notas) {
        this.notas = notas;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public int getCur() {
        return cur;
    }

    public void setCur(int cur) {
        this.cur = cur;
    }
    
    
    @Override
    public void GenerarCodigo() {
        Random rand = new Random();
        this.codigo = "A" + (rand.nextInt(2020-1995+1)+1995) + "" + (rand.nextInt(9999-1000+1)+1000);
    }
    
    //SOLICITA NOMBRE DE CURSOS Y LOS GUARDA EN UN ARREGLO CON TAMAÑO "CUR"
    @Override
    public void SolicitarCursos() {
        Scanner sc = new Scanner(System.in);
        int ver = 0;
        
        while(ver != 1){
            System.out.println(sep);
            
            System.out.println("Ingrese número de cursos inscritos del alumno: ");
            cur = sc.nextInt();
            sc.nextLine();
            
            System.out.println(sep);
            
            for(int i=0; i<cur; i++){
                System.out.println("Ingresar nombre de curso #" + (i+1) + ": ");
                cursos[i] = sc.nextLine();
            }
            
            String cad = "";
            
            for(int i=0; i<cur; i++){
                cad += cursos[i] + "\n";
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
    
    @Override
    public void SolicitarNotas(){
        int ver;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        double prom = 0.0;
        
        System.out.println("Recuperando notas...");
        
        for(int i=0; i<cur; i++){
            for(int j=0; j<2; j++){
                notas[i][j] = rand.nextInt(20)+1;
                
                prom += notas[i][j];
                
            }
            
            this.promedio[i] = prom/2;
            prom = 0;
        }
        
        try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {}
        
        System.out.println("Notas cargadas!");
        
        System.out.println(sep);
        
        System.out.println("Desea ver las notas del último año?\n1. Sí\n2. No");
        ver = sc.nextInt();
        
        if (ver == 1){
            System.out.println(sep);
            
            String cad = "\t";
            
            for(int i=0; i<2; i++){
                cad += "Ciclo " + (i+1) + "\t|\t";
            }
            
            cad += "PROM\n";
            
            for(int i=0; i<cur; i++){
                
                cad += cursos[i] + ":\t";
                
                for(int j=0; j<2; j++){
                    
                    cad += notas[i][j] + "\t|\t";
                    
                }
                cad += this.promedio[i] + "\n";
            }
            
            System.out.println(cad);
            
        }
        
    }
    
    
    
    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nCursos matriculados: " + this.cur; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
