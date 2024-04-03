package ejercicioB1_03;

/**
 * Clase Perecedero
 * 
 * @author Nestor Sanchez
 */
public class Perecedero extends Productos {

	/**
	 * int diasACaducar: dias que le faltan al producto para caducar
	 */
	private int diasACaducar;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre       nombre del producto
	 * @param precio       precio del producto
	 * @param diasACaducar dias que le faltan al producto para caducar
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {

		// Asigna el nombre y el precio del producto
		super(nombre, precio);

		// diasACaducar se guardara si es mayor o igual que 0
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}

	}

	/**
	 * Getter getDiasACaducar
	 * 
	 * @return dias que le faltan al producto para caducar
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Setter setDiasACaducar
	 * 
	 * @param diasACaducar dias que le faltan al producto para caducar
	 */
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	/**
	 * toString: incluye la informacion del producto a mostar por pantalla
	 */
	@Override
	public String toString() {

		// String texto: texto a pasar al main
		String texto;

		// texto sera el toString de la clase productos incluyendo los dias restantes
		// para la fecha de caducidad del producto
		texto = super.toString() + " | Dias para su caducacion: " + diasACaducar;

		// Devuelve texto
		return texto;

	}

	/**
	 * double calcular: calcula el precio final del producto
	 * 
	 * @param cantidad cantidad del producto
	 * @return precio final del producto
	 */
	public double calcular(int cantidad) {

		// double precioFinal: precio final del producto
		double precioFinal;

		// Inicialmente, el precio final sera lo que se calcule en la clase Productos
		precioFinal = super.calcular(cantidad);

		// Switch: se hara descuento segun los dias que le falten al producto para su
		// caducacion
		switch (diasACaducar) {

		// Case 1: 75% de descuento
		case 1 -> {
			precioFinal = precioFinal / 4;
		} // Fin Case 1

		// Case 2: ~67% de descuento
		case 2 -> {
			precioFinal = precioFinal / 3;
		} // Fin Case 2
 
		// Case 3: 50% de descuento
		case 3 -> {
			precioFinal = precioFinal / 2;
		} // Fin Case 3

		} // Fin Switch
		
		// Devuelve precioFinal al main
		return precioFinal;
		
	}

}