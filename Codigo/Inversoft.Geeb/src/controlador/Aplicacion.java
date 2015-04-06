package controlador;

import modelo.Logica;
import modelo.dao.UsuarioDao;
import modelo.vo.UsuarioVo;
import vista.PanelIngresarPrestamos;
import vista.PanelMenu;
import vista.PanelModificar;
import vista.PanelModificarCuenta;
import vista.VentanaPrincipal;

public class Aplicacion {

	public void iniciar() {
		
		

		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		PanelModificarCuenta miPanelModificar = new PanelModificarCuenta();
		PanelMenu miMenu = new PanelMenu();
		PanelModificar miPanelModificarP = new PanelModificar();
		PanelIngresarPrestamos miPanelIngresarP = new PanelIngresarPrestamos();
		UsuarioVo miUsuarioVo = new UsuarioVo();
		UsuarioDao miUsuarioDao = new UsuarioDao();
		Logica miLogica = new Logica();
		
		
		
		Coordinador miCoordinador = new Coordinador();
		
		miCoordinador.setPanelIngresarPrestamo(miPanelIngresarP);
		miCoordinador.setPanelModificar(miPanelModificarP);
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setPanelModificarCuenta(miPanelModificar);
		miCoordinador.setPanelMenu(miMenu);
		miCoordinador.setUsuarioVo(miUsuarioVo);
		miCoordinador.setUsuarioDao(miUsuarioDao);
		miCoordinador.setLogica(miLogica);
		
		
		miUsuarioDao.setCoordinador(miCoordinador);
		miUsuarioVo.setCoordinador(miCoordinador);
		miPanelIngresarP.setCoordinador(miCoordinador);
		miPanelModificarP.setCoordinador(miCoordinador);
		miMenu.setCoordinador(miCoordinador);
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miPanelModificar.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		miVentanaPrincipal.setVisible(true);
		
	}
	

	

}
