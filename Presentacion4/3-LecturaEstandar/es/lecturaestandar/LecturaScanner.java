package es.lecturaestandar;

import java.io.ObjectOutput;
import java.util.Scanner;

public class LecturaScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;
		System.out.println("Ingrese la información a imprimir");
		Scanner sc = new Scanner(System.in);
		do{
			texto = sc.next();
			System.out.println(texto);
		}while(!(texto.equals("#")));
		

	}

	
	

}
