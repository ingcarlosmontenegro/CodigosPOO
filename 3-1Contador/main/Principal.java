/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import contador.gui.JFrameContador;
import contador.logica.*;

/**
 *
 * @author chamo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador contador = new ContadorHexadecimal();//cambia aqui el contador que quieras
        int limite=4099;   //modifica hasta donde quieres que cuente
        for(int i=0;i<limite;i++){
            contador.contar();
            System.out.println(contador.mostrarConteo());
        }
        JFrameContador gui = new JFrameContador();
        gui.setVisible(true);     
    }
}
