public class Perro {
    // Atributos
    private String nombre;
    private String raza;
    private int edad;
    
    // Constructor de clase
    public Perro(String nombre, String raza, int edad) {
        this.setNombre(nombre);
        this.setRaza(raza);
        this.setEdad(edad);
    }

    // Métodos getter (para obtener los valores de los atributos)   
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
