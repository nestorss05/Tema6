package ejercicioB1_02;

/**
 * Clase Empleado
 * @author Nestor Sanchez
 */
public class Empleado {
	
	/**
	 * String nombre: nombre del trabajador
	 */
	private String nombre;

	/**
	 * Constructor sin parametros
	 */
	public Empleado() {
		super();
	}

	/**
	 * Constructor con parametros
	 * @param nombre nombre del trabajador
	 */
	@SuppressWarnings("null")
	public Empleado(String nombre) {
		if (nombre != null || !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Getter getNombre
	 * @return nombre del trabajador
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter setNombre
	 * @param nombre nombre del trabajador
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * String toString: informa lo que es el empleado
	 */
	public String toString() {
		
		// String frase: frase a devolver
		String frase;
		
		// La frase consistira de la palabra Empleado y su nombre
		frase = "Empleado " + nombre;
		
		// Devuelve la frase
		return frase;
		
	}
	
}