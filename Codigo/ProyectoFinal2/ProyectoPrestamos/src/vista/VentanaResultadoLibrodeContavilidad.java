
package vista;

import controlador.Coordinador;

/**
 *
 * @author ERIKA
 */
public class VentanaResultadoLibrodeContavilidad extends javax.swing.JDialog {

    private javax.swing.JTable TablaLibro;
    private javax.swing.JButton btnLibroContExportar;
    private javax.swing.JButton btnLibroContImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
	private Coordinador miCoordinador;
    public VentanaResultadoLibrodeContavilidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibro = new javax.swing.JTable();
        btnLibroContImprimir = new javax.swing.JButton();
        btnLibroContExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Libro de contabilidad");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 20, 140, 30);

        TablaLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Telefono", "Direccion", "Cantidad de dinero", "Numero de cuotas", "Fecha de prestamo"
            }
        ));
        jScrollPane1.setViewportView(TablaLibro);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 640, 402);

        btnLibroContImprimir.setText("Imprimir");
        jPanel1.add(btnLibroContImprimir);
        btnLibroContImprimir.setBounds(190, 490, 100, 30);

        btnLibroContExportar.setText("Exportar");
        jPanel1.add(btnLibroContExportar);
        btnLibroContExportar.setBounds(430, 490, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 540);

    }


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

}
