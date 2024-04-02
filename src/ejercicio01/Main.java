package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Inicia el Scanner
	private static Scanner sc = new Scanner(System.in);

	// Hora hora
	private static Hora hora = new Hora(0, 0);

	// int valor: valor a establecer
	private static int valor;

	// Funcion main
	public static void main(String[] args) {

		// int opcion: opcion elegida por el usuario
		int opcion;

		// Da un mensaje de bienvenida al usuario
		System.out.println("RELOJ NSS");

		// Do-While: se ejecutara el programa mientras que la opcion no sea 0
		do {
			mostrarMenu();
			opcion = eligeOpcion();
			opciones(opcion);
		} while (opcion != 0); // Fin Do-While

		// Cierra el Scanner
		sc.close();

	}

	/**
	 * Funcion mostrarMenu: muestra el menu
	 */
	private static void mostrarMenu() {
		System.out.println("1. Mostrar hora");
		System.out.println("2. Incrementar minuto en 1");
		System.out.println("3. Establecer minutos");
		System.out.println("4. Establecer horas");
		System.out.println("0. Salir");
		System.out.println("Introduce una opcion");
	}

	/**
	 * int eligeOpcion: pide al usuario una opcion
	 * 
	 * @return opcion elegida
	 */
	private static int eligeOpcion() {

		// int opcion: opcion elegida por el usuario
		int opcion;

		// Try-Catch: pide al usuario la opcion
		try {
			opcion = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: respuesta invalida. La opcion procedera a ser -1");
			opcion = -1;
		} finally {
			sc.nextLine();
		} // Fin Try-Catch

		// Devuelve opcion al main
		return opcion;
	}

	/**
	 * void opciones: se ejecutaran ciertas funciones a medida de la opcion
	 * seleccionada
	 * 
	 * @param opcion opcion elegida por el usuario
	 */
	private static void opciones(int opcion) {

		// Switch
		switch (opcion) {

		// Case 0: sal del programa
		case 0 -> {
			System.out.println("Saliendo del programa...");
		}

		// Case 1: mostrar hora
		case 1 -> {
			System.out.println(hora.toString());
		}

		// Case 2: incrementar minuto en 1
		case 2 -> {
			hora.inc();
		}

		// Case 3: establece los minutos
		case 3 -> {

			// Pide al usuario un valor
			valor = eligeValor();

			// Establece los minutos
			hora.setMinutos(valor);

		}

		// Case 4: establece los minutos
		case 4 -> {

			// Pide al usuario un valor
			valor = eligeValor();

			// Establece los minutos
			hora.setHoras(valor);

		}

		// Default: opcion incorrecta
		default -> {
			System.out.println("ERROR: opcion invalida");
		}

		} // Fin Switch

	}

	private static int eligeValor() {

		// int valor: valor a elegir
		int valorElegido = 0;

		// boolean correcto: booleana que comprueba que la opcion esta bien
		boolean correcto = false;
		System.out.println("Inserta un valor a establecer");

		// Do-While: pide al usuario un valor
		do {
			try {
				valorElegido = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do-While

		// Devuelve valor
		return valorElegido;

	}

}
