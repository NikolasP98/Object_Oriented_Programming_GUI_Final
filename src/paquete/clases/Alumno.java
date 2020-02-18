/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.time.Year;
import java.util.Random;
import javax.swing.JOptionPane;
import paquete.interfaces.Educacion;

/**
 *
 * @author L46374
 */
public class Alumno extends Persona implements Educacion{
    private int[][] notas;
    private String[] cursos;
    private double[] promedios;
    private int cur;
    private double promTotal;
    
    
    public Alumno(String nombre, String distrito, int cur) {
        super(nombre, distrito);
        this.cur = cur;
        notas = new int[10][2];
        cursos = new String[10];
        promedios = new double[10];
    }

    public double[] getPromedios() {
        return promedios;
    }

    public void setPromedios(double[] promedios) {
        this.promedios = promedios;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getPromTotal() {
        return promTotal;
    }

    public void setPromTotal(double promTotal) {
        this.promTotal = promTotal;
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
        int x = rand.nextInt(2020-1995+1) + 1995;
        this.tiempo = Year.now().getValue() - x;
        this.codigo = "A" + x + "" + (rand.nextInt(9999-1000+1)+1000);
    }
    
    //SOLICITA NOMBRE DE CURSOS Y LOS GUARDA EN UN ARREGLO CON TAMAÑO "CUR"
    
    public void SolicitarNotas(){
        
        Random rand = new Random();
        double prom = 0.0;
        
        
        for(int i=0; i<cur; i++){
            cursos[i] = JOptionPane.showInputDialog("Ingresar nombre de curso #" + (i+1));
        }
        
        
        for(int i=0; i<cur; i++){
            for(int j=0; j<2; j++){
                
                notas[i][j] = rand.nextInt(20)+1;
                
                prom += notas[i][j];
                
            }
            
            this.promedios[i] = prom/2;
            this.promTotal += prom/2;
            prom = 0;
        }
        
        this.promTotal /= cur;
        
    }

    @Override
    public void SolicitarCursos() {
        
        
        
    }
    
}
