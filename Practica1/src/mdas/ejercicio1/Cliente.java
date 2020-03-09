package mdas.ejercicio1;


/**
 * <p>Clase cliente, la cual representa el un cliente dentro del sistema. De esta abstracción tenemos
 * en cuenta los atributos dni, nombre, apellidos, correo y la última modificación del usuario</p>
 **/

public class Cliente {

	// private constructor 
	public Cliente() {}
	
	public Cliente(int DNI, String usuario, String correo) {
		setDNI(DNI); 
		setUsuario(usuario); 
		setCorreo(correo);
	}
	
	// data
	private int DNI_; 
	private String correo_; 
	private String usuario_; 
	
	//methods 
	// getters
	public int getDNI() {return DNI_;}
	public void setDNI(int DNI) {this.DNI_ = DNI;}
	
	
	public String getCorreo() {return correo_;}
	public void setCorreo(String correo) {this.correo_ = correo;}
	
	
	public String getUsuario() {return usuario_;}
	public void setUsuario(String usuario) {this.usuario_ = usuario;}
	
	//
	
	
} // End of Client class
