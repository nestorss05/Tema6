package ejercicioB3_02;

/**
 * Clase Ficha
 * 
 * @author Nestor Sanchez
 */
public abstract class Ficha {

	/**
	 * int id: autor
	 */
	private int id;

	/**
	 * String titulo: titulo
	 */
	private String titulo;

	/**
	 * Getter getID
	 * 
	 * @return ID
	 */
	public int getID() {
		return id;
	}

	/**
	 * Getter getTitulo
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Setter setEditorial
	 * 
	 * @param editorial editorial
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Funcion abstracta prestamo: prestamo a calcular
	 * 
	 * @return nada
	 */
	public abstract int prestamo();

	/**
	 * Constructor con parametros
	 * 
	 * @param id     id
	 * @param titulo titulo
	 */
	public Ficha(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

}