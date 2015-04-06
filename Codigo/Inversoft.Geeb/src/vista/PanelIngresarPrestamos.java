
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.vo.UsuarioVo;

import controlador.Coordinador;

/**
 *
 * @author ERIKA
 */
public class PanelIngresarPrestamos extends javax.swing.JPanel implements ActionListener {


    private javax.swing.JButton btonCancelar;
    private javax.swing.JButton btonRegistrar;
    private javax.swing.JComboBox comboMunicipio;
    private javax.swing.JLabel etiApellidos;
    private javax.swing.JLabel etiCantDinero;
    private javax.swing.JLabel etiCedula;
    private javax.swing.JLabel etiCuotas1;
    private javax.swing.JLabel etiDireccion;
    private javax.swing.JLabel etiFechaTer;
    private javax.swing.JLabel etiMunicipio;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JLabel etiTelefono;
    private javax.swing.JLabel etiTituPpal;
    private javax.swing.JLabel etifehcaIni;
    private javax.swing.JLabel jLabel1;
    javax.swing.JPanel panelIngPres;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCantDinero;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaTer;
    private javax.swing.JTextField txtFecharIni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCuotas1;
    private javax.swing.JTextField txtTelefono;
	private Coordinador miCoordinador;
    public PanelIngresarPrestamos() {
        initComponents();
    }

  
    private void initComponents() {

        panelIngPres = new javax.swing.JPanel();
        etiTituPpal = new javax.swing.JLabel();
        btonCancelar = new javax.swing.JButton();
        btonRegistrar = new javax.swing.JButton();
        etiNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        etiApellidos = new javax.swing.JLabel();
        etiCedula = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        etiDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        etiTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        etiMunicipio = new javax.swing.JLabel();
        comboMunicipio = new javax.swing.JComboBox();
        etiCantDinero = new javax.swing.JLabel();
        txtCantDinero = new javax.swing.JTextField();
        etiFechaTer = new javax.swing.JLabel();
        txtFechaTer = new javax.swing.JTextField();
        txtNumCuotas1 = new javax.swing.JTextField();
        etiCuotas1 = new javax.swing.JLabel();
        txtFecharIni = new javax.swing.JTextField();
        etifehcaIni = new javax.swing.JLabel();
 
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        panelIngPres.setLayout(null);

        etiTituPpal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiTituPpal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiTituPpal.setText("INGRESAR PRESTAMO");
        etiTituPpal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelIngPres.add(etiTituPpal);
        etiTituPpal.setBounds(550, 130, 340, 40);

        btonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btonCancelar.setText("Cancelar");
     
        panelIngPres.add(btonCancelar);
        btonCancelar.setBounds(820, 660, 90, 30);

        btonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btonRegistrar.setText("Registrar");
      
        panelIngPres.add(btonRegistrar);
        btonRegistrar.setBounds(630, 660, 90, 30);

        etiNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiNombre.setText("Nombre Completo : ");
        panelIngPres.add(etiNombre);
        etiNombre.setBounds(510, 200, 160, 30);
        panelIngPres.add(txtNombre);
        txtNombre.setBounds(670, 200, 230, 30);
        panelIngPres.add(txtApellidos);
        txtApellidos.setBounds(670, 240, 230, 30);

        etiApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiApellidos.setText("Apellidos : ");
        panelIngPres.add(etiApellidos);
        etiApellidos.setBounds(510, 240, 120, 30);

        etiCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiCedula.setText("No.Identificacion : ");
        panelIngPres.add(etiCedula);
        etiCedula.setBounds(510, 290, 160, 30);
        panelIngPres.add(txtId);
        txtId.setBounds(670, 290, 230, 30);

        etiDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiDireccion.setText("Direccion : ");
        panelIngPres.add(etiDireccion);
        etiDireccion.setBounds(510, 340, 120, 30);
        panelIngPres.add(txtDireccion);
        txtDireccion.setBounds(670, 340, 230, 30);

        etiTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiTelefono.setText("Telefono : ");
        panelIngPres.add(etiTelefono);
        etiTelefono.setBounds(510, 390, 120, 30);
        panelIngPres.add(txtTelefono);
        txtTelefono.setBounds(670, 390, 230, 30);

        etiMunicipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiMunicipio.setText("Municipio : ");
        panelIngPres.add(etiMunicipio);
        etiMunicipio.setBounds(510, 430, 120, 30);

        comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Armenia", "Calarca", "Salento ", "Cordoba", "Pijao", "Genova", "Buenavista", "Filandia", "Montenegro", "Tebaida", "Quimbaya", "Circasia"}));
        panelIngPres.add(comboMunicipio);
        comboMunicipio.setBounds(670, 430, 230, 30);

        etiCantDinero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiCantDinero.setText("Cantidad Dinero : ");
        panelIngPres.add(etiCantDinero);
        etiCantDinero.setBounds(510, 470, 160, 30);
        panelIngPres.add(txtCantDinero);
        txtCantDinero.setBounds(670, 470, 230, 30);

        etiFechaTer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiFechaTer.setText("Fecha de Terminacion :");
        panelIngPres.add(etiFechaTer);
        etiFechaTer.setBounds(510, 590, 160, 30);
        panelIngPres.add(txtFechaTer);
        txtFechaTer.setBounds(670, 590, 230, 30);
        panelIngPres.add(txtNumCuotas1);
        txtNumCuotas1.setBounds(670, 510, 230, 30);

        etiCuotas1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiCuotas1.setText("Numero Cuotas : ");
        panelIngPres.add(etiCuotas1);
        etiCuotas1.setBounds(510, 510, 160, 30);
        panelIngPres.add(txtFecharIni);
        txtFecharIni.setBounds(670, 550, 230, 30);

        etifehcaIni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etifehcaIni.setText("Fecha de inicio :");
        panelIngPres.add(etifehcaIni);
        etifehcaIni.setBounds(510, 550, 160, 30);
        
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg")));
        panelIngPres.add(jLabel1);
        jLabel1.setBounds(0,  100, 1400, 650);
        

        

             add(panelIngPres);
        panelIngPres.setBounds(0, 0, 1400, 800);
    }


	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador=miCoordinador;
	}


	@Override
	public void actionPerformed(ActionEvent a) {
		if (a.getSource()==btonRegistrar){
		}
		
	}


}
