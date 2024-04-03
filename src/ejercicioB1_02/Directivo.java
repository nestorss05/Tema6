package ejercicioB1_02;

/**
 * Clase Directivo
 * 
 * @author Nestor Sanchez
 */
public class Directivo extends Empleado {

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre nombre del trabajador
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * String toString: informa lo que es el empleado
	 */
	public String toString() {

		// String frase: frase a devolver
		String frase;

		// La frase consistira del toString de empleado, seguido de una fecha y la
		// palabra Directivo
		frase = super.toString() + " -> Directivo";

		// Devuelve la frase
		return frase;

	}

}