package modelo.vo;

import controlador.Coordinador;

public class UsuarioVo {
	//PARA REGISTRAR PERSONA
	// nombre , apellido , contraseña , alias , sexo
	private String nombre ;
	private String apellido ;
	private String pass;
	private String alias;
	private String sexo;
	private Coordinador miCoordinador;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador=miCoordinador;
	}
	

	

}
