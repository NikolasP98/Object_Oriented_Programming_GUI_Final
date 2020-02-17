/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;


/**
 *
 * @author L46374
 */
public abstract class Persona{
    protected String nombre, codigo, distrito;
    //protected int cur;
    
    //protected Thread t;

    public Persona(String nombre, String distrito) {
        this.nombre = nombre;
        this.distrito = distrito;
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

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    
    public abstract void GenerarCodigo();
    
    
    
}
