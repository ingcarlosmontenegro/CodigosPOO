public class Main {

	public static void main(String[] args) {
		Dias semana = new Dias();
		//semana.LUNES = 1; No se puede cambiar por que es FInal.
		System.out.println("Día 1: " + semana.LUNES);
		System.out.println("Día 2: " + semana.MARTES);
		System.out.println("Día 3: " + semana.MIERCOLES);
		System.out.println("Día 4: " + semana.JUEVES);
		System.out.println("Día 5: " + semana.VIERNES);
		System.out.println("Día 6: " + semana.SABADO);
		System.out.println("Día 7: " + semana.DOMINGO);
	}
}
