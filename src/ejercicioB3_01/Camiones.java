package ejercicioB3_01;

/**
 * Funcion Camiones
 * 
 * @author Nestor Sanchez
 */
public class Camiones extends Vehiculo {

	/**
	 * int maxPeso: peso maximo de un camion
	 */
	private int maxPeso;

	/**
	 * boolean transportaMercanciaPeligrosa: booleana que indica si un camion
	 * transporta mercancia peligrosa o no
	 */
	private boolean transportaMercanciaPeligrosa;

	/**
	 * Constructor con parametros
	 * 
	 * @param marca                        marca del camion
	 * @param modelo                       modelo del camion
	 * @param color                        color del camion
	 * @param matricula                    matricula del camion
	 * @param maxPeso                      peso maximo del camion
	 * @param transportaMercanciaPeligrosa booleana que indica si el camion
	 *                                     transporta mercancia peligrosa o no
	 */
	public Camiones(String marca, String modelo, String color, String matricula, int maxPeso,
			boolean transportaMercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		if (maxPeso >= 0) {
			this.maxPeso = maxPeso;
		}
		this.transportaMercanciaPeligrosa = transportaMercanciaPeligrosa;
	}
	
}