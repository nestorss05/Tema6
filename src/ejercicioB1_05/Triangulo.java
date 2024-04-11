package ejercicioB1_05;

/**
 * Funcion Triangulo
 * 
 * @author Nestor Sanchez
 */
public class Triangulo extends Poligono {

	/**
	 * double lado1: lado 1 del triangulo
	 */
	private double lado1;

	/**
	 * double lado2: lado 2 del triangulo
	 */
	private double lado2;

	/**
	 * double lado3: lado 3 del triangulo
	 */
	private double lado3;

	/**
	 * Constructor sin parametros
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroLados numero de lados de un poligono
	 * @param lado1       lado 1 del rectangulo
	 * @param lado2       lado 2 del rectangulo
	 * @param lado3       lado 3 del rectangulo
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {

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

		// If 3: asigna lado3
		if (lado3 > 0) {
			this.lado3 = lado3;
		} // Fin If 3

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
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
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
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Getter getLado3
	 * 
	 * @return lado 3 del rectangulo
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Setter setLado3
	 * 
	 * @param lado3 lado 3 del rectangulo
	 */
	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Funcion area: calcula el area del triangulo mediante la Formula de Heron
	 */
	@Override
	public double area() {
		
		// Double resultado: area del triangulo
		double resultado;
		
		// Double semiperimetro: semiperimetro del triangulo
		double semiperimetro = (lado1 + lado2 + lado3) / 2;
		
		// Calcula el area usando la Formula de Heron
		resultado = Math.sqrt(semiperimetro + (semiperimetro - 1) * (semiperimetro - 2) * (semiperimetro - 3));
		
		// Devuelve resultado
		return resultado;
		
	}

	/**
	 * Funcion toString: muestra el nº de lados, el tipo de poligono y la longitud
	 * de cada lado por pantalla
	 */
	@Override
	public String toString() {
		String mensaje = "";
		mensaje += "------------------------------------------------";
		mensaje += "\n" + super.toString();
		mensaje += "\nTipo de poligono: Triangulo\nLado1: " + lado1 + "\nLado2: " + lado2 + "\nLado3: " + lado3 + "\n";
		mensaje += "------------------------------------------------";
		return mensaje;
	}

}