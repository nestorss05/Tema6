package ejercicioB1_04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// double sumaPrecios: suma de precios de los electrodomesticos
		double sumaPrecios = 0;
		
		// Electrodomestico[] Electrodomesticos: array de 10 electrodomesticos
		Electrodomestico[] Electrodomesticos = new Electrodomestico[10];
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// For-Each 1: calcula el precio final de cada electrodomestico
		for (Electrodomestico elect : Electrodomesticos) {
			elect.precioFinal();
		} // Fin For-Each 1
		
		// For-Each 2:
		for (Electrodomestico elect: Electrodomesticos) {
			// A continuar
		}

		// Cierra el Scanner
		sc.close();

	}

}
