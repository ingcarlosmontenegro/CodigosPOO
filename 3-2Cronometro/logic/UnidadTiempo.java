/*
 * UnidadTiempo.java
 * 
 * Created on 6/09/2007, 10:43:46 PM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author alejo
 */
class UnidadTiempo {
    protected int valor;
    protected int tope;
    
    protected int forward(){
        if(valor < tope)valor++;
        else valor=0;
        return valor;
    }

    protected int back(){
        if(valor > 0)valor--;
        else valor=tope;
        return valor;
    }
    
    protected int reset(){
        valor=0;
        return valor;
    }
}
