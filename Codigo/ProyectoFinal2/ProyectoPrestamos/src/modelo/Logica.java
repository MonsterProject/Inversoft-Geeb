package modelo;

import modelo.vo.UsuarioVo;

public class Logica {
	
	public boolean validarCampos(UsuarioVo miUsuarioVo) {
	
	boolean validarNombre=false;
	boolean validarApellido=false;
	boolean validarContraseña=false;
	boolean validarAlias=false;
	boolean validarSexo=false;
	
	String nombre=miUsuarioVo.getNombre();
	String apellido=miUsuarioVo.getApellido();
	String contraseña=miUsuarioVo.getContraseña();
	String alias=miUsuarioVo.getAlias();
	String sexo=miUsuarioVo.getSexo();
	
	
	if (nombre!=null && !nombre.equals("")){
		
		validarNombre=true;
	}
	
	if (apellido!=null && !apellido.equals("")){
		
		validarApellido=true;
	}
	
	if (contraseña!=null && !contraseña.equals("")){
		
		validarContraseña=true;
	}
	
	if (alias!=null && !alias.equals("")){
		
		validarAlias=true;
	}
	
	if (!sexo.equals("Seleccione")){
		
		validarSexo=true;
	}
	
	if (validarNombre==true && validarApellido==true && validarContraseña==true && validarAlias==true && validarSexo==true){
		
		return true;
		
	}else{
		
		return false;

	}
	
	}

	}
