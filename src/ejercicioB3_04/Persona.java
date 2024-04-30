package ejercicioB3_04;

/**
 * Clase Persona
 * 
 * @author Nestor Sanchez
 */
public class Persona extends Contacto {

	/**
	 * String cumpleaños: cumpleaños de la persona
	 */
	private String cumpleaños;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre     nombre de la persona
	 * @param telefono   telefono de la persona
	 * @param cumpleaños cumpleaños de la persona
	 */
	public Persona(String nombre, long telefono, String cumpleaños) {
		super(nombre, telefono);
		if (cumpleaños != null && !cumpleaños.equals("")) {
			this.cumpleaños = cumpleaños;
		}
	}

	/**
	 * Getter getCumpleaños
	 * 
	 * @return cumpleaños de la persona
	 */
	public String getCumpleaños() {
		return cumpleaños;
	}

	/**
	 * Setter setCumpleaños
	 * 
	 * @param cumpleaños cumpleaños de la persona
	 */
	public void setCumpleaños(String cumpleaños) {
		this.cumpleaños = cumpleaños;
	}

}