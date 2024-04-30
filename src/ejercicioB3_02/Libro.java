package ejercicioB3_02;

/**
 * Clase Libro
 * 
 * @author Nestor Sanchez
 */
public class Libro extends Ficha {

	/**
	 * String autor: autor del libro
	 */
	private String autor;

	/**
	 * String editorial: editorial del libro
	 */
	private String editorial;

	/**
	 * Getter getEditorial
	 * 
	 * @return editorial del libro
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Setter setEditorial
	 * 
	 * @param editorial editorial del libro
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Getter getAutor
	 * 
	 * @return autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param id        id del libro
	 * @param titulo    titulo del libro
	 * @param autor     autor del libro
	 * @param editorial editorial del libro
	 */
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		if (editorial != null && !editorial.equals("")) {
			this.editorial = editorial;
		}
	}

	/**
	 * Funcion prestamo: asigna 15 dias de prestamo
	 * 
	 * @return dias de prestamo
	 */
	@Override
	public int prestamo() {
		return 15;
	}

}