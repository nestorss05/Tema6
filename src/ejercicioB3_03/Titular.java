package ejercicioB3_03;

import java.util.Objects;

public class Titular {

	/**
	 * String dni: DNI del titular
	 */
	private String dni;

	/**
	 * String nombre: nombre del titular
	 */
	private String nombre;

	/**
	 * String apellidos: apellidos del titular
	 */
	private String apellidos;

	/**
	 * int telefono: telefono del titular
	 */
	private int telefono;

	/**
	 * Constructor con parametros
	 * 
	 * @param dni       DNI del titular
	 * @param nombre    nombre del titular
	 * @param apellidos apellidos del titular
	 * @param telefono  telefono del titular
	 */
	public Titular(String dni, String nombre, String apellidos, int telefono) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.equals("")) {
			this.apellidos = apellidos;
		}
		if (telefono >= 0) {
			this.telefono = telefono;
		}
	}

	/**
	 * Equals: comprueba si dos titulares son iguales o no a base de todo
	 */
	@Override
	public boolean equals(Object obj) {
		boolean esIgual;
		Titular otro = (Titular) obj;
		esIgual = Objects.equals(dni, otro.dni) && Objects.equals(nombre, otro.nombre)
				&& Objects.equals(apellidos, otro.apellidos) && Objects.equals(telefono, otro.telefono);
		return esIgual;
	}

}