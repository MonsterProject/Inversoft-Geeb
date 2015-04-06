package vista;

import javax.swing.JLabel;

/**
 *
 * @author JHON
 */
public class PanelAyuda extends javax.swing.JPanel {
	
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
     javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea textAreaAcercaD;
    private JLabel fondo;
    public PanelAyuda() {
        initComponents();
        
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        fondo= new JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaAcercaD = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setLayout(null);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(700, -20, 20, 730);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo24.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 130, 430, 130);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("A Cerca De");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 210, 130);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 100, 650, 210);

        textAreaAcercaD.setColumns(20);
        textAreaAcercaD.setRows(5);
        textAreaAcercaD.setText("INVERSOFT:\nEs SOFTWARE basico para prestamistas. Es una herramienta\ninformatica basica para realizar prestamos,\ntener un control diario de las operaciones realizadas,\ngestionar y controlar cobros. \n\nEl sistema permite tener un listado de cartera de clientes \nen mora, conocer al instante sus datos personales y su \nsituacion actual ademas de llevar un registro historico \nde gestion y promesas de pago. \n\nINVERSOFT-GEEB fue programado en Java.\n\nIntegrantes GEEB:\n\nEl acronimo GEEB sale de las iniciales de los nombres de\nde todos los integrantes del proyecto.\n\n \n  German Gonzalez Vargas.\n  Erika Johana Gonzalez Cuartas.\n  Esleida Cardenas Medina.\n  Brayan Andres Pinto Bedoya.");
        jScrollPane1.setViewportView(textAreaAcercaD);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 280, 570, 370);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manual De Usuario");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(750, 130, 380, 130);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ManualUsuario.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1130, 130, 240, 130);
        
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg")));
        jPanel1.add(fondo);
        fondo.setBounds(0, 100, 1400, 650);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1400, 740);
    }
}
