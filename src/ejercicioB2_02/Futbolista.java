package ejercicioB2_02;

import java.util.Objects;

/**
 * Clase Futbolista
 * 
 * @author Nestor Sanchez
 */
public class Futbolista implements Comparable<Futbolista> {

	/**
	 * int nCamiseta: nº de camiseta del futbolista
	 */
	private int nCamiseta;

	/**
	 * String nombre: nombre del futbolista
	 */
	private String nombre;

	/**
	 * int edad: edad del futbolista
	 */
	private int edad;

	/**
	 * int nGoles: nº de goles del futbolista
	 */
	private int nGoles;

	/**
	 * Constructor con parametros
	 * 
	 * @param nCamiseta nº de camiseta del futbolista
	 * @param nombre    nombre del futbolista
	 * @param edad      edad del futbolista
	 * @param nGoles    nº de goles del futbolista
	 */
	public Futbolista(int nCamiseta, String nombre, int edad, int nGoles) {
		if (nCamiseta > 0) {
			this.nCamiseta = nCamiseta;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad >= 0) {
			this.edad = edad;
		}
		if (nGoles >= 0) {
			this.nGoles = nGoles;
		}
	}

	/**
	 * Metodo toString: muestra la informacion del futbolista por pantalla
	 */
	public String toString() {

		// Inicializa el mensaje
		String mensaje = "";

		// Rellena el mensaje con los datos de la clase
		mensaje += "\n--------------------------------\n";
		mensaje += "Nº de Camiseta: " + nCamiseta;
		mensaje += "\nNombre: " + nombre;
		mensaje += "\nEdad: " + edad;
		mensaje += "\nNº de Goles: " + nGoles;
		mensaje += "\n--------------------------------";

		// Devuelve el mensaje
		return mensaje;
	}

	/**
	 * Metodo equals: compara si dos clases son iguales
	 */
	public boolean equals(Object obj) {

		// boolean iguales: indica si dos futbolistas son iguales o no
		boolean iguales = false;

		// Futbolista otroFutbolista: obj pero siendo los datos del futbolista a
		// comparar
		Futbolista otroFutbolista = (Futbolista) obj;

		// If: si el numero de camiseta y el nombre son iguales, iguales sera true
		if (this.nCamiseta == otroFutbolista.nCamiseta && Objects.equals(nombre, otroFutbolista.nombre)) {
			iguales = true;
		} // Fin If

		// Devuelve iguales
		return iguales;
	}

	@Override
	public int compareTo(Futbolista arg0) {
		/*
		 * 0 = es igual
		 * 1 = es mayor
		 * -1 = es menor
		 */
		int res = 0;
		Futbolista f = (Futbolista) arg0;
		if (this.nCamiseta < f.nCamiseta) {
			res = -1;
		} else if (this.nCamiseta > f.nCamiseta) {
			res = 1;
		} else {
			if (this.nombre.charAt(0) < f.nombre.charAt(0)) {
				res = -1;
			} else if (this.nombre.charAt(0) > f.nombre.charAt(0)) {
				res = 1;
			}
		}
		return res;
	}

}