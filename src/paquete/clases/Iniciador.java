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
    Docente prof;
    Gestion_Alumnos galum = new Gestion_Alumnos();
    Gestion_Docentes gprof = new Gestion_Docentes(); 
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
                        
                        System.out.println(sep+"\nCuantos alumnos desea ingresar?");
                        
                        int b = sc.nextInt();
                            for(int i=0; i<b; i++){
                                
                                Alumno a = new Alumno();
                                
                                System.out.println(sep +"\nAlumno #" +(i+1) +":");
                                a.Iniciar();
                                galum.AgregarAlum(a);
                                
                            }
                            
                        galum.MostrarGestion();
                        
                        opcion=0;
                        while(opcion != 1){
                            System.out.println("Ingrese 1 para regresar al menú:");
                            opcion = sc.nextInt();
                        }
                        
                        this.Iniciar();
                        
                        break;
                    case 2: //VER TODOS LOS ALUMNOS
                        
                        System.out.println(sep + "\nCargando datos de alumnos...");
                        try {Thread.sleep(2500);} catch (InterruptedException e) {}
                        System.out.println(sep);
                        
                        galum.VerInfo();
                        
                        
                        opcion=0;
                        while(opcion != 1){
                            System.out.println("Ingrese 1 para regresar al menú:");
                            opcion = sc.nextInt();
                        }
                        
                        this.Iniciar();
                        
                        break;
                        
                    case 3: //ELIMINAR ALUMNOS
                        System.out.println(sep + "\nEliminación de Alumno:, elegir alumno a borrar: ");
                        
                        galum.MostrarGestion();
                        
                        opcion = sc.nextInt();
                        
                        galum.EliminarAlum(opcion);
                        
                        System.out.println(sep);
                        
                        galum.MostrarGestion();
                        
                        opcion=0;
                        while(opcion != 1){
                            System.out.println("Ingrese 1 para regresar al menú:");
                            opcion = sc.nextInt();
                        }
                        
                        this.Iniciar();
                        
                        break;
                        
                    case 4: //VOLVER A INICIAR INTERFAZ
                        this.Iniciar();
                        break;
                        
                    default: //ERROR
                        System.out.println("Opcion inválida");
                        this.Iniciar();
                }
                break;
                
            case 2: //INTERFAZ PARA DOCENTES
                
                System.out.println(sep + "\nOpciones para DOCENTE: \n1. Agregar profesores \n2. Ver profesores \n3. Eliminar profesores \n4. Regresar");
                opcion = sc.nextInt();
                
                switch(opcion){
                    
                    case 1: //AGREGAR DOCENTES
                        
                        System.out.println(sep+"\nCuantos profesores desea ingresar?");
                        
                        int b = sc.nextInt();
                        
                            for(int i=0; i<b; i++){
                                
                                Docente a = new Docente();
                                
                                System.out.println(sep +"\nProfesor #" +(i+1) +":");
                                
                                a.Iniciar();
                                gprof.AgregarProfe(a);
                                
                            }
                            
                        gprof.MostrarGestion();
                        
                        opcion=0;
                        while(opcion != 1){
                            System.out.println("Ingrese 1 para regresar al menú:");
                            opcion = sc.nextInt();
                        }
                        
                        this.Iniciar();
                        
                        break;
                    case 2: //VER TODOS LOS DOCENTES
                        
                        System.out.println(sep + "\nCargando datos de docentes...\n");
                        try {Thread.sleep(2500);} catch (InterruptedException e) {}
                        System.out.println(sep);
                        gprof.VerInfo();
                        
                        
                        opcion=0;
                        while(opcion != 1){
                            System.out.println("Ingrese 1 para regresar al menú:");
                            opcion = sc.nextInt();
                        }
                        
                        this.Iniciar();
                        
                        break;
                        
                    case 3: //ELIMINAR DOCENTE
                        System.out.println(sep + "\nEliminación de Docente:, elegir profesor a borrar: ");
                        
                        gprof.MostrarGestion();
                        
                        opcion = sc.nextInt();
                        
                        gprof.EliminarProfe(opcion);
                        
                        System.out.println(sep);
                        
                        gprof.MostrarGestion();
                        
                        opcion=0;
                        while(opcion != 1){
                            System.out.println("Ingrese 1 para regresar al menú:");
                            opcion = sc.nextInt();
                        }
                        
                        this.Iniciar();
                        
                        break;
                        
                    case 4: //VOLVER A INICIAR INTERFAZ
                        this.Iniciar();
                        break;
                        
                    default: //ERROR
                        System.out.println("Opcion inválida");
                        this.Iniciar();
                }
                
                break;
            case 3: //INTERFAZ PARA STAFF
                
                break;
            default:
                System.out.println("Opción inválida");
                this.Iniciar();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
