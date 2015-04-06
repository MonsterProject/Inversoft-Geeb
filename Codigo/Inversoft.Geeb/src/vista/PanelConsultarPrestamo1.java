
package vista;

/**
 *
 * @author ERIKA
 */
public class PanelConsultarPrestamo1 extends javax.swing.JPanel {

	   private javax.swing.JButton btnConsultar;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel fondo;

	    private javax.swing.JLabel jLabel2;
	     javax.swing.JPanel panConsulPrest;
	    private javax.swing.JTextField txtCedula;
    public PanelConsultarPrestamo1() {
        initComponents();
    }

 
    private void initComponents() {

        panConsulPrest = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        txtCedula = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();


        panConsulPrest.setLayout(null);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Prestamo");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panConsulPrest.add(jLabel1);
        jLabel1.setBounds(300, 200, 440, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Ingrese el Id : ");
        panConsulPrest.add(jLabel2);
        jLabel2.setBounds(280, 320, 140, 40);
        panConsulPrest.add(txtCedula);
        txtCedula.setBounds(420, 330, 320, 30);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        panConsulPrest.add(btnConsultar);
        btnConsultar.setBounds(520, 430, 150, 40);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg"))); // NOI18N
        panConsulPrest.add(fondo);
        fondo.setBounds(0,  100, 1400, 650);

        add(panConsulPrest);
        panConsulPrest.setBounds(0, 0, 1400, 800);
    }
}
