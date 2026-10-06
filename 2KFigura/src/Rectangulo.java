public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
	
	public Rectangulo() {
		super();
      }
	
public double getBase() {
             return base;
      }

public void setBase(double base) {
             this.base = base;
      }

public double getAltura() {
    return altura;
}

public void setAltura(double altura) {
    this.altura = altura;
}

public void calcularArea() {
          this.area = this.base * this.altura;
      }

public void calcularPerimetro() {
           this.perimetro = 2*(this.base + this.altura);
	}

}