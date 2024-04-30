package ejercicioB3_03;

/**
 * Clase CuentaBancaria
 * 
 * @author Nestor Sanchez
 */
public abstract class CuentaBancaria {

	/**
	 * String numeroCuenta: nº de cuenta de la cuenta bancaria
	 */
	private String numeroCuenta;

	/**
	 * String saldo: saldo de la cuenta bancaria
	 */
	protected double saldo;

	/**
	 * Titular[] titulares: titulares de una cuenta bancaria
	 */
	private Titular[] titulares = new Titular[3];

	/**
	 * Funcion ingresar: ingresa una cantidad de dinero especifica
	 * 
	 * @param cantidad cantidad de dinero a ingresar
	 * @return si ha salido bien la operacion o no
	 */
	public boolean ingresar(double cantidad) {

		// boolean hecho: booleana que indica si la operacion ha salido bien o no
		boolean hecho = false;

		// If: si la cantidad es mayor o igual que 0, se sumara la cantidad al saldo
		if (cantidad >= 0) {
			saldo = saldo + cantidad;
			hecho = true;
		} // Fin If

		// Devuelve hecho
		return hecho;

	}

	/**
	 * Funcion retirar: retira una cantidad de dinero especifica
	 * 
	 * @param cantidad cantidad de dinero a retirar
	 * @return si ha salido bien la operacion o no
	 */
	public boolean retirar(double cantidad) {

		// boolean hecho: booleana que indica si la operacion ha salido bien o no
		boolean hecho = false;

		// If: si saldo - cantidad mayor o igual que 0, se restara el saldo a la
		// cantidad
		if (saldo - cantidad >= 0) {
			saldo = saldo - cantidad;
			hecho = true;
		} // Fin If

		// Devuelve hecho
		return hecho;

	}

	/**
	 * Funcion anyadir: añade un titular
	 * 
	 * @param titular: titular a añadir
	 * @return si se ha podido añadir el titular o no
	 */
	public boolean anyadir(Titular titular) {

		// Boolean hecho: comprueba si la operacion se ha realizado correctamente
		boolean hecho = false;

		// int pos: posicion del array
		int pos = 0;

		// While: mientras que se recorra el array...
		while (pos < titulares.length) {

			// If: si no hay ningun titular, se añadira el titular
			if (titulares[pos] == null) {
				titulares[pos] = titular;
				hecho = true;
				break;
			}

			// Aumenta la posicion en 1
			pos++;

		} // Fin While

		// Devuelve hecho
		return hecho;
	}

	/**
	 * Funcion borrar: borra un titular
	 * 
	 * @param titular: titular a borrar
	 * @return si se ha podido borrar el titular o no
	 */
	public boolean borrar(Titular titular) {

		// Boolean hecho: comprueba si la operacion se ha realizado correctamente
		boolean hecho = false;

		// int pos: posicion del array
		int pos = 0;

		// While: mientras que se recorra el array...
		while (pos < titulares.length) {

			// If: si el titular esta ahi, se borrara el titular
			if (titulares[pos] == titular) {
				titulares[pos] = null;
				hecho = true;
				break;
			}

			// Aumenta la posicion en 1
			pos++;

		} // Fin While

		// Devuelve hecho
		return hecho;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroCuenta nº de cuenta de la cuenta bancaria
	 * @param saldo        saldo de la cuenta bancaria
	 * @param titulares    titulares de la cuenta bancaria
	 */
	public CuentaBancaria(String numeroCuenta, double saldo, Titular[] titulares) {
		if (numeroCuenta != null && !numeroCuenta.equals("")) {
			this.numeroCuenta = numeroCuenta;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		this.titulares = titulares;
	}

	/**
	 * Funcion calcularSaldoConInteres: calculara el saldo con interes en las demas
	 * clases
	 * 
	 * @return aqui nada
	 */
	public abstract double calcularSaldoConInteres();

}