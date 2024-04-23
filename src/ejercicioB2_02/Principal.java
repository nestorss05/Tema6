package ejercicioB2_02;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		
		// Creo un array de socios. Que conste que el orden esta alterado.
		Futbolista[] futbolistas = new Futbolista[] {
				new Futbolista(4, "Sergio Ramos", 38, 110),
				new Futbolista(19, "Marcos Acuña", 32, 40),
				new Futbolista(16, "Jesus Navas", 38, 44),
				new Futbolista(5, "Lucas Ocampos", 29, 96),
				new Futbolista(16, "Erik Lamela", 32, 78)
		};
		
		// Ordena el array
		Arrays.sort(futbolistas);
		
		// Muestra el array
		System.out.println(Arrays.deepToString(futbolistas));
		
	}
	
}