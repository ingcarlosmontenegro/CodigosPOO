/**
 * Módulo: Puntaje
 * Caja negra:
 *   Entradas: nombre del jugador, puntos actuales, vidas perdidas
 *   Salidas: puntos actualizados, archivo de texto con el resultado
 *   Función: Manejar el sistema de puntuación (5000 iniciales, -1000 por atrapada)
 *            y guardar el resultado final en un archivo de texto plano.
 *   Independiente: solo se ocupa de números y de escribir en archivo.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Puntaje {
    private String nombreJugador;
    private int puntos;
    private int vidasGastadas;
    private static final int PUNTOS_INICIALES = 5000;
    private static final int PENALIZACION_PERRO = 1000;

    public Puntaje(String nombre) {
        this.nombreJugador = nombre;
        this.puntos = PUNTOS_INICIALES;
        this.vidasGastadas = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getVidasGastadas() {
        return vidasGastadas;
    }

    public String getNombre() {
        return nombreJugador;
    }

    // Cuando un perro atrapa al ladrón
    public void penalizarPorPerro() {
        vidasGastadas++;
        puntos -= PENALIZACION_PERRO;
        if (puntos < 0) puntos = 0;
        System.out.println("Puntos restantes: " + puntos + " | Vidas gastadas: " + vidasGastadas);
    }

    // Si pierde el juego sin tomar el premio
    public void perderTodo() {
        puntos = 0;
    }

    // Guarda el resultado en un archivo de texto plano
    public void guardarEnArchivo(boolean gano) {
        String nombreArchivo = "resultado_lupin.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fecha = LocalDateTime.now().format(formato);

            writer.println("========================================");
            writer.println("Jugador: " + nombreJugador);
            writer.println("Fecha: " + fecha);
            writer.println("Resultado: " + (gano ? "GANÓ" : "PERDIÓ"));
            writer.println("Puntos finales: " + puntos);
            writer.println("Vidas gastadas (atrapadas por perros): " + vidasGastadas);
            writer.println("========================================");
            writer.println();

            System.out.println("Resultado guardado en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
