/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lineasdibujables.gui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import lineasdibujables.logica.Linea;
import lineasdibujables.logica.Punto;

/**
 *
 * @author estudiantes
 */
public class MiCanvas extends Canvas{
    Punto origen;
    Punto fin;
    ArrayList<Linea> lineas;
    boolean enOrigen;
    
    public MiCanvas() {
        enOrigen = true;
        this.lineas = new ArrayList<Linea>();
    }
    
    public void addLinea(Linea linea) {
        this.lineas.add(linea);
    }
    
    @Override
    public void paint(Graphics g) {
        
        for (Iterator<Linea> it = lineas.iterator(); it.hasNext();) {
            Linea linea = it.next();
            linea.dibujar(g);
        }
    }

    public void operacion(MouseEvent e) {
       if(enOrigen){
           origen = new Punto(e.getX(), e.getY());   
       }else{
           fin = new Punto(e.getX(), e.getY()); 
           addLinea(new Linea(origen, fin));
           repaint();
       }
       enOrigen = !enOrigen;
    }

    
}
