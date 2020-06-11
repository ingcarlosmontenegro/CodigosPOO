/*
 * Clase Contador V1
 * Alejandro Daza
 * 16-03-2012
 */
package contador.logica;

/**
 * Contador maneja la logica de conteo
 *
 * @author chamo
 */
public abstract class Contador {

    protected int valor;
    protected int tope;

    public Contador() {
        valor = 0;
        tope = 4096;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void contar() {
        if (valor < tope) {
            valor++;
        } else {
            valor = 0;
        }
    }

    public abstract String mostrarConteo();
}
