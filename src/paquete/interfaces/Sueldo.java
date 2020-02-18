/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.interfaces;

/**
 *
 * @author Nikolas
 */
public interface Sueldo {
    
    double pagoHora_Docente = 30.5, pagoHora_Staff = 28.5;
    
    void SolicitarHoras();
    void CalcularSueldo();
    
    
}
