package mdas.cliente;

/*
 * Breve definicion de la clase 
 * 
 * 
 **/

public class Cliente {

	// private constructor 
	public Cliente() {
		
	}
	
	// data
	private int DNI_; 
	private String correo_; 
	private String nombre_; 
	private String apellidos_; 
	private String direccion_; 
	private int telefono_; 
	
	//methods 
	// getters
	public int getDNI() {return DNI_;}
	public String getCorreo() {return correo_;}
	public String getNombre() {return nombre_;}
	public String getApellidos() {return apellidos_;}
	public String getDireccion() {return direccion_;}
	public int getTelefono() {return telefono_;}

	// setters
	public void setDNI(int DNI) {DNI_ = DNI;}
	public void setCorreo(String correo) {correo_ = correo;}
	public void setNombre(String nombre) {nombre_ = nombre;}
	public void setApellidos(String apellidos) {apellidos_ = apellidos;}
	public void setDireccion(String direccion) {direccion_ = direccion;}
	public void setTelefono(int telefono) {telefono_ = telefono;}
	
	//
	
	
} // End of Client class
