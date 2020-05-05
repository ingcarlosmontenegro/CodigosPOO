/**
* sumar enteros capturados por joptionpane
*/

import javax.swing.JOptionPane;
public class Suma{
	public static void main(String[] args){
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un entero"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un entero"));
		JOptionPane.showMessageDialog(null,a+" + "+b+" = "+(a+b));
	}
}
