package modelo;

import modelo.vo.UsuarioVo;
import controlador.Coordinador;

public class Logica {

	private Coordinador miCoordinador;

	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador=miCoordinador;
	}

	public boolean validarCampos(UsuarioVo miUserVo) {

		boolean validarNombre=false;
		boolean validarApellido=false;
		boolean validarContraseña=false;
		boolean validarAlias=false;
		boolean validarSexo=false;
		
		String nombre=miUserVo.getNombre();
		String apellido=miUserVo.getApellido();
		String pass=miUserVo.getPass();
		String alias=miUserVo.getAlias();
		String sexo=miUserVo.getSexo();

		
		if (nombre!=null && !nombre.equals("")){
			
			validarNombre=true;
		}		
		if (apellido!=null && !apellido.equals("")){
			
			validarApellido=true;
		}
		
		if (pass!=null && !pass.equals("")){
			
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
