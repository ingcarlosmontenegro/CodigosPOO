/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;
import persistencia.Archivo;
import java.util.Random;
/**
 *
 * @author chamo
 */
public class Cuadrito {
    private int[][] cuadrito;
    private final int _DIMENSION = 3;

    public Cuadrito() {
        this.cuadrito = new int[_DIMENSION][_DIMENSION];
    }

    public int[][] getCuadrito() {
        return cuadrito;
    }
    
    
    
    public void iniciarCuadrito(){
        Random aleatorio = new Random();
        int x;
        for(int f=0;f<_DIMENSION;f++){
            for(int c=0;c<_DIMENSION;c++){
                do{
                    x = aleatorio.nextInt(9)+1;
                }while(buscarNumero(x));
                cuadrito[f][c]=x;
            }
        }
    }
    
    public void mover(char c){
        int fil=0, col=0;
        for(int f=0;f<_DIMENSION;f++){
            for(int s=0;s<_DIMENSION;s++){
                if(cuadrito[f][s]==9){
                    fil = f;
                    col = s;
                }
            }
        }
        switch(c){
            case 'i'://izquierda
                if(col!=2){
                   cuadrito[fil][col]=cuadrito[fil][col+1];
                   cuadrito[fil][col+1]=9;
                }
                break;
            case 'a'://arriba
                if(fil!=0){
                   cuadrito[fil][col]=cuadrito[fil-1][col];
                   cuadrito[fil-1][col]=9;
                }
                break;
            case 'd'://derecha
                if(col!=0){
                   cuadrito[fil][col]=cuadrito[fil][col-1];
                   cuadrito[fil][col-1]=9;
                }
                break;
            case 'b'://abajo
                if(fil!=2){
                   cuadrito[fil][col]=cuadrito[fil+1][col];
                   cuadrito[fil+1][col]=9;
                }
                break;
        }
    }
    
    private boolean buscarNumero(int n){
        boolean encontrado=false;
        for(int f=0;f<_DIMENSION;f++){
            for(int c=0;c<_DIMENSION;c++){
                if(cuadrito[f][c]==n){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean verificarOrden(){
        int cont=1;
        for(int f=0;f<_DIMENSION;f++){
            for(int c=0;c<_DIMENSION;c++){
                if(cuadrito[c][f]!=cont){
                    return false;
                }
                cont++;
            }
        }
        return true;
    }
    
    public void guardarCuadrito(){
        Archivo.escribirArrego(cuadrito);
    }
    
    public void cargarCuadrito(){
        this.cuadrito=Archivo.leerArrego(_DIMENSION);
    }

}
