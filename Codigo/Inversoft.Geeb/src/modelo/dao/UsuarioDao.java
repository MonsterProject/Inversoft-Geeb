package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import vista.PanelMenu;

import modelo.conexion.Conexion;
import modelo.vo.UsuarioVo;
import controlador.Coordinador;


public class UsuarioDao {
	
	Connection connection=null;
	PreparedStatement preStatement=null;
	Conexion conexion=new Conexion();
	ResultSet result=null;
	String consulta="";
	private PanelMenu elMenu;
	private Coordinador miCoordinador;

	public void setCoordinador(Coordinador miCoordinador) {
	this.miCoordinador=miCoordinador;
	
	}

	public String registrarUsuario(UsuarioVo miUserVo) {

		String resultado="";
		connection=conexion.getConnection();
		consulta="INSERT INTO administrador (Pass_Admin, Nombre_admin, Apellidos_admin, Sexo_admin, alias_admin) VALUES (?,?,?,?,?)" ;
	
		try {
			preStatement=connection.prepareStatement(consulta);
			preStatement.setString(1, miUserVo.getPass());
			preStatement.setString(2, miUserVo.getNombre());
			preStatement.setString(3, miUserVo.getApellido());
			preStatement.setString(4, miUserVo.getSexo());
			preStatement.setString(5, miUserVo.getAlias());
			preStatement.execute();

			resultado="Ok";
			
		} catch (SQLException e) {

		
		JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR"+e.getMessage());
		resultado="error";
		}
		return resultado;
	}	
	public void setElMenu (PanelMenu elMenu){
		this.elMenu=elMenu;
	}
	}


