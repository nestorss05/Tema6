package ejerciciob1_02;

public class Main {

	public static void main(String[] args) {
		
		// Asigna los cinco empleados
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		
		// Muestra a los cinco empleados por pantalla
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
		
	}

}
