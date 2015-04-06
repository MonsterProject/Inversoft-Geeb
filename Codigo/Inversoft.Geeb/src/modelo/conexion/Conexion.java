package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	
	private String nombreBd="Inversoft-Geeb";
	private String usuario="root";
	private String password="";
	private String url="jdbc:mysql://localhost/"+nombreBd;
	
	Connection conn=null;

	
	//constructor de la clase
	public Conexion(){
		
		try {
			
			//obtener el driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//obtener la conexion
			conn=DriverManager.getConnection(url, usuario, password);
			
			System.out.println("Conexion a la base de datos exitosa¡¡¡");
			
		} catch (ClassNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public Connection getConnection(){
		return conn;
	}
	
	public void desconectar(){
		conn=null;
	}

}



