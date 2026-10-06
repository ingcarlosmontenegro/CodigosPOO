/**
 * Módulo: Vigilante
 * Caja negra:
 *   Entradas: posición actual, si el ladrón está en parte 2
 *   Salidas: nueva posición (se mueve de lado a lado)
 *   Función: Solo se mueve cuando el ladrón entra a la segunda bóveda.
 *            Se desplaza horizontalmente de un lado a otro.
 *   Independiente: solo conoce su posición y dirección de movimiento.
 */
public class Vigilante {
    private Posicion posicion;
    private int direccion; // 1 = derecha, -1 = izquierda
    private int columnaMin;
    private int columnaMax;

    public Vigilante(int fila, int columna, int colMin, int colMax) {
        this.posicion = new Posicion(fila, columna);
        this.direccion = 1;
        this.columnaMin = colMin;
        this.columnaMax = colMax;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    // Solo se mueve si el ladrón ya está en la parte 2
    public void mover(boolean ladronEnParte2) {
        if (!ladronEnParte2) {
            return; // no se mueve todavía
        }

        int nuevaColumna = posicion.getColumna() + direccion;

        // Rebotar en los extremos de la segunda bóveda
        if (nuevaColumna > columnaMax) {
            nuevaColumna = columnaMax;
            direccion = -1;
        } else if (nuevaColumna < columnaMin) {
            nuevaColumna = columnaMin;
            direccion = 1;
        }

        posicion.setColumna(nuevaColumna);
    }
}
