package ejercicioB1_03;

/**
 * Clase Productos
 * 
 * @author Nestor Sanchez
 */
public class Productos {

	/**
	 * String nombre: nombre del producto
	 */
	protected String nombre;

	/**
	 * double precio: precio del producto
	 */
	protected double precio;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 */
	public Productos(String nombre, double precio) {

		// Se guardara el nombre si no es nulo o no es cadena vacia
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		// Se guardara el precio si es mayor o igual a 0
		if (precio >= 0) {
			this.precio = precio;
		}

	}

	/**
	 * Getter getNombre
	 * 
	 * @return nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter setNombre
	 * 
	 * @param nombre nombre del producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter getPrecio
	 * 
	 * @return precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter setPrecio
	 * 
	 * @param precio precio del producto
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * toString: incluye la informacion del producto a mostar por pantalla
	 */
	@Override
	public String toString() {

		// String texto: texto a pasar al main
		String texto;

		// El texto incluira el nombre y el precio
		texto = "Nombre: " + nombre + " | Precio: " + precio + "€";

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

		// precioFinal sera el precio por la cantidad
		precioFinal = precio * cantidad;

		// Devuelve precioFinal al main
		return precioFinal;

	}

}