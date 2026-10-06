public class Articulo {
    private float precio;
    
    public void setPrecio() {
         precio = 3.50f;
     }
    
     public void setPrecio(float nuevoPrecio) {
          precio = nuevoPrecio;
          
     }
     
     public void setPrecio(float costo, int porcentajeGanancia)
     {
    	 precio = costo + (costo * porcentajeGanancia);
     }
     
		public float getPrecio() {
			return precio;
		}
		
		public String getPrecio(String mensaje) {
			return mensaje + " " + precio;
		}
}