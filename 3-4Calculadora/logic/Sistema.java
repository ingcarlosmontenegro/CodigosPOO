/*
 * Matematicas.java
 *
 * Created on 29 de agosto de 2007, 09:31 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author alejo
 */
abstract public class Sistema {
    protected int numeroA;
    protected int numeroB;
    protected int resultado;
    protected char operacion;
    protected int base;
    
    public Sistema() {
        this.numeroA = 0;
        this.numeroB = 0;
        this.resultado = 0;
        this.operacion = ' ';
    }
    
    public void setNumeroA(int n){
        this.numeroA = n;
    }
    
    public void setNumeroB(int n){
        this.numeroB = n;
    }
    
    public void setResultado(int n){
        this.resultado = n;
    }
    
    public void setOperacion(char o){
        this.operacion = o;
    }
    
    public int getNumeroA(){
        return this.numeroA;
    }
    
    public int getNumeroB(){
        return this.numeroB;
    }
    
    public int getResultado(){
        return this.resultado;
    }
    
    public char getOperacion(){
        return this.operacion;
    }
    
    public void suma(){
        this.resultado = this.numeroA + this.numeroB;
    }
    public void resta(){
        this.resultado = this.numeroA - this.numeroB;
    }
    public void multiplicacion(){
        this.resultado = this.numeroA * this.numeroB;
    }
    public void division(){
        this.resultado = this.numeroA / this.numeroB;
    }
    
    public void establecerNumeroA(String a){
        int n = Integer.parseInt(a,base);
        this.setNumeroA(n);
    }
    public void establecerNumeroB(String b){
        int n = Integer.parseInt(b,base);
        this.setNumeroB(n);
    }
    public String retornarNumeroA(){
        String cad="";
        switch(base){
        case 2:
            cad = Integer.toBinaryString(numeroA);
            break;
        case 8:
            cad = Integer.toOctalString(numeroA);
            break;
        case 10:
            cad = String.valueOf(numeroA);
            break;
        case 16:
            cad = Integer.toHexString(numeroA);
            break;
        }
        return cad;
        
    }
    public String retornarNumeroB(){
        String cad="";
        switch(base){
        case 2:
            cad = Integer.toBinaryString(numeroB);
            break;
        case 8:
            cad = Integer.toOctalString(numeroB);
            break;
        case 10:
            cad = String.valueOf(numeroB);
            break;
        case 16:
            cad = Integer.toHexString(numeroB);
            break;
        }
        return cad;
    }
    public String retornarResultado(){
        String cad="";
        switch(base){
        case 2:
            cad = Integer.toBinaryString(resultado);
            break;
        case 8:
            cad = Integer.toOctalString(resultado);
            break;
        case 10:
            cad = String.valueOf(resultado);
            break;
        case 16:
            cad = Integer.toHexString(resultado);
            break;
        }
        return cad;
    }
        
}
