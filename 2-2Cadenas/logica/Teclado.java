/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author alejo
 */
public class Teclado {
    private InputStreamReader isr;
    private BufferedReader br;
    public Teclado() {
       isr = new InputStreamReader(System.in);
       br = new BufferedReader(isr);
    }
    
    public String capturarCadena(){
        String cadena = "";
        try{
            cadena = br.readLine();
        }catch(IOException e){
            System.out.println("error en la entrada");
        }
        return cadena;
    }
    
    public void capturarNumero(int numero){
        numero=0;
        try{
            numero = Integer.parseInt(br.readLine(),10);
        }catch(IOException e){
            System.out.println("error en la entrada");
        }catch(NumberFormatException e){
            System.out.println("error en formato numérico");
        }
    }
    
    public void capturarNumero(float numero){
        numero=0;
        try{
            numero = Float.parseFloat(br.readLine());
        }catch(IOException e){
            System.out.println("error en la entrada");
        }catch(NumberFormatException e){
            System.out.println("error en formato numérico");
        }
    }
    
    public void capturarNumero(double numero){
        numero=0;
        try{
            numero = Double.parseDouble(br.readLine());
        }catch(IOException e){
            System.out.println("error en la entrada");
        }catch(NumberFormatException e){
            System.out.println("error en formato numérico");
        }
    }

}
