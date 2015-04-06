package controlador;

import java.awt.Component;

import modelo.Logica;
import modelo.dao.UsuarioDao;
import modelo.vo.UsuarioVo;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import vista.PanelIngresarPrestamos;
import vista.PanelMenu;
import vista.PanelModificar;
import vista.PanelModificarCuenta;
import vista.VentanaPrincipal;

public class Coordinador {

	private VentanaPrincipal miVentanaPrincipal;
	private PanelModificarCuenta miPanelModificar;
	private PanelMenu miMenu;
	private PanelModificar miPanelModificarP;
	private PanelIngresarPrestamos miPanelIngresarP;
	private UsuarioVo miUsuarioVo;
	private UsuarioDao miUsuarioDao;
	private Logica miLogica;

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {

		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public void setPanelModificarCuenta(PanelModificarCuenta miPanelModificar) {

		this.miPanelModificar=miPanelModificar;
	}

	public void setPanelMenu(PanelMenu miMenu) {

		this.miMenu=miMenu;
	}

	

	public void setPanelModificar(PanelModificar miPanelModificarP) {

		this.miPanelModificarP = miPanelModificarP;
	}

	
	public void setPanelIngresarPrestamo(PanelIngresarPrestamos miPanelIngresarP) {
		this.miPanelIngresarP= miPanelIngresarP;		
	}

	public void setUsuarioVo(UsuarioVo miUsuarioVo) {

		this.miUsuarioVo=miUsuarioVo;
	}

	public void setUsuarioDao(UsuarioDao miUsuarioDao) {

		this.miUsuarioDao= miUsuarioDao;
	}

	public boolean validarCampos(UsuarioVo miUserVo) {
		// TODO Auto-generated method stub
		return miLogica.validarCampos(miUserVo);
	}

	public void setLogica(Logica miLogica) {

		this.miLogica=miLogica;
	}

	public String registrarUsuario(UsuarioVo miUserVo) {
		// TODO Auto-generated method stub
		return miUsuarioDao.registrarUsuario(miUserVo);
	}





}


	






