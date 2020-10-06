package exeptions;

import javax.swing.JOptionPane;

class Melon {
	public static void main( String[] a ) {
		int valor;
		try {
			int x;
			int [] arreglo = new int [5]; 
			for( x=0,valor = 100; x < 100; x ++ ) {
				valor /= x;
			}
		}
		catch( ArithmeticException e ) {
			System.out.println( "Matemáticas locas!" );
		}
		catch( Exception e ) {
			System.out.println( "Se ha producido un error" );
		}
	}
}