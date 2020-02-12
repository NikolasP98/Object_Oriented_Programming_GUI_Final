/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import paquete.clases.Docente;
import static paquete.interfaces.Caracteres.sep;

/**
 *
 * @author L46374
 */
public class Gestion_Docentes {
    private Docente[] profe;
    private int contador;

    public Gestion_Docentes() {
        profe = new Docente[100];
        contador =0;
    }

    public Docente[] getProfe() {
        return profe;
    }

    public void setProfe(Docente[] profe) {
        this.profe = profe;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void AgregarProfe(Docente a){
        if(profe.length > contador){
            
            this.profe[contador] = a;
            this.contador++;
            
        } else {
            
            System.out.println("Límite de docentes alcanzado. \nElimine algunos docentes para utilizar esta función.");
        }
    }
    
    public void EliminarProfe(int i){
        int indic = i-1;
        
        if(contador>0 && contador > indic){
            for(int k=indic; k<contador; k++){
                this.profe[k] = this.profe[k+1];
            }
            
            this.profe[contador-1] = null;
            
            contador--;
        } else if(contador <= 0){
            System.out.println("Función inválida. No hay suficientes Docentes registrados.");
        } else if(contador < i) {
            System.out.println("Función inválida. Docente no existe.");
        }
    }
    
    public void MostrarGestion(){
        String cad= sep + "\nProfesores Ingresados:\n";
        
        for(int i=0; i<contador; i++){
            cad += "Docente " + (i+1) + ": " + profe[i].getNombre() + "\n";
        }
        System.out.println(cad);
        
    }
    
    public void VerInfo(){
        for(int i=0; i<contador; i++){
            System.out.println(profe[i].VerInfo() + "\n\n");
        }
    }
    
}
