import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class VentanaLiquidacion extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtSueldo;
	private ArrayList<Liquidacion> Liquidar= new ArrayList();
	protected int i;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLiquidacion frame = new VentanaLiquidacion();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaLiquidacion() {
		setBackground(new Color(255, 250, 205));
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLiquidacion.class.getResource("/Imagenes/Icon.png")));
		setTitle("Valor Del Trabajador En Colombia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 508);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(224, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setBackground(new Color(255, 255, 255));
		mnMenu.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnMenu);
		
		JMenuItem mntmValor = new JMenuItem("Valor Del Trabajador");
		mntmValor.setIcon(new ImageIcon(VentanaLiquidacion.class.getResource("/Imagenes/liquidacion1.jpg")));
		mntmValor.setBackground(new Color(255, 255, 255));
		mntmValor.setFont(new Font("Arial", Font.BOLD, 12));
		mntmValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaLiquidacion vLiquidacion=new VentanaLiquidacion();
				vLiquidacion.setVisible(true);
				vLiquidacion.setLocationRelativeTo(null);
				dispose();
			}
		});
		mnMenu.add(mntmValor);
		
		JMenuItem mntmA_Variable = new JMenuItem("Amortizaci\u00F3n Variable");
		mntmA_Variable.setIcon(new ImageIcon(VentanaLiquidacion.class.getResource("/Imagenes/indicador2.png")));
		mntmA_Variable.setBackground(new Color(255, 255, 255));
		mntmA_Variable.setFont(new Font("Arial", Font.BOLD, 12));
		mntmA_Variable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventana_A_Variable vIndicadores=new Ventana_A_Variable();
				vIndicadores.setVisible(true);
				vIndicadores.setLocationRelativeTo(null);
				dispose();
			}
		});
		mnMenu.add(mntmA_Variable);
		
		JMenuItem mntmA_Fija = new JMenuItem("Amortizaci\u00F3n Fija");
		mntmA_Fija.setBackground(new Color(255, 255, 255));
		mntmA_Fija.setIcon(new ImageIcon(VentanaLiquidacion.class.getResource("/Imagenes/indicador1.png")));
		mntmA_Fija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana_A_Fija vFija = new Ventana_A_Fija();
				vFija.setVisible(true);
				vFija.setLocationRelativeTo(null);
				dispose();
			}
		});
		mntmA_Fija.setFont(new Font("Arial", Font.BOLD, 12));
		mnMenu.add(mntmA_Fija);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setBackground(new Color(255, 255, 255));
		mnAyuda.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnAyuda);
		
		JMenuItem mntmCreditos = new JMenuItem("Acerca de");
		mntmCreditos.setIcon(new ImageIcon(VentanaLiquidacion.class.getResource("/Imagenes/Acerca de1.png")));
		mntmCreditos.setBackground(new Color(255, 255, 255));
		mntmCreditos.setFont(new Font("Arial", Font.BOLD, 12));
		mnAyuda.add(mntmCreditos);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon(VentanaLiquidacion.class.getResource("/Imagenes/Salir1.png")));
		mntmSalir.setBackground(new Color(255, 255, 255));
		mntmSalir.setFont(new Font("Arial", Font.BOLD, 12));
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int respuesta=JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar la aplicacion?","Valor Del Trabajador En Colombia",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(respuesta==0)
					System.exit(0);
			}
		});
		mnAyuda.add(mntmSalir);
		mntmCreditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Creditos vCreditos= new Creditos();
				vCreditos.setVisible(true);
				vCreditos.setLocationRelativeTo(null);
			}
		});
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Trabajador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 22, 217, 222);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 29, 60, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 59, 60, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sueldo");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 94, 60, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ARL");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 127, 46, 14);
		panel.add(lblNewLabel_3);
		
		txtNombres = new JTextField();
		txtNombres.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombres.setBounds(113, 26, 86, 20);
		panel.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Arial", Font.PLAIN, 12));
		txtApellidos.setBounds(113, 56, 86, 20);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtSueldo = new JTextField();
		txtSueldo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSueldo.setBounds(113, 91, 86, 20);
		panel.add(txtSueldo);
		txtSueldo.setColumns(10);
		
		JComboBox cmbRiesgo = new JComboBox();
		cmbRiesgo.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbRiesgo.setModel(new DefaultComboBoxModel(new String[] {"I", "II", "III", "IV", "V"}));
		cmbRiesgo.setToolTipText("");
		cmbRiesgo.setBounds(113, 123, 86, 22);
		panel.add(cmbRiesgo);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha Inicio");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 152, 74, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha Fin");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 187, 86, 14);
		panel.add(lblNewLabel_5);
		
		JDateChooser dateChooserInicio = new JDateChooser();
		dateChooserInicio.setBounds(106, 156, 93, 20);
		panel.add(dateChooserInicio);
		
		JDateChooser dateChooserFin = new JDateChooser();
		dateChooserFin.setBounds(106, 191, 93, 20);
		panel.add(dateChooserFin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBorder(new TitledBorder(null, "Opciones de Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 255, 217, 153);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSalarioEmpleado = new JLabel("");
		lblSalarioEmpleado.setBackground(new Color(255, 218, 185));
		lblSalarioEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSalarioEmpleado.setBounds(258, 292, 314, 29);
		lblSalarioEmpleado.setOpaque(true);
		contentPane.add(lblSalarioEmpleado);
		
		JLabel lblSaldoEmpresa = new JLabel("");
		lblSaldoEmpresa.setBackground(new Color(255, 218, 185));
		lblSaldoEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSaldoEmpresa.setBounds(258, 332, 314, 29);
		lblSaldoEmpresa.setOpaque(true);
		contentPane.add(lblSaldoEmpresa);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(VentanaLiquidacion.class.getResource("/Imagenes/Guardar1.png")));
		btnGuardar.setBackground(new Color(240, 255, 255));
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=txtNombres.getText();
				String apellido=txtApellidos.getText();
				double sueldo=Double.parseDouble(txtSueldo.getText());
				int indice=cmbRiesgo.getSelectedIndex();
				//System.out.println("INDICE "+indice);
				String Riesgo=null;
				double pago=0;
				if(indice==0) {
					Riesgo="I";
					pago= 0.00522;
				}
				else if(indice==1) {
					Riesgo="II";
					pago=0.01044;
				}
				else if(indice==2) {
					Riesgo="III";
					pago= 0.02436;
				}
				else if(indice==3) {
					Riesgo="IV";
					pago= 0.0435;
				}
				else if(indice==4) {
					Riesgo="V";
					pago=0.0696;
				}
				
				//Calculo de los meses a liquidar
				Date fechaInicio = dateChooserInicio.getDate();
				Date fechaFin = dateChooserFin.getDate();	
								
				Calendar inicioCalendario = new GregorianCalendar();
				inicioCalendario.setTime(fechaInicio);
				Calendar finCalendario = new GregorianCalendar();
				finCalendario.setTime(fechaFin);
				int diffaño = finCalendario.get(Calendar.YEAR) - inicioCalendario.get(Calendar.YEAR);
				int diffmes = diffaño * 12 + finCalendario.get(Calendar.MONTH) - inicioCalendario.get(Calendar.MONTH);
				//System.out.println(diffmes);
				
				Liquidacion trabajador=new Liquidacion(nombre, apellido, sueldo, Riesgo, pago, diffmes);
				Liquidar.add(trabajador);
				DefaultTableModel modelo=(DefaultTableModel)table.getModel();
				String datos[]= {"","","","","","","","","","","","",""};
				modelo.addRow(datos);
				table.setValueAt(trabajador.getNombres(), i, 0);
				table.setValueAt(trabajador.getApellidos(), i, 1);
				table.setValueAt(trabajador.getSueldo(), i, 2);
				table.setValueAt(trabajador.Transporte(), i, 3);
				table.setValueAt(trabajador.CalcularVacaciones(), i, 4);
				table.setValueAt(trabajador.CalcularPrima(), i, 5);
				table.setValueAt(trabajador.CalcularCesantias(), i, 6);
				table.setValueAt(trabajador.CalcularSalud(), i, 7);
				table.setValueAt(trabajador.CalcularPension(), i, 8);
				table.setValueAt(trabajador.getRiesgo(), i, 9);
				table.setValueAt(trabajador.CalcularParafiscales(), i, 10);
				table.setValueAt(trabajador.CalcularDotacion(), i, 11);
				i++;
				lblSalarioEmpleado.setText(trabajador.MostrarDatos2());
				lblSaldoEmpresa.setText(trabajador.MostrarDatos1());
				}
			
		});
		btnGuardar.setBounds(27, 36, 120, 39);
		panel_1.add(btnGuardar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(VentanaLiquidacion.class.getResource("/Imagenes/Limpiar1.png")));
		btnLimpiar.setBackground(new Color(240, 255, 255));
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtNombres.setText("");
				txtApellidos.setText("");
				txtSueldo.setText("");
				cmbRiesgo.setSelectedIndex(0);
			}
		});
		btnLimpiar.setBounds(27, 86, 120, 39);
		panel_1.add(btnLimpiar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 205));
		panel_2.setBounds(237, 22, 936, 237);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "Salario", "Aux.Transporte", "Vacaciones", "Prima", "Cesant\u00EDas", "Salud", "Pensi\u00F3n", "ARL", "Parafiscales", "Dotaci\u00F3n"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(3).setPreferredWidth(95);
		table.getColumnModel().getColumn(9).setPreferredWidth(35);
		scrollPane.setViewportView(table);
		
	}
}
