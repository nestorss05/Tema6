package ejercicioB3_03;

import java.util.List;

/**
 * Clase CuentaCorriente
 * 
 * @author Nestor Sanchez
 */
public class CuentaCorriente extends CuentaBancaria {

	/**
	 * List transacciones: lista indefinida de transacciones
	 */
	private List<Transaccion> transacciones;

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroCuenta nº de cuenta de una cuenta corriente
	 * @param saldo        saldo de una cuenta corriente
	 * @param titulares    titulares de una cuenta corriente
	 */
	public CuentaCorriente(String numeroCuenta, double saldo, Titular[] titulares) {
		super(numeroCuenta, saldo, titulares);
	}

	/**
	 * Funcion realizarTransaccion: realiza una transaccion
	 * 
	 * @param transaccion transaccion a realizar
	 * @return si se ha podido realizar la transaccion o no
	 */
	public boolean realizarTransaccion(Transaccion transaccion) {

		// boolean hecho: booleana que indica si se ha podido hacer la transaccion o no
		boolean hecho;

		// Confirma si se ha hecho la transaccion
		hecho = transacciones.add(transaccion);

		// Devuelve hecho
		return hecho;

	}

	/**
	 * double calcularSaldoConInteres: simplemente devuelve el saldo
	 * 
	 * @return saldo de la cuenta corriente en cuestion
	 */
	@Override
	public double calcularSaldoConInteres() {
		return saldo;
	}

}