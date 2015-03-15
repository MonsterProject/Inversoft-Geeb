package modelo;

import modelo.vo.UsuarioVo;

public class Logica {
	
	public boolean validarCampos(UsuarioVo miUsuarioVo) {
	
	boolean validarNombre=false;
	boolean validarApellido=false;
	boolean validarContrase�a=false;
	boolean validarAlias=false;
	boolean validarSexo=false;
	
	String nombre=miUsuarioVo.getNombre();
	String apellido=miUsuarioVo.getApellido();
	String contrase�a=miUsuarioVo.getContrase�a();
	String alias=miUsuarioVo.getAlias();
	String sexo=miUsuarioVo.getSexo();
	
	
	if (nombre!=null && !nombre.equals("")){
		
		validarNombre=true;
	}
	
	if (apellido!=null && !apellido.equals("")){
		
		validarApellido=true;
	}
	
	if (contrase�a!=null && !contrase�a.equals("")){
		
		validarContrase�a=true;
	}
	
	if (alias!=null && !alias.equals("")){
		
		validarAlias=true;
	}
	
	if (!sexo.equals("Seleccione")){
		
		validarSexo=true;
	}
	
	if (validarNombre==true && validarApellido==true && validarContrase�a==true && validarAlias==true && validarSexo==true){
		
		return true;
		
	}else{
		
		return false;

	}
	
	}

	}
