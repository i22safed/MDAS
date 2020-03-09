
/**
 * <p>Clase que gestiona el manejo de una lista de clientes. Contiene métodos CRUD y búsqueda por DNI</p>
 * @author David Sánchez Fernández
 * */



package mdas.ejercicio1;

import java.util.*;		

public class GestorCliente {
	
	/**
	 * Lista de tipo cliente
	 * */
	private List<Cliente> clientes;   
	
	/**
	 * Constructor de la clase GestorCliente()
	 * */
	private GestorCliente(){		
		clientes = new ArrayList<Cliente>();
	}
	
	/**
	 * Instncia unica privada Singleton
	 * */ 
	private static GestorCliente unicaInstancia = null; 
	
	/**
	 * Funcion de acceso Singleton
	 * */
	public static GestorCliente getInstance() {
		if (unicaInstancia == null) {
			unicaInstancia = new GestorCliente();
			System.out.println("Instancia creada correctamente ");
		}else {
			System.out.println("Error al crear la instancia ");
		}
			
		return unicaInstancia;
	}
	
	
	/**
	 * crear(): añade un cliente a la lista
	 * @param c - objeto de tipo cliente 
	 * @return valorDevuelto:bool, variable que devuelve el 
	 * resultado de la operacion 
	 * */
	public Boolean crearCliente(Cliente c) {
	
		Boolean valorDevuelto ; 
		int tam = clientes.size(); 
		
		clientes.add(c);
		
		if(clientes.size() == tam+1) {
			valorDevuelto = true; 
		}else {
			valorDevuelto = false;
		}
		
		return valorDevuelto;
		
	}
	
	/**
	 * leerCliente(): lista los clientes que hay almacenados
	 * */
	public void leerCliente() {
		
		Cliente c = new Cliente();
		
		for (int i = 0; i <= clientes.size() - 1; i++) {
            c = clientes.get(i);
            System.out.println(i + ". " + c.getDNI() + " " +  c.getUsuario() + " " + c.getCorreo());
        }
 
	}
	
	/**
	 * modificar(): modifica un cliente de la lista
	 * @param c - objeto de tipo cliente 
	 * @return valorDevuelto:bool, variable que devuelve el 
	 * resultado de la operacion 
	 * */	
	public Boolean modificarCliente(Cliente c) {
		
		Boolean valorDevuelto = false; 
		
		for (int i=0; i<clientes.size();i++) {
			
			if (clientes.get(i).getDNI() == c.getDNI()) {
				
				clientes.get(i).setUsuario(c.getUsuario());
				clientes.get(i).setCorreo(c.getCorreo());
				valorDevuelto = true; 
			}
			
		}
		
		return valorDevuelto; 
	
	}

	/**
	 * borrar(): elimina un cliente de la lista
	 * @param DNI - entero que posee el valor del DNI a borrar 
	 * @return valorDevuelto:bool, variable que devuelve el 
	 * resultado de la operacion 
	 * */
	public Boolean borrarCliente(Cliente c) {
		
		int tam = clientes.size();
		
		for (int i=0; i<clientes.size();i++) {
			
			if (clientes.get(i).getDNI() == c.getDNI()) {
				clientes.remove(i);
			}	
		}
		
		if(tam == clientes.size()+1) {
			return true; 
		}else {
			return false; 
		}	
	}
	
	
	/**
	 * buscar(): busca a un cliente por su DNI
	 * @param DNI - valor del DNI del usuario  
	 * */
	public void buscarCLiente(int DNI) {
		
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).getDNI() == DNI) {
				System.out.println(clientes.get(i).getDNI()+" " +clientes.get(i).getUsuario()+" "+clientes.get(i).getCorreo());
			}
		}
		
		return; 
	}
		
} // Fin de la clase gestorCliente
