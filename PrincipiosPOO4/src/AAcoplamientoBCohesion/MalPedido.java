package AAcoplamientoBCohesion;

import java.util.List;

public class MalPedido {

	List<String> productos;
	double total;
	
	public void agregarProductos (String p){
		productos.add(p);
	}
	
	public void CaluclarTotal () {
		// Calcuta el total del pedido
	}
	
	public void procesarPago(String metodoPago) {
		if(metodoPago.equals("Targeta")) {
			//se pago con targeta
		}
		else if (metodoPago.equals("Efectivo")) {
			// se paga con efectivo
		}
	}
	
}
