import java.io.*;

class CuentaCaracteres {
  
  public static void main(String args[]) throws IOException {
    int contador = 0;
    while (System.in.read() != '\n')
      contador++;
    System.out.println(); // Retorno de carro "gratuito"
    System.out.println("Tecleados " + contador + " caracteres.");
  }
}