package ejercicio01;

/**
 * Clase Hora
 * 
 * @author Nestor Sanchez
 */
public class Hora {

	/**
	 * hora: hora de la fecha
	 */
	protected int hora;

	/**
	 * minuto: minuto de la fecha
	 */
	protected int minuto;

	/**
	 * Constructor con parametros
	 * 
	 * @param hora    hora de la fecha
	 * @param minutos minutos de la fecha
	 */
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora < 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto < 59) {
			this.minuto = minuto;
		}
	}

	/**
	 * Funcion inc: incrementa el minuto en 1
	 */
	public void inc() {

		// Incrementa el minuto en 1
		minuto++;

		// If: si el minuto es 60:
		if (minuto == 60) {

			// Se incrementara hora en 1
			hora++;

			// Minuto se reestablecera a 0
			minuto = 0;

			// If: si hora es 24:
			if (hora == 24) {
				hora = 0;
			} // Fin If

		} // Fin If

	}

	/**
	 * boolean setMinutos: establece los minutos mediante un valor dado
	 * 
	 * @param valor valor a establecer
	 * @return si se ha podido hacer la operacion o no
	 */
	public boolean setMinutos(int valor) {

		// boolean establecido: booleana que indica si se han establecido los minutos o
		// no
		boolean establecido = false;

		// If: para establecer el valor, debe estar entre 0 y 59
		if (valor >= 0 && valor < 60) {
			establecido = true;
			minuto = valor;
		} // Fin If

		// Devuelve establecido al main
		return establecido;
	}

	/**
	 * boolean setHoras: establece la hora mediante un valor dado
	 * 
	 * @param valor valor a establecer
	 * @return si se ha podido hacer la operacion o no
	 */
	public boolean setHoras(int valor) {

		// boolean establecido: booleana que indica si se han establecido las horas o no
		boolean establecido = false;

		// If: para establecer el valor, debe estar entre 0 y 23
		if (valor >= 0 && valor < 24) {
			establecido = true;
			hora = valor;
		} // Fin If

		// Devuelve establecido al main
		return establecido;
	}

	/**
	 * toString: override de toString
	 * 
	 * @return hora completa
	 */
	@Override
	public String toString() {
		String texto = "";
		if (minuto < 10) {
			texto += hora + ":0" + minuto;
		} else {
			texto += hora + ":" + minuto;
		}
		return texto;
	}

}
