/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.anrial.daw;

/**
 *
 * @author ana
 */
public class validar {
    public int numero(String valor){
        int numero = 0;
        try{
            numero = Integer.parseInt(valor);
        }catch(NumberFormatException nfe){
            
        }
    return numero;
    }
}
