/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.StringTokenizer;
import logica.*;
/**
 *
 * @author alejo
 */
public class ElSordo {
    
    public static void main(String[] args){
        Teclado t = new Teclado();
        System.out.println("ingresa tu nombre: ");
        String nombre = t.capturarCadena();
        StringTokenizer st = new StringTokenizer(nombre);
        String palabras[] = new String[st.countTokens()];
        int x = st.countTokens()-1;
        while(st.hasMoreTokens()){
            palabras[x]=st.nextToken();
            x--;
        }
        String temp = "";
        for(int c=0;c<palabras.length-1;c++){
            temp = palabras[c];
            palabras[c]=palabras[c+1]+" ";
            palabras[c+1]=temp;
        }
        String nombreDesordenado = "";
        for(int c=0;c<palabras.length;c++){
            nombreDesordenado+=palabras[c]+" ";
        }
        
        System.out.println("lo siento no entendi, su nombre es "+nombreDesordenado);
        int numeroEntero=0;
        float precioBajito=0;
        double precioAlto=0;
        System.out.println("podria indicarme cuantos años tiene?");
        t.capturarNumero(numeroEntero);
        System.out.println("podria decirme un precio aproximado del dolar?");
        t.capturarNumero(precioBajito);
        System.out.println("podria ahora devirme cuantos pesos son 1000 dolares?");
        t.capturarNumero(precioAlto);
        System.out.println("a ver si capte bien");
        System.out.println("usted tiene mas o menos "+precioBajito+" años");
        System.out.println("y 1000 dolares son "+numeroEntero+" pesos a "+precioAlto+" pesos por dolares!");
        System.out.println("no, creo que no entendi");
    }

}
