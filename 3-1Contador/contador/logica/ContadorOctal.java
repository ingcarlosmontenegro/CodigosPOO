/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contador.logica;

/**
 *
 * @author chamo
 */
public class ContadorOctal extends Contador{
    public String mostrarConteo(){
        return Integer.toOctalString(valor);
    }
    
}
