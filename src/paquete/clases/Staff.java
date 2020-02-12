/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;
import paquete.interfaces.Caracteres;
import static paquete.interfaces.Caracteres.*;
import paquete.interfaces.Sueldo;

/**
 *
 * @author Nikolas
 */
public class Staff extends Persona implements Caracteres, Sueldo{
    private int tiempo, cur, totalHrs;
    private double sueldo;
    private int[] horas;
    
    
    @Override
    public void GenerarCodigo() {
        Random rand = new Random();
        int x = rand.nextInt(2020-1995+1) + 1995;
        this.tiempo = Year.now().getValue() - x;
        this.codigo = "S" + x + "" + (rand.nextInt(9999-1000+1)+1000);
    }



    @Override
    public void CalcularSueldo() {
        this.sueldo = this.totalHrs * pagoHora * 4.0;
    }
    
    
    
    
    @Override
    public String VerInfo() {
        return super.VerInfo() + "\nAños formando parte del Staff: " + this.tiempo +
                "\nHoras semanales: " + this.totalHrs +
                "\nSueldo mensual: " + this.sueldo; //To change body of generated methods, choose Tools | Templates.
    }
    
        @Override
    public void Iniciar() {
        this.SolicitarNombre();
        this.CalcularSueldo();
        this.SolicitarDistrito();
        this.GenerarCodigo();
        //this.SolicitarHoras();
    }
}
