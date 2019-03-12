
package mdas.cliente;

import java.util.*;		// Importa ArrayList / List
import java.io.*;


public class GestorCliente {
	
	
	List<Cliente> clientes = new ArrayList<Cliente>();  
	
	GestorCliente(){
		
	}
	
	// CreateCliente
	public Boolean crearCliente() {
		
		Cliente c = new Cliente();
		Boolean valorDevuelto = false; 
		int tam = clientes.size();
		
		Scanner ID = new Scanner (System.in);
		Scanner email = new Scanner (System.in);
		Scanner user = new Scanner (System.in);
		
		int DNI = 0;	
	
		
		System.out.println("DNI: ");
		DNI = ID.nextInt();
		
		while(checkDNI(DNI) == false) {
			System.out.println("DNI existente, introduzca otro: ");
			System.out.println("DNI: ");
			DNI = ID.nextInt();
		}
	
		
		System.out.println("Usuario : ");
		String correo = email.nextLine(); 
		System.out.println("Correo: ");
		String usuario = user.nextLine(); 
		
		/*
		ID.close(); 
		email.close(); 
		user.close();
		*/
		
		c.setDNI(DNI); 
		c.setCorreo(correo); 
		c.setUsuario(usuario);
		
		clientes.add(c);
		
		
		if(clientes.size() == tam+1 ) {
			valorDevuelto = true; 
		}else {
			valorDevuelto = false;
		}
		
		return valorDevuelto;
		
	}
	
	// ReadCliente 
	public void leerCliente() {
		
		Cliente c = new Cliente();
		
		for (int i = 0; i <= clientes.size() - 1; i++) {
            c = clientes.get(i);
            System.out.println(i + ". " + c.getDNI() + " " + c.getCorreo() + " " + c.getUsuario());
        }
 
	}
	
	// UpdateCliente	
	public void modificarCliente() {
		
		Scanner op = new Scanner(System.in);
		Scanner op_at = new Scanner(System.in);
		Scanner correo = new Scanner(System.in);
		Scanner usuario = new Scanner(System.in);
		Cliente c = new Cliente(); 
		
		System.out.println("\nClientes: \n");
		leerCliente();
		System.out.println("\nNumero de cliente que desea modificar: ");
		int opcion = op.nextInt(); 
		
		c = clientes.get(opcion);
		
		System.out.println("\nElija campo: "); 
		System.out.println("0. Correo");
		System.out.println("1. Usuario"); 
		System.out.println("Opcion: ");
		int op_a = op_at.nextInt();

		if(op_a == 0){
			String nCorreo;
			System.out.println("Introduzca el nuevo correo: ");
			nCorreo = correo.nextLine();
			c.setUsuario(nCorreo);
			clientes.set(opcion,c);
		}
		
		if(op_a == 1){
			String nUsuario;
			System.out.println("Introduzca el nuevo usuario: ");
			nUsuario = usuario.nextLine();
			c.setCorreo(nUsuario);
			clientes.set(opcion,c);
		}		
		

		
	}
	
	// Borrar cliente
	
	public Boolean borrarCliente() {
		
		Scanner opcion = new Scanner(System.in);
		Boolean valorDevuelto = false;
		int tam = clientes.size();
		
		System.out.println("Clientes: ");
		leerCliente();
		System.out.println("Introduzca el cliente a eliminar: ");
		
		int op = opcion.nextInt();
		clientes.remove(op);
		
		if( tam == clientes.size() + 1) {
			valorDevuelto = true; 
		}else {
			return false; 
		}
		
		return valorDevuelto ; 
		
		
	}
	
	// Busqueda de cliente por DNI 
		
	// Funciones de control
	// Funcion de control -> Comprueba que el DNI no exista en el sistema 
	
	public Boolean checkDNI(int DNI) {
		
		// Retorna false si el DNI existe en la lista
		// true en caso contrario 
		
		Boolean valorDevuelto = true; 
		
		Cliente c = new Cliente();
		for(int i=0; i <= clientes.size()-1 ; i++ ) {
			c = clientes.get(i);
			
			if(c.getDNI() == DNI ) {
				valorDevuelto = false; 
			}
		
		}
		
		return valorDevuelto; 
		
	}
	
	
	///////////  MAIN  /////////////////////////////////////////////

	public static void main(String [] args){

		 GestorCliente g = new GestorCliente();
		 
		 System.out.println("El valor de la insercion es " + g.crearCliente());
		 System.out.println("El valor de la insercion es " + g.crearCliente());
		 g.leerCliente();
		 g.modificarCliente();
		 g.leerCliente();
		 g.borrarCliente();
		 g.leerCliente();
		 
		 System.out.println("Ejecución finalizada");
		 
		 return ; 
	}


} // Fin de la clase gestorCliente
