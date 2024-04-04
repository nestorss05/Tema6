package ejercicioB1_04;

/**
 * Clase Television
 * 
 * @author Nestor Sanchez
 */
public class Television extends Electrodomestico {

	/**
	 * int resolucion: cantidad de pulgadas de la pantalla
	 */
	private int resolucion = 20;

	/**
	 * boolean sintonizadorTDT: booleana que indica si la television transmite en
	 * digital
	 */
	private boolean sintonizadorTDT = false;

	/**
	 * Constructor sin parametros
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase precio base del electrodomestico
	 * @param peso       peso del electrodomestico
	 */
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase      precio base del electrodomestico
	 * @param color           color del electrodomestico
	 * @param consumo         consumo energetico del electrodomestico
	 * @param peso            peso del electrodomestico
	 * @param resolucion      cantidad de pulgadas de la pantalla
	 * @param sintonizadorTDT booleana que indica si la television transmite en
	 *                        digital
	 */
	public Television(double precioBase, NombreColor color, ConsumoEnergetico consumo, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumo, peso);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Getter getResolucion
	 * 
	 * @return cantidad de pulgadas de la pantalla
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Getter getSintonizadorTDT
	 * 
	 * @return booleana que indica si la television transmite en digital
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
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

		// If 1: si la television es de mas de 40 pulgadas, el precio subira un 30%
		if (resolucion > 40) {
			precioFinal *= 1.30;
		} // Fin If 1

		// If 2: si la television es digital, el precio aumentara en 50€
		if (sintonizadorTDT) {
			precioFinal += 50;
		} // Fin If 2

		// Devuelve precioFinal
		return precioFinal;

	}

}