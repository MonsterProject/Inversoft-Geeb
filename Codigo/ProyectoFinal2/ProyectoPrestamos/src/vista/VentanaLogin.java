package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controlador.Coordinador;



/**
 *
 * @author ERIKA
 */
public class VentanaLogin extends javax.swing.JDialog implements ActionListener {
	
	 private javax.swing.JButton btnLogin;
	    private javax.swing.JLabel labelLogin1;
	    private javax.swing.JLabel labelLogin2;
	    private javax.swing.JLabel labelLoginImg;
	    private javax.swing.JLabel labelLoginTitu;
	    private javax.swing.JPanel panelLogin;
	    private javax.swing.JPasswordField passLogin;
	    private javax.swing.JTextField txtLoginNombre;
		private Coordinador miCoordinador;
		private VentanaCuentas ventanaCuentas;

	    
    public VentanaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setTitle("Login");

        initComponents();
    }

 
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        labelLogin1 = new javax.swing.JLabel();
        labelLogin2 = new javax.swing.JLabel();
        txtLoginNombre = new javax.swing.JTextField();
        passLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        labelLoginImg = new javax.swing.JLabel();
        labelLoginTitu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelLogin.setLayout(null);

        labelLogin1.setText("Contraseña :");
        panelLogin.add(labelLogin1);
        labelLogin1.setBounds(50, 310, 80, 30);

        labelLogin2.setText("Alias :");
        panelLogin.add(labelLogin2);
        labelLogin2.setBounds(50, 250, 70, 30);
        panelLogin.add(txtLoginNombre);
        txtLoginNombre.setBounds(130, 250, 140, 30);
        panelLogin.add(passLogin);
        passLogin.setBounds(130, 310, 140, 30);

        btnLogin.setText("Entrar");
        panelLogin.add(btnLogin);
        btnLogin.setBounds(230, 390, 100, 40);
        btnLogin.addActionListener(this);

        labelLoginImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/40041.png"))); // NOI18N
        panelLogin.add(labelLoginImg);
        labelLoginImg.setBounds(70, 70, 220, 150);

        labelLoginTitu.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        labelLoginTitu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLoginTitu.setText("Login");
        panelLogin.add(labelLoginTitu);
        labelLoginTitu.setBounds(140, 10, 100, 40);

        getContentPane().add(panelLogin);
        panelLogin.setBounds(0, 10, 370, 460);

    }


	public void setCoordinador(Coordinador miCoordinador) {
			
		this.miCoordinador=miCoordinador;		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnLogin){
			
			validarIngreso(txtLoginNombre.getText(), passLogin.getText());
			
			
		}
	}

	String retorno="";
	private VentanaCuentas misCuentas;

	private void validarIngreso(String usuario, String contraseña) {
		
		retorno=miCoordinador.resultadoAcceso(usuario, contraseña);
		
		if (retorno.equals("logueoCorrecto")){
			
			JOptionPane.showMessageDialog(null, "¡¡Logueo Correcto!!");
			misCuentas.alias(usuario);
			dispose();
			txtLoginNombre.setText("");
			passLogin.setText("");
			ventanaCuentas.setVisible(true);
			
			
		}else if (retorno.equals("logueoIncorrecto")){
			
			JOptionPane.showMessageDialog(null, "¡¡Logueo Incorrecto!!","Error",JOptionPane.ERROR_MESSAGE);
	
		}
	}


	public void setVentanaCuentas(VentanaCuentas misCuentas) {
		ventanaCuentas=misCuentas;		
	}


	public void setMisCuentas(VentanaCuentas misCuentas) {

		this.misCuentas=misCuentas;
	}
   
}
