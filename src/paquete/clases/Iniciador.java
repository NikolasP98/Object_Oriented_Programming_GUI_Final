/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Scanner;
import paquete.gestion.*;
import paquete.interfaces.Caracteres;

/**
 *
 * @author L46374
 */
public class Iniciador implements Caracteres{
    Alumno alum;
    Gestion_Alumnos galum;
    Scanner sc = new Scanner(System.in);
    
    
    
    public Iniciador() {
    }
    
    public void Iniciar(){
        int opcion;
        System.out.println(ifaz);
        System.out.println("Ingresar una opción: \n1. Alumnos \n2. Docentes \n3. Staff");
        
        opcion = sc.nextInt();
        
        switch(opcion) {
            
            case 1: //INTERFAZ PARA ALUMNO
                
                System.out.println(sep + "\nOpciones para ALUMNO: \n1. Agregar alumnos \n2. Ver alumnos \n3. Eliminar alumnos \n4. Regresar");
                opcion = sc.nextInt();
                
                switch(opcion){
                    
                    case 1: //AGREGAR ALUMNOS
                        
                        int b;
                        System.out.println(sep+"\nCuantos alumnos desea ingresar?");
                        b = sc.nextInt();
                        
                        galum.AgregarAlum(b);
                        
                        galum.MostrarGestion();
                        
                        break;
                    case 2: //VER TODOS LOS ALUMNOS
                        
                        break;
                    case 3: //ELIMINAR ALUMNOS
                        
                        break;
                    case 4: //VOLVER A INICIAR INTERFAZ
                        this.Iniciar();
                        break;
                    default: //ERROR
                        System.out.println("Opcion inválida");
                
                
                }
                
                break;
            case 2: //INTERFAZ PARA DOCENTES
                
                break;
            case 3: //INTERFAZ PARA STAFF
                
                break;
            default:
                System.out.println("Opción inválida");
        }
        
    }
    
    
    
    
    
}
