/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int x = s.nextInt();
        System.out.println("Ingrese una frase: ");
        String palabra = s.next();
        palabra = palabra + s.nextLine();
        System.out.println(palabra + x);
    }
}
