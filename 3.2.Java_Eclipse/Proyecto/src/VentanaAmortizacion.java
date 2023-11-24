import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaAmortizacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtInversion;
	private JTextField txtFinanciamiento;
	private JTextField txtAños;
	private JTextField txtPorcentaje;
	private JTable TablaAmortizacion;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAmortizacion frame = new VentanaAmortizacion();
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
	public VentanaAmortizacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(24, 21, 630, 139);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inversi\u00F3n");
		lblNewLabel.setBounds(10, 11, 94, 26);
		panel.add(lblNewLabel);
		
		txtInversion = new JTextField();
		txtInversion.setBounds(10, 36, 86, 20);
		panel.add(txtInversion);
		txtInversion.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Financiamiento");
		lblNewLabel_1.setBounds(114, 17, 86, 14);
		panel.add(lblNewLabel_1);
		
		txtFinanciamiento = new JTextField();
		txtFinanciamiento.setBounds(114, 36, 86, 20);
		panel.add(txtFinanciamiento);
		txtFinanciamiento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("A\u00F1os");
		lblNewLabel_2.setBounds(215, 17, 58, 14);
		panel.add(lblNewLabel_2);
		
		txtAños = new JTextField();
		txtAños.setBounds(215, 36, 86, 20);
		panel.add(txtAños);
		txtAños.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de pago");
		lblNewLabel_3.setBounds(311, 17, 82, 14);
		panel.add(lblNewLabel_3);
		
		JComboBox cmbPago = new JComboBox();
		cmbPago.setModel(new DefaultComboBoxModel(new String[] {"Mensual", "Bimestral", "Trimestral", "Semestral"}));
		cmbPago.setBounds(311, 35, 82, 22);
		panel.add(cmbPago);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
		//---------------------------------------------------
		//Amortización variable
			public void actionPerformed(ActionEvent arg0) {
				
				
				double inversion = Double.parseDouble(txtInversion.getText());
				double financiamiento = Double.parseDouble(txtFinanciamiento.getText());
				
				double porcentajeFinanc = Double.parseDouble(txtPorcentaje.getText());
				double pago = 0;
				int años = Integer.parseInt(txtAños.getText());
				int indice = cmbPago.getSelectedIndex();
				int periodos = 0;
				
				switch(indice){
					case 0:{
						periodos = años * 12;
					}break;
					case 1:{
						periodos = años * 6;
					}break;
					case 2:{
						periodos = años * 4;
					}break;
					case 3:{
						periodos = años * 2;
					}break;	
				}
				
				double interes = Double.parseDouble(txtPorcentaje.getText());
				Inversion aporte = new Inversion(inversion,financiamiento,periodos,porcentajeFinanc,pago);
				
				interes = porcentajeFinanc/100;
				financiamiento = aporte.calculoFinanciamiento(inversion,financiamiento/100);
				pago = aporte.calculoPago(financiamiento,periodos);
				System.out.println(pago);
				System.out.println(inversion);
				System.out.println(financiamiento);
				System.out.println(periodos);
				
				double amortizacion[][] = new double[periodos+1][5];
				
				for( int i=0; i<=periodos; i++) {
					amortizacion[i][0] = i;
					TablaAmortizacion.setValueAt(amortizacion[i][0], i, 0);
				}
				
				amortizacion[0][1] = financiamiento;
				amortizacion[0][2] = 0;
				amortizacion[0][3] = 0;
				amortizacion[0][4] = 0;
				amortizacion[1][1] = financiamiento;
				
				TablaAmortizacion.setValueAt(amortizacion[0][1], 0, 1);
				TablaAmortizacion.setValueAt(amortizacion[0][2], 0, 2);
				TablaAmortizacion.setValueAt(amortizacion[0][3], 0, 3);
				TablaAmortizacion.setValueAt(amortizacion[0][4], 0, 4);
				TablaAmortizacion.setValueAt(amortizacion[1][1], 1, 1);
				
				for( int i=1; i<=periodos; i++) {
					amortizacion[i][2] = pago;
					TablaAmortizacion.setValueAt(amortizacion[i][2], i, 2);
				}
				
				

				for( int i=2; i<=periodos; i++) {
					amortizacion[i][1] = amortizacion[i-1][1]-pago;
					TablaAmortizacion.setValueAt(amortizacion[i][1], i, 1);
				}
			
				for( int i=1; i<=periodos; i++) {
					amortizacion[i][3] = amortizacion[i][1]*interes;
					TablaAmortizacion.setValueAt(amortizacion[i][3], i, 3);
				}
				
				for( int i=1; i<=periodos; i++) {
					amortizacion[i][4] = pago+amortizacion[i][3];
					TablaAmortizacion.setValueAt(amortizacion[i][4], i, 4);
				}
				
				
			}
		});
		btnCalcular.setBounds(10, 77, 89, 51);
		panel.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLimpiar.setBounds(124, 77, 89, 51);
		panel.add(btnLimpiar);
		
	
		
		txtPorcentaje = new JTextField();
		txtPorcentaje.setBounds(413, 36, 86, 20);
		panel.add(txtPorcentaje);
		txtPorcentaje.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo Interes");
		lblNewLabel_4.setBounds(413, 17, 70, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(243, 77, 89, 51);
		panel.add(btnSalir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 186, 630, 164);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		TablaAmortizacion = new JTable();
		TablaAmortizacion.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Periodo", "Capital", "Pago", "Intereses", "Abono a Capital"
			}
		) {
			Class[] columnTypes = new Class[] {
				Double.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(TablaAmortizacion);
	}
}
