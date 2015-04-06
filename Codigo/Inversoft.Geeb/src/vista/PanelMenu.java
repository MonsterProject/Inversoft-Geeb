
package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controlador.Coordinador;

/**
 *
 * @author ERIKA
 */
public class PanelMenu extends javax.swing.JPanel implements ActionListener {

  
  
     javax.swing.JLabel bienvenido;
     javax.swing.JLabel jLabel3;
     javax.swing.JLabel fondo;
    public javax.swing.JPanel jPanel1;
     javax.swing.JScrollPane jScrollPane1;
     javax.swing.JTable tabla;
	 Coordinador miCoordinador;
	 String alias;
	


    
	 public PanelMenu() {
	        initComponents();
	    }

                        
	    public void initComponents() {

	      
	        jPanel1 = new javax.swing.JPanel();
	        bienvenido = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        tabla = new javax.swing.JTable();
	        fondo = new javax.swing.JLabel();
	 
	 
	        jPanel1.setLayout(null);

	        

	        bienvenido.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
	        bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        bienvenido.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.green));
	        jPanel1.add(bienvenido);
	        bienvenido.setBounds(170, 170, 1040, 80);

	        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        jLabel3.setText("Prestamos recientes");
	        jPanel1.add(jLabel3);
	        jLabel3.setBounds(270, 280, 180, 40);

	        tabla.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null, null, null}
	            },
	            new String [] {
	                "Nombre", "Direccion", "Teleofono", "Cedula", "Cantidad de dinero", "Numero de cuotas", "Cuotas pagas", "Cuotas restantes", "Cuotas atrasadas", "Interes"
	            }
	        ));
	        jScrollPane1.setViewportView(tabla);

	        jPanel1.add(jScrollPane1);
	        jScrollPane1.setBounds(120, 370, 1090, 110);

	        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos de Pantalla Gratis Abstractos (466).jpg")));
	        jPanel1.add(fondo);
	        fondo.setBounds(0, 100, 1400, 650);


	        add(jPanel1);
	        jPanel1.setBounds(0, 0, 1400, 800);
	    }


		public void setCoordinador(Coordinador miCoordinador) {
			this.miCoordinador= miCoordinador;
			
		}


		@Override
		public void actionPerformed(ActionEvent a) {
		
	}


		public void iniciarAlias(String alias) {

			this.alias=alias;
			bienvenido.setText("BIENVENIDO  : "+alias);
			
		}
		
		

	}

