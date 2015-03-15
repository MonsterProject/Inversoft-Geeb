package vista;

import controlador.Coordinador;


/**
 *
 * @author ERIKA
 */
public class VentanaLibroDeContabilidad extends javax.swing.JDialog {

	private javax.swing.JButton btnLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLibroContable;
	private Coordinador miCoordinador;
    
    public VentanaLibroDeContabilidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLibroContable = new javax.swing.JTextField();
        btnLibro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Ingrese mes y año: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 130, 130, 30);
        jPanel1.add(txtLibroContable);
        txtLibroContable.setBounds(180, 130, 220, 30);

        btnLibro.setText("Aceptar");
        jPanel1.add(btnLibro);
        btnLibro.setBounds(300, 240, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 390);

    }


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
    
}
