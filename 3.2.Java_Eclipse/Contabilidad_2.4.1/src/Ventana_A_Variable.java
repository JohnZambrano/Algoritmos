import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.util.ArrayList;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font; 

public class Ventana_A_Variable extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtInversion;
	private JTextField txtFinanciamiento;
	private JTextField txtAños;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtInteres;
	private JTextField txtIngreso;
	private JTextField txtGastos;
	private JTextField txtValorR;
	private JTextField txtPR;
	private JTextField txtDTF;
	private JTable table;
	private ArrayList<Indicadores> Trabajador= new ArrayList();
	private JTable t_flujo_caja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventana_A_Variable dialog = new Ventana_A_Variable();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventana_A_Variable() {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana_A_Variable.class.getResource("/Imagenes/Icon.png")));
		setTitle("Indicadores Financieros");
		setBounds(100, 100, 1260, 762);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JMenuBar menuBar = new JMenuBar();
			menuBar.setBackground(new Color(224, 255, 255));
			menuBar.setBounds(0, 0, 1184, 22);
			contentPanel.add(menuBar);
			{
				JMenu mnMenu = new JMenu("Menu");
				mnMenu.setFont(new Font("Arial", Font.BOLD, 12));
				mnMenu.setBackground(new Color(255, 255, 255));
				menuBar.add(mnMenu);
				{
					JMenuItem mntmValor = new JMenuItem("Valor Del Trabajador");
					mntmValor.setFont(new Font("Arial", Font.BOLD, 12));
					mntmValor.setBackground(new Color(255, 255, 255));
					mntmValor.setIcon(new ImageIcon(Ventana_A_Variable.class.getResource("/Imagenes/liquidacion1.jpg")));
					mntmValor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							VentanaLiquidacion vLiquidacion=new VentanaLiquidacion();
							vLiquidacion.setVisible(true);
							vLiquidacion.setLocationRelativeTo(null);
							dispose();
						}
					});
					mnMenu.add(mntmValor);
				}
				{
					JMenuItem mntmA_Variable = new JMenuItem("Amortizaci\u00F3n Variable");
					mntmA_Variable.setFont(new Font("Arial", Font.BOLD, 12));
					mntmA_Variable.setBackground(new Color(255, 255, 255));
					mntmA_Variable.setIcon(new ImageIcon(Ventana_A_Variable.class.getResource("/Imagenes/indicador2.png")));
					mntmA_Variable.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							Ventana_A_Variable vVariable=new Ventana_A_Variable();
							vVariable.setVisible(true);
							vVariable.setLocationRelativeTo(null);
							dispose();
						}
					});
					mnMenu.add(mntmA_Variable);
				}
				
				JMenuItem mntmA_Fija = new JMenuItem("Amortizaci\u00F3n Fija\r\n");
				mntmA_Fija.setBackground(new Color(255, 255, 255));
				mntmA_Fija.setIcon(new ImageIcon(Ventana_A_Variable.class.getResource("/Imagenes/indicador1.png")));
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
			}
			{
				JMenu mnAyuda = new JMenu("Ayuda");
				mnAyuda.setFont(new Font("Arial", Font.BOLD, 12));
				mnAyuda.setBackground(new Color(255, 255, 255));
				menuBar.add(mnAyuda);
				{
					JMenuItem mntmCreditos = new JMenuItem("Acerca de");
					mntmCreditos.setFont(new Font("Arial", Font.BOLD, 12));
					mntmCreditos.setBackground(new Color(255, 255, 255));
					mntmCreditos.setIcon(new ImageIcon(Ventana_A_Variable.class.getResource("/Imagenes/Acerca de1.png")));
					mntmCreditos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							Creditos vCreditos= new Creditos();
							vCreditos.setVisible(true);
							vCreditos.setLocationRelativeTo(null);
						}
					});
					mnAyuda.add(mntmCreditos);
				}
				{
					JMenuItem mntmSalir = new JMenuItem("Salir");
					mntmSalir.setFont(new Font("Arial", Font.BOLD, 12));
					mntmSalir.setBackground(new Color(255, 255, 255));
					mntmSalir.setIcon(new ImageIcon(Ventana_A_Variable.class.getResource("/Imagenes/Salir1.png")));
					mntmSalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							int respuesta=JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar la aplicacion?","Valor Del Trabajador En Colombia",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							if(respuesta==0)
								System.exit(0);
						}
					});
					mnAyuda.add(mntmSalir);
				}
			}
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 255, 250));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos A Calcular", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 33, 598, 249);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("A\u00F1os");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(240, 255, 240));
		lblNewLabel_1.setBounds(82, 84, 111, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inversi\u00F3n");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBackground(new Color(240, 255, 240));
		lblNewLabel_2.setBounds(82, 34, 57, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Financiamiento");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBackground(new Color(240, 255, 240));
		lblNewLabel_3.setBounds(82, 59, 86, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pago");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4.setBackground(new Color(240, 255, 240));
		lblNewLabel_4.setBounds(82, 109, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		txtInversion = new JTextField();
		txtInversion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInversion.setBounds(178, 31, 89, 20);
		panel_1.add(txtInversion);
		txtInversion.setColumns(10);
		
		txtFinanciamiento = new JTextField();
		txtFinanciamiento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFinanciamiento.setBounds(178, 56, 65, 20);
		panel_1.add(txtFinanciamiento);
		txtFinanciamiento.setColumns(10);
		
		txtAños = new JTextField();
		txtAños.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAños.setBounds(178, 81, 89, 20);
		panel_1.add(txtAños);
		txtAños.setColumns(10);
		
		JLabel lblPago = new JLabel("0");
		lblPago.setFont(new Font("Arial", Font.BOLD, 12));
		lblPago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPago.setBackground(new Color(240, 255, 240));
		lblPago.setBounds(178, 109, 89, 20);
		lblPago.setOpaque(true);
		panel_1.add(lblPago);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBackground(new Color(240, 255, 240));
		lblNewLabel_5.setBounds(249, 59, 18, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tasa de Inter\u00E9s");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6.setBackground(new Color(240, 255, 240));
		lblNewLabel_6.setBounds(322, 31, 89, 14);
		panel_1.add(lblNewLabel_6);
		
		txtInteres = new JTextField();
		txtInteres.setBounds(452, 28, 65, 20);
		panel_1.add(txtInteres);
		txtInteres.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("%");
		lblNewLabel_5_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5_1.setBackground(new Color(240, 255, 240));
		lblNewLabel_5_1.setBounds(520, 31, 18, 14);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_8 = new JLabel("Ingresos");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_8.setBackground(new Color(240, 255, 240));
		lblNewLabel_8.setBounds(322, 56, 65, 14);
		panel_1.add(lblNewLabel_8);
		
		txtIngreso = new JTextField();
		txtIngreso.setBounds(452, 53, 86, 20);
		panel_1.add(txtIngreso);
		txtIngreso.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Gastos");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_9.setBackground(new Color(240, 255, 240));
		lblNewLabel_9.setBounds(322, 87, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		txtGastos = new JTextField();
		txtGastos.setBounds(452, 81, 86, 20);
		panel_1.add(txtGastos);
		txtGastos.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Valor Recuperado");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10.setBackground(new Color(240, 255, 240));
		lblNewLabel_10.setBounds(322, 116, 109, 14);
		panel_1.add(lblNewLabel_10);
		
		txtValorR = new JTextField();
		txtValorR.setBounds(452, 113, 86, 20);
		panel_1.add(txtValorR);
		txtValorR.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("PR");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_11.setBackground(new Color(240, 255, 240));
		lblNewLabel_11.setBounds(82, 178, 46, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("DTF");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_12.setBackground(new Color(240, 255, 240));
		lblNewLabel_12.setBounds(82, 207, 46, 14);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("TIO");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_13.setBackground(new Color(240, 255, 240));
		lblNewLabel_13.setBounds(322, 150, 46, 14);
		panel_1.add(lblNewLabel_13);
		
		txtPR = new JTextField();
		txtPR.setBounds(178, 175, 65, 20);
		panel_1.add(txtPR);
		txtPR.setColumns(10);
		
		txtDTF = new JTextField();
		txtDTF.setBounds(178, 204, 65, 20);
		panel_1.add(txtDTF);
		txtDTF.setColumns(10);
		
		JLabel lblTIO = new JLabel("0");
		lblTIO.setFont(new Font("Arial", Font.BOLD, 12));
		lblTIO.setOpaque(true);
		lblTIO.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTIO.setBackground(new Color(240, 255, 240));
		lblTIO.setBounds(349, 147, 65, 20);
		panel_1.add(lblTIO);
		
		JLabel lblNewLabel_5_1_1_2 = new JLabel("%");
		lblNewLabel_5_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5_1_1_2.setBackground(new Color(240, 255, 240));
		lblNewLabel_5_1_1_2.setBounds(249, 178, 18, 14);
		panel_1.add(lblNewLabel_5_1_1_2);
		
		JLabel lblNewLabel_5_1_1_3 = new JLabel("%");
		lblNewLabel_5_1_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5_1_1_3.setBackground(new Color(240, 255, 240));
		lblNewLabel_5_1_1_3.setBounds(249, 207, 18, 14);
		panel_1.add(lblNewLabel_5_1_1_3);
		
		JLabel lblNewLabel_5_1_1_4 = new JLabel("%");
		lblNewLabel_5_1_1_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5_1_1_4.setBackground(new Color(240, 255, 240));
		lblNewLabel_5_1_1_4.setBounds(520, 150, 18, 14);
		panel_1.add(lblNewLabel_5_1_1_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.setBackground(new Color(240, 248, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mensual", "Bimestral", "Trimestral", "Cuatrimestral", "Semestral"}));
		comboBox.setBounds(178, 140, 89, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_14 = new JLabel("Mensualidad");
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_14.setBackground(new Color(240, 255, 240));
		lblNewLabel_14.setBounds(82, 144, 86, 14);
		panel_1.add(lblNewLabel_14);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Opciones de calculo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(618, 33, 535, 249);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnVPN = new JRadioButton("Calcular VPN");
		rdbtnVPN.setBackground(new Color(240, 248, 255));
		rdbtnVPN.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnVPN.setBounds(54, 72, 109, 23);
		panel.add(rdbtnVPN);
		
		JRadioButton rdbtnBeneficio = new JRadioButton("Calcular B/C");
		rdbtnBeneficio.setBackground(new Color(240, 248, 255));
		rdbtnBeneficio.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnBeneficio.setBounds(54, 130, 109, 23);
		panel.add(rdbtnBeneficio);
		
		JLabel lblNewLabel = new JLabel("VPN =");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(169, 76, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblBc = new JLabel("B/C =");
		lblBc.setFont(new Font("Arial", Font.BOLD, 12));
		lblBc.setBounds(169, 134, 46, 14);
		panel.add(lblBc);
		
		JLabel lblResultadoa = new JLabel("0");
		lblResultadoa.setFont(new Font("Arial", Font.BOLD, 12));
		lblResultadoa.setBackground(Color.WHITE);
		lblResultadoa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoa.setBounds(206, 76, 63, 14);
		lblResultadoa.setOpaque(true);
		panel.add(lblResultadoa);
		
		JLabel lblResultadob = new JLabel("0");
		lblResultadob.setFont(new Font("Arial", Font.BOLD, 12));
		lblResultadob.setBackground(Color.WHITE);
		lblResultadob.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadob.setBounds(206, 134, 63, 14);
		lblResultadob.setOpaque(true);
		panel.add(lblResultadob);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(240, 255, 240));
		btnCalcular.setIcon(new ImageIcon(Ventana_A_Variable.class.getResource("/Imagenes/Calcular1.png")));
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double inversion=Double.parseDouble(txtInversion.getText());
				double financia=Double.parseDouble(txtFinanciamiento.getText());
				int año=Integer.parseInt(txtAños.getText());
				double interes=Double.parseDouble(txtInteres.getText());
				
				
				double ingresos=Double.parseDouble(txtIngreso.getText());
				double gastos=Double.parseDouble(txtGastos.getText());
				double valorrescue=Double.parseDouble(txtValorR.getText());
				double pr=Double.parseDouble(txtPR.getText());
				double dtf=Double.parseDouble(txtDTF.getText());
				
				
				int opc1=comboBox.getSelectedIndex();
				int periodo = 0;
				if(opc1==0) {
					periodo = 12;
				}else if(opc1==1) {
					periodo = 6;
				}else if(opc1==2) {
					periodo = 4;
				}else if(opc1==3) {
					periodo = 3;
				}else if(opc1==4) {
					periodo = 2;
				}
				
				Indicadores trabajador=new Indicadores(inversion,financia,año,interes,0,ingresos,gastos,valorrescue,pr,dtf,periodo);
				
				//calculo Tio
				
				double tio=0;
								
				pr = pr/periodo;
				tio = dtf+pr;
				lblTIO.setText(String.format("%.2f",tio));
				
				
				double tasa_interes=(interes/periodo)/100;
				
				if(financia!=0) {
					financia=inversion*(financia/100);
				}else {
					financia=inversion;
				}
				Trabajador.add(trabajador);
				
				for (int i=0; i<=periodo*año;i++) {
				DefaultTableModel modelo=(DefaultTableModel)table.getModel();
				String datos[]= {"","","","",""};
				modelo.addRow(datos);
				}
				
				//System.out.println(año);
				//System.out.println(trabajador.pago());
				//System.out.println(trabajador.ia());
				//System.out.println(periodo*año);
				
				double amortizacion[][] = new double[periodo*año+1][5];
				
				for( int i=0; i<=periodo*año; i++) {                                                
					amortizacion[i][0] = i;
					table.setValueAt(String.format("%.0f",amortizacion[i][0]), i, 0);
				}
				
				amortizacion[0][1] = financia;
				amortizacion[0][2] = 0;
				amortizacion[0][3] = 0;
				amortizacion[0][4] = 0;
				amortizacion[1][1] = financia;
				
				table.setValueAt(String.format("%.2f",amortizacion[0][1]), 0, 1);
				table.setValueAt(String.format("%.2f",amortizacion[0][2]), 0, 2);
				table.setValueAt(String.format("%.2f",amortizacion[0][3]), 0, 3);
				table.setValueAt(String.format("%.2f",amortizacion[0][4]), 0, 4);
				table.setValueAt(String.format("%.2f",amortizacion[1][1]), 1, 1);
				
				double p = trabajador.abonop();
				double ia = trabajador.ia();
				
				lblPago.setText(String.format("%.0f",p));
				
				for( int i=1; i<=periodo*año; i++) {
					amortizacion[i][2] = p;
					table.setValueAt(String.format("%.2f", amortizacion[i][2]), i, 2);
				}//columna abono p
						

				for( int i=2; i<=periodo*año; i++) {
					amortizacion[i][1] = amortizacion[i-1][1] - p;
					table.setValueAt(String.format("%.2f", amortizacion[i][1]), i, 1);
				}//columna p
			
				for( int i=1; i<=periodo*año; i++) {
					amortizacion[i][3] = amortizacion[i][1]*ia;
					table.setValueAt(String.format("%.2f",amortizacion[i][3]), i, 3);
				}//columna interes
				
				for( int i=1; i<=periodo*año; i++) {
					amortizacion[i][4] = p+amortizacion[i][3];
					table.setValueAt(String.format("%.2f",amortizacion[i][4]), i, 4);
				}//columna pago bancos
				
				
				//segunda tabla de flujo de caja
								
				double tabla_ingresos[] = new double[periodo*año+1];
				double tabla_egresos[] = new double[periodo*año+1];
				double flujo_neto_efectivo[] = new double[periodo*año+1];
				
				tabla_ingresos[0] = 0;
				tabla_egresos[0]=financia;
				flujo_neto_efectivo[0]=tabla_ingresos[0]-tabla_egresos[0];
				
				
				for (int i=0; i<=periodo*año;i++) {
					DefaultTableModel modelo_2=(DefaultTableModel)t_flujo_caja.getModel();
					String datos[]= {"","","",""};
					modelo_2.addRow(datos);
					}
				
				t_flujo_caja.setValueAt(String.format("%.2f",tabla_ingresos[0]), 0, 1);
				t_flujo_caja.setValueAt(String.format("%.2f",tabla_egresos[0]), 0, 2);
				t_flujo_caja.setValueAt(String.format("%.2f",flujo_neto_efectivo[0]), 0, 3);
												
				for( int i=0; i<=periodo*año; i++) {                                                
					t_flujo_caja.setValueAt(String.format("%.0f",amortizacion[i][0]), i, 0);
				}//periodos
								
				
				for(int i=1;i<=periodo*año;i++) {
					
					tabla_ingresos[i]=ingresos;
					tabla_egresos[i]=amortizacion[i][4];
					flujo_neto_efectivo[i]=tabla_ingresos[i]-tabla_egresos[i];
					
					t_flujo_caja.setValueAt(String.format("%.2f",tabla_ingresos[i]), i, 1);
					t_flujo_caja.setValueAt(String.format("%.2f",tabla_egresos[i]), i, 2);
					t_flujo_caja.setValueAt(String.format("%.2f",flujo_neto_efectivo[i]), i, 3);
				}//tabla flujo de caja
				
				//valor recuperado en la tabla
				tabla_ingresos[periodo*año]=tabla_ingresos[periodo*año]+valorrescue;
				flujo_neto_efectivo[periodo*año]=tabla_ingresos[periodo*año]-tabla_egresos[periodo*año];
				t_flujo_caja.setValueAt(String.format("%.2f",flujo_neto_efectivo[periodo*año]), periodo*año, 3);
				t_flujo_caja.setValueAt(String.format("%.2f",tabla_ingresos[periodo*año]), periodo*año, 1);
				
				
				//calculo del VPN 
				
				
				if(rdbtnVPN.isSelected()) {
					
					double vpn = 0;
					
					for(int i=1;i<=periodo*año;i++) {
						vpn= vpn + ( (flujo_neto_efectivo[i]) / (Math.pow(1+tio, i)) );
					}
						vpn = vpn - financia;
						lblResultadoa.setText(String.format("%.2f", vpn));
				}	
				
				// beneficio/costo
				if(rdbtnBeneficio.isSelected()) {
					
					double bc = 0;
					double vpn = 0;
					
					for(int i=1;i<=periodo*año;i++) {
						vpn= vpn + ( (flujo_neto_efectivo[i]) / (Math.pow(1+tio, i)) );
					}
						vpn = vpn - financia;
					
					bc= (tabla_egresos[0])/(tabla_egresos[0] - vpn);
									
					lblResultadob.setText(String.format("%.2f", bc));
				}	
				
				
				
				
			}
		});
		btnCalcular.setBounds(340, 72, 130, 47);
		panel.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBackground(new Color(240, 255, 240));
		btnNuevo.setIcon(new ImageIcon(Ventana_A_Variable.class.getResource("/Imagenes/Nuevo1.png")));
		btnNuevo.setFont(new Font("Arial", Font.BOLD, 12));
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Component[] componentes=panel_1.getComponents();
				for(int i=0;i<componentes.length;i++) {
					if(componentes[i] instanceof JTextField)
						((JTextField)componentes[i]).setText("");
				}
				lblPago.setText("");
				lblTIO.setText("");
				comboBox.setSelectedIndex(0);
				DefaultTableModel modelo=(DefaultTableModel)table.getModel();
				modelo.setRowCount(0);
				DefaultTableModel model=(DefaultTableModel)t_flujo_caja.getModel();
				model.setRowCount(0);
				
			}
		});
		btnNuevo.setBounds(340, 130, 130, 41);
		panel.add(btnNuevo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 255, 250));
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Amortizaci\u00F3n Variable", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 293, 608, 412);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(21, 23, 576, 367);
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"n", "P", "ABONO P", "I", "PAGO BANCOS"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		scrollPane.setViewportView(table);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Flujo de caja", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBackground(new Color(245, 255, 250));
		panel_2_1.setBounds(618, 293, 619, 412);
		contentPanel.add(panel_2_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(21, 23, 576, 367);
		panel_2_1.add(panel_3_1);
		panel_3_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_3_1.add(scrollPane_1, BorderLayout.CENTER);
		
		t_flujo_caja = new JTable();
		t_flujo_caja.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"n", "Ingresos", "Egresos", "Flujo neto de efectivo"
			}
		));
		scrollPane_1.setViewportView(t_flujo_caja);
	}
}

