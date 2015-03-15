package vista;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.vo.UsuarioVo;

import controlador.Coordinador;



/**
 *
 * @author GERMAN
 */
public class VentanaRegitroUsuario extends javax.swing.JDialog implements ActionListener {

	 private javax.swing.JComboBox comBoxSexo;
	    private javax.swing.JButton btnGuardar;
	    private javax.swing.JButton btnCancelar;
	    private javax.swing.JLabel labelImegenRegistar;
	    private javax.swing.JLabel etiNombre;
	    private javax.swing.JLabel etiApellido;
	    private javax.swing.JLabel etiContraseña;
	    private javax.swing.JLabel etiAlias;
	    private javax.swing.JLabel etiSexo;
	    private javax.swing.JLabel labelTitulo;
	    private javax.swing.JPanel panelRegistrar;
	    private javax.swing.JPasswordField txtPass;
	    private javax.swing.JTextField txtNombre;
	    private javax.swing.JTextField txtApellido;
	    private javax.swing.JTextField txtAlias;
		private Coordinador miCoordinador;
		
	    
    public VentanaRegitroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setSize(600, 500);
        setTitle("Registro Usuario");

        setLocationRelativeTo(null);
      
        initComponents();
    }


    private void initComponents() {

        panelRegistrar = new javax.swing.JPanel();
        etiNombre = new javax.swing.JLabel();
        etiApellido = new javax.swing.JLabel();
        etiContraseña = new javax.swing.JLabel();
        etiAlias = new javax.swing.JLabel();
        etiSexo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtAlias = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        comBoxSexo = new javax.swing.JComboBox();
        labelImegenRegistar = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelRegistrar.setLayout(null);

        etiNombre.setText("* Nombre :");
        panelRegistrar.add(etiNombre);
        etiNombre.setBounds(50, 80, 80, 30);

        etiApellido.setText("* Apellido :");
        panelRegistrar.add(etiApellido);
        etiApellido.setBounds(50, 140, 120, 30);

        etiContraseña.setText("* Contraseña :");
        panelRegistrar.add(etiContraseña);
        etiContraseña.setBounds(50, 210, 80, 30);

        etiAlias.setText("* Alias :");
        panelRegistrar.add(etiAlias);
        etiAlias.setBounds(50, 260, 120, 30);

        etiSexo.setText("* Sexo : ");
        panelRegistrar.add(etiSexo);
        etiSexo.setBounds(50, 320, 120, 30);
        panelRegistrar.add(txtNombre);
        txtNombre.setBounds(130, 80, 180, 30);
        panelRegistrar.add(txtApellido);
        txtApellido.setBounds(130, 140, 180, 30);

      
        panelRegistrar.add(txtAlias);
        txtAlias.setBounds(130, 260, 180, 30);
        panelRegistrar.add(txtPass);
        txtPass.setBounds(130, 210, 180, 30);

        comBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "F", "M" }));
        panelRegistrar.add(comBoxSexo);
        comBoxSexo.setBounds(130, 330, 190, 30);

        labelImegenRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/time-money.png"))); // NOI18N
        panelRegistrar.add(labelImegenRegistar);
        labelImegenRegistar.setBounds(350, 40, 210, 330);

        labelTitulo.setFont(new java.awt.Font("Gungsuh", 1, 14)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Datos Personales");
        panelRegistrar.add(labelTitulo);
        labelTitulo.setBounds(120, 20, 190, 30);

        btnGuardar.setText("Guardar");
        panelRegistrar.add(btnGuardar);
        btnGuardar.setBounds(170, 410, 80, 30);
        btnGuardar.addActionListener(this);

        btnCancelar.setText("Cancelar");
        panelRegistrar.add(btnCancelar);
        btnCancelar.setBounds(380, 410, 90, 30);
        btnCancelar.addActionListener(this);


        getContentPane().add(panelRegistrar);
        panelRegistrar.setBounds(0, 0, 600, 500);

    }


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
	
	
	public void actionPerformed(ActionEvent p) {
	
		
		if (p.getSource()==btnGuardar){
			
			registrar();
			
			
			
			
		}
	if (p.getSource()==btnCancelar){
			
			dispose();
			
		}
	}


	private void registrar() {
				
		
		UsuarioVo miUsuarioVo = new UsuarioVo();
		miUsuarioVo.setNombre(txtNombre.getText().trim());
		miUsuarioVo.setApellido(txtApellido.getText().trim());
		miUsuarioVo.setContraseña(txtPass.getText().trim());
		miUsuarioVo.setAlias(txtAlias.getText().trim());
		miUsuarioVo.setSexo(comBoxSexo.getSelectedItem()+"");
		String retorno="";
		
		
		if (miCoordinador.validarCampos(miUsuarioVo)){
			
			 retorno= miCoordinador.registrarUsuario(miUsuarioVo);
		}else {
			retorno="mas_datos";
		}
		
		
		
		if (retorno.equals("ok")){
			JOptionPane.showMessageDialog(null, "¡¡El Administrador Fue Registrado con Exito!!");
			dispose();
			txtAlias.setText("");
			txtApellido.setText("");
			txtNombre.setText("");
			txtPass.setText("");
			comBoxSexo.setSelectedIndex(0);
			
		}
		else {
			if (retorno.equals("error")){
			JOptionPane.showMessageDialog(null, "no se registro con exito ");
			
		}else {
			JOptionPane.showMessageDialog(null, "Se necesitan diligenciar los campos obligatorios (*) ", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
		}
	}
}
