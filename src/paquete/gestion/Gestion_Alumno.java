 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import javax.swing.JOptionPane;
import paquete.clases.*;

/**
 *
 * @author Nikolas
 */
public class Gestion_Alumno {
    private Alumno[] arreglo;
    private int contador, tipo;
    
    /*
    Tipo 1: alumno
    Tipo 2: docente
    Tipo 3: staff
    
    */
    
    public Gestion_Alumno() {
        arreglo = new Alumno[100];
        contador = 0;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    
    
    public Alumno[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Alumno[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    
        
    public void Agregar(Alumno a){
        
        if(arreglo.length > contador){
            
            this.arreglo[contador] = a;
            this.contador++;
            
        } else {
            
            JOptionPane.showMessageDialog(null,"Límite de ingresos alcanzado. \nElimine algunas entradas para utilizar esta función.");
        }
    }
    
    public void Eliminar(int i){

        
        if(contador>0 && contador > i){
            for(int k=i; k<contador; k++){
                
                this.arreglo[k] = this.arreglo[k+1];
                
            }
            
            this.arreglo[contador-1] = null;
            
            contador--;
            
        } else if(contador <= 0){
            JOptionPane.showMessageDialog(null,"Función inválida. No hay suficientes entradas registradas.");
        } else if(contador <= i) {
            JOptionPane.showMessageDialog(null,"Función inválida. Entrada inexistente.");
        }
    }
    
    
    
    
}
