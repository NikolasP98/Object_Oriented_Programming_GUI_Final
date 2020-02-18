/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.time.Year;
import java.util.Random;
import javax.swing.JOptionPane;
import paquete.interfaces.Sueldo;

/**
 *
 * @author Nikolas
 */
public class Staff extends Persona implements Sueldo{
    private int tiempo, resp, totalHrs;
    private String puesto;
    private String[] responsabilidad;
    private double sueldo;
    private int[] horas;

    public Staff(String nombre, String distrito, String puesto, int resp) {
        super(nombre, distrito);
        this.puesto = puesto;
        this.resp = resp;
        responsabilidad = new String[10];
        horas = new int[10];
    }
    
    
    
    
    
    @Override
    public void GenerarCodigo() {
        Random rand = new Random();
        int x = rand.nextInt(2020-1995+1) + 1995;
        this.tiempo = Year.now().getValue() - x;
        this.codigo = "S" + x + "" + (rand.nextInt(9999-1000+1)+1000);
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getResp() {
        return resp;
    }

    public void setResp(int resp) {
        this.resp = resp;
    }

    public int getTotalHrs() {
        return totalHrs;
    }

    public void setTotalHrs(int totalHrs) {
        this.totalHrs = totalHrs;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String[] getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String[] responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int[] getHoras() {
        return horas;
    }

    public void setHoras(int[] horas) {
        this.horas = horas;
    }

    
    
    
    
    
    @Override
    public void SolicitarHoras() {
        
        Random rand = new Random();
        int totHoras = 0;
        
        
        for(int i=0; i<resp; i++){
            
            responsabilidad[i] = JOptionPane.showInputDialog("Ingresar responsabilidad #" + (i+1));
            
            horas[i] = rand.nextInt(7)+2;

            totHoras += horas[i];
        }
        
        this.totalHrs = totHoras;
        
    }

    @Override
    public void CalcularSueldo() {
        this.sueldo = this.totalHrs * pagoHora_Staff * 4.0;
    }
    
}
