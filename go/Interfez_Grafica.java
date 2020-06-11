package go;

public class Interfez_Grafica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero tablero = new Tablero();
		darColorBlanco(tablero);
		imprimir (tablero);
	}
	
	//Imprime el tablero enviado
	public static void imprimir (Tablero tablero){
		for (int i=0; i<6; i++){
			for (int j=0; j<7; j++){
				System.out.print(tablero.entregaTablero()[i][j].entregaColor());
			}
			System.out.println();
		}
	}
	
	//Llenar todo de blanco
	public static void darColorBlanco (Tablero tablero){
		for (int i=0; i<6; i++){
			for (int j=0; j<7; j++){
				tablero.damePosicionTableroYColor(i,j,"Blanco");
			}
		}
	}

}
