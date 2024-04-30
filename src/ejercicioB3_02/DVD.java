package ejercicioB3_02;

/**
 * Clase DVD
 * 
 * @author Nestor Sanchez
 */
public class DVD extends Ficha {

	/**
	 * enum tipos: tipos de DVDs admitidos
	 */
	enum tipos {
		pelicula, documental, serie
	};

	/**
	 * String director: director de un DVD
	 */
	private String director;

	/**
	 * String anio: anio de un DVD
	 */
	private int anio;

	/**
	 * tipos tipo: tipo de DVD
	 */
	private tipos tipo;

	/**
	 * Constructor con parametros
	 * 
	 * @param id       id de un DVD
	 * @param titulo   titulo de un DVD
	 * @param director director de un DVD
	 * @param anio     anio de un DVD
	 * @param tipo     tipo de DVD
	 */
	public DVD(int id, String titulo, String director, int anio, String tipo) {
		super(id, titulo);
		if (director != null && !director.equals("")) {
			this.director = director;
		}
		this.anio = anio;
		this.tipo = tipos.valueOf(String.valueOf(tipo));
	}

	/**
	 * Getter getDirector
	 * @return director de un DVD
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Getter getAnio
	 * @return anio de un DVD
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * Getter getTipo
	 * @return tipo de un DVD
	 */
	public tipos getTipo() {
		return tipo;
	}

	/**
	 * Funcion prestamo: asigna 5 dias de prestamo
	 * 
	 * @return dias de prestamo
	 */
	@Override
	public int prestamo() {
		return 5;
	}

}