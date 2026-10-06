public class Zoo {
	
public static void main(String[] _args) {
	
	Animal[] animales = new Animal[3];
	animales[0] = new Animal();
	animales[1] = new Mamifero();
	animales[2] = new Ave();
	int i = (int) (3*Math.random());
	animales[i].saludo();
	}
}