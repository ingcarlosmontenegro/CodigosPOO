/**
 * Módulo: Juego (Controlador principal)
 * Caja negra:
 *   Entradas: nombre del jugador, dificultad elegida, teclas de movimiento
 *   Salidas: estado del juego (ganó/perdió), tablero actualizado, puntos finales
 *   Función: Orquestar todos los módulos. Controla el bucle principal del juego,
 *            detecta colisiones, aplica reglas de victoria/derrota y coordina
 *            el movimiento de ladrón, perros y vigilante.
 *   Este es el módulo central que usa a los demás.
 */
import java.util.Scanner;

public class Juego {
    private Ladron ladron;
    private Perro[] perros;
    private Vigilante vigilante;
    private Tablero tablero;
    private Puntaje puntaje;
    private Scanner scanner;
    private boolean terminado;
    private boolean gano;
    private int dificultad; // 1=Fácil, 2=Normal, 3=Difícil

    public Juego(String nombreJugador, int dificultad) {
        this.dificultad = dificultad;
        this.scanner = new Scanner(System.in);
        this.tablero = new Tablero();
        this.puntaje = new Puntaje(nombreJugador);
        this.terminado = false;
        this.gano = false;

        // Posición inicial del ladrón (según imagen: arriba-izquierda)
        this.ladron = new Ladron(1, 1);

        // Tres perros en la parte 1
        this.perros = new Perro[3];
        this.perros[0] = new Perro(3, 2);
        this.perros[1] = new Perro(3, 3);
        this.perros[2] = new Perro(3, 4);

        // Vigilante en la parte 2 (se mueve de lado a lado)
        this.vigilante = new Vigilante(2, 8, 7, 13);
    }

    public void iniciar() {
        System.out.println("\n========================================");
        System.out.println("   PROYECTO LUPIN - El ladrón bueno");
        System.out.println("========================================");
        System.out.println("Jugador: " + puntaje.getNombre());
        System.out.println("Dificultad: " + nombreDificultad());
        System.out.println("Puntos iniciales: 5000");
        System.out.println("Controles: W/A/S/D o 8/4/2/6 (arriba/izq/abajo/der)");
        System.out.println("Objetivo: Recoge las 3 llaves (K), abre las puertas y llega al premio ($)");
        System.out.println("Cuidado con los perros (P) y el vigilante (V)!");
        System.out.println("========================================\n");

        while (!terminado) {
            tablero.dibujar(ladron, perros, vigilante);
            mostrarEstado();

            System.out.print("Tu movimiento: ");
            String entrada = scanner.nextLine().trim();
            if (entrada.isEmpty()) continue;
            char tecla = entrada.charAt(0);

            // Intentar mover al ladrón
            boolean movio = ladron.mover(tecla, Tablero.FILAS, Tablero.COLUMNAS, null);
            if (!movio) continue;

            // Verificar si recogió alguna llave
            verificarLlaves();

            // Mover los perros (siempre)
            for (Perro p : perros) {
                p.mover(Tablero.FILAS, Tablero.COLUMNA_PUERTAS);
            }

            // Mover el vigilante (solo si ladrón está en parte 2)
            vigilante.mover(ladron.estaEnParte2());

            // Verificar colisiones
            verificarColisiones();

            // Verificar victoria
            if (ladron.getPosicion().igualA(tablero.getPremio())) {
                gano = true;
                terminado = true;
                System.out.println("\n*** ¡FELICIDADES! Robaste el contenido de la caja fuerte! ***");
            }
        }

        // Fin del juego
        if (!gano) {
            puntaje.perderTodo();
            System.out.println("\n*** Juego terminado. No lograste el premio. ***");
        }

        System.out.println("Puntos finales: " + puntaje.getPuntos());
        puntaje.guardarEnArchivo(gano);
    }

    private void verificarLlaves() {
        Posicion posL = ladron.getPosicion();
        Posicion[] llaves = tablero.getLlaves();
        boolean[] recogidas = tablero.getLlaveRecogida();

        for (int i = 0; i < 3; i++) {
            if (!recogidas[i] && posL.igualA(llaves[i])) {
                ladron.recolectarLlave();
                tablero.marcarLlaveRecogida(i);
            }
        }
    }

    private void verificarColisiones() {
        Posicion posL = ladron.getPosicion();

        // Colisión con perros (solo importa en parte 1, pero se revisa siempre)
        for (Perro p : perros) {
            if (posL.igualA(p.getPosicion())) {
                ladron.regresarAlInicio();
                puntaje.penalizarPorPerro();

                if (puntaje.getVidasGastadas() >= 3) {
                    terminado = true;
                    System.out.println("¡Los perros te atraparon 3 veces! Fin del juego.");
                }
                return; // una sola atrapada por turno
            }
        }

        // Colisión con vigilante (solo relevante en parte 2)
        if (ladron.estaEnParte2() && posL.igualA(vigilante.getPosicion())) {
            terminado = true;
            System.out.println("¡El vigilante te atrapó! Fin del juego.");
        }
    }

    private void mostrarEstado() {
        System.out.println("Ladrón: " + (puntaje.getVidasGastadas() == 0 ? "Feliz" : "Herido"));
        System.out.println("Vidas gastadas: " + puntaje.getVidasGastadas() + "/3");
        System.out.println("Llaves: " + ladron.getLlaves() + "/3");
        System.out.println("Puntos: " + puntaje.getPuntos());
        if (ladron.estaEnParte2()) {
            System.out.println(">>> Estás en la SEGUNDA BÓVEDA <<<");
        }
    }

    private String nombreDificultad() {
        switch (dificultad) {
            case 1: return "Fácil";
            case 2: return "Normal";
            case 3: return "Difícil";
            default: return "Normal";
        }
    }

    // Método main - punto de entrada
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   BIENVENIDO AL JUEGO LUPIN");
        System.out.println("====================================");
        System.out.print("Digite su nombre: ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) nombre = "Jugador";

        System.out.println("\nDigite la dificultad deseada:");
        System.out.println("1. Fácil");
        System.out.println("2. Normal");
        System.out.println("3. Difícil");
        System.out.print("Opción: ");

        int dif = 2; // por defecto Normal
        try {
            dif = Integer.parseInt(sc.nextLine().trim());
            if (dif < 1 || dif > 3) dif = 2;
        } catch (NumberFormatException e) {
            dif = 2;
        }

        // Nota: la dificultad se puede usar después para cambiar velocidad
        // de los perros o del vigilante. Por ahora se guarda el valor.
        Juego juego = new Juego(nombre, dif);
        juego.iniciar();

        sc.close();
    }
}
