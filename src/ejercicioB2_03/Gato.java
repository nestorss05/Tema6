package ejercicioB2_03;

/**
 * Clase Gato
 * @author Nestor Sanchez
 */
public class Gato extends AnimalDomestico {

	/**
	 * Funcion toserBolaPelo: haz que tu gato tosa una bola de pelo
	 */
	public void toserBolaPelo() {
		System.out.println("Tu gato acaba de toser una bola de pelo. Creo que te lo ha hecho por feo.");
	}
	
	/**
	 * Funcion hacerCaso: haz que tu gato te haga caso. O no.
	 */
	@Override
	public boolean hacerCaso() {
		
		// Boolean caso: muestra si el animal hace caso o no
		boolean caso = false;
		
		// If: si del 0 al 9 sale 19, caso sera false
		if ((int) Math.random() * 20 == 19) {
			caso = true;
		}
		
		// Devuelve caso
		return caso;
	}
	
	/**
	 * Funcion hacerRuido: haz que el gato maulle
	 */
	@Override
	public void hacerRuido() {
		System.out.println("¡Miau!");
	}
	
}