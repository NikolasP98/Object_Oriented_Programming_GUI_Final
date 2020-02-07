/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Scanner;

/**
 *
 * @author L46374
 */
public abstract class Persona {
    protected String nombre, codigo, distrito;
    protected Universidad uni;
    protected Thread t;
    
    protected String sep = "================================================";
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Universidad getUni() {
        return uni;
    }

    public void setUni(Universidad uni) {
        this.uni = uni;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    
    //METODO SOLICITUD DE NOMBRE
    public void SolicitarNombre(){
        
        Scanner sc = new Scanner(System.in);
        int ver=2;
        
        while(ver != 1){
            
            System.out.println("Ingresar nombre: ");
        
            this.nombre = sc.nextLine();
            
            System.out.println(sep);
            System.out.println("Nombre ingresado: " + this.nombre);
            System.out.println("Es correcto? \n1. Sí \n2. No");
            
            ver = sc.nextInt();
            sc.nextLine();
            System.out.println(sep);
        }
    }
    
    //SOLICITAR DISTRITO DE RESIDENCIA
    public void SolicitarDistrito(){
        Scanner sc = new Scanner(System.in);
        int ver=2;
        
        while(ver!=1){
            
            System.out.println("Ingresar distrito de residencia: ");
        
            this.distrito = sc.nextLine();
            
            System.out.println(sep);
            System.out.println("Distrito ingresado: " + this.distrito);
            System.out.println("Es correcto? \n1. Sí \n2. No");
            
            ver = sc.nextInt();
            sc.nextLine();
        }
    } 
    
    public abstract void GenerarCodigo();
    
    
    /*
    public void Iniciar(){
        this.SolicitarNombre();
        this.SolicitarDistrito();
        this.GenerarCodigo();
    }
    */
    
    
    
    
    public String VerInfo() {
        return "Nombre: " + nombre + 
                "\nCodigo: " + codigo + 
                "\nDistrito: " + distrito + 
                "\nUniversidad: " + uni;
    }
}
