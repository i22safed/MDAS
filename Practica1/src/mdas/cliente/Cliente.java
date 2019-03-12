package mdas.cliente;

/*
 * Breve definicion de la clase 
 * 
 * 
 **/

public class Cliente {

	// private constructor 
	public Cliente() {}
	
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
