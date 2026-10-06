/**
 * Módulo: Perro
 * Caja negra:
 *   Entradas: posición actual, límites del tablero (solo parte 1)
 *   Salidas: nueva posición después del movimiento aleatorio
 *   Función: Moverse aleatoriamente ±1 en fila o columna cada vez que el ladrón se mueve.
 *            Solo actúa en la primera bóveda.
 *   Independiente: solo conoce su posición y el límite de movimiento.
 */
import java.util.Random;

public class Perro {
    private Posicion posicion;
    private Random random;

    public Perro(int fila, int columna) {
        this.posicion = new Posicion(fila, columna);
        this.random = new Random();
    }

    public Posicion getPosicion() {
        return posicion;
    }

    // Mueve el perro de forma aleatoria (±1 en fila o en columna)
    // Solo dentro de la primera parte del tablero (columnas 0 a mitad-1)
    public void mover(int maxFilas, int columnaMaxParte1) {
        int opcion = random.nextInt(4); // 0=arriba, 1=abajo, 2=izq, 3=der
        int nuevaFila = posicion.getFila();
        int nuevaColumna = posicion.getColumna();

        switch (opcion) {
            case 0: nuevaFila--; break;
            case 1: nuevaFila++; break;
            case 2: nuevaColumna--; break;
            case 3: nuevaColumna++; break;
        }

        // Mantener dentro de límites de la parte 1
        if (nuevaFila < 0) nuevaFila = 0;
        if (nuevaFila >= maxFilas) nuevaFila = maxFilas - 1;
        if (nuevaColumna < 0) nuevaColumna = 0;
        if (nuevaColumna >= columnaMaxParte1) nuevaColumna = columnaMaxParte1 - 1;

        posicion.setFila(nuevaFila);
        posicion.setColumna(nuevaColumna);
    }
}
