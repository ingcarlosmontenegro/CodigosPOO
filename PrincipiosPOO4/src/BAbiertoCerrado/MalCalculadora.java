package BAbiertoCerrado;

public class MalCalculadora {
	public double calcular (String tipo, double a, double b) {
		if (tipo.equals("suma")) return a+b;
		else if (tipo.equals("resta")) return a-b;
		// si quiero otra la agrego
		else throw new IllegalArgumentException("Operqacion no existe");
	}

}
