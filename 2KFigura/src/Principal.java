
public class Principal {
	public static void main(String args[]) {
		Circulo c1 = new Circulo();
		c1.setRadio(2.0);
		c1.calcularArea();
		c1.calcularPerimetro();
		System.out.println("El área del círculo es: " + c1.getArea());
		System.out.println("El perímetro del círculo es: " + c1.getPerimetro());
		
		Cuadrado c2 = new Cuadrado();
		c2.setLongitud(2.0);
		c2.calcularArea();
		c2.calcularPerimetro();
		System.out.println("El área del cuadrado es: " + c2.getArea());
		System.out.println("El perímetro del cuadrado es: " + c2.getPerimetro());
	
		Rectangulo c3 = new Rectangulo();
		c3.setBase(2.0);
		c3.setAltura(3.0);
		c3.calcularArea();
		c3.calcularPerimetro();
		System.out.println("El área del rectangulo es: " + c3.getArea());
		System.out.println("El perímetro del rectangulo es: " + c3.getPerimetro());
	
		Triangulo c4 = new Triangulo();
		c4.setBase(2.0);
		c4.setAltura(3.0);
		c4.calcularArea();
		c4.calcularPerimetro();
		System.out.println("El área del tringulo es: " + c4.getArea());
		System.out.println("El perímetro del triangulo es: " + c4.getPerimetro());
	
	}

}
