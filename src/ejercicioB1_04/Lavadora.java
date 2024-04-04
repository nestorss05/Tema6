package ejercicioB1_04;

/**
 * Clase Lavadora
 * 
 * @author Nestor Sanchez
 */
public class Lavadora extends Electrodomestico {

	/**
	 * int carga: carga que soporta la lavadora
	 */
	private int carga = 5;

	/**
	 * Constructor sin parametros
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase precio base del electrodomestico
	 * @param peso       peso del electrodomestico
	 */
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase precio base del electrodomestico
	 * @param color      color del electrodomestico
	 * @param consumo    consumo energetico del electrodomestico
	 * @param peso       peso del electrodomestico
	 * @param carga      carga que soporta la lavadora
	 */
	public Lavadora(double precioBase, NombreColor color, ConsumoEnergetico consumo, int peso, int carga) {
		super(precioBase, color, consumo, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Getter getCarga
	 * 
	 * @return carga que soporta la lavadora
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Funcion precioFinal: calcula el precio final del electrodomestico
	 * 
	 * @return precio final del electrodomestico
	 */
	@Override
	public double precioFinal() {

		// double precioFinal: precio final del producto
		double precioFinal = super.precioFinal();

		// If: Si la carga es mayor a 30, se incrementara el precio en 50
		if (carga > 30) {
			precioFinal += 50;
		} // Fin If

		// Devuelve precioFinal
		return precioFinal;
		
	}

}