package exeptions;

import javax.swing.JOptionPane;

class Melon {
	public static void main( String[] a ) {
		int i=0, j=0, k;
		k = i/j; // Origina un error de division-by-zero
		System.out.println (k);
	}
}