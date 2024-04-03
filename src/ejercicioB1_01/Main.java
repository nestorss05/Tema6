package ejerciciob1_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Inicia el Scanner
	private static Scanner sc = new Scanner(System.in);

	// HoraExacta horaexct: variable para enlazar a HoraExacta
	private static HoraExacta horaexct = new HoraExacta(0, 0, 0);

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
		System.out.println("1. Mostrar hora exacta");
		System.out.println("2. Incrementar segundos en 1");
		System.out.println("3. Establecer horas");
		System.out.println("4. Establecer minutos");
		System.out.println("5. Establecer segundos");
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
		} // Fin Case 0

		// Case 1: mostrar hora
		case 1 -> {
			System.out.println(horaexct);
		} // Fin Case 1

		// Case 2: incrementar segundos en 1
		case 2 -> {
			horaexct.inc();
		} // Fin Case 2

		// Case 3: establece horas
		case 3 -> {

			// Pide al usuario un valor
			valor = eligeValor();

			// Establece los minutos
			horaexct.setHoras(valor);

		} // Fin Case 3

		// Case 4: establece los minutos
		case 4 -> {

			// Pide al usuario un valor
			valor = eligeValor();

			// Establece los minutos
			horaexct.setMinutos(valor);

		} // Fin Case 4

		// Case 5: establecer segundos
		case 5 -> {

			// Pide al usuario un valor
			valor = eligeValor();

			// Establece los minutos
			horaexct.setSegundos(valor);

		} // Fin Case 5

		// Default: opcion incorrecta
		default -> {
			System.out.println("ERROR: opcion invalida");
		} // Fin Default

		} // Fin Switch

	}

	/**
	 * Funcion eligeValor: pide al usuario un valor en concreto
	 * 
	 * @return horas / minutos / segundos
	 */
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
