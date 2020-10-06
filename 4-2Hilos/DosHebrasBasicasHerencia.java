/*
 * DosHebrasBasicasHerencia.java
 * 
 * Created on 12/05/2008, 09:09:31 AM
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class DosHebrasBasicasHerencia extends Thread{
    int cont;
    boolean bandera = true;
    public DosHebrasBasicasHerencia(int c) {
        cont = c;
    }
    
    public void run(){
        while(bandera){
            System.out.println(cont++);
            if(cont>100)bandera=false;
        }
    }
    
    public static void main(String[] args){
        new DosHebrasBasicasHerencia(0).start();
        new DosHebrasBasicasHerencia(1).start();
    }

}
