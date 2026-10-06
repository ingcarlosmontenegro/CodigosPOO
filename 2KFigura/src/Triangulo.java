public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	
	public Triangulo() {
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
          this.area = (this.base * this.altura)/2;
      }

public void calcularPerimetro() {
	double hypo = Math.sqrt(Math.pow(this.base/2, 2) + Math.pow(this.altura, 2));
	this.perimetro = this.base + this.altura + hypo;
	}

}