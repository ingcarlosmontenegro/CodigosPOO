public class Persona {

	/**
	 * @uml.property  name="nombre"
	 */
	private String nombre;

	/**
	 * Getter of the property <tt>nombre</tt>
	 * @return  Returns the nombre.
	 * @uml.property  name="nombre"
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter of the property <tt>nombre</tt>
	 * @param nombre  The nombre to set.
	 * @uml.property  name="nombre"
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @uml.property  name="apellidos"
	 */
	private String apellidos;

	/**
	 * Getter of the property <tt>apellidos</tt>
	 * @return  Returns the apellidos.
	 * @uml.property  name="apellidos"
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Setter of the property <tt>apellidos</tt>
	 * @param apellidos  The apellidos to set.
	 * @uml.property  name="apellidos"
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @uml.property  name="numeroIdentidad"
	 */
	private String numeroIdentidad;

	/**
	 * Getter of the property <tt>numeroIdentidad</tt>
	 * @return  Returns the numeroIdentidad.
	 * @uml.property  name="numeroIdentidad"
	 */
	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}

	/**
	 * Setter of the property <tt>numeroIdentidad</tt>
	 * @param numeroIdentidad  The numeroIdentidad to set.
	 * @uml.property  name="numeroIdentidad"
	 */
	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}

		
			
			
			public String fullName(String nombre, String apellidos){
			
						return (nombre + " " + apellidos);	
					 }

}
