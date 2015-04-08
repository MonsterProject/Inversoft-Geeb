package vista;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import modelo.vo.UsuarioVo;

import controlador.Coordinador;

/**
 *
 * @author ERIKA
 */
public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener{

	

	PanelMenu miMenu = new PanelMenu();

	PanelIngresarPrestamos mipan = new PanelIngresarPrestamos();
	PanelAyuda miAyuda = new PanelAyuda();
	PanelModificar miPanelModificarP = new PanelModificar();
	PanelModificarCuenta miPanelModificarC = new PanelModificarCuenta();
	PanelConsultarPrestamo1 miPanelConsultar1 = new PanelConsultarPrestamo1();
	PanelLibroCont miLibro = new PanelLibroCont();
	
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistra;
    private javax.swing.JComboBox comboxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel etiSesiInco;
    
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField passLogin;
    private javax.swing.JPasswordField passRegistrar;
    private javax.swing.JTextField txtAliasLogin;
    private javax.swing.JTextField txtAliasR;
    private javax.swing.JTextField txtApellidoR;
    private javax.swing.JTextField txtNombreR;
		private Coordinador miCoordinador;
		
	     javax.swing.JToolBar tolbar;
	     private javax.swing.JButton btnAcerca;
	     private javax.swing.JButton btnCerrarSesi;
	     private javax.swing.JButton btnConsultarP;
	     private javax.swing.JButton btnIngresarP;
	     private javax.swing.JButton btnInicio;

	     private javax.swing.JButton btnLibro;
	     javax.swing.JButton btnModificarCuen;
	     javax.swing.JButton btnModificarP;
	     
	     JPanel panelEmergencia;
		
    public VentanaPrincipal() {
    	setLocationRelativeTo(null);
    	setTitle("Inversoft-Geeb");
        setExtendedState(MAXIMIZED_BOTH);
    	initComponents();
    }

  
    private void initComponents() {
    	
    	

    	  panelPrincipal = new javax.swing.JPanel();
    	  
    	  panelEmergencia = new JPanel();
    	  
          jLabel2 = new javax.swing.JLabel();
          etiSesiInco = new javax.swing.JLabel();
          jLabel1 = new javax.swing.JLabel();
          txtAliasLogin = new javax.swing.JTextField();
          passLogin = new javax.swing.JPasswordField();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          btnEntrar = new javax.swing.JButton();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jLabel7 = new javax.swing.JLabel();
          jLabel8 = new javax.swing.JLabel();
          jLabel9 = new javax.swing.JLabel();
          jLabel10 = new javax.swing.JLabel();
          txtApellidoR = new javax.swing.JTextField();
          txtAliasR = new javax.swing.JTextField();
          txtNombreR = new javax.swing.JTextField();
          passRegistrar = new javax.swing.JPasswordField();
          comboxSexo = new javax.swing.JComboBox();
          btnRegistra = new javax.swing.JButton();
          jLabel12 = new javax.swing.JLabel();
          jLabel13 = new javax.swing.JLabel();
          jLabel11 = new javax.swing.JLabel();
          
          tolbar = new javax.swing.JToolBar();
	        btnInicio = new javax.swing.JButton();
	        btnIngresarP = new javax.swing.JButton();
	        btnConsultarP = new javax.swing.JButton();
	        btnModificarP = new javax.swing.JButton();
	        btnLibro = new javax.swing.JButton();
	        btnModificarCuen = new javax.swing.JButton();
	        btnCerrarSesi = new javax.swing.JButton();
	        btnAcerca = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          getContentPane().setLayout(null);

          panelPrincipal.setLayout(null);
          panelEmergencia.setLayout(null);

          jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel2.setText("Alias : ");
          panelPrincipal.add(jLabel2);
          jLabel2.setBounds(620, 80, 70, 30);

          jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          panelPrincipal.add(jLabel1);
          jLabel1.setBounds(-10, 10, 1410, 130);
          
          panelPrincipal.add(txtAliasLogin);
          txtAliasLogin.setBounds(680, 80, 200, 30);
          panelPrincipal.add(passLogin);
          passLogin.setBounds(1000, 80, 190, 30);

          jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel3.setText("Contraseña :");
          panelPrincipal.add(jLabel3);
          jLabel3.setBounds(890, 80, 120, 30);

          jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
          jLabel4.setText("Iniciar Sesion");
          panelPrincipal.add(jLabel4);
          jLabel4.setBounds(390, 80, 190, 30);

          btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
          btnEntrar.setText("Entrar");
          panelPrincipal.add(btnEntrar);
          btnEntrar.setBounds(1230, 70, 110, 40);

          jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
          jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel5.setText("REGISTRAR");
          jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          panelPrincipal.add(jLabel5);
          jLabel5.setBounds(690, 200, 310, 60);

          jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel6.setText("Apellido :");
          panelPrincipal.add(jLabel6);
          jLabel6.setBounds(630, 360, 130, 30);

          jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel7.setText("Contraseña  :");
          panelPrincipal.add(jLabel7);
          jLabel7.setBounds(630, 420, 120, 30);

          jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel8.setText("Alias :");
          panelPrincipal.add(jLabel8);
          jLabel8.setBounds(630, 480, 130, 30);

          jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel9.setText("Sexo :");
          panelPrincipal.add(jLabel9);
          jLabel9.setBounds(630, 550, 130, 30);

          jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel10.setText("Nombre :");
          panelPrincipal.add(jLabel10);
          jLabel10.setBounds(630, 300, 130, 30);
          panelPrincipal.add(txtApellidoR);
          

          
          etiSesiInco.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
          etiSesiInco.setForeground(Color.red);
          etiSesiInco.setBounds(640, 105, 500, 30);
  		  panelPrincipal.add(etiSesiInco);
  		

          
          txtApellidoR.setBounds(750, 360, 250, 30);
          panelPrincipal.add(txtAliasR);
          txtAliasR.setBounds(750, 480, 250, 30);
          panelPrincipal.add(txtNombreR);
          txtNombreR.setBounds(750, 300, 250, 30);
          panelPrincipal.add(passRegistrar);
          passRegistrar.setBounds(750, 420, 250, 30);

          comboxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Mujer", "Hombre" }));
          panelPrincipal.add(comboxSexo);
          comboxSexo.setBounds(750, 550, 250, 30);

          btnRegistra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          btnRegistra.setText("Registrar");
          panelPrincipal.add(btnRegistra);
          btnRegistra.setBounds(710, 620, 170, 40);

          jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MONSTER_1.png"))); // NOI18N
          panelPrincipal.add(jLabel12);
          jLabel12.setBounds(40, 20, 290, 120);

          jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo24.png"))); // NOI18N
          panelPrincipal.add(jLabel13);
          jLabel13.setBounds(300, 240, 250, 140);


          
	        tolbar.setRollover(true);

	        btnInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homealt_green_64.png"))); // NOI18N
	        btnInicio.setText("    Inicio    ");
	        btnInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnInicio.setFocusable(false);
	        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnInicio);

	        btnIngresarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnIngresarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money_bag_64.png"))); // NOI18N
	        btnIngresarP.setText("   Ingresar Prestamo   ");
	        btnIngresarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnIngresarP.setFocusable(false);
	        btnIngresarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnIngresarP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnIngresarP);

	        btnConsultarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnConsultarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mundo.png"))); // NOI18N
	        btnConsultarP.setText("   Consultar Prestamo   ");
	        btnConsultarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnConsultarP.setFocusable(false);
	        btnConsultarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnConsultarP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnConsultarP);

	        btnModificarP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnModificarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Radar-Dinero.png"))); // NOI18N
	        btnModificarP.setText("  Modificar Prestamo  ");
	        btnModificarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnModificarP.setFocusable(false);
	        btnModificarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnModificarP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnModificarP);

	        btnLibro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros-de-la-biblioteca-icono-5623-64.png"))); // NOI18N
	        btnLibro.setText("   Libro de contabilidad   ");
	        btnLibro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnLibro.setFocusable(false);
	        btnLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnLibro);

	        btnModificarCuen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnModificarCuen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wheel_64.png"))); // NOI18N
	        btnModificarCuen.setText("   Modificar cuenta Prestamista   ");
	        btnModificarCuen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnModificarCuen.setFocusable(false);
	        btnModificarCuen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnModificarCuen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnModificarCuen);

	        btnCerrarSesi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnCerrarSesi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion-icono-5977-64.png"))); // NOI18N
	        btnCerrarSesi.setText("   Cerrar Sesion   ");
	        btnCerrarSesi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnCerrarSesi.setFocusable(false);
	        btnCerrarSesi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnCerrarSesi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnCerrarSesi);

	        btnAcerca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Exclamacion_reduc.png"))); // NOI18N
	        btnAcerca.setText("   Ayuda  ");
	        btnAcerca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.green));
	        btnAcerca.setFocusable(false);
	        btnAcerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btnAcerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        tolbar.add(btnAcerca);
	        
	        btnIngresarP.addActionListener(this);
	        btnAcerca.addActionListener(this);
	        btnCerrarSesi.addActionListener(this);
	        btnConsultarP.addActionListener(this);
	        btnInicio.addActionListener(this);
	        btnLibro.addActionListener(this);
	        btnModificarCuen.addActionListener(this);
	        btnModificarP.addActionListener(this);
	        
	        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg"))); // NOI18N
	        panelPrincipal.add(jLabel11);
	        jLabel11.setBounds(0, 0, 1420, 800);
	   
	        tolbar.setBounds(0, 0, 1400, 100);
	        
	        getContentPane().add(panelPrincipal);

            panelEmergencia.setBounds(0, 0, 1400, 750);
            panelPrincipal.setBounds(0, 0, 1400, 750);

            btnRegistra.addActionListener(this);
            btnEntrar.addActionListener(this);
        

    }
	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador = miCoordinador;
	}


	@Override
	public void actionPerformed(ActionEvent a) {
if (a.getSource()==btnEntrar){
	
	boolean validarIngreso=miCoordinador.validarIngreso(txtAliasLogin.getText(), passLogin.getText());
	
	if (validarIngreso) {
		
		panelPrincipal.setVisible(false);
		miMenu.iniciarAlias(txtAliasLogin.getText());
		
		add(tolbar);
		add(miMenu.jPanel1);
		
	}else{
		
		  etiSesiInco.setText("el alias o la contraseña son incorrectos... Por Favor Diligencie los Campos. ");		
	}
}

	if (a.getSource()==btnIngresarP){
	miMenu.jPanel1.removeAll(); 
	miMenu.jPanel1.repaint();
	miMenu.jPanel1.setVisible(false);
	miMenu.jPanel1.setVisible(true);
	miMenu.jPanel1.add(tolbar);
	miMenu.jPanel1.add(mipan.panelIngPres);
	
	
	}else if (a.getSource()==btnInicio){
		
		miMenu.jPanel1.removeAll();
		miMenu.jPanel1.repaint();
		miMenu.jPanel1.add(miMenu.jScrollPane1);
		miMenu.jPanel1.add(miMenu.jLabel3);
		miMenu.jPanel1.add(miMenu.bienvenido);
		miMenu.jPanel1.add(miMenu.fondo);
		miMenu.jPanel1.add(tolbar);
		
		

	}
	if (a.getSource()==btnModificarP){
		miMenu.jPanel1.removeAll();
		miMenu.jPanel1.repaint();
		miMenu.jPanel1.setVisible(false);
		miMenu.jPanel1.setVisible(true);
		miMenu.jPanel1.add(tolbar);
		miMenu.jPanel1.add(miPanelModificarP.jPanel1);
		
	}
	
	if (a.getSource()==btnModificarCuen){
		miMenu.jPanel1.removeAll();
		miMenu.jPanel1.repaint();
		miMenu.jPanel1.setVisible(false);
		miMenu.jPanel1.setVisible(true);
		miMenu.jPanel1.add(tolbar);
		miMenu.jPanel1.add(miPanelModificarC.panelModificarCuent);
	}
	if (a.getSource()==btnConsultarP){
		miMenu.jPanel1.removeAll();
		miMenu.jPanel1.repaint();
		miMenu.jPanel1.add(tolbar);
		miMenu.jPanel1.add(miPanelConsultar1.panConsulPrest);
	}
	if (a.getSource()==btnLibro){
		miMenu.jPanel1.removeAll();
		miMenu.jPanel1.repaint();
		miMenu.jPanel1.setVisible(false);
		miMenu.jPanel1.setVisible(true);
		miMenu.jPanel1.add(tolbar);
		miMenu.jPanel1.add(miLibro.panelLibro);
	}
	if (a.getSource()==btnCerrarSesi){
		
		miMenu.jPanel1.removeAll();
		remove(tolbar);
		miMenu.jPanel1.repaint();
		panelPrincipal.setVisible(true);
		txtAliasLogin.setText("");
		passLogin.setText("");
		miMenu.jPanel1.add(miMenu.jScrollPane1);
		miMenu.jPanel1.add(miMenu.jLabel3);
		miMenu.jPanel1.add(miMenu.bienvenido);
		miMenu.jPanel1.add(miMenu.fondo);
		etiSesiInco.setText("");

		

	}

	if (a.getSource()==btnRegistra){
		registrar();
	}
if (a.getSource()==btnAcerca){
	miMenu.jPanel1.removeAll();
	miMenu.jPanel1.repaint();
	miMenu.jPanel1.setVisible(false);
	miMenu.jPanel1.setVisible(true);
	miMenu.jPanel1.add(tolbar);
	miMenu.jPanel1.add(miAyuda.jPanel1);
}

	}


	private void registrar() {

		UsuarioVo miUserVo = new UsuarioVo();
		miUserVo.setNombre(txtNombreR.getText().trim());
		miUserVo.setApellido(txtApellidoR.getText().trim());
		miUserVo.setPass(passRegistrar.getText().trim());
		miUserVo.setAlias(txtAliasR.getText().trim());
		miUserVo.setSexo(comboxSexo.getSelectedItem()+"");
		String retorno="";
		
		if (miCoordinador.validarCampos(miUserVo)){
			retorno=miCoordinador.registrarUsuario(miUserVo);
		}
		else {
			retorno="mas datos";
		}
		
		
		if (retorno.equals("Ok")){
			JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");

			
			panelPrincipal.setVisible(false);
			miMenu.iniciarAlias(txtAliasR.getText());
			
			add(tolbar);
			add(miMenu.jPanel1);
			
		}
		else {
			if (retorno.equals("error")){
				JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR. POR FAVOR DILIGENCIE LOS CAMPOS NUEVAMENTE ");
				
				txtAliasR.setText(null);
				txtApellidoR.setText(null);
				txtNombreR.setText(null);
				passRegistrar.setText(null);
				comboxSexo.setSelectedIndex(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "DILIGENCIE TODOS LOS CAMPOS POR FAVOR");
			}
		}
		
		
	}



}
