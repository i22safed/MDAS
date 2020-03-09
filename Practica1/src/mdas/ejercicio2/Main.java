


package mdas.ejercicio2;

public class Main {

	
	public static void main (String[] args) {
		
		Boolean valorDevuelto ; 
		Adapter a = new Adapter(); 
		GestorClientes g = new GestorClientes();
	
		Cliente c1 = new Cliente(12345678 , "Rafa","Perez","rape@uco.es");
		Cliente c2 = new Cliente(12345688 , "Juan","Lopez","julo@uco.es");
		Cliente c3 = new Cliente(12345668 , "Julio","Gutierrez","jugu@uco.es");
		Cliente c4 = new Cliente(12345638 , "Antonio","Lopera","anlo@uco.es");
		
		// Añadimos a la agenda 
		
		System.out.println("Operaciones sobre la agenda");
		
		valorDevuelto = a.anadir(c1); 
		System.out.println("Operación de añadir c1: " + valorDevuelto);
		valorDevuelto = a.anadir(c2); 
		System.out.println("Operación de añadir c2: " + valorDevuelto);
		valorDevuelto = a.anadir(c3); 
		System.out.println("Operación de añadir c3: " + valorDevuelto);
		valorDevuelto = a.anadir(c4); 
		System.out.println("Operación de añadir c4: " + valorDevuelto);
		
		// Añadimos al gestor de clientes
		
		System.out.println("\nOperaciones sobre GestorClientes");
		
		valorDevuelto = g.crear(c1); 
		System.out.println("Operación de añadir c1: " + valorDevuelto);
		valorDevuelto = g.crear(c2); 
		System.out.println("Operación de añadir c2: " + valorDevuelto);
		valorDevuelto = g.crear(c3); 
		System.out.println("Operación de añadir c3: " + valorDevuelto);
		valorDevuelto = g.crear(c4); 
		System.out.println("Operación de añadir c4: " + valorDevuelto);
	
		// Mostramos los clientes de ambos sitios 
		
		System.out.println("\nElementos de la Agenda");
		a.listar();
		
		System.out.println("\nElementos de GestorClientes");
		g.listar();
		
		Cliente c5 = new Cliente(12345668 , "Julio","Gutierrez","julo1111@uco.es");
		Cliente c6 = new Cliente(12345638 , "Antonio","Lopera","anlo222@uco.es");
		
		try {			// Para comprobar que los el tiempo de actualización se realiza correctamente
			Thread.sleep (10000);
		} catch (Exception e) {
			System.out.println("Error en la espera");
		}
		
		valorDevuelto = a.modificar(c5);
		System.out.println("\nOperación de modificar c3: " + valorDevuelto);
		
		try {			// Para comprobar que los el tiempo de actualización se realiza correctamente
			Thread.sleep (10000);
		} catch (Exception e) {
			System.out.println("Error en la espera");
		}
		
		valorDevuelto = g.modificar(c6);
		System.out.println("Operación de añadir c4: " + valorDevuelto);
		
		System.out.println("\nElementos de la Agenda post modificacion");
		a.listar();
		
		System.out.println("\nElementos de GestorClientes post modificacion");
		g.listar();
		
	}
	
}
