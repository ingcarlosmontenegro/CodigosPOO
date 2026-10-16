package AAcoplamientoBCohesion;

public class ProcesarPago {
	
	public void procesarPago(Producto p, String metodoPago) {
		if(metodoPago.equals("Targeta")) {
			//se pago con targeta
		}
		else if (metodoPago.equals("Efectivo")) {
			// se paga con efectivo
		}
	}
	
}
