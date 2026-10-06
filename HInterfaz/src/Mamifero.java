
public class Mamifero implements PuedeMoverse, PuedeNadar {
	  String especie, color;
	  
	  public void mover() {
	    System.out.println("El mamifero es el que se mueve");
	  }

	  @Override
	  public void nadar() {
		  System.out.println("El mamifero nada");	
	  }	  
}
