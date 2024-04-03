package ejercicioB1_01;

/**
 * Clase HoraExacta
 * 
 * @author Nestor Sanchez
 */
public class HoraExacta extends Hora {

	/**
	 * int segundos: segundos de la fecha
	 */
	private int segundos;

	/**
	 * Constructor con parametros
	 * 
	 * @param hora     horas de la fecha
	 * @param minuto   minutos de la fecha
	 * @param segundos segundos de la fecha
	 */
	public HoraExacta(int hora, int minuto, int segundos) {
		
		// Asigna las horas y los minutos
		super(hora, minuto);
		
		// If: Se guardaran los segundos si estan entre 0 y 59
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		} // Fin If
		
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

			// Se incrementara un minuto
			super.inc();

			// Segundos se reestablecera en 0
			segundos = 0;

		} // Fin If

	}

	/**
	 * toString: override de toString
	 * 
	 * @return hora exacta completa
	 */
	@Override
	public String toString() {

		// String texto: texto final a devolver
		String texto;

		// String textoOG: texto de la clase Hora
		String textoOG = super.toString();

		// If-Else: revisa si segundos es menor que 10 y une todo hacia texto
		if (segundos < 10) {
			texto = textoOG + ":0" + segundos;
		} else {
			texto = textoOG + ":" + segundos;
		} // Fin If-Else

		// Devuelve texto
		return texto;

	}

}