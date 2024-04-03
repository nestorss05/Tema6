package ejercicioB1_03;

/**
 * Clase Perecedero
 * 
 * @author Nestor Sanchez
 */
public class NoPerecedero extends Productos {

	/**
	 * String tipo: tipo del producto
	 */
	private String tipo;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 * @param tipo   tipo del producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {

		// Asigna el nombre y el precio del producto
		super(nombre, precio);

		// Se guardara el tipo si no es nulo o no es cadena vacia
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}

	}

	/**
	 * Getter getTipo
	 * 
	 * @return dias que le faltan al producto para caducar
	 */
	public String getDiasACaducar() {
		return tipo;
	}

	/**
	 * Setter setTipo
	 * 
	 * @param diasACaducar dias que le faltan al producto para caducar
	 */
	public void setDiasACaducar(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * toString: incluye la informacion del producto a mostar por pantalla
	 */
	@Override
	public String toString() {

		// String texto: texto a pasar al main
		String texto;

		// texto sera el toString de la clase productos incluyendo su tipo
		texto = super.toString() + " | Tipo del producto: " + tipo;

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

		// El precio final sera lo que se calcule en la clase Productos
		precioFinal = super.calcular(cantidad);

		// Devuelve precioFinal al main
		return precioFinal;

	}

}