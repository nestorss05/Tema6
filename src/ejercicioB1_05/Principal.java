package ejercicioB1_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// Inicia el Scanner
	private static Scanner sc = new Scanner(System.in);

	// Array poligonos[]: array de 10 de longitud de rectangulos y triangulos
	private static Poligono poligonos[] = new Poligono[10];

	public static void main(String[] args) {

		// int opcion: opcion seleccionada por el usuario
		int opcion = -1;

		// Do-While: la aplicacion se seguira ejecutando mientras la opcion no sea 0
		do {

			// Muestra el menu
			mostrarMenu();

			// Pide al usuario una opcion
			System.out.println("Introduce una opcion");
			opcion = seleccionaInt();

			// If-Else: Segun la opcion seleccionada, se ejecutara cierta accion o no
			if (opcion == 0) {
				break;
			} else {
				accionesOpcion(opcion);
			} // Fin If-Else

		} while (opcion != 0); // Fin Do-While

	}

	/**
	 * Funcion mostrarMenu: muestra el menu
	 */
	private static void mostrarMenu() {
		System.out.println("1. Introducir triangulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar contenido del array");
		System.out.println("0. Salir");
	}

	/**
	 * Funcion seleccionaInt: pide al usuario un numero entero
	 * 
	 * @return numero entero
	 */
	private static int seleccionaInt() {

		// int respuesta: respuesta a introducir
		int respuesta = 0;

		// Try-Catch: pide al usuario una respuesta
		try {
			respuesta = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: respuesta invalida");
		} finally {
			sc.nextLine();
		} // Fin Try-Catch

		// Devuelve respuesta al main
		return respuesta;
	}

	/**
	 * Funcion pideLado: pide al usuario un lado
	 * 
	 * @return numero double
	 */
	private static double pideLado() {

		// double respuesta: respuesta a introducir
		double respuesta = 0;

		// boolean pase: booleana que indica si el numero es valido o no
		boolean pase = false;

		// Do-While: pide al usuario una respuesta
		do {
			try {
				pase = false;
				respuesta = sc.nextDouble();

				// If-Else: si la respuesta es positiva, se podra avanzar.
				if (respuesta > 0) {
					pase = true;
				} else {
					System.out.println("ERROR: numero invalido");
				} // Fin If-Else
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!pase); // Fin Do-While

		// Devuelve respuesta al main
		return respuesta;
	}

	/**
	 * Funcion accionesOpcion: segun la opcion seleccionada, se ejecutara cierta
	 * accion
	 * 
	 * @param opcion opcion seleccionada por el usuario
	 */
	private static void accionesOpcion(int opcion) {

		// double lado1: lado 1 del poligono
		double lado1;

		// double lado2: lado 2 del poligono
		double lado2;

		// double lado3: lado 3 del poligono
		double lado3;

		// int pos: posicion del array
		int pos;

		// Switch: segun la opcion seleccionada, se ejecutara cierta accion
		switch (opcion) {

		// Case 1: introducir triangulo
		case 1 -> {

			// Pide al usuario el lado 1
			System.out.println("Inserta el lado 1");
			lado1 = pideLado();

			// Pide al usuario el lado 2
			System.out.println("Inserta el lado 2");
			lado2 = pideLado();

			// Pide al usuario el lado 3
			System.out.println("Inserta el lado 3");
			lado3 = pideLado();

			// Busca una posicion vacia y guardala en pos
			pos = buscaPosVacia();

			// If-Else: si el array no esta lleno, inserta el nuevo objeto en el array
			if (pos > poligonos.length) {
				System.out.println("ERROR: no se ha podido añadir el poligono. Maximo numero de poligonos alcanzado.");
			} else {
				poligonos[pos] = new Triangulo(3, lado1, lado2, lado3);
			} // Fin If-Else

		} // Fin Case 1

		// Case 2: introducir rectangulo
		case 2 -> {

			// Pide al usuario el lado 1
			System.out.println("Inserta el lado 1");
			lado1 = pideLado();

			// Pide al usuario el lado 2
			System.out.println("Inserta el lado 2");
			lado2 = pideLado();

			// Busca una posicion vacia y guardala en pos
			pos = buscaPosVacia();

			// If-Else: si el array no esta lleno, inserta el nuevo objeto en el array
			if (pos > poligonos.length) {
				System.out.println("ERROR: no se ha podido añadir el poligono. Maximo numero de poligonos alcanzado.");
			} else {
				poligonos[pos] = new Rectangulo(4, lado1, lado2);
			} // Fin If-Else

		} // Fin Case 2

		// Case 3: Mostrar contenido del array
		case 3 -> {
			muestraArray();
		} // Fin Case 3

		// Default: opcion invalida
		default -> {
			System.out.println("ERROR: opcion invalida");
		} // Fin Default

		} // Fin Switch

	}

	/**
	 * Funcion buscaPosVacia: busca una posicion vacia en el array
	 * 
	 * @return posicion vacia
	 */
	private static int buscaPosVacia() {

		// int i: indice del array
		int i = 0;

		// int pos: posicion encontrada
		int pos = 0;

		// While: mientras se recorre el array, comprueba por posiciones nulas
		while (i < poligonos.length) {
			if (poligonos[i] == null) {
				pos = i;
				break;
			}
			i++;
		} // Fin While

		// Devuelve pos
		return pos;
	}

	/**
	 * Funcion muestraArray: muestra el array de poligonos
	 */
	private static void muestraArray() {

		// int i: indice del array
		int i = 0;

		// While: mientras se recorre el array, comprueba por posiciones nulas, y
		// muestra las posiciones no nulas por pantalla
		while (i < poligonos.length) {
			if (poligonos[i] == null) {
				break;
			}
			System.out.println(poligonos[i]);
			i++;
		} // Fin While
		
	}

}