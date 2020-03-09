package mdas.ejercicio2;

/**
 * <p>Clase cliente, la cual representa el un cliente dentro del sistema. De esta abstracción tenemos
 * en cuenta los atributos dni, nombre, apellidos, correo y la última modificación del usuario</p>
 * 
 **/

public class Cliente {

	/**
	 * Constructor de la clase cliente
	 * */ 
	public Cliente() {}
	
	/**
	 * Constructor parametrizado de la clase cliente
	 * */
	public Cliente(int DNI, String nombre,String apellidos, String correo) {
		setDNI(DNI); 
		setNombre(nombre); 
		setApellidos(apellidos);
		setCorreo(correo);
		setModificacion(System.currentTimeMillis()/1000);
	}
	
	
	private int DNI_;
	private String nombre_;
	private String apellidos_;
	private String correo_; 
	private long modificado_; 
	

	/**
	 * Observador y modificador del atributo DNI
	 * */
	public int getDNI() {return DNI_;}
	public void setDNI(int DNI) {this.DNI_ = DNI;}

	
	/**
	 * Observador y modificador del atributo Nombre
	 * */
	public String getNombre() {return nombre_;}
	public void setNombre(String nombre) {this.nombre_ = nombre;}
	
	
	/**
	 * Observador y modificador del atributo Apellidos
	 * */
	public String getApellidos() {return apellidos_;}
	public void setApellidos(String apellidos) {this.apellidos_ = apellidos;}
	
	/**
	 * Observador y modificador del atributo Correo
	 * */
	public String getCorreo() {return correo_;}
	public void setCorreo(String correo) {this.correo_ = correo;}
	
	/**
	 * Observador y modificador del atributo ultima actualización
	 * */
	public long getModificacion() {return modificado_;}
	public void setModificacion(long modificacion) {this.modificado_ = modificacion;}
	
	//
	
	
} // End of Client class
