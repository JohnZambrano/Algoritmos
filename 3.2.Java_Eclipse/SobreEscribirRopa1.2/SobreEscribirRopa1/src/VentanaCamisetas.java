import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class VentanaCamisetas extends JInternalFrame {
	private JTextField txtCodigo;
	private JTextField txtPrecio;
	private JTable tabla;
	private final ButtonGroup btgCorte = new ButtonGroup();
	
	final static int N=10;
	int i=0;
	Camiseta[] cam = new Camiseta[N];
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCamisetas frame = new VentanaCamisetas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCamisetas() {
		setBounds(100, 100, 727, 485);
		getContentPane().setLayout(null);
		
		JLabel lblCamisetas = new JLabel("Camisetas");
		lblCamisetas.setIcon(new ImageIcon(VentanaCamisetas.class.getResource("/ImagenesRopa/camiseta48.png")));
		lblCamisetas.setBounds(592, 11, 165, 145);
		getContentPane().add(lblCamisetas);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos Camisetas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 572, 145);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setToolTipText("");
		txtCodigo.setBounds(46, 53, 92, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JRadioButton optRegular = new JRadioButton("Regular");
		btgCorte.add(optRegular);
		optRegular.setBounds(23, 102, 109, 23);
		panel.add(optRegular);
		
		JRadioButton optCuello = new JRadioButton("Con cuello");
		btgCorte.add(optCuello);
		optCuello.setBounds(245, 102, 109, 23);
		panel.add(optCuello);
		
		JRadioButton optDeportiva = new JRadioButton("Deportiva");
		btgCorte.add(optDeportiva);
		optDeportiva.setBounds(134, 102, 109, 23);
		panel.add(optDeportiva);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(321, 53, 86, 20);
		panel.add(txtPrecio);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(46, 28, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(321, 28, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Talla");
		lblNewLabel_2.setBounds(181, 28, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Color");
		lblNewLabel_3.setBounds(448, 28, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Corte");
		lblNewLabel_4.setBounds(37, 84, 46, 14);
		panel.add(lblNewLabel_4);
		
		JComboBox cmbTalla = new JComboBox();
		cmbTalla.setModel(new DefaultComboBoxModel(new String[] {"Peque\u00F1a", "Mediana", "Grande", "Extra Grande"}));
		cmbTalla.setBounds(181, 52, 92, 22);
		panel.add(cmbTalla);
		
		JComboBox cmbColor = new JComboBox();
		cmbColor.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Amarillo", "Azul", "Verde", "Blanco", "Negro"}));
		cmbColor.setBounds(448, 52, 92, 22);
		panel.add(cmbColor);
		
		JPanel OpcionesRegistro = new JPanel();
		OpcionesRegistro.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Opciones de registro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		OpcionesRegistro.setBounds(10, 167, 226, 277);
		getContentPane().add(OpcionesRegistro);
		OpcionesRegistro.setLayout(null);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(VentanaCamisetas.class.getResource("/ImagenesRopa/search.png")));
		btnBuscar.setBounds(33, 172, 158, 64);
		OpcionesRegistro.add(btnBuscar);
		
		JButton btnGrabar = new JButton("Guardar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=txtCodigo.getText();
				double precio = Double.parseDouble(txtPrecio.getText());
				String talla = cmbTalla.getSelectedItem().toString();
				String color = cmbColor.getSelectedItem().toString();
				String corte = "";
				
				if(optCuello.isSelected()) {
					corte = optCuello.getText();}
				
				if(optDeportiva.isSelected()) {
					corte=optDeportiva.getText();
				}	
				
				if(optRegular.isSelected()) {
					corte=optDeportiva.getText();
				}				
				cam[i]=new Camiseta(id,precio,talla,color,corte);
				
				DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
				String datos[]= {"","","","","",};
				modelo.addRow(datos);
				
				tabla.setValueAt(cam[i].getId(), i, 0);
				tabla.setValueAt(cam[i].getTalla(), i, 1);
				tabla.setValueAt(cam[i].getPrecio(), i, 2);
				tabla.setValueAt(cam[i].getColor(), i, 3);
				tabla.setValueAt(cam[i].getCorte(), i, 4);
				
				i++;
			}
		});
		btnGrabar.setIcon(new ImageIcon(VentanaCamisetas.class.getResource("/ImagenesRopa/save.png")));
		btnGrabar.setBounds(33, 97, 158, 64);
		OpcionesRegistro.add(btnGrabar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(33, 22, 158, 64);
		OpcionesRegistro.add(btnNuevo);
		btnNuevo.setIcon(new ImageIcon(VentanaCamisetas.class.getResource("/ImagenesRopa/document_new.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(246, 167, 443, 277);
		getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Talla", "Precio", "Color", "Corte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tabla);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCodigo.setText("");
				txtPrecio.setText("");
				cmbTalla.setSelectedIndex(0);
				cmbColor.setSelectedIndex(0);
				btgCorte.clearSelection();
			}
		});

	}
}
