import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pOcacionales extends JDialog {

	private final JPanel cmbSexo = new JPanel();
	private JTextField txtIdFuncionario;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtContrato;
	private JTextField txtMeses;
	
	
	//----------------------------------------------------------------
	
	final public static int N=10;
	
	int i=0;
	Ocacionales cuentaOcacionales= new Ocacionales(0,"","",' ',0,"","",0,0);
	ArrayList<Ocacionales> datosOcacionales= new ArrayList<Ocacionales>();
	
	
	private JTextField txtMesesContrato;
	private JTextField txtValorContrato;
	private JTable table;
	private JTable tabla;
	private JTextField txtAreaFormacion;
	private JTextField txtTituloProfesional;
	protected JComboBox cmbGenero;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			pOcacionales dialog = new pOcacionales();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public pOcacionales() {
		setTitle("Profesores Ocacionales");
		setBounds(100, 100, 851, 477);
		getContentPane().setLayout(new BorderLayout());
		cmbSexo.setBackground(SystemColor.desktop);
		cmbSexo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(cmbSexo, BorderLayout.CENTER);
		cmbSexo.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 10, 799, 131);
			panel.setBackground(SystemColor.activeCaption);
			panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			cmbSexo.add(panel);
			panel.setLayout(null);
			{
				JLabel lblIdFuncionario = new JLabel("Id Funcionario");
				lblIdFuncionario.setBounds(35, 23, 90, 14);
				panel.add(lblIdFuncionario);
			}
			{
				JLabel lblNombres = new JLabel("Nombres");
				lblNombres.setBounds(176, 23, 90, 14);
				panel.add(lblNombres);
			}
			{
				JLabel lblApellidos = new JLabel("Apellidos");
				lblApellidos.setBounds(365, 23, 90, 14);
				panel.add(lblApellidos);
			}
			{
				JLabel lblGenero = new JLabel("Genero");
				lblGenero.setBounds(545, 23, 90, 14);
				panel.add(lblGenero);
			}
			{
				txtIdFuncionario = new JTextField();
				txtIdFuncionario.setBounds(35, 48, 86, 20);
				txtIdFuncionario.setColumns(10);
				panel.add(txtIdFuncionario);
			}
			{
				txtNombres = new JTextField();
				txtNombres.setBounds(176, 48, 140, 20);
				txtNombres.setColumns(10);
				panel.add(txtNombres);
			}
			{
				txtApellidos = new JTextField();
				txtApellidos.setBounds(365, 48, 140, 20);
				txtApellidos.setColumns(10);
				panel.add(txtApellidos);
			}
			{
				JLabel lblValorContrato = new JLabel("Valor Contrato");
				lblValorContrato.setBounds(35, 79, 90, 14);
				panel.add(lblValorContrato);
			}
			{
				txtContrato = new JTextField();
				txtContrato.setBounds(35, 96, 90, 20);
				panel.add(txtContrato);
				txtContrato.setColumns(10);
			}
			{
				txtMeses = new JTextField();
				txtMeses.setBounds(176, 96, 140, 20);
				panel.add(txtMeses);
				txtMeses.setColumns(10);
			}
			{
				JLabel lblDuracionEnMeses = new JLabel("Duraci\u00F3n En Meses");
				lblDuracionEnMeses.setBounds(176, 79, 116, 14);
				panel.add(lblDuracionEnMeses);
			}
			
			JComboBox cmbGenero = new JComboBox();
			cmbGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
			cmbGenero.setBounds(545, 47, 98, 22);
			panel.add(cmbGenero);
			
			JLabel lblAreaFormacion = new JLabel("Area Formaci\u00F3n");
			lblAreaFormacion.setBounds(365, 79, 90, 14);
			panel.add(lblAreaFormacion);
			
			txtAreaFormacion = new JTextField();
			txtAreaFormacion.setBounds(365, 96, 140, 20);
			panel.add(txtAreaFormacion);
			txtAreaFormacion.setColumns(10);
			
			JLabel lblTituloProfecional = new JLabel("Titulo Profesional");
			lblTituloProfecional.setBounds(545, 80, 109, 14);
			panel.add(lblTituloProfecional);
			
			txtTituloProfesional = new JTextField();
			txtTituloProfesional.setBounds(545, 96, 109, 20);
			panel.add(txtTituloProfesional);
			txtTituloProfesional.setColumns(10);
			
			
			
			JButton btnCalcular = new JButton("Calcular");
			btnCalcular.setBounds(685, 96, 90, 20);
			btnCalcular.addActionListener(new ActionListener() {
			//----------------------------------------------------------
				
				
				public void actionPerformed(ActionEvent arg0) {
					
					double valorDevengado=0;
					double eps=0;
					double pension=0;
					double salarioBase = 0;
					
					
								
					int idFuncionario = Integer.parseInt(txtIdFuncionario.getText());
					String nombres = txtNombres.getText();
					String apellidos = txtApellidos.getText();
					String generoAux = cmbGenero.getSelectedItem().toString();
					char genero = generoAux.charAt(0);
					double valorContrato = Double.parseDouble(txtContrato.getText());
					int mesesContrato= Integer.parseInt(txtMeses.getText());
					String areaFormacion = txtAreaFormacion.getText();
					String tituloProfesional=txtTituloProfesional.getText();
													
					
					
					salarioBase = cuentaOcacionales.calcularSueldo(valorContrato, mesesContrato);
					eps= cuentaOcacionales.calcularEPS(salarioBase);
					pension = cuentaOcacionales.calcularPension(salarioBase);
					salarioBase = salarioBase-eps-pension;
					
					cuentaOcacionales = new Ocacionales(idFuncionario,nombres,apellidos,genero,salarioBase,areaFormacion,tituloProfesional,valorContrato,mesesContrato);
					
					datosOcacionales.add(cuentaOcacionales);
					
					tabla.setValueAt(cuentaOcacionales.getFuncionario(),i, 0);
					tabla.setValueAt(cuentaOcacionales.getNombres(),i, 1);
					tabla.setValueAt(cuentaOcacionales.getApellidos(),i, 2);
					tabla.setValueAt(cuentaOcacionales.getGenero(),i, 3);
					tabla.setValueAt(cuentaOcacionales.getValorContrato(),i, 4);
					tabla.setValueAt(cuentaOcacionales.getMesesContrato(),i, 5);
					tabla.setValueAt(cuentaOcacionales.getSalarioBase(),i, 6);
					tabla.setValueAt(cuentaOcacionales.getAreaFormacion(),i, 7);
					tabla.setValueAt(cuentaOcacionales.getTituloProfesional(),i, 8);
					tabla.setValueAt(eps,i, 9);
					tabla.setValueAt(pension,i, 10);
														
					i++;	
				}

				

			});
			btnCalcular.setForeground(Color.BLACK);
			btnCalcular.setBackground(new Color(95, 158, 160));
			panel.add(btnCalcular);
			
		
		
		}
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 152, 799, 275);
		panel1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel1.setBackground(new Color(128, 128, 128));
		cmbSexo.add(panel1);
		panel1.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			panel1.add(scrollPane, BorderLayout.CENTER);
			
			tabla = new JTable();
			tabla.addMouseListener(new MouseAdapter() {
				
				
				public void mouseClicked(MouseEvent e) {
					int pos=tabla.getSelectedRow();
					String info=datosOcacionales.get(pos).mostrarDatosDocente(); 
					JOptionPane.showMessageDialog(null, info,"Informacion Profesor Tiempo Completo",JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			});
			tabla.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, "", "", null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
				},
				new String[] {
					"Id Funcionario", "Nombres", "Apellidos", "Genero", "Valor Contrato", "Duraci\u00F3n En Meses", "Salario Base", "Area Formaci\u00F3n", "Titulo Profecional", "Eps", "Pensi\u00F3n"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			tabla.setBorder(new EmptyBorder(0, 0, 0, 0));
			scrollPane.setViewportView(tabla);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null},
				},
				new String[] {
					"Id Funcionario", "Nombres", "Apellidos", "Genero", "Salario Base", "Valor contrato", "Duraci\u00F3n En Meses", "Eps", "Pensi\u00F3n"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
		}
	}
}