package ejercicioB1_04;

/**
 * Clase Electrodomestico
 * 
 * @author Nestor Sanchez
 */
public class Electrodomestico {

	/**
	 * double precioBase: precio base del electrodomestico
	 */
	protected double precioBase = 100;

	/**
	 * String color: color del electrodomestico
	 */
	protected NombreColor color = NombreColor.blanco;

	/**
	 * char consumo: consumo energetico del electrodomestico
	 */
	protected ConsumoEnergetico consumo = ConsumoEnergetico.F;

	/**
	 * int peso: peso del electrodomestico
	 */
	protected int peso = 5;

	/**
	 * Constructor sin parametros
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase precio base del electrodomestico
	 * @param peso       peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, int peso) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase precio base del electrodomestico
	 * @param color      color del electrodomestico
	 * @param consumo    consumo energetico del electrodomestico
	 * @param peso       peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, String color, char consumo, int peso) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}
		if (peso >= 0) {
			this.peso = peso;
		}

		// Comprueba el consumo energetico
		comprobarConsumoEnergetico(consumo);

		// Comprueba el color
		comprobarColor(color);

	}

	/**
	 * Getter getPrecioBase
	 * 
	 * @return precio base del electrodomestico
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Getter getColor
	 * 
	 * @return color del electrodomestico
	 */
	public String getColor() {
		return String.valueOf(this.color);
	}

	/**
	 * Getter getConsumoEnergetico
	 * 
	 * @return consumo energetico del electrodomestico
	 */
	public char getConsumoEnergetico() {
		return String.valueOf(this.consumo).charAt(0);
	}

	/**
	 * Getter getPeso
	 * 
	 * @return peso del electrodomestico
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Funcion comprobarConsumoEnergetico: comprueba la letra y asigna el consumo
	 * energetico del electrodomestico
	 * 
	 * @param letra letra que corresponde a un nivel de consumo energetico
	 */
	private void comprobarConsumoEnergetico(char letra) {

		// Switch: por cada respuesta, asigna una letra en concreto
		switch (letra) {

		// Case A
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			this.consumo = ConsumoEnergetico.valueOf(String.valueOf(letra));
			break;
		} // Fin Case A

		// Default
		default -> {
			break;
		} // Fin Default

		} // Fin Switch

	}

	/**
	 * Funcion comprobarConsumoEnergetico: comprueba el color y asigna el color del
	 * electrodomestico
	 * 
	 * @param color color del electrodomestico
	 */
	private void comprobarColor(String color) {

		// Switch: por cada respuesta, asigna un color en concreto
		switch (color) {

		// Case de color acertaoo
		case "blanco", "negro", "rojo", "azul", "gris" -> {
			this.color = NombreColor.valueOf(color);
			break;
		} // Fin Case de color acertado

		// Default: color nulo
		default -> {
			break;
		} // Fin default

		} // Fin Switch

	}

	/**
	 * Funcion precioFinal: calcula el precio final del electrodomestico
	 */
	public void precioFinal() {

		// Switch: se aumentara el precio base segun su nivel de consumo energetico
		switch (consumo) {

		// Case A
		case A -> {
			precioBase += 100;
			break;
		} // Fin Case A

		// Case B
		case B -> {
			precioBase += 80;
			break;
		} // Fin Case B

		// Case C
		case C -> {
			precioBase += 60;
			break;
		} // Fin Case C

		// Case D
		case D -> {
			precioBase += 50;
			break;
		} // Fin Case D

		// Case E
		case E -> {
			precioBase += 30;
			break;
		} // Fin Case E

		// Case F
		case F -> {
			precioBase += 10;
			break;
		} // Fin Case F

		} // Fin Switch

		// If-Else anidados: debido a que seria muy largo poner una gran cantidad de
		// cases en un switch, he ido analizando mediante If-Else desde el peso mas
		// pequeño al mas grande, y asi asignar el valor del precio final
		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else {
			precioBase += 100;
		} // Fin If-Else anidados

	}

}

/**
 * enum consumoEnergetico: niveles del consumo energetico de un electrodomestico
 */
enum ConsumoEnergetico {
	A, B, C, D, E, F
}

/**
 * enum color: colores de un electrodomestico
 */
enum NombreColor {
	blanco, negro, rojo, azul, gris
}