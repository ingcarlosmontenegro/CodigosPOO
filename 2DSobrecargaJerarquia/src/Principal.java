
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo cl = new Circulo();
		System.out.println("Area: " + cl.getArea());
		System.out.println("Area: " + cl.getPerimetro());
		cl.setRadio(5);
		cl.calcularArea();
		cl.calcularPerimetro();
		System.out.println("Area: " + cl.getArea());
		System.out.println("Area: " + cl.getPerimetro());
		
	}

}
