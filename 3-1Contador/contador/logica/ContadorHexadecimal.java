/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contador.logica;

/**
 *
 * @author chamo
 */
public class ContadorHexadecimal extends Contador{
    public String mostrarConteo(){
        return Integer.toHexString(valor);
    }
    
}
