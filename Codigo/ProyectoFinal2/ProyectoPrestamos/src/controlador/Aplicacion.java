package controlador;

import vista.VentanaClientesAtrasados;
import vista.VentanaConsultarCLiente;
import vista.VentanaCuentas;
import vista.VentanaIngresarPrestamos;
import vista.VentanaLibroDeContabilidad;
import vista.VentanaLogin;
import vista.VentanaPrincipal;
import vista.VentanaRegitroUsuario;
import vista.VentanaResultadoLibrodeContavilidad;
import modelo.dao.*;
import modelo.vo.UsuarioVo;
import modelo.*;

public class Aplicacion {

	public void iniciar(){
		
	VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
	VentanaClientesAtrasados misClientesAtrasados = new VentanaClientesAtrasados(miVentanaPrincipal, true);
	VentanaConsultarCLiente miVentanaConsultarClientes = new VentanaConsultarCLiente(miVentanaPrincipal, true);
	VentanaCuentas misCuentas = new VentanaCuentas(miVentanaPrincipal, true);
	VentanaIngresarPrestamos miVentanaIngresarPrestamos = new VentanaIngresarPrestamos(miVentanaPrincipal, true);
	VentanaLibroDeContabilidad miLibroContabilidad = new VentanaLibroDeContabilidad(miVentanaPrincipal, true);
	VentanaLogin miLogin = new VentanaLogin(miVentanaPrincipal, true);
	VentanaRegitroUsuario miRegistrodeUsuario = new VentanaRegitroUsuario(miVentanaPrincipal, true);
	VentanaResultadoLibrodeContavilidad miResultadoLibroContabilidad = new VentanaResultadoLibrodeContavilidad(miVentanaPrincipal, true);
	Coordinador miCoordinador = new Coordinador();
	UsuarioDao miUsuarioDao= new UsuarioDao();
	UsuarioVo miUsuarioVo = new UsuarioVo();
	Logica miLogica= new Logica();
	
	
//falta el de esleida
	
	
	misClientesAtrasados.setCoordinador(miCoordinador);
	miVentanaConsultarClientes.setCoordinador(miCoordinador);
	misCuentas.setCoordinador(miCoordinador);
	miLibroContabilidad.setCoordinador(miCoordinador);
	miLogin.setCoordinador(miCoordinador);
	miRegistrodeUsuario.setCoordinador(miCoordinador);
	miResultadoLibroContabilidad.setCoordinador(miCoordinador);
	miVentanaIngresarPrestamos.setCoordinador(miCoordinador);
	miVentanaPrincipal.setCoordinador(miCoordinador);
	miLogin.setVentanaCuentas(misCuentas);
	miUsuarioDao.setMisCuentas(misCuentas);

	
	miVentanaPrincipal.setVentanaLogin(miLogin);
	miVentanaPrincipal.setVentanaRegistroUsuario(miRegistrodeUsuario);
	miCoordinador.setVentanaClientesAtrasados(misClientesAtrasados);
	miCoordinador.setVentanaConsultarCliente(miVentanaConsultarClientes);
	miCoordinador.setVentanaCuentas(misCuentas);
	miCoordinador.setVentanaIngresarPrestamos(miVentanaIngresarPrestamos);
	miCoordinador.setVentanaLibroDeContabilidad(miLibroContabilidad);
	miCoordinador.setVentanaLogin(miLogin);
	miCoordinador.setVentanaRegistroUsuario(miRegistrodeUsuario);
	miCoordinador.setVentanaResultadoLibrodeContabilidad(miResultadoLibroContabilidad);
	miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
	miCoordinador.setUsuarioDao(miUsuarioDao);
	miCoordinador.setLogica(miLogica);
	miLogin.setMisCuentas(misCuentas);
	
	

	miVentanaPrincipal.setVisible(true);
	
	
	}
	
	
}
