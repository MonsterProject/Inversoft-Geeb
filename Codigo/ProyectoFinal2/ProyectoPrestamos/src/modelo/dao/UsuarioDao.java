/**
 * 
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import vista.VentanaCuentas;


import modelo.conexion.Conexion;
import modelo.vo.UsuarioVo;


public class UsuarioDao {
	
	Connection connection=null;
	PreparedStatement preStatement=null;
	Conexion conexion=new Conexion();
	ResultSet result=null;
	String consulta="";
	private VentanaCuentas misCuentas;
	
	public String resultadoAcceso (String usuario, String contraseña){
		
		String resultLogueo="";

		connection=conexion.getConnection();
	    consulta=("SELECT aliasAdmin, passAdmin FROM administrador WHERE aliasAdmin='"+usuario+"' and passAdmin='"+contraseña+"'");

		try {

			preStatement=connection.prepareStatement(consulta);
			result=preStatement.executeQuery();

			
		     if (result.next()){

		    	 resultLogueo="logueoCorrecto";
		     }else{
		    	 resultLogueo="logueoIncorrecto";
		     }
		     
		} catch (NullPointerException |SQLException e) {
			
	    	 JOptionPane.showMessageDialog(null, "Error Definitivamente :( ");
	    	 
	    	 resultLogueo="logueoIncorrecto";


		}
			
		return resultLogueo;
	}
	
	public String registrarUsuario(UsuarioVo miUsuarioVo){
		
		String resultado=""; 
		connection=conexion.getConnection();
		consulta="INSERT INTO administrador (aliasAdmin, nombreAdmin, apellidosAdmin, sexoAdmin, passAdmin) VALUES (?,?,?,?,?)";
		
		try {
			preStatement=connection.prepareStatement(consulta);
			preStatement.setString(2, miUsuarioVo.getNombre());
			preStatement.setString(3, miUsuarioVo.getApellido());
			preStatement.setString(5, miUsuarioVo.getContraseña());
			preStatement.setString(1, miUsuarioVo.getAlias());
			preStatement.setString(4, miUsuarioVo.getSexo());
			preStatement.execute();
			
			resultado="ok";

		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "No se pudo Registrar el Usuario"+e.getMessage());
		}
		misCuentas.alias(miUsuarioVo.getAlias());
		return resultado;
	}
	
	public void setMisCuentas(VentanaCuentas misCuentas){

		this.misCuentas=misCuentas;
	}
}