package GestionErrores;

public class Principal {
	public static void main (String[] args) {
		int numerador = 10;
		int denominador = 0;
		
		try {
		int resultado = numerador / denominador;
		System.out.println(resultado);
		}
		catch (Exception e) {
			System.out.println("Existio un error");
			System.out.println(e.toString());
			
		}

		System.out.println("El programa termina normalmente");
	}

}
