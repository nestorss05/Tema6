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
		super();
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
	public Electrodomestico(double precioBase, NombreColor color, ConsumoEnergetico consumo, int peso) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}
		if (color != null) {
			this.color = color;
		}
		if (consumo != null) {
			this.consumo = consumo;
		}
		if (peso >= 0) {
			this.peso = peso;
		}
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
	public NombreColor getColor() {
		return color;
	}

	/**
	 * Getter getConsumoEnergetico
	 * 
	 * @return consumo energetico del electrodomestico
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumo;
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
	 * @return nivel de consumo energetico
	 */
	private char comprobarConsumoEnergetico(char letra) {

		// char letraFinal: letra a asignar en cuanto a consumo energetico
		char letraFinal;

		// Switch: por cada respuesta, asigna una letra en concreto
		switch (letra) {

		// Case A
		case 'A' -> {
			letraFinal = 'A';
			precioBase = 100;
		} // Fin Case A

		// Case B
		case 'B' -> {
			letraFinal = 'B';
			precioBase = 80;
		} // Fin Case B

		// Case C
		case 'C' -> {
			letraFinal = 'C';
			precioBase = 60;
		} // Fin Case C

		// Case D
		case 'D' -> {
			letraFinal = 'D';
			precioBase = 50;
		} // Fin Case D

		// Case E
		case 'E' -> {
			letraFinal = 'E';
			precioBase = 30;
		} // Fin Case E

		// Default
		default -> {
			letraFinal = 'F';
			precioBase = 10;
		} // Fin Default

		} // Fin Switch

		// Devuelve letraFinal
		return letraFinal;

	}

	/**
	 * Funcion comprobarConsumoEnergetico: comprueba el color y asigna el color del
	 * electrodomestico
	 * 
	 * @param color color del electrodomestico
	 * @return color del electrodomestico
	 */
	private String comprobarColor(String color) {

		// String colorFinal: color final del electrodomestico
		String colorFinal = "";

		// Switch: por cada respuesta, asigna un color en concreto
		switch (color) {

		// Case negro
		case "negro" -> {
			colorFinal = "negro";
		} // Fin Case negro

		// Case rojo
		case "rojo" -> {
			colorFinal = "rojo";
		} // Fin Case rojo

		// Case azul
		case "azul" -> {
			colorFinal = "azul";
		} // Fin Case azul

		// Case gris
		case "gris" -> {
			colorFinal = "gris";
		} // Fin Case gris

		// Default: color blanco
		default -> {
			colorFinal = "blanco";
		} // Fin default

		} // Fin Switch

		// Devuelve colorFinal
		return colorFinal;

	}

	/**
	 * Funcion precioFinal: calcula el precio final del electrodomestico
	 * 
	 * @return precio final del electrodomestico
	 */
	public double precioFinal() {

		// String nivelString: enum consumo pasado a String
		String nivelString = consumo.toString();
		
		// String colorString: enum color pasado a String
		String colorString = color.toString();
		
		// Comprueba el consumo energetico pasando nivelString a char
		comprobarConsumoEnergetico(nivelString.charAt(0));
		
		// Comprueba el color del electrodomestico
		comprobarColor(colorString);

		// double precioFinal: precio final del producto
		double precioFinal;

		// If-Else anidados: debido a que seria muy largo poner una gran cantidad de
		// cases en un switch, he ido analizando mediante If-Else desde el peso mas
		// pequeño al mas grande, y asi asignar el valor del precio final
		if (peso <= 19) {
			precioFinal = precioBase + 10;
		} else if (peso <= 49) {
			precioFinal = precioBase + 50;
		} else if (peso <= 79) {
			precioFinal = precioBase + 80;
		} else {
			precioFinal = precioBase + 100;
		}

		// Devuelve precioFinal
		return precioFinal;

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