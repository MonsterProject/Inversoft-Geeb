package controlador;

import modelo.Logica;
import modelo.dao.UsuarioDao;
import modelo.vo.UsuarioVo;
import vista.VentanaClientesAtrasados;
import vista.VentanaConsultarCLiente;
import vista.VentanaCuentas;
import vista.VentanaIngresarPrestamos;
import vista.VentanaLibroDeContabilidad;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRegitroUsuario;
import vista.VentanaResultadoLibrodeContavilidad;

public class Coordinador {

	private VentanaResultadoLibrodeContavilidad miResultadoLibroContabilidad;
	private VentanaRegitroUsuario miRegistrodeUsuario;
	private VentanaLogin miLogin;
	private VentanaLibroDeContabilidad miLibroContabilidad;
	private VentanaIngresarPrestamos miVentanaIngresarPrestamos;
	private VentanaCuentas misCuentas;
	private VentanaClientesAtrasados misClientesAtrasados;
	private VentanaConsultarCLiente miVentanaConsultarClientes;
	private VentanaPrincipal miVentanaPrincipal;
	private Coordinador miCoordinador;
	private UsuarioDao miUsuarioDao;
	private Logica miLogica;

	public void setVentanaResultadoLibrodeContabilidad(
			VentanaResultadoLibrodeContavilidad miResultadoLibroContabilidad) {

		this.miResultadoLibroContabilidad = miResultadoLibroContabilidad;
	}

	public void setVentanaRegistroUsuario(
			VentanaRegitroUsuario miRegistrodeUsuario) {
	
	this.miRegistrodeUsuario = miRegistrodeUsuario;
	
	}		
	

	public void setVentanaLogin(VentanaLogin miLogin) {

		this.miLogin = miLogin;
	}

	public void setVentanaLibroDeContabilidad(
			VentanaLibroDeContabilidad miLibroContabilidad) {

		this.miLibroContabilidad = miLibroContabilidad;
	}

	public void setVentanaIngresarPrestamos(
			VentanaIngresarPrestamos miVentanaIngresarPrestamos) {

		this.miVentanaIngresarPrestamos = miVentanaIngresarPrestamos;
	}
	
	public String registrarUsuario(UsuarioVo miUsuarioVo) {
		
		return miUsuarioDao.registrarUsuario(miUsuarioVo);
		
	}
	
	public String resultadoAcceso(String usuario, String contraseña) {
		
		return miUsuarioDao.resultadoAcceso(usuario, contraseña);
		
	}
	
	public void setVentanaCuentas(VentanaCuentas misCuentas) {

		this.misCuentas = misCuentas;
	}

	public void setVentanaClientesAtrasados(
			VentanaClientesAtrasados misClientesAtrasados) {

		this.misClientesAtrasados = misClientesAtrasados;
	}
	
	public boolean validarCampos(UsuarioVo miUsuarioVo) {
		
		return miLogica.validarCampos(miUsuarioVo);
	}

	public void setVentanaConsultarCliente(
			VentanaConsultarCLiente miVentanaConsultarClientes) {

		this.miVentanaConsultarClientes = miVentanaConsultarClientes;
	}

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {

		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public void logear() {
		miRegistrodeUsuario.setVisible(false);
miLogin.setVisible(true);	
	}

	public void registrarUsuario() {
		miLogin.setVisible(false);

		miRegistrodeUsuario.setVisible(true);
	}

	public void setUsuarioDao(UsuarioDao miUsuarioDao) {
		
		this.miUsuarioDao=miUsuarioDao;
	}

	public void setLogica(Logica miLogica) {

		this.miLogica=miLogica;
	}


}
