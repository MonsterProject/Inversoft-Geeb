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
public class VentanaClientesAtrasados extends javax.swing.JDialog {
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelClientesAtrasados;
    private javax.swing.JPanel panelClientesAtrasados;
	private Coordinador miCoordinador;
    public VentanaClientesAtrasados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    private void initComponents() {

        panelClientesAtrasados = new javax.swing.JPanel();
        labelClientesAtrasados = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelClientesAtrasados.setLayout(null);

        labelClientesAtrasados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelClientesAtrasados.setText("Clientes Atrasados");
        panelClientesAtrasados.add(labelClientesAtrasados);
        labelClientesAtrasados.setBounds(20, 20, 210, 30);

        jButton1.setText("Aceptar");
        panelClientesAtrasados.add(jButton1);
        jButton1.setBounds(530, 490, 120, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel());
        jScrollPane1.setViewportView(jTable1);

        panelClientesAtrasados.add(jScrollPane1);
        jScrollPane1.setBounds(80, 60, 800, 402);

        getContentPane().add(panelClientesAtrasados);
        panelClientesAtrasados.setBounds(0, 0, 910, 530);
    }


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

}
