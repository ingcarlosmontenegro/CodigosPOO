package app.logica;

public class Tablero{
  private Ficha tableroJuego[][] = new Ficha [3][3];

  public Ficha[][] getTablero (){
    return tableroJuego;
  }

  public void setTablero (Ficha tableroTemp[][]){
    this.tableroJuego = tableroTemp;
  }

  public void llenar(){
    for (int i=0; i<3; i++){
      for (int j=0; j<3; j++){
        tableroJuego[i][j] = new Ficha();
        tableroJuego[i][j].setForma("-");
      }  
    }
  }

  public void ver(){
    for (int i=0; i<3; i++){
      for (int j=0; j<3; j++){
        System.out.print(tableroJuego[i][j].getForma() + " ");
      }
      System.out.println("");  
    }
  }

  public boolean verificarVacio (int x, int y){
    if (tableroJuego[x][y].getForma().equals("-")){
      return true;
    }
    else
     return false;
  }

  public boolean validarGanador(){
     boolean bandera;
     bandera = validarFilas();  
     if (!bandera)
      bandera = validarColumnas();
     return bandera;
  }
  
  public boolean validarFilas(){
    for (int i= 0; i < 3; i++){
        if ((tableroJuego[i][0].getForma().equals("X") && tableroJuego[i][1].getForma().equals("X") && tableroJuego[i][2].getForma().equals("X"))
        ||
        (tableroJuego[i][0].getForma().equals("O") && tableroJuego[i][1].getForma().equals("O") && tableroJuego[i][2].getForma().equals("O")))
        {
          return true;
        }
    }
      return false;
  }

  public boolean validarColumnas(){
    for (int i= 0; i < 3; i++){
        if ((tableroJuego[0][i].getForma().equals("X") && tableroJuego[1][i].getForma().equals("X") && tableroJuego[2][i].getForma().equals("X"))
        ||
        (tableroJuego[0][i].getForma().equals("O") && tableroJuego[1][i].getForma().equals("O") && tableroJuego[2][i].getForma().equals("O")))
        {
          return true;
        }
    }
      return false;
  }

}