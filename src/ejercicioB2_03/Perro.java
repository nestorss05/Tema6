package ejercicioB2_03;

/**
 * Clase Perro
 * @author Nestor Sanchez
 */
public class Perro extends AnimalDomestico {

	/**
	 * Funcion sacarPaseo: saca de paseo al perro
	 */
	public void sacarPaseo() {
		System.out.println("Has salido de paseo con el perro.");
	}
	
	/**
	 * Funcion hacerCaso: haz que tu perro te haga caso. O no.
	 */
	@Override
	public boolean hacerCaso() {
		
		// Boolean caso: muestra si el animal hace caso o no
		boolean caso = true;
		
		// If: si del 0 al 9 sale 9, caso sera false
		if ((int) Math.random() * 10 == 9) {
			caso = false;
		}
		
		// Devuelve caso
		return caso;
	}
	
	/**
	 * Funcion hacerRuido: haz que el perro ladre
	 */
	@Override
	public void hacerRuido() {
		System.out.println("¡Guau Guau!");
	}
	
}