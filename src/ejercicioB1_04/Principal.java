package ejercicioB1_04;

public class Principal {

	public static void main(String[] args) {

		// double sumaPrecios: suma de precios de los electrodomesticos
		double sumaPrecios = 0;

		// double precioLavadoras: suma de precios de las lavadoras
		double precioLavadoras = 0;

		// double precioTelevisiones: suma de precios de las televisiones
		double precioTelevisiones = 0;

		// double precioElectrodomesticos: suma de precios de los electrodomesticos
		double precioElectrodomesticos = 0;

		// Electrodomestico[] Electrodomesticos: array de 10 electrodomesticos
		Electrodomestico[] Electrodomesticos = new Electrodomestico[10];

		// Asignare manualmente a cada electrodomestico 3 lavadoras, 3 televisores, 2
		// electrodomesticos completos y 2 electrodomesticos con solo el precio base y
		// el peso
		Electrodomesticos[0] = new Lavadora(200, "blanco", 'E', 40, 7);
		Electrodomesticos[1] = new Lavadora(800, "negro", 'A', 65, 14);
		Electrodomesticos[2] = new Lavadora(300, "gris", 'D', 52, 12);
		Electrodomesticos[3] = new Television(50, "gris", 'F', 50, 21, false);
		Electrodomesticos[4] = new Television(500, "azul", 'B', 15, 60, true);
		Electrodomesticos[5] = new Television(800, "negro", 'A', 20, 75, true);
		Electrodomesticos[6] = new Electrodomestico(100, "rojo", 'C', 5);
		Electrodomesticos[7] = new Electrodomestico(200, "azul", 'D', 20);
		Electrodomesticos[8] = new Electrodomestico(333, 33);
		Electrodomesticos[9] = new Electrodomestico(420, 69);

		// For-Each 1: calcula el precio final de cada electrodomestico y muestralo por
		// pantalla
		System.out.println("Precio de cada electrodomestico");
		for (Electrodomestico elect : Electrodomesticos) {
			elect.precioFinal();
			System.out.println(elect.precioBase);
		} // Fin For-Each 1

		// For-Each 2: calcula el precio final de cada television, lavadora,
		// electrodomestico y los tres combinados
		System.out.println("-------------------------------");
		for (Electrodomestico elect : Electrodomesticos) {

			/*
			 * If-Else anidado: se sumara el precio de cada cosa si es instancia de esa
			 * clase en concreto
			 * 
			 * Ejemplo: se le sumara el precio de una lavadora a precioLavadoras si ese
			 * objeto es una instancia de la clase Lavadora
			 */
			if (elect instanceof Lavadora) {
				precioLavadoras += elect.getPrecioBase();
			} else if (elect instanceof Television) {
				precioTelevisiones += elect.getPrecioBase();
			} else {
				precioElectrodomesticos += elect.getPrecioBase();
			} // Fin If-Else anidado

			// Asigna el precio total
			sumaPrecios = precioLavadoras + precioTelevisiones + precioElectrodomesticos;

		}

		// Muestra los precios por pantalla
		System.out.println("Precio de las lavadoras: " + precioLavadoras);
		System.out.println("Precio de las televisiones: " + precioTelevisiones);
		System.out.println("Precio de los electrodomesticos: " + precioElectrodomesticos);
		System.out.println("Precio total: " + sumaPrecios);

	}

}
