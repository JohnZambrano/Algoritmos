import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class pHoraCatedra extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIdFuncionario;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtHoras;
	private JTextField txtMeses;
	private JTable tablaHoraCatedra;
	private JTextField txtTituloProfesional;
	private JTextField txtCategoria;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	
	
	
	HoraCatedra cuentaHoraCatedra= new HoraCatedra(0, "",  "", ' ', 0,"", "", 0, 0, "");
	ArrayList<HoraCatedra> datosHoraCatedra= new ArrayList<HoraCatedra>();
	int i=0;
	
	private JTextField txtAreaFormacion;
	
	public static void main(String[] args) {
		try {
			pHoraCatedra dialog = new pHoraCatedra();
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
	public pHoraCatedra() {
		setTitle("Profesores Hora C\u00E1tedra");
		setBounds(100, 100, 921, 560);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.desktop);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 11, 885, 167);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdFuncionario = new JLabel("Id Funcionario");
		lblIdFuncionario.setBounds(34, 26, 90, 14);
		panel.add(lblIdFuncionario);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(134, 26, 90, 14);
		panel.add(lblNombres);
		
		txtIdFuncionario = new JTextField();
		txtIdFuncionario.setBounds(34, 51, 86, 20);
		panel.add(txtIdFuncionario);
		txtIdFuncionario.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(130, 51, 140, 20);
		panel.add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(280, 26, 90, 14);
		panel.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(280, 51, 140, 20);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(713, 26, 90, 14);
		panel.add(lblGenero);
		
		JComboBox cmbGenero = new JComboBox();
		cmbGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		cmbGenero.setBounds(713, 50, 101, 21);
		panel.add(cmbGenero);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo De Contrato");
		lblTipoDeContrato.setBounds(34, 78, 115, 14);
		panel.add(lblTipoDeContrato);
		
		JRadioButton optAuxiliar = new JRadioButton("Auxiliar");
		buttonGroup.add(optAuxiliar);
		optAuxiliar.setBounds(69, 99, 86, 23);
		panel.add(optAuxiliar);
		
		JRadioButton optAsistente = new JRadioButton("Asistente");
		buttonGroup.add(optAsistente);
		optAsistente.setBounds(191, 99, 86, 23);
		panel.add(optAsistente);
		
		JRadioButton optAsociado = new JRadioButton("Asociado");
		buttonGroup.add(optAsociado);
		optAsociado.setBounds(311, 99, 90, 23);
		panel.add(optAsociado);
		
		JLabel lblHorasSemanales = new JLabel("Horas Semanales");
		lblHorasSemanales.setBounds(34, 135, 101, 14);
		panel.add(lblHorasSemanales);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(153, 132, 86, 20);
		panel.add(txtHoras);
		
		JLabel lblMesesContratados = new JLabel("Meses Contratados");
		lblMesesContratados.setBounds(298, 135, 115, 14);
		panel.add(lblMesesContratados);
		
		txtMeses = new JTextField();
		txtMeses.setColumns(10);
		txtMeses.setBounds(430, 132, 86, 20);
		panel.add(txtMeses);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(430, 26, 80, 14);
		panel.add(lblCategoria);
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulo Profesional");
		lblNewLabel.setBounds(564, 26, 110, 14);
		panel.add(lblNewLabel);
		
		txtTituloProfesional = new JTextField();
		txtTituloProfesional.setColumns(10);
		txtTituloProfesional.setBounds(564, 51, 110, 20);
		panel.add(txtTituloProfesional);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(430, 51, 109, 20);
		panel.add(txtCategoria);
		
		txtAreaFormacion = new JTextField();
		txtAreaFormacion.setColumns(10);
		txtAreaFormacion.setBounds(564, 100, 110, 20);
		panel.add(txtAreaFormacion);
		
		JLabel lblNewLabel_1 = new JLabel("\u00C1rea de Formaci\u00F3n");
		lblNewLabel_1.setBounds(442, 103, 110, 14);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 189, 885, 321);
		contentPanel.add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				double tiempo=0;
				int numeroHoras=0;
				int numeroMeses=0;
				double valorHora=0;
				double salarioBase=0;
				double pension=0;
				double eps=0;
				
				
								
				try {
					
					int idFuncionario = Integer.parseInt(txtIdFuncionario.getText());
					String nombres = txtNombres.getText();
					String apellidos = txtApellidos.getText();
					String generoAux = cmbGenero.getSelectedItem().toString();
					char genero = generoAux.charAt(0);
					String areaFormacion = txtAreaFormacion.getText();
					String tituloProfesional=txtTituloProfesional.getText();
					String categoria = txtCategoria.getText();
					
				
				if(optAuxiliar.isSelected()) {
					numeroHoras=Integer.parseInt(txtHoras.getText());
					numeroMeses=Integer.parseInt(txtMeses.getText());
					valorHora=30474;
					
					
				}
				if(optAsistente.isSelected()) {
					numeroHoras=Integer.parseInt(txtHoras.getText());
					numeroMeses=Integer.parseInt(txtMeses.getText());
					valorHora=30474;
													
				}
				if(optAsociado.isSelected()) {
					numeroHoras=Integer.parseInt(txtHoras.getText());
					numeroMeses=Integer.parseInt(txtMeses.getText());
					valorHora=45412;
					
				}
				
				tiempo=numeroHoras*numeroMeses;
				
				salarioBase=cuentaHoraCatedra.calcularSueldo(valorHora,tiempo);
				eps=cuentaHoraCatedra.calcularEPS(salarioBase);				
				pension=cuentaHoraCatedra.calcularPension(salarioBase);
								
				salarioBase=salarioBase-eps-pension;
				
								
				cuentaHoraCatedra= new HoraCatedra(idFuncionario, nombres,  apellidos, genero, salarioBase,
						 areaFormacion, tituloProfesional, numeroHoras, numeroMeses, categoria);
				
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getFuncionario(),i, 0);
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getNombres(),i, 1);
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getApellidos(),i, 2);
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getGenero(),i, 3);
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getSalarioBase(),i, 4);
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getAreaFormacion(),i, 5);
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getTituloProfesional(),i, 6);
				tablaHoraCatedra.setValueAt(cuentaHoraCatedra.getCategoria(),i, 7);
				tablaHoraCatedra.setValueAt(eps,i, 8);
				tablaHoraCatedra.setValueAt(pension,i, 9);
				
													
				i++;
				
				}catch(IllegalArgumentException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Error en el ingreso de datos",JOptionPane.ERROR_MESSAGE);
					
				}	
				
			}
		});
		btnCalcular.setBounds(713, 131, 89, 23);
		panel.add(btnCalcular);
		
		
		
		tablaHoraCatedra = new JTable();
		tablaHoraCatedra.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				int row=tablaHoraCatedra.getSelectedRow();
				String info=datosHoraCatedra.get(row).mostrarDatosDocente(); 
				JOptionPane.showMessageDialog(null, info,"Informacion Profesor Tiempo Completo",JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		tablaHoraCatedra.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Id Funcionario", "Nombres", "Apellidos", "Genero", "SalarioBase", "\u00C1rea de formaci\u00F3n", "T\u00EDtulo profesional", "Categoria", "Eps", "Pensi\u00F3n"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablaHoraCatedra.getColumnModel().getColumn(5).setPreferredWidth(111);
		tablaHoraCatedra.getColumnModel().getColumn(6).setPreferredWidth(110);
		scrollPane.setViewportView(tablaHoraCatedra);
	}
}
