package ejercicio02;

/**
 * Clase Tecnico
 * 
 * @author Nestor Sanchez
 */
public class Tecnico extends Operario {

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre nombre del trabajador
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * String toString: informa lo que es el empleado
	 */
	public String toString() {
		// String frase: frase a devolver
		String frase;

		// La frase consistira del toString de empleado, seguido de una fecha y la
		// palabra Tecnico
		frase = super.toString() + " -> Tecnico";

		// Devuelve la frase
		return frase;
	}

}