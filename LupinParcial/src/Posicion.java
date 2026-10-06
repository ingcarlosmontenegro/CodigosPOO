/**
 * Módulo: Posicion
 * Caja negra:
 *   Entradas: fila, columna
 *   Salidas: getters de fila y columna, comparación de igualdad
 *   Función: Representar una coordenada (x,y) en el tablero.
 *   Independiente: no depende de otras clases del juego.
 */
public class Posicion {
    private int fila;
    private int columna;

    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    // Compara si dos posiciones son la misma (colisión)
    public boolean igualA(Posicion otra) {
        if (otra == null) return false;
        return this.fila == otra.fila && this.columna == otra.columna;
    }

    @Override
    public String toString() {
        return "(" + fila + "," + columna + ")";
    }
}
