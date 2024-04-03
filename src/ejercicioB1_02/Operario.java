package ejercicioB1_02;

/**
 * Clase Operario
 * 
 * @author Nestor Sanchez
 */
public class Operario extends Empleado {

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre nombre del trabajador
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * String toString: informa lo que es el empleado
	 */
	public String toString() {

		// String frase: frase a devolver
		String frase;

		// La frase consistira del toString de empleado, seguido de una fecha y la
		// palabra Operario
		frase = super.toString() + " -> Operario";

		// Devuelve la frase
		return frase;
	}

}