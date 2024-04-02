package ejercicio01;

/**
 * Clase HoraExacta
 * 
 * @author Nestor Sanchez
 */
public class HoraExacta extends Hora {

	/**
	 * int segundos: segundos de la fecha
	 */
	int segundos;

	/**
	 * Constructor con parametros
	 * 
	 * @param hora     horas de la fecha
	 * @param minuto   minutos de la fecha
	 * @param segundos segundos de la fecha
	 */
	public HoraExacta(int hora, int minuto, int segundos) {
		super(hora, minuto);
		if (segundos >= 0 && segundos < 59) {
			this.segundos = segundos;
		}
	}

	/**
	 * boolean setSegundos: establece los segundos mediante un valor dado
	 * 
	 * @param valor valor a establecer
	 * @return si se ha podido hacer la operacion o no
	 */
	public boolean setSegundos(int valor) {

		// boolean establecido: booleana que indica si se han establecido los segundos o
		// no
		boolean establecido = false;
		
		// If: para establecer el valor, debe estar entre 0 y 59
		if (valor >= 0 && valor < 60) {
			establecido = true;
			segundos = valor;
		} // Fin If
		
		// Devuelve establecido al main
		return establecido;
	}

	/**
	 * Funcion inc: incrementa el minuto en 1
	 */
	public void inc() {

		// Incrementa segundos en 1
		segundos++;

		if (segundos == 60) {

			// Incrementa el minuto en 1
			minuto++;

			// Segundos se reestablecera en 0
			segundos = 0;

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

	}

	/**
	 * toString: override de toString
	 * 
	 * @return hora exacta completa
	 */
	@Override
	public String toString() {
		
		// String texto: texto final a devolver
		String texto = "";
		
		// String horaString: hora pasada a string
		String horaString;
		String minutoString;
		String segundoString;
		if (hora < 10) {
			horaString = "0" + hora;
		} else {
			horaString = "" + hora;
		}
		if (minuto < 10) {
			minutoString = "0" + minuto;
		} else {
			minutoString = "" + minuto;
		}
		if (segundos < 10) {
			segundoString = "0" + segundos;
		} else {
			segundoString = "" + segundos;
		}
		
		// Une todo hacia texto
		texto = horaString + ":" + minutoString + ":" + segundoString;
		
		// Devuelve texto
		return texto;
		
	}

}