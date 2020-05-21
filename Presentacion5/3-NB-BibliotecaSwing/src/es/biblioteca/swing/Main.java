/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.biblioteca.swing;

import javax.swing.JFrame;

/**
 *
 * @author Juanjo - Edward And Carlos
 */
public class Main {

    
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Ventana v = new Ventana(biblioteca);
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.pack();
        v.setVisible(true);
    }

}
