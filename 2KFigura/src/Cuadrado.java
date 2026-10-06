public class Cuadrado extends Figura {
	
	private double longitud;
	
	public Cuadrado() {
		super();
      }
	
public double getLongitud() {
             return longitud;
      }

public void setLongitud(double longitud) {
             this.longitud = longitud;
      }

public void calcularArea() {
          this.area = Math.pow(this.longitud,2.0);
      }

public void calcularPerimetro() {
           this.perimetro = 4*this.longitud;
	}

}