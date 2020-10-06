package app;

import app.logica.*;
import java.util.Scanner;

/**
 * @author carlosmontenegromarin
 *
 */
public class Principal{

 Scanner sc = new Scanner (System.in);

 Tablero juego = new Tablero();

 public static void main (String args[]){
   Principal inicio = new Principal();
   inicio.juego.llenar();
   inicio.juego.ver();
   inicio.jugar();
 }  

 void jugar(){
  int x, y;
  int turno=1;
  while (turno <= 9){
    x = sc.nextInt();
    y = sc.nextInt();
    if (x>=0 && x<=2 && y>=0 && y<=2){
      if (turno%2!=0){
        if (juego.verificarVacio(x, y)){
          juego.getTablero()[x][y].setForma("X");
          juego.ver();
          if (juego.validarGanador()){
          System.out.println("Hay ganador X");
          turno=10;
          }
          turno++;
        }
      }
      else {
        if (juego.verificarVacio(x, y)){
          juego.getTablero()[x][y].setForma("O");
          juego.ver();
           if (juego.validarGanador()){
            System.out.println("Hay ganador O");
            turno=10;
          }
          turno++;
        }   
      }
    }
    else
     System.out.println("x o y estan fuera de rango");
  }  
}






} 