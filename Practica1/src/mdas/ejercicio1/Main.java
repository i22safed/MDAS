package mdas.ejercicio1;

public class Main {

	
	public static void main(String[] args) {
	
		int DNI = 12345; // Parametro para la búsqueda por DNI
		
		Cliente c1 = new Cliente(12345,"Jose","jose@uco.es");
		Cliente c2 = new Cliente(73198,"Antonio","antonio@uco.es");
		Cliente c3 = new Cliente(45678,"Juan","juan@uco.es");
		Cliente c4 = new Cliente(73198,"Antonio","antonio001@uco.es");
		
		GestorCliente g = GestorCliente.getInstance(); 	// Comprobamos que la instancia Singleton se realiza 
		GestorCliente g1 = GestorCliente.getInstance();	// correctamente no permitiendo que se ejecute una segunda
														// instancia
		
		// Creamos clientes 
		
		System.out.println("\nCrear de usuarios: ");
		
		g.crearCliente(c1);
		g.crearCliente(c2);
		g.crearCliente(c3);
		g.leerCliente();
		
		System.out.println("\nModificar usuarios: ");
		
		// Modificamos clientes
		g.modificarCliente(c4);
		g.leerCliente();
		
		System.out.println("\nBorrar usuarios: ");
		// Borramos cliente
		g.borrarCliente(c2);
		g.leerCliente();
		
		System.out.println("\nUsuario con DNI " + DNI + ":");
		// Buscamos clientes por DNI
		g.buscarCLiente(DNI);
			
	}// Fin del método main

} // Fin de la clase Main
