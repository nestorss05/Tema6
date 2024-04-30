package ejercicioB3_03;

/**
 * Clase CuentaAhorro
 * 
 * @author Nestor Sanchez
 */
public class CuentaAhorro extends CuentaBancaria {

	/**
	 * double cuotaMantenimiento: cuota de mantenimento de una cuenta de ahorro
	 */
	private double cuotaMantenimiento;

	/**
	 * double interesAnual: interes anual de una cuenta de ahorro
	 */
	private double interesAnual;

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroCuenta       nº de cuenta de una cuenta de ahorro
	 * @param saldo              saldo de una cuenta de ahorro
	 * @param titulares          titulares de una cuota de ahorro
	 * @param cuotaMantenimiento cuota de mantenimento de una cuenta de ahorro
	 * @param interesAnual       interes anual de una cuenta de ahorro
	 */
	public CuentaAhorro(String numeroCuenta, double saldo, Titular[] titulares, double cuotaMantenimiento,
			double interesAnual) {
		super(numeroCuenta, saldo, titulares);
		if (cuotaMantenimiento >= 0) {
			this.cuotaMantenimiento = cuotaMantenimiento;
		}
		if (interesAnual >= 0) {
			this.interesAnual = interesAnual;
		}
	}

	/**
	 * Funcion calcularSaldoConInterese: calcula tu saldo con intereses
	 * 
	 * @return saldo con intereses
	 */
	@Override
	public double calcularSaldoConInteres() {
		double neoSaldo = saldo + interesAnual - cuotaMantenimiento;
		return neoSaldo;
	}
	
	/**
	 * Funcion aplicaInteres: aplica un interes
	 * 
	 * @param interesAnual interes a aplicar
	 */
	public void aplicaInteres(double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	/**
	 * Funcion aplicaMantenimiento: aplica una cuota de mantenimiento
	 * 
	 * @param cuotaMantenimiento cuota de mantenimiento a aplicar
	 */
	public void aplicaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

}