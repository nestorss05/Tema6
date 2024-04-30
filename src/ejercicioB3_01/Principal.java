package ejercicioB3_01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Double velocidad: velocidad del coche
		double velocidad;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Inicializa coche1
		Vehiculo coche1 = new Vehiculo("Ford", "Focus", "Negro", "2655DTR");
		
		// Hago lo que me pide el ejercicio
		coche1.arrancar();
		velocidad = sc.nextDouble();
		coche1.acelerar(velocidad);
		coche1.desacelerar();
		coche1.parar();
		
		// Cierra el Scanner
		sc.close();
		
	}

}
