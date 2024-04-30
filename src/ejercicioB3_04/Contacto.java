package ejercicioB3_04;

import java.util.Objects;

/**
 * Clase Contacto
 * 
 * @author Nestor Sanchez
 */
public class Contacto {

	/**
	 * String nombre: nombre del contacto
	 */
	private String nombre;

	/**
	 * long telefono: telefono del contacto
	 */
	private long telefono;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre   nombre del contacto
	 * @param telefono telefono del contacto
	 */
	public Contacto(String nombre, long telefono) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (telefono >= 0) {
			this.telefono = telefono;
		}
	}

	/**
	 * Getter getNombre
	 * 
	 * @return nombre del contacto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter setNombre
	 * 
	 * @param nombre nombre del contacto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter getTelefono
	 * 
	 * @return telefono del contacto
	 */
	public long getTelefono() {
		return telefono;
	}

	/**
	 * Setter setTelefono
	 * 
	 * @param telefono telefono del contactos
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	/**
	 * equals: dos contactos seran iguales si comparten el mismo nombre
	 * 
	 * @return si los dos contactos son iguales o no
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Contacto other = (Contacto) obj;
		iguales = Objects.equals(nombre, other.nombre);
		return iguales;
	}

}