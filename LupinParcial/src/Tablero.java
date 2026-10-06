/**
 * Módulo: Tablero
 * Caja negra:
 *   Entradas: posiciones del ladrón, perros, vigilante, llaves y premio
 *   Salidas: representación visual del tablero (imprimir)
 *   Función: Dibujar el estado actual del juego en consola.
 *            Maneja las dos bóvedas, puertas, llaves y premio.
 *   Independiente: solo recibe datos y los muestra, no modifica el juego.
 */
public class Tablero {
    public static final int FILAS = 8;
    public static final int COLUMNAS = 14;
    public static final int COLUMNA_PUERTAS = 6; // mitad del tablero

    private char[][] matriz;
    private Posicion[] llaves;
    private boolean[] llaveRecogida;
    private Posicion premio;

    public Tablero() {
        matriz = new char[FILAS][COLUMNAS];
        // Posiciones de las 3 llaves (parte 1)
        llaves = new Posicion[3];
        llaves[0] = new Posicion(6, 1);
        llaves[1] = new Posicion(6, 3);
        llaves[2] = new Posicion(6, 5);
        llaveRecogida = new boolean[3];

        // Premio (caja fuerte) en la parte 2
        premio = new Posicion(3, 12);

        limpiar();
    }

    private void limpiar() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = '.';
            }
        }
        // Dibujar puertas (cerradas con | )
        for (int i = 0; i < FILAS; i++) {
            matriz[i][COLUMNA_PUERTAS] = '|';
        }
    }

    public Posicion getPremio() {
        return premio;
    }

    public Posicion[] getLlaves() {
        return llaves;
    }

    public boolean[] getLlaveRecogida() {
        return llaveRecogida;
    }

    // Marca una llave como recogida
    public void marcarLlaveRecogida(int indice) {
        if (indice >= 0 && indice < 3) {
            llaveRecogida[indice] = true;
        }
    }

    // Actualiza y dibuja el tablero con todas las entidades
    public void dibujar(Ladron ladron, Perro[] perros, Vigilante vigilante) {
        limpiar();

        // Si el ladrón tiene 3 llaves, las puertas se abren (espacio)
        if (ladron.getLlaves() >= 3) {
            for (int i = 0; i < FILAS; i++) {
                matriz[i][COLUMNA_PUERTAS] = ' ';
            }
        }

        // Colocar llaves que aún no se han recogido
        for (int i = 0; i < 3; i++) {
            if (!llaveRecogida[i]) {
                Posicion p = llaves[i];
                matriz[p.getFila()][p.getColumna()] = 'K';
            }
        }

        // Colocar premio
        matriz[premio.getFila()][premio.getColumna()] = '$';

        // Colocar perros
        for (Perro p : perros) {
            Posicion pos = p.getPosicion();
            matriz[pos.getFila()][pos.getColumna()] = 'P';
        }

        // Colocar vigilante
        Posicion vPos = vigilante.getPosicion();
        matriz[vPos.getFila()][vPos.getColumna()] = 'V';

        // Colocar ladrón (sobre-escribe si coincide)
        Posicion lPos = ladron.getPosicion();
        matriz[lPos.getFila()][lPos.getColumna()] = 'L';

        // Imprimir
        System.out.println();
        System.out.println("  === CASTILLO DEL MAL DUQUE ===");
        System.out.println("  Parte 1 (bóveda)     |  Parte 2 (caja fuerte)");
        System.out.print("  ");
        for (int j = 0; j < COLUMNAS; j++) System.out.print("-");
        System.out.println();

        for (int i = 0; i < FILAS; i++) {
            System.out.print("  ");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int j = 0; j < COLUMNAS; j++) System.out.print("-");
        System.out.println();
        System.out.println("  L=Ladrón  P=Perro  K=Llave  V=Vigilante  $=Premio  |=Puertas");
        System.out.println();
    }
}
