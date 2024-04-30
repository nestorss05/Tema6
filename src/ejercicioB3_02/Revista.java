package ejercicioB3_02;

/**
 * Clase Revista
 * 
 * @author Nestor Sanchez
 */
public class Revista extends Ficha {

	/**
	 * String nRevista: nº de una revista
	 */
	private int nRevista;

	/**
	 * String anioPublicacion: anio de publicacion de una revista
	 */
	private int anioPublicacion;

	/**
	 * Constructor con parametros
	 * 
	 * @param id              id de una revista
	 * @param titulo          titulo de una revista
	 * @param nRevista        nº de una revista
	 * @param anioPublicacion anio de publicacion de una revista
	 */
	public Revista(int id, String titulo, int nRevista, int anioPublicacion) {
		super(id, titulo);
		if (nRevista > 0) {
			this.nRevista = nRevista;
		}
		this.anioPublicacion = anioPublicacion;
	}

	/**
	 * Getter getnRevista
	 * 
	 * @return nº de una revista
	 */
	public int getnRevista() {
		return nRevista;
	}

	/**
	 * Getter getAnioPublicacion
	 * 
	 * @return año de publicacion de una revista
	 */
	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	/**
	 * Funcion prestamo: asigna 10 dias de prestamo
	 * 
	 * @return dias de prestamo
	 */
	@Override
	public int prestamo() {
		return 10;
	}

}