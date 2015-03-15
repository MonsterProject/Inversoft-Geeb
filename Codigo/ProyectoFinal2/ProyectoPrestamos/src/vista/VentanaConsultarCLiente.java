package vista;

import controlador.Coordinador;


/**
 *
 * @author ERIKA
 */
public class VentanaConsultarCLiente extends javax.swing.JDialog {

    private javax.swing.JButton btnConsultar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelConsultar;
    private javax.swing.JTextField txtConsultar;
	private Coordinador miCoordinador;
    
    public VentanaConsultarCLiente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelConsultar = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        labelConsultar.setText("Ingrese el documento del cliente :");
        jPanel1.add(labelConsultar);
        labelConsultar.setBounds(20, 110, 180, 30);
        jPanel1.add(txtConsultar);
        txtConsultar.setBounds(220, 110, 200, 30);

        btnConsultar.setText("Buscar");
        jPanel1.add(btnConsultar);
        btnConsultar.setBounds(280, 200, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 380);

    }


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

}
