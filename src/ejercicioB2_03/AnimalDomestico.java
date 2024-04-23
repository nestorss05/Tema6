package ejercicioB2_03;

/**
 * Clase AnimalDomestico
 * @author Nestor Sanchez
 */
public abstract class AnimalDomestico implements Animal {
	
	/**
	 * String nombre: nombre del animal domestico
	 */
	String nombre;
	
	/**
	 * String raza: raza del animal domestico
	 */
	String raza;
	
	/**
	 * Double peso: peso del animal domestico
	 */
	double peso;
	
	/**
	 * String color: color del animal domestico
	 */
	String color;
	
	/**
	 * Funcion vacunar: vacuna al animal
	 */
	public void vacunar() {
		System.out.println("Vacuna puesta. Animal domestico ya vacunado.");
	}
	
	/*+
	 * Funcion abstracta hacerCaso: el animal hara caso. O no.
	 */
	public abstract boolean hacerCaso();

	/**
	 * Funcion comer: haz que el animal coma
	 */
	@Override
	public void comer() {
		System.out.println("Ñam, ñam");
	}

	/**
	 * Funcion dormir: haz que el animal duerma
	 */
	@Override
	public void dormir() {
		System.out.println("Zzz...");
	}

	/**
	 * Funcion hacerRuido: haz que el animal haga ruido
	 */
	@Override
	public void hacerRuido() {
		
	}
	
}