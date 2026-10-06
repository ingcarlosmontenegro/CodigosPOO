/**
 * Módulo: Ladron
 * Caja negra:
 *   Entradas: posición inicial, movimiento del usuario (dirección)
 *   Salidas: nueva posición, cantidad de llaves recolectadas, estado (atrapado o no)
 *   Función: Controlar al personaje principal (Lupin). Se mueve con teclado,
 *            respeta límites del tablero y recolecta llaves.
 *   Independiente: solo conoce su propia posición y estado.
 */
public class Ladron {
    private Posicion posicion;
    private Posicion posicionInicial;
    private int llaves;
    private boolean enParte2; // true cuando ya cruzó a la segunda bóveda

    public Ladron(int filaInicial, int columnaInicial) {
        this.posicion = new Posicion(filaInicial, columnaInicial);
        this.posicionInicial = new Posicion(filaInicial, columnaInicial);
        this.llaves = 0;
        this.enParte2 = false;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getLlaves() {
        return llaves;
    }

    public boolean estaEnParte2() {
        return enParte2;
    }

    public void setEnParte2(boolean valor) {
        this.enParte2 = valor;
    }

    // Recoge una llave (máximo 3)
    public void recolectarLlave() {
        if (llaves < 3) {
            llaves++;
            System.out.println("¡Llave recolectada! Total: " + llaves);
        }
    }

    // Mueve al ladrón según dirección. Direcciones válidas: w/a/s/d o 8/4/2/6
    // Retorna true si el movimiento fue válido
    public boolean mover(char direccion, int maxFilas, int maxColumnas, boolean[][] puertasAbiertas) {
        int nuevaFila = posicion.getFila();
        int nuevaColumna = posicion.getColumna();

        switch (Character.toLowerCase(direccion)) {
            case 'w': case '8': // arriba
                nuevaFila--;
                break;
            case 's': case '2': // abajo
                nuevaFila++;
                break;
            case 'a': case '4': // izquierda
                nuevaColumna--;
                break;
            case 'd': case '6': // derecha
                nuevaColumna++;
                break;
            default:
                System.out.println("Tecla no válida. Usa W A S D o 8 4 2 6");
                return false;
        }

        // Verificar límites del tablero
        if (nuevaFila < 0 || nuevaFila >= maxFilas || nuevaColumna < 0 || nuevaColumna >= maxColumnas) {
            System.out.println("¡No puedes salir del tablero!");
            return false;
        }

        // Si intenta pasar a la parte 2 sin tener las 3 llaves / puertas abiertas
        // (la columna de las puertas está en el medio del tablero)
        int columnaPuertas = maxColumnas / 2;
        if (!enParte2 && nuevaColumna >= columnaPuertas) {
            if (llaves < 3) {
                System.out.println("Necesitas las 3 llaves para abrir las puertas.");
                return false;
            }
            // Se consideran las puertas abiertas
            enParte2 = true;
            System.out.println("¡Has abierto las puertas y entrado a la segunda bóveda!");
        }

        posicion.setFila(nuevaFila);
        posicion.setColumna(nuevaColumna);
        return true;
    }

    // Cuando un perro lo atrapa, regresa al inicio
    public void regresarAlInicio() {
        posicion.setFila(posicionInicial.getFila());
        posicion.setColumna(posicionInicial.getColumna());
        enParte2 = false;
        System.out.println("¡Un perro te atrapó! Regresas al inicio.");
    }
}
