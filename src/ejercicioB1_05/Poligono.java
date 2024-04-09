package ejercicioB1_05;

/**
 * Clase Poligono
 * 
 * @author Nestor Sanchez
 */
public abstract class Poligono {

	/**
	 * int numeroLados: numero de lados de un poligono
	 */
	protected int numeroLados;

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroLados numero de lados de un poligono
	 */
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	/**
	 * Getter getNumeroLados
	 * 
	 * @return numero de lados de un poligono
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Funcion area: funcion que calcula el area del poligono (a especificar)
	 * 
	 * @return area del poligono
	 */
	public abstract double area();

	/**
	 * Funcion toString: muestra el nº de lados por pantalla
	 */
	@Override
	public String toString() {
		String mensaje;
		mensaje = "Nº de lados: " + numeroLados;
		return mensaje;
	}
	
}