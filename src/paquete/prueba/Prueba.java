/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.clases.*;

/**
 *
 * @author L46374
 */
public class Prueba {
    public static void main(String[] args) {
        Docente niko = new Docente();
        niko.SolicitarCursos();
        niko.SolicitarHoras();
        System.out.println(niko.VerInfo());
        
        //No me sale el sueldo de profe :(
    }
}
