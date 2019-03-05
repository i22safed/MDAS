package mdas.cliente;

import java.io.*;
import mdas.cliente.Cliente;

public class GestorCliente {
	
	
	// Operaciones CRUD 
	public void crearCliente() {
		
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    
	    String tupla  = getDNI() + " " + getCorreo() +
	    			" " + getNombre() + " " + getApellidos() +
	    			" " + getDireccion() + " " + getTelefono();   
		
	}
	
	//public Cliente consultarCliente(); 
	
	//public void actualizarCliente();
	
	//public void borrarCliente(); 
	
	
	
	
	
}
