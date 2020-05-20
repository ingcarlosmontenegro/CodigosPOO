/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

/**
 *
 * @author Carlos
 */
public class Coche extends Vehiculo  {
    int numRuedas;

    public static int atributo;

    static {
        System.out.println("La clase coche acaba de crearse");
        atributo = 2;
    }

    public Coche(String matricula)
    {
        super();
        this.matricula = matricula;
    }

    public void describeme()
    {
        super.describeme();
        System.out.println("Soy un coche y tengo esta matr�cula: " + matricula);
    }

    public String toString()
    {
        String cadena = "Coche: " + matricula;
        return cadena;
    }

    public static void metodo()
    {
        System.out.println("Se ha llamado a un m�todo est�tico");
    }

}
