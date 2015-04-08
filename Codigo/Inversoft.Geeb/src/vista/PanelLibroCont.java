
package vista;

/**
 *
 * @author ERIKA
 */
public class PanelLibroCont extends javax.swing.JPanel {
	
	    private javax.swing.JButton btnAceptar;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel labelAnio;
	    private com.toedter.calendar.JYearChooser anio;

	    private com.toedter.calendar.JMonthChooser mes;
	     javax.swing.JPanel panelLibro;
	    
    public PanelLibroCont() {
    	initComponents();
    }

 
    private void initComponents() {

        panelLibro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mes = new com.toedter.calendar.JMonthChooser();
        btnAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        anio = new com.toedter.calendar.JYearChooser();
        labelAnio = new javax.swing.JLabel();


        setLayout(null);

        panelLibro.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIBRO DE CONTABILIDAD");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelLibro.add(jLabel1);
        jLabel1.setBounds(530, 240, 380, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Escoja un mes");
        panelLibro.add(jLabel2);
        jLabel2.setBounds(550, 390, 100, 50);

        mes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelLibro.add(mes);
        mes.setBounds(660, 400, 130, 30);
        

        labelAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAnio.setText("Escoja un año");
        panelLibro.add(labelAnio);
        
        labelAnio.setBounds(550, 450, 100, 50);
        anio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelLibro.add(anio);
        anio.setBounds(660, 460, 110, 30);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        panelLibro.add(btnAceptar);
        btnAceptar.setBounds(600, 500, 150, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg"))); // NOI18N
        panelLibro.add(jLabel4);
        jLabel4.setBounds(0, 120, 1380, 650);

        add(panelLibro);
        panelLibro.setBounds(0, 0, 1380, 770);
    }
}
