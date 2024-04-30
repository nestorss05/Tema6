package ejercicioB3_01;

/**
 * Clase Turismo
 * @author Nestor Sanchez
 */
public class Turismo extends Vehiculo {

	/**
	 * Enum tipos: tipos de uso de un turismo
	 */
	enum tipos {Profesional, Particular};
	
	/**
	 * int nPlazas: nº de plazas de un turismo
	 */
	private int nPlazas;
	
	/**
	 * tipos tipo: tipo de uso de un turismo
	 */
	private tipos tipo;
	
	/**
	 * Constructor con parametros
	 * 
	 * @param marca: marca del turismo
	 * @param modelo: modelo del turismo
	 * @param color: color del turismo
	 * @param matricula: matricula del turismo
	 * @param nPlazas: nº de plazas del turismo
	 * @param tipo: tipo de uso del turismo
	 */
	public Turismo(String marca, String modelo, String color, String matricula, int nPlazas, String tipo) {
		super(marca, modelo, color, matricula);
		if (nPlazas > 0) {
			this.nPlazas = nPlazas;
		}
		this.tipo = tipos.valueOf(String.valueOf(tipo));
	}

}