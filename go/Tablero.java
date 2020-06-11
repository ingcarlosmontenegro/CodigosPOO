package go;

public class Tablero {

	private Ficha[][] tablero;
	
	public Tablero (){
		
		tablero = new Ficha [6][7];
		
		for (int i=0; i<6; i++){
			for (int j=0; j<7; j++){
				tablero[i][j] = new Ficha();
			}
		}
	}
	
	public void damePosicionTableroYColor (int posicionX, int posicionY, String colorJugador){
		//Asigno Color a la ficha
		tablero [posicionX][posicionY].dameColor(colorJugador);
	}
	
	public Ficha[][] entregaTablero (){
		//Regresa el tablero
		return tablero;
	}
}
