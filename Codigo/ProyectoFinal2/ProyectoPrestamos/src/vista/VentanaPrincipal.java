package vista;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controlador.Coordinador;



/**
 *
 * @author ERIKA
 */
public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener{

    private javax.swing.JButton btnEntrarP2;
    private javax.swing.JButton btnRegistrarP1;
    private javax.swing.JLabel labelImeagen1;
    private javax.swing.JPanel panelPrincipal;
	private Coordinador miCoordinador;
	  private  Dimension tamPantalla;
	    private Rectangle pantalla;
	    private VentanaLogin VentanaLogin;
	    private VentanaRegitroUsuario VentanaRegitroUsuario;
	    
    public VentanaPrincipal() {
    	
    	setSize(620, 480);
    	setLocationRelativeTo(null);
    	setTitle("Principal");
    	  tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
          pantalla=new Rectangle(tamPantalla);
          setBounds(pantalla);
        initComponents();
    }

   
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnRegistrarP1 = new javax.swing.JButton();
        btnEntrarP2 = new javax.swing.JButton();
        labelImeagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelPrincipal.setLayout(null);

        btnRegistrarP1.setFont(new java.awt.Font("Kalinga", 1, 18)); // NOI18N
        btnRegistrarP1.setText("Registrar");
       
        panelPrincipal.add(btnRegistrarP1);
        btnRegistrarP1.setBounds(180, 400, 160, 50);

        btnEntrarP2.setFont(new java.awt.Font("Kalinga", 1, 18)); // NOI18N
        btnEntrarP2.setText("Entrar");
        
        panelPrincipal.add(btnEntrarP2);
        btnEntrarP2.setBounds(950, 400, 160, 50);

        labelImeagen1.setBackground(new java.awt.Color(204, 204, 204));
        labelImeagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/49232.png"))); // NOI18N
        panelPrincipal.add(labelImeagen1);
        labelImeagen1.setBounds(540, 60, 250, 250);
        
        btnEntrarP2.addActionListener(this);
        btnRegistrarP1.addActionListener(this);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(0, 0, 1200, 1000);
        
        

    }


	@Override
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==btnEntrarP2){
			VentanaLogin.setVisible(true);	
			
		}else {
			VentanaRegitroUsuario.setVisible(true);
			
		}
	}


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}


	public void setVentanaLogin(VentanaLogin miLogin) {
				 VentanaLogin = miLogin;		
	}


	public void setVentanaRegistroUsuario(
			VentanaRegitroUsuario miRegistrodeUsuario) {
		
		VentanaRegitroUsuario=miRegistrodeUsuario;
		
	}
    

}
