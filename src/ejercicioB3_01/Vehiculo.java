package ejercicioB3_01;

/**
 * Clase Vehiculo
 * 
 * @author Nestor Sanchez
 */
public class Vehiculo {

	/**
	 * String marca: marca del coche
	 */
	private String marca;

	/**
	 * String modelo: modelo del coche
	 */
	private String modelo;

	/**
	 * String color: color del coche
	 */
	private String color;

	/**
	 * String matricula: matricula del coche
	 */
	private String matricula;

	/**
	 * boolean encendido: booleana que indica si el coche esta encendido o no
	 */
	private boolean encendido = false;

	/**
	 * int marcha: marcha del coche
	 */
	private int marcha = 0;

	/**
	 * double velocidad: velocidad del coche
	 */
	private double velocidad = 0;

	/**
	 * Funcion parar: para el coche
	 */
	public void parar() {
		encendido = false;
		marcha = 0;
		velocidad = 0;
	}

	/**
	 * Funcion arrancar: arranca el coche
	 */
	public void arrancar() {
		encendido = true;
	}

	/**
	 * Funcion subirMarcha: sube la marcha del coche
	 */
	private void subirMarcha() {
		marcha++;
	}

	/**
	 * Funcion bajarMarcha: baja la marcha del coche
	 */
	private void bajarMarcha() {
		marcha--;
	}

	/**
	 * Funcion acelerar: acelera el coche
	 * 
	 * @param velocidad: velocidad a la que se quiere aumentar
	 */
	public void acelerar(double velocidad) {
		if (velocidad >= 0) {
			this.velocidad = velocidad;
		}
	}

	/**
	 * Funcion desacelerar: desacelera el coche
	 */
	public void desacelerar() {
		velocidad = 0;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param marca     marca del coche
	 * @param modelo    modelo del coche
	 * @param color     color del coche
	 * @param matricula matricula del coche
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		if (color != null && !color.equals("")) {
			this.color = color;
		}
		if (matricula != null && !matricula.equals("")) {
			this.matricula = matricula;
		}
	}

	/**
	 * Setter setMarcha
	 * 
	 * @param marcha: marcha del coche
	 */
	public void setMarcha(int marcha) {
		if (marcha >= 0) {
			this.marcha = marcha;
		}
	}

	/**
	 * Setter setEncendido
	 * 
	 * @param encendido booleana que indica si el coche esta encendido o no
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}
