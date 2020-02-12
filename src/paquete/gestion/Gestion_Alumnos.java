/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import paquete.clases.*;
import paquete.interfaces.Caracteres;

/**
 *
 * @author L46374
 */
public class Gestion_Alumnos implements Caracteres{
    private Alumno[] alum;
    private int contador;
    
    public Gestion_Alumnos() {
        alum = new Alumno[100];
        contador = 0;
    }

    public Alumno[] getAlum() {
        return alum;
    }

    public void setAlum(Alumno[] alum) {
        this.alum = alum;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    public void AgregarAlum(Alumno a){
        if(alum.length > contador){
            
            this.alum[contador] = a;
            this.contador++;
            
        } else {
            
            System.out.println("Límite de alumnos alcanzado. \nElimine algunos alumnos para utilizar esta función.");
        }
    }
    
    public void EliminarAlum(int i){
        int indic = i-1;
        
        if(contador>0 && contador > indic){
            for(int k=indic; k<contador; k++){
                this.alum[k] = this.alum[k+1];
            }
            
            this.alum[contador-1] = null;
            
            
            
            
            contador--;
        } else if(contador <= 0){
            System.out.println("Función inválida. No hay suficientes alumnos registrados.");
        } else if(contador < i) {
            System.out.println("Función inválida. Alumno no existe.");
        }
    }
    
    public void MostrarGestion(){
        String cad = sep + "\nAlumnos Ingresados:\n";
        
        for(int i=0; i<contador; i++){
            cad += "Alumno " + (i+1) + ": " + alum[i].getNombre() + "\n";
        }
        System.out.println(cad);
        
    }
    
    public void VerInfo(){
        for(int i=0; i<contador; i++){
            System.out.println(alum[i].VerInfo() + "\n\n");
        }
    }
    
    
}
