package ejercicioB2_01;

/**
 * Clase Socio
 * 
 * @author Nestor Sanchez
 */
public class Socio implements Comparable<Socio> {

	/**
	 * int id: id del socio
	 */
	private int id;

	/**
	 * String nombre: nombre del socio
	 */
	private String nombre;

	/**
	 * int edad: edad del socio
	 */
	private int edad;

	/**
	 * Constructor con parametros
	 * 
	 * @param id     id del socio
	 * @param nombre nombre del socio
	 * @param edad   edad del socio
	 */
	public Socio(int id, String nombre, int edad) {

		if (id >= 0) {
			this.id = id;
		}

		if (!nombre.equals("") && nombre != null) {
			this.nombre = nombre;
		}

		if (edad >= 0) {
			this.edad = edad;
		}

	}

	/**
	 * toString: muestra los datos del socio por pantalla
	 */
	public String toString() {

		// String mensaje: mensaje a concatenar
		String mensaje = "";

		// Concatena el ID, el nombre y la edad del socio
		mensaje += "\n--------------------------------\n";
		mensaje += "Id: " + id;
		mensaje += "\nNombre: " + nombre;
		mensaje += "\nEdad: " + edad;
		mensaje += "\n--------------------------------";

		// Devuelve mensaje
		return mensaje;

	}

	/**
	 * Funcion compareTo: Ordena los numeros de identificacion de manera creciente
	 */
	@Override
	public int compareTo(Socio arg0) {

		/*
		 * 0 = es igual
		 * 1 = es mayor
		 * -1 = es menor
		 */
		int res = 0;
		if (this.id < arg0.id) {
			res = -1;
		} else if (this.id > arg0.id) {
			res = 1;
		}
		return res;

	}

}