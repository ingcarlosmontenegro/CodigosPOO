/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lineasdibujables.logica;

import java.awt.Graphics;

/**
 *
 * @author estudiantes
 */
public class Linea {
    private Punto origen;
    private Punto fin;

    public Linea(Punto origen, Punto fin) {
        this.origen = origen;
        this.fin = fin;
    }
    
    public double calcularDistancia(){
        double distancia = 0;
        
        distancia = Math.sqrt(Math.pow(Math.abs(origen.getX()-fin.getX()),2)+Math.pow(Math.abs(origen.getY()-fin.getY()),2));
        
        return distancia;
    }
    
    public void dibujar(Graphics g){
        g.drawLine(origen.getX(), origen.getY(), fin.getX(), fin.getY());
        g.drawString(String.valueOf(calcularDistancia()), origen.getX(), origen.getY());
    }
    
}
