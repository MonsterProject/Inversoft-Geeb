/**
 * 
 */
package modelo.vo;

public class UsuarioVo {

	private String nombre;
	private String apellido;
	private String contraseña;
	private String alias;
	private String sexo;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
