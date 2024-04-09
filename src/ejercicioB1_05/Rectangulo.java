package ejercicioB1_05;

/**
 * Funcion Rectangulo
 * 
 * @author Nestor Sanchez
 */
public class Rectangulo extends Poligono {

	/**
	 * double lado1: lado 1 del rectangulo
	 */
	private double lado1;

	/**
	 * double lado2: lado 2 del rectangulo
	 */
	private double lado2;

	/**
	 * Constructor sin parametros
	 */
	public Rectangulo() {
		super(4);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroLados numero de lados de un poligono
	 * @param lado1       lado 1 del rectangulo
	 * @param lado2       lado 2 del rectangulo
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {

		// Asigna el nº de lados
		super(numeroLados);

		// If: asigna lado1
		if (lado1 > 0) {
			this.lado1 = lado1;
		} // Fin If

		// If 2: asigna lado2
		if (lado2 > 0) {
			this.lado2 = lado2;
		} // Fin If 2

	}

	/**
	 * Getter getLado1
	 * 
	 * @return lado 1 del rectangulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Setter setLado1
	 * 
	 * @param lado1 lado 1 del rectangulo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Getter getLado2
	 * 
	 * @return lado 2 del rectangulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Setter setLado2
	 * 
	 * @param lado2 lado 2 del rectangulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Funcion area: calcula el area del rectangulo
	 */
	@Override
	public double area() {
		double resultado = lado1 * lado2;
		return resultado;
	}

	/**
	 * Funcion toString: muestra el nº de lados, el tipo de poligono y la longitud
	 * de cada lado por pantalla
	 */
	@Override
	public String toString() {
		String mensaje = "";
		mensaje += super.toString();
		mensaje += "\nTipo de poligono: Rectangulo\nLado1: " + lado1 + "\nLado2: " + lado2;
		return mensaje;
	}

}