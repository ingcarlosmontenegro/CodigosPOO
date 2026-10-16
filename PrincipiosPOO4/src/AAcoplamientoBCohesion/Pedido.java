package AAcoplamientoBCohesion;

import java.util.List;

public class Pedido {

	List<Producto>  productos;
	double total;
	
	public void agregarProductos (Producto p){
		productos.add(p);
	}
	
	public void calcularTotal () {
		// Calcuta el total del pedido
	}

}
