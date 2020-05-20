/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

/**
 *
 * @author Carlos
 */
public class Vehiculo {
    public String matricula;

    public Vehiculo()
    {
        System.out.println("Creaci�n finalizada");
    }

    public void describeme()
    {
        System.out.println("Soy un veh�culo y tengo esta matr�cula: " + matricula);
    }

    public void describeme(String matricula)
    {
        this.matricula = matricula;
        describeme();
    }

}
