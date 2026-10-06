
public class Principal {

	public static void main(String[] args) {
		Fecha hoy = new Fecha();
		System.out.println(hoy.ObtieneDia());
		hoy.fijaDia(0);
		System.out.println(hoy.ObtieneDia());
	}

}
