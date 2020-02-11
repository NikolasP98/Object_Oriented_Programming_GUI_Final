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
    private int contador = 0;
    
    public Gestion_Alumnos() {
        alum = new Alumno[100];
    }

    public Alumno[] getAlum() {
        return alum;
    }

    public void setAlum(Alumno[] alum) {
        this.alum = alum;
    }
    
    public void AgregarAlum(int rep){
        if(contador < alum.length){
            Alumno a = new Alumno();
            
            for(int i=0; i<rep; i++){
                
                System.out.println(sep +"\nAlumno #" +(i+1) +":");
                
                a.Iniciar();
                
                this.alum[contador] = a;
                this.contador++;
            }
            
        } else {
            System.out.println("Límite de alumnos alcanzado. \nElimine algunos alumnos para utilizar esta función.");
        }
    }
    
    public void EliminarAlum(int i){
        int indic = i-1;
        
        if(contador>0 && contador > i){
            for(int k=indic; k<contador; k++){
                this.alum[indic] = this.alum[k+1];
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
        String cad= "";
        
        for(int i=0; i<contador; i++){
            cad+=alum[i].getNombre() + "\n";
        }
        System.out.println(cad);
        
    }
    
    
    
}
