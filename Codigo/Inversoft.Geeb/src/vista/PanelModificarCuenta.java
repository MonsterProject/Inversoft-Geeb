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
public class PanelModificarCuenta extends javax.swing.JPanel {

	 private javax.swing.JComboBox comboxSexo;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel13;

	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	     javax.swing.JPanel panelModificarCuent;
	    private javax.swing.JPasswordField passRegistrar;
	    private javax.swing.JTextField txtAliasR;
	    private javax.swing.JTextField txtApellidoR;
	    private javax.swing.JTextField txtNombreR;
		private Coordinador miCoordinador;
    public PanelModificarCuenta() {
        initComponents();
    }


    public void initComponents() {

        panelModificarCuent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        comboxSexo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAliasR = new javax.swing.JTextField();
        passRegistrar = new javax.swing.JPasswordField();
        txtNombreR = new javax.swing.JTextField();
        txtApellidoR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setLayout(null);

        panelModificarCuent.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR CUENTA");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelModificarCuent.add(jLabel1);
        jLabel1.setBounds(80, 50, 320, 50);

        comboxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Mujer", "Hombre" }));
        panelModificarCuent.add(comboxSexo);
        comboxSexo.setBounds(340, 410, 250, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sexo :");
        panelModificarCuent.add(jLabel9);
        jLabel9.setBounds(190, 410, 140, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Alias :");
        panelModificarCuent.add(jLabel8);
        jLabel8.setBounds(190, 350, 140, 40);
        panelModificarCuent.add(txtAliasR);
        txtAliasR.setBounds(340, 350, 250, 40);
        panelModificarCuent.add(passRegistrar);
        passRegistrar.setBounds(340, 290, 250, 40);
        panelModificarCuent.add(txtNombreR);
        txtNombreR.setBounds(340, 170, 250, 40);
        panelModificarCuent.add(txtApellidoR);
        txtApellidoR.setBounds(340, 230, 250, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Apellido :");
        panelModificarCuent.add(jLabel6);
        jLabel6.setBounds(190, 230, 140, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Contraseña  :");
        panelModificarCuent.add(jLabel7);
        jLabel7.setBounds(190, 290, 130, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Nombre :");
        panelModificarCuent.add(jLabel10);
        jLabel10.setBounds(190, 160, 140, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Actualizar");
        panelModificarCuent.add(jButton1);
        jButton1.setBounds(410, 500, 160, 50);
        
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inver.jpg"))); // NOI18N
        panelModificarCuent.add(jLabel13);
        jLabel13.setBounds(720, 210, 470, 200);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg")));// NOI18N
        panelModificarCuent.add(jLabel11);
        jLabel11.setBounds(0, 0, 1410, 760);

        add(panelModificarCuent);
        panelModificarCuent.setBounds(0, 0, 1400, 750);
    }
	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador=miCoordinador;
	}
}
