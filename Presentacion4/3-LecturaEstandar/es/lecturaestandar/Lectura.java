package es.lecturaestandar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutput;

public class Lectura {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 	System.out.println("Ingrese la información a imprimir, para terminar ingresar #");				
			 	InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			 	BufferedReader br = new BufferedReader(inputStreamReader);
		        
		        String linea;
		       
				while (!(linea = br.readLine()).equals( "#" ))
					{
					    System.out.println(linea);
					}
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		 
	}

}
