/**
 * <p>Clase que implementa el patrón Adapter(adaptador). El cual nos permite adaptar la interfaz de una clase en otra </p>
 * @author David Sánchez Fernández
 * */



package mdas.ejercicio2;

import mdas.agenda.Agenda;
import mdas.agenda.IUserMgt;
import mdas.agenda.User;


public class Adapter {

	
	
	  /**
	   * Instancia del componente agenda a traves de su interfaz
	   * */
	  IUserMgt userMgt = new Agenda(); //AGENDA
	  
	  /**
	   * Vector de tipo usuario 
	   * */
	  private User[] usuarios;		// Vector de usuarios que es lo que devuelve getUsers() 
	  
	  /**
	   * Contructor público de la clase adaptador 
	   * */
	  public Adapter() {}
	  
	  /** 
	   * anadir(): Añade un cliente a la Agenda 
	   * @param c - parametro de tipo cliente
	   * @return valorDevuelto, variable que comprueba que
	   * la operacion de inserción ha sido realizada correctamente
	   * */
	  public Boolean anadir(Cliente c) {
		  
		  Boolean valorDevuelto = false; 
		  
		  String dni = String.valueOf(c.getDNI()) ;
		  String nombre = c.getNombre(); 
		  String apellidos = c.getApellidos(); 
		  String password = null; 
		  String correo = c.getCorreo();
		  
		  User u = new User(dni,nombre,apellidos,password,correo);
		  
		  valorDevuelto = userMgt.addUser(u);
		  
		  usuarios = userMgt.getUsers();
		  
		  return valorDevuelto ; 
		  
	  }
	  
	  /** 
	   * borrar(): Borra un cliente de la Agenda por el DNI 
	   * @param DNI - parametro de tipo String que indica el DNI del cliente
	   * @return valorDevuelto, variable que comprueba que
	   * la operacion de borrado ha sido realizada correctamente
	   * */
	  public Boolean borrar(String DNI) {
		  
		  Boolean valorDevuelto ; 
		  
		  String dni = String.valueOf(DNI);
		  
		  valorDevuelto = userMgt.removeUser(dni);
		  
		  return valorDevuelto; 
		  
	  }
	  
	  
	  /** 
	   * modificar(): Modifica un cliente a la Agenda 
	   * @param c - parametro de tipo cliente
	   * @return valorDevuelto:bool, variable que comprueba que
	   * la operacion de modificacion ha sido realizada correctamente
	   * */
	  public Boolean modificar(Cliente c) {
		  
		  Boolean valorDevuelto = false; 

		  String dni = String.valueOf(c.getDNI()) ;
		  String nombre = c.getNombre(); 
		  String apellidos = c.getApellidos(); 
		  String password = null; 
		  String correo = c.getCorreo();
		  
		  User u = new User(dni,nombre,apellidos,password,correo);
		  
		  for (int i=0;i<usuarios.length;i++) {
			  if(usuarios[i].getDni().equals(dni) == true) {  
				  usuarios[i] = u;
				  valorDevuelto = true;
			  }
		  }
		  
		  return valorDevuelto;
		  
	  }
	  
	  
	  /** 
	   * listar(): Lista todos los clientes del vector 
	   * */
	  public void listar() {
		  
		  for(int i=0;i<usuarios.length;i++) {
					
					System.out.println(i+". "+usuarios[i].getDni() + 
							" " + usuarios[i].getName() + 
							" " + usuarios[i].getSurname() +
							" " + usuarios[i].getPassword() + 
							" " + usuarios[i].getEmail() + 
							" " + usuarios[i].getRegistration());
				}
		  
		  return ; 
	  }
	  
	  /** 
	   * obtenerUsuarios(): Vuelca los usuarios de la Agenda en el vector usuarios 
	   * @return usuarios, variable que almacena todos los usuarios de la agenda
	   * */
	  
	  public User[] obtenerUsuarios() {
		  
		  usuarios = userMgt.getUsers();
		
		  return usuarios; 
	  
	  }
	  
	  
	  
}
