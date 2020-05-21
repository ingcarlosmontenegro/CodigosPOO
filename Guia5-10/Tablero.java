public class Tablero {
  Fichas estadoTablero[][];
  
  public Tablero(){
    estadoTablero=new Fichas [6][7];
    }
 
  public boolean verSiLlena(int indice){
    return(estadoTablero[5][indice]==null);}

  public static void main (String args[]){
    Tablero juego = new Tablero();
    for (int i = 0; i< 6; i++){
      for (int j=0; j<7; j++){
        System.out.print(juego.estadoTablero[i][j]);
      }
    System.out.println("");   
    }
    System.out.println(juego.verSiLlena(6));
  }
  
}