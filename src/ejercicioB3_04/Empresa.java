package ejercicioB3_04;

/**
 * Clase Empresa
 * 
 * @author Nestor Sanchez
 */
public class Empresa extends Contacto {

	/**
	 * String paginaWeb: pagina web de la empresa
	 */
	private String paginaWeb;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre    nombre de la empresa
	 * @param telefono  telefono de la empresa
	 * @param paginaWeb pagina web de la empresa
	 */
	public Empresa(String nombre, long telefono, String paginaWeb) {
		super(nombre, telefono);
		if (paginaWeb != null && !paginaWeb.equals("")) {
			this.paginaWeb = paginaWeb;
		}
	}

	/**
	 * Getter getPaginaWeb
	 * 
	 * @return pagina web de la persona
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * Setter setPaginaWeb
	 * 
	 * @param paginaWeb pagina web de la persona
	 */
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

}