package ejercicioB3_03;

/**
 * Clase Transaccion
 * 
 * @author Nestor Sanchez
 */
public class Transaccion {

	/**
	 * enum TipoMovimiento: tipo de movimiento permitido
	 */
	private enum TipoMovimiento {
		BIZUM, RECIBOS, TRANSFERENCIAS, IMPUESTOS
	};

	/**
	 * double porcentaje: porcentaje de una transaccion
	 */
	private double porcentaje;

	/**
	 * int dia: dia de una transaccion
	 */
	private int dia;

	/**
	 * int mes: mes de una transaccion
	 */
	private int mes;

	/**
	 * int anio: anio de una transaccion
	 */
	private int anio;

	/**
	 * String concepto: concepto de una transaccion
	 */
	private String concepto;

	/**
	 * double importe: importe de una transaccion
	 */
	private double importe;

	/**
	 * TipoMovimiento tipo: tipo de movimiento de una transaccion
	 */
	private TipoMovimiento tipo;

	/**
	 * Constructor con parametros
	 * 
	 * @param porcentaje porcentaje de una transaccion
	 * @param dia        dia de una transaccion
	 * @param mes        mes de una transaccion
	 * @param anio       anio de una transaccion
	 * @param concepto   concepto de una transaccion
	 * @param importe    importe de una transaccion
	 * @param tipo       tipo de movimiento de una transaccion
	 */
	public Transaccion(double porcentaje, int dia, int mes, int anio, String concepto, double importe, String tipo) {
		if (porcentaje >= 0) {
			this.porcentaje = porcentaje;
		}
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
		this.anio = anio;
		if (concepto != null && !concepto.equals("")) {
			this.concepto = concepto;
		}
		if (importe >= 0) {
			this.importe = importe;
		}
		if (tipo != null && !tipo.equals("")) {
			this.tipo = TipoMovimiento.valueOf(String.valueOf(tipo));
		}
	}

}