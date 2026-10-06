public class Interfaces {
	
  public static void main(String[] args) {
    Mamifero bisho = new Mamifero();
    bisho.mover();
    bisho.nadar();
    bisho = new Gato();
    bisho.mover();
    bisho.nadar();
  }
 }