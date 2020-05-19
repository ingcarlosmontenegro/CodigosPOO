/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

/**
 *
 * @author Juanjo - Edward and Carlos
 */
public class Vehiculo {
    public String matricula;

    public Vehiculo()
    {
        System.out.println("Creación finalizada");
    }

    public void describeme()
    {
        System.out.println("Soy un vehículo y tengo esta matrícula: " + matricula);
    }

    public void describeme(String matricula)
    {
        this.matricula = matricula;
        describeme();
    }

}
