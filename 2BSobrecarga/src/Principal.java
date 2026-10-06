
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo carrito = new Articulo();
		carrito.setPrecio();
		System.out.println("El precio del articulo es: " + carrito.getPrecio());
		carrito.setPrecio(8.20f);
		System.out.println("El precio del articulo es: " + carrito.getPrecio());
		carrito.setPrecio(5.5f, 10);
		System.out.println(carrito.getPrecio("El precio del articulo es:"));
	}

}
