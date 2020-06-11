/*
 * Cronometro.java
 * 
 * Created on 7/09/2007, 08:56:17 AM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author alejo
 */
public class Cronometro {
    Horas h;
    Minutos m;
    Segundos s;
    
    int memCont;
    
    String cadena;

    public Cronometro() {
        h = new Horas();
        m = new Minutos();
        s = new Segundos();
        memCont=0;
                
        cadena = new String("0 : 0 : 0");

    }
    
    public String forward(){       
        if(s.forward()==0){
            if(m.forward()==0){
                h.forward();
            }
        }
        
        cadena = h.valor + " : " + m.valor + " : " + s.valor;
        return cadena;
    }
    
     public String back(){       
        if(s.back()==s.tope){
            if(m.back()==m.tope){
                h.back();
            }
        }
        
        cadena = h.valor + " : " + m.valor + " : " + s.valor;
        return cadena;
    }
    
    public String reset(){
        s.reset();
        m.reset();
        h.reset();
        cadena = h.valor + " : " + m.valor + " : " + s.valor;
        return cadena;
    }
    

}
