package vista;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import controlador.Coordinador;


/**
 *
 * @author ERIKA
 */
public class VentanaCuentas extends javax.swing.JDialog {
	

	
    private javax.swing.JButton btnCuentas1;
    private javax.swing.JButton btnCuentas2;
    private javax.swing.JButton btnCuentas3;
    private javax.swing.JButton btnCuentas4;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelCuentasImg;
    private javax.swing.JLabel labelCuentasImg1;
    private javax.swing.JPanel panelCuentas;
	private Coordinador miCoordinador;
	private  Dimension tamPantalla;
	private Rectangle pantalla;
	String nombre="";
	private String alias;

    public VentanaCuentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Mis Cuentas");
        setLocationRelativeTo(null);
    	setSize(900, 780);
  	  	tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
  	  	pantalla=new Rectangle(tamPantalla);
  	  	setBounds(pantalla);
  	  	
        initComponents();
    }

	

    private void initComponents() {
    	
        panelCuentas = new javax.swing.JPanel();
        btnCuentas1 = new javax.swing.JButton();
        btnCuentas2 = new javax.swing.JButton();
        btnCuentas3 = new javax.swing.JButton();
        labelCuentasImg = new javax.swing.JLabel();
        labelCuentasImg1 = new javax.swing.JLabel();
        btnCuentas4 = new javax.swing.JButton();
        labelBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelCuentas.setLayout(null);
        
        btnCuentas1.setText("Ingresar Nuevo Prestamo");
        panelCuentas.add(btnCuentas1);
        btnCuentas1.setBounds(20, 330, 190, 50);

        btnCuentas2.setText("Libro  de contabilidad");
        panelCuentas.add(btnCuentas2);
        btnCuentas2.setBounds(20, 410, 190, 50);

        btnCuentas3.setText("Consultar Cliente");
     
        panelCuentas.add(btnCuentas3);
        btnCuentas3.setBounds(410, 330, 190, 50);

        labelCuentasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/50268.png"))); // NOI18N
        panelCuentas.add(labelCuentasImg);
        labelCuentasImg.setBounds(320, 30, 260, 230);

        labelCuentasImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/21524.png"))); // NOI18N
        panelCuentas.add(labelCuentasImg1);
        labelCuentasImg1.setBounds(80, 80, 260, 190);
        
        btnCuentas4.setText("Clientes Atrasados");
   
        panelCuentas.add(btnCuentas4);
        btnCuentas4.setBounds(410, 410, 190, 50);
    
		
        panelCuentas.add(labelBienvenido);
        labelBienvenido.setBounds(20, 20, 280, 40);
        labelBienvenido.setFont(new java.awt.Font("Tahoma",0, 30)); 

        getContentPane().add(panelCuentas);
        panelCuentas.setBounds(0, 0, 640, 500);
    }
    
	public void alias(String alias) {

		this.alias=alias;
		labelBienvenido.setText("Bienvenido : "+alias);
		
	}
	
	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador = miCoordinador;
	}
	

}
