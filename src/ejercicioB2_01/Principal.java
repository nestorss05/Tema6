package ejercicioB2_01;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		// Creo un array de socios. Que conste que el orden esta alterado.
		Socio[] socios = new Socio[] {
				new Socio(1, "Raul", 22),
				new Socio(2, "Carlos", 18),
				new Socio(4, "Nestor", 19),
				new Socio(3, "Fernando", 23)
		};

		// Ordena la tabla de Socios (se usara el metodo compareTo de la clase Socio)
		Arrays.sort(socios);
		
		// Muestra el array por pantalla
		System.out.println(Arrays.deepToString(socios));

	}

}