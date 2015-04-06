/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import controlador.Coordinador;

/**
 *
 * @author ERIKA
 */
public class PanelModificar extends javax.swing.JPanel {

    private javax.swing.JComboBox comboMunicipio;
    private javax.swing.JLabel etiApellidos;
    private javax.swing.JLabel etiCantDinero;
    private javax.swing.JLabel etiCedula;
    private javax.swing.JLabel etiCuotas;
    private javax.swing.JLabel etiDireccion;
    private javax.swing.JLabel etiMunicipio;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JLabel etiTelefono;
    private javax.swing.JLabel fondo;

    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCantDinero;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCuotas;
    private javax.swing.JTextField txtTelefono;
	private Coordinador miCoordinador;
    public PanelModificar() {
        initComponents();
    }


    public void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        txtNumCuotas = new javax.swing.JTextField();
        txtCantDinero = new javax.swing.JTextField();
        comboMunicipio = new javax.swing.JComboBox();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        etiNombre = new javax.swing.JLabel();
        etiApellidos = new javax.swing.JLabel();
        etiCedula = new javax.swing.JLabel();
        etiDireccion = new javax.swing.JLabel();
        etiTelefono = new javax.swing.JLabel();
        etiMunicipio = new javax.swing.JLabel();
        etiCantDinero = new javax.swing.JLabel();
        etiCuotas = new javax.swing.JLabel();


        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modificar Prestamo");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(800, 300, 270, 60);

        btnCancelar.setText("Cancelar");
      
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(710, 600, 150, 40);

        btnAceptar.setText("Aceptar");
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(430, 600, 150, 40);
        jPanel1.add(txtNumCuotas);
        txtNumCuotas.setBounds(520, 530, 230, 30);
        jPanel1.add(txtCantDinero);
        txtCantDinero.setBounds(520, 490, 230, 30);

        comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Armenia", "Calarca", "Salento ", "Cordoba", "Pijao", "Genova", "Buenavista", "Filandia", "Montenegro", "Tebaida", "Quimbaya", "Circasia"}));
        jPanel1.add(comboMunicipio);
        comboMunicipio.setBounds(520, 450, 230, 30);
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(520, 410, 230, 30);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(520, 360, 230, 30);
        jPanel1.add(txtId);
        txtId.setBounds(520, 310, 230, 30);
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(520, 260, 230, 30);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(520, 210, 230, 30);

        etiNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiNombre.setText("Nombre Completo : ");
        jPanel1.add(etiNombre);
        etiNombre.setBounds(360, 210, 160, 30);

        etiApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiApellidos.setText("Apellidos : ");
        jPanel1.add(etiApellidos);
        etiApellidos.setBounds(360, 260, 120, 30);

        etiCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiCedula.setText("No.Identificacion : ");
        jPanel1.add(etiCedula);
        etiCedula.setBounds(360, 310, 160, 30);

        etiDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiDireccion.setText("Direccion : ");
        jPanel1.add(etiDireccion);
        etiDireccion.setBounds(360, 360, 120, 30);

        etiTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiTelefono.setText("Telefono : ");
        jPanel1.add(etiTelefono);
        etiTelefono.setBounds(360, 410, 120, 30);

        etiMunicipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiMunicipio.setText("Municipio : ");
        jPanel1.add(etiMunicipio);
        etiMunicipio.setBounds(360, 450, 120, 30);

        etiCantDinero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiCantDinero.setText("Cantidad Dinero : ");
        jPanel1.add(etiCantDinero);
        etiCantDinero.setBounds(360, 490, 160, 30);

        etiCuotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiCuotas.setText("Numero Cuotas : ");
        jPanel1.add(etiCuotas);
        etiCuotas.setBounds(360, 530, 160, 30);

        
        
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg")));
        jPanel1.add(fondo);
        fondo.setBounds(0,  100, 1400, 650);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1400, 800);
    }


	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador=miCoordinador;
	}
}
