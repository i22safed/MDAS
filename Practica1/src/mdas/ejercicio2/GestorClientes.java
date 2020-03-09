/**
 * <p>Clase que gestiona el manejo de una lista de clientes. Contiene métodos CRUD y búsqueda por DNI</p>
 * @author David Sánchez Fernández
 * */


package mdas.ejercicio2;

import java.util.*;		// Importa ArrayList / List
import mdas.agenda.User;

public class GestorClientes {
	
	
	/**
	 * Lista de tipo cliente
	 * */
	private List<Cliente> clientes;   
	
	/**
	 * Constructor de la clase GestorCliente()
	 * */
	public GestorClientes(){		
		clientes = new ArrayList<Cliente>();
	}	
		
	
	
	/**
	 * crear(): añade un cliente a la lista
	 * @param c - objeto de tipo cliente 
	 * @return valorDevuelto:bool, variable que devuelve el 
	 * resultado de la operacion 
	 * */
	public Boolean crear(Cliente c) {
		
		Boolean valorDevuelto = false; 
		int tam = clientes.size(); 
		
		clientes.add(c);
		
		if(clientes.size() == tam +1) {
			valorDevuelto = true; 
		}
		
		return valorDevuelto; 
		
	}
	
	
	
	/**
	 * modificar(): modifica un cliente de la lista
	 * @param c - objeto de tipo cliente 
	 * @return valorDevuelto:bool, variable que devuelve el 
	 * resultado de la operacion 
	 * */	
	public Boolean modificar(Cliente c) {
		
		Boolean valorDevuelto = false;
		
		Cliente a = new Cliente();
		
		for(int i=0;i<clientes.size();i++) {
			
			a = clientes.get(i);
			
			if(a.getDNI() == c.getDNI()) {
				a.setNombre(c.getNombre());
				a.setApellidos(c.getApellidos());
				a.setCorreo(c.getCorreo());
				a.setModificacion(System.currentTimeMillis()/1000);
				
				valorDevuelto = true; 
				
			}	
		}
		
		
		return valorDevuelto; 
		
	}
	
	/**
	 * listar(): lista todos los elementos de la lista  
	 * */
	public void listar() {
		
		Cliente a = new Cliente();
		
		for (int i=0;i<clientes.size();i++) {
			a = clientes.get(i);
			System.out.println(i+". "+a.getDNI() + 
					" " + a.getNombre() + 
					" " + a.getApellidos() +
					" " + a.getCorreo() + 
					" " + a.getModificacion());
		}
		
		return ;
	}
	
	/**
	 * borrar(): elimina un cliente de la lista
	 * @param DNI - entero que posee el valor del DNI a borrar 
	 * @return valorDevuelto:bool, variable que devuelve el 
	 * resultado de la operacion 
	 * */
	public Boolean borrar(int DNI) {
		
		Boolean valorDevuelto = false;
		int tam = clientes.size();
		Cliente c = new Cliente();
		
		for(int i=0;i<clientes.size();i++) {
			c = clientes.get(i);
			if(c.getDNI() == DNI) {
				clientes.remove(i);
			}
		}
		
		if(tam == (clientes.size() + 1)){
			valorDevuelto = true;
		}
	
		return valorDevuelto;
	}
	
	
	/**
	 * buscar(): busca a un cliente por su DNI
	 * @param DNI - valor del DNI del usuario  
	 * */
	public void buscar(int DNI) {
		
		Cliente a = new Cliente();
		Boolean valorDevuelto = false; 
		
		for(int i=0;i<clientes.size();i++) {
			a = clientes.get(i);
			if(a.getDNI() == DNI) {
				valorDevuelto = true; 
				a = clientes.get(i);
				System.out.println(i+". "+a.getDNI() + 
						" " + a.getNombre() + 
						" " + a.getApellidos() +
						" " + a.getCorreo() + 
						" " + a.getModificacion());
			}
		}
		
		if(valorDevuelto == false) {
			System.out.println("Cliente no encontrado");
		}
		
		return ;
		
	}

		
} // Fin de la clase gestorCliente

	
