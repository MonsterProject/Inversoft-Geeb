package vista;

import controlador.Coordinador;


/**
 *
 * @author ERIKA
 */
public class VentanaIngresarPrestamos extends javax.swing.JDialog {

    private javax.swing.JButton btnregPrestamo1;
    private javax.swing.JButton btnregPrestamo2;
    private javax.swing.JLabel labelIngPrestamo1;
    private javax.swing.JLabel labelIngPrestamo2;
    private javax.swing.JLabel labelIngPrestamo3;
    private javax.swing.JLabel labelIngPrestamo4;
    private javax.swing.JLabel labelIngPrestamo5;
    private javax.swing.JLabel labelIngPrestamo6;
    private javax.swing.JLabel labelIngPrestamo7;
    private javax.swing.JLabel labelIngPrestamo8;
    private javax.swing.JPanel panelIngresarPrestamo;
    private javax.swing.JTextField txtIngPrestamo1;
    private javax.swing.JTextField txtIngPrestamo2;
    private javax.swing.JTextField txtIngPrestamo3;
    private javax.swing.JTextField txtIngPrestamo4;
    private javax.swing.JTextField txtIngPrestamo5;
    private javax.swing.JTextField txtIngPrestamo6;
    private javax.swing.JTextField txtIngPrestamo7;
	private Coordinador miCoordinador;
    
    public VentanaIngresarPrestamos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    private void initComponents() {

        panelIngresarPrestamo = new javax.swing.JPanel();
        labelIngPrestamo1 = new javax.swing.JLabel();
        labelIngPrestamo2 = new javax.swing.JLabel();
        labelIngPrestamo3 = new javax.swing.JLabel();
        labelIngPrestamo4 = new javax.swing.JLabel();
        labelIngPrestamo5 = new javax.swing.JLabel();
        labelIngPrestamo6 = new javax.swing.JLabel();
        labelIngPrestamo7 = new javax.swing.JLabel();
        labelIngPrestamo8 = new javax.swing.JLabel();
        txtIngPrestamo1 = new javax.swing.JTextField();
        txtIngPrestamo2 = new javax.swing.JTextField();
        txtIngPrestamo3 = new javax.swing.JTextField();
        txtIngPrestamo4 = new javax.swing.JTextField();
        txtIngPrestamo5 = new javax.swing.JTextField();
        txtIngPrestamo6 = new javax.swing.JTextField();
        txtIngPrestamo7 = new javax.swing.JTextField();
        btnregPrestamo1 = new javax.swing.JButton();
        btnregPrestamo2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelIngresarPrestamo.setLayout(null);

        labelIngPrestamo1.setText("* Nombre del cliente :");
        panelIngresarPrestamo.add(labelIngPrestamo1);
        labelIngPrestamo1.setBounds(50, 70, 110, 30);

        labelIngPrestamo2.setText(" Telefono :");
        panelIngresarPrestamo.add(labelIngPrestamo2);
        labelIngPrestamo2.setBounds(50, 120, 110, 30);

        labelIngPrestamo3.setText("Direccion :");
        panelIngresarPrestamo.add(labelIngPrestamo3);
        labelIngPrestamo3.setBounds(50, 180, 110, 30);

        labelIngPrestamo4.setText("Cantidad de dinero :");
        panelIngresarPrestamo.add(labelIngPrestamo4);
        labelIngPrestamo4.setBounds(50, 240, 110, 30);

        labelIngPrestamo5.setText("Cedula :");
        panelIngresarPrestamo.add(labelIngPrestamo5);
        labelIngPrestamo5.setBounds(50, 300, 110, 30);

        labelIngPrestamo6.setText("Numero de cuotas :");
        panelIngresarPrestamo.add(labelIngPrestamo6);
        labelIngPrestamo6.setBounds(50, 350, 110, 30);

        labelIngPrestamo7.setText("Fecha :");
        panelIngresarPrestamo.add(labelIngPrestamo7);
        labelIngPrestamo7.setBounds(50, 400, 110, 30);

        labelIngPrestamo8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelIngPrestamo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngPrestamo8.setText("Llene todas las casillas");
        panelIngresarPrestamo.add(labelIngPrestamo8);
        labelIngPrestamo8.setBounds(180, 20, 160, 30);
        panelIngresarPrestamo.add(txtIngPrestamo1);
        txtIngPrestamo1.setBounds(170, 70, 190, 30);
        panelIngresarPrestamo.add(txtIngPrestamo2);
        txtIngPrestamo2.setBounds(170, 120, 190, 30);
        panelIngresarPrestamo.add(txtIngPrestamo3);
        txtIngPrestamo3.setBounds(170, 180, 190, 30);
        panelIngresarPrestamo.add(txtIngPrestamo4);
        txtIngPrestamo4.setBounds(170, 240, 190, 30);
        panelIngresarPrestamo.add(txtIngPrestamo5);
        txtIngPrestamo5.setBounds(170, 300, 190, 30);
        panelIngresarPrestamo.add(txtIngPrestamo6);
        txtIngPrestamo6.setBounds(170, 360, 190, 30);
        panelIngresarPrestamo.add(txtIngPrestamo7);
        txtIngPrestamo7.setBounds(170, 410, 190, 30);

        btnregPrestamo1.setText("Cancelar");
      
        panelIngresarPrestamo.add(btnregPrestamo1);
        btnregPrestamo1.setBounds(100, 470, 80, 30);

        btnregPrestamo2.setText("Guardar ");
        
        panelIngresarPrestamo.add(btnregPrestamo2);
        btnregPrestamo2.setBounds(330, 470, 80, 30);

        getContentPane().add(panelIngresarPrestamo);
        panelIngresarPrestamo.setBounds(0, 0, 500, 520);

    }


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

}
