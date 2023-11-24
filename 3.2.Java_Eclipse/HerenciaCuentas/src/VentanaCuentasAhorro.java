import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaCuentasAhorro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4290603373722930787L;
	private static final int S = 0;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtCliente;
	private JTextField txtSaldo;
	private JTextField txtPorcentaje;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtValor;
	private JTable tablaCuentas;
	
	final public static int N=S;
	
	CuentaAhorros[] cuentas = new CuentaAhorros[N];
	
	int i=0;
	protected double porcentaje;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCuentasAhorro frame = new VentanaCuentasAhorro();
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
	public VentanaCuentasAhorro() {
		setTitle("Registro Cuentas de Ahorro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 426);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 31, 641, 147);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos Cuenta",
				TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("No Cliente");
		lblNewLabel_3.setBounds(52, 21, 95, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel(" Cliente");
		lblNewLabel_2.setBounds(198, 21, 88, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("Saldo");
		lblNewLabel_1.setBounds(368, 21, 63, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Porcentaje");
		lblNewLabel.setBounds(497, 21, 77, 14);
		panel.add(lblNewLabel);

		txtNumero = new JTextField();
		txtNumero.setBounds(52, 46, 95, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);

		txtCliente = new JTextField();
		txtCliente.setBounds(198, 46, 123, 20);
		panel.add(txtCliente);
		txtCliente.setColumns(10);

		txtSaldo = new JTextField();
		txtSaldo.setBounds(368, 46, 86, 20);
		panel.add(txtSaldo);
		txtSaldo.setColumns(10);

		txtPorcentaje = new JTextField();
		txtPorcentaje.setBounds(497, 46, 77, 20);
		panel.add(txtPorcentaje);
		txtPorcentaje.setColumns(10);

		JButton btnCrear = new JButton("Crear Cuenta");
		btnCrear.setBackground(Color.GRAY);
		btnCrear.addActionListener(new ActionListener() {
			
			
			/////////////////////////////////////////////
			////////////////////////////////////////////
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					String numero = txtNumero.getText();
					String cliente = txtCliente.getText();
					double saldo = Double.parseDouble(txtSaldo.getText());
					double porcentaje = Double.parseDouble(txtPorcentaje.getText());
					cuentas[i] = new CuentaAhorros(numero,cliente,saldo,porcentaje);
					tablaCuentas.setValueAt(cuentas[i].getNumero(),i, 0);
					tablaCuentas.setValueAt(cuentas[i].getCliente(),i,1);
					tablaCuentas.setValueAt(cuentas[i].getSaldo(),i,2);
					i++;
					JOptionPane.showMessageDialog(null,"Cuenta registrada exitosamente","Manejo de Cuentas de Ahorro",JOptionPane.INFORMATION_MESSAGE);	
				}
				catch(IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null,e.getMessage(), "Manejo de Cuentas Ahorro", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			////////////////////////////////////////////
			////////////////////////////////////////////
		});
		btnCrear.setForeground(SystemColor.desktop);
		btnCrear.setBounds(238, 92, 136, 23);
		panel.add(btnCrear);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Movimientos",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 189, 137, 163);
		panel_1.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JRadioButton optConsignar = new JRadioButton("Consignar");
		buttonGroup.add(optConsignar);
		optConsignar.setBounds(6, 24, 99, 23);
		optConsignar.setBackground(Color.GRAY);
		panel_1.add(optConsignar);

		JRadioButton optRetirar = new JRadioButton("Retirar");
		buttonGroup.add(optRetirar);
		optRetirar.setBounds(6, 54, 99, 23);
		optRetirar.setBackground(Color.GRAY);
		panel_1.add(optRetirar);

		JLabel lblNewLabel_4 = new JLabel("Valor");
		lblNewLabel_4.setBounds(40, 96, 53, 14);
		panel_1.add(lblNewLabel_4);

		txtValor = new JTextField();
		txtValor.setBounds(6, 116, 99, 20);
		panel_1.add(txtValor);
		txtValor.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setBounds(179, 189, 472, 163);
		panel_2.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane JScrollPane = new JScrollPane();
		panel_2.add(JScrollPane, BorderLayout.CENTER);
		
		tablaCuentas = new JTable();
		tablaCuentas.addMouseListener(new MouseAdapter() {
			
			////////////////////////////////////////////////////////
			
			///////////////////////////////////////////////////////
			@Override
			public void mouseClicked(MouseEvent e) {
				String num = tablaCuentas.getValueAt(tablaCuentas.getSelectedRow(), 0).toString();
				JOptionPane.showMessageDialog(null, "La cuenta seleccionada es "+num,"Manejo Cuentas Ahorro",JOptionPane.INFORMATION_MESSAGE);
				int pos=tablaCuentas.getSelectedRow();
				if(optConsignar.isSelected())
					cuentas[pos].consignar(Double.parseDouble(txtValor.getText()));
				if(optRetirar.isSelected())
					cuentas[pos].retirar(Double.parseDouble(txtValor.getText()));
				tablaCuentas.setValueAt(cuentas[pos].getSaldo(), pos,2);
				txtValor.setText("");
				JOptionPane.showMessageDialog(null, "Cuenta modificada exitosamente","Manejo Cuentas Ahorro",JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			////////////////////////////////////////////////////
			///////////////////////////////////////////////////
			
		});
		tablaCuentas.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"No Cuenta", "Cliente", "Saldo"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		JScrollPane.setViewportView(tablaCuentas);
	}
}
