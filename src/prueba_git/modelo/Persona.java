package prueba_git.modelo;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, int edad, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido el apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return el telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/* (sin-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ "]";
	}
		
}
