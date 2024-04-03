package ejercicioB1_02;

/**
 * Clase Oficial
 * 
 * @author Nestor Sanchez
 */
public class Oficial extends Operario {

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre nombre del trabajador
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * String toString: informa lo que es el empleado
	 */
	public String toString() {
		// String frase: frase a devolver
		String frase;

		// La frase consistira del toString de empleado, seguido de una fecha y la
		// palabra Oficial
		frase = super.toString() + " -> Oficial";

		// Devuelve la frase
		return frase;
	}

}