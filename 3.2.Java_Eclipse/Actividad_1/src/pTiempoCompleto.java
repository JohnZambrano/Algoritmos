import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class pTiempoCompleto extends JDialog {

		private final JPanel contentPanel = new JPanel();
	private JTextField txtIdFuncionario;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable tablaTiempoCompleto;

	/**
	 * Launch the application.
	 */
	
	
	
	
	final public static int N=10;
	

	TiempoCompleto cuentaTiempoCompleto= new TiempoCompleto(0,"","",' ',0,"","","",0);
	
	ArrayList<TiempoCompleto> datosTiempoCompleto= new ArrayList<TiempoCompleto>();
	
	
	int i=0;
	
	
	private JTextField txtCategoria;
	private JTextField txtAreaFormacion;
	private JTextField txtTituloProfesional;
	
	
	
	public static void main(String[] args) {
		try {
			pTiempoCompleto dialog = new pTiempoCompleto();
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
	public pTiempoCompleto() {
		setTitle("Profesores Tiempo Completo");
		setBounds(100, 100, 921, 560);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.desktop);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.activeCaption);
			panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel.setBounds(10, 11, 885, 131);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblIdFuncionario = new JLabel("Id Funcionario");
				lblIdFuncionario.setBounds(35, 23, 90, 14);
				panel.add(lblIdFuncionario);
			}
			{
				JLabel lblNombres = new JLabel("Nombres");
				lblNombres.setBounds(135, 23, 90, 14);
				panel.add(lblNombres);
			}
			{
				JLabel lblApellidos = new JLabel("Apellidos");
				lblApellidos.setBounds(291, 23, 90, 14);
				panel.add(lblApellidos);
			}
			{
				JLabel lblGenero = new JLabel("Genero");
				lblGenero.setBounds(723, 23, 90, 14);
				panel.add(lblGenero);
			}
			{
				txtIdFuncionario = new JTextField();
				txtIdFuncionario.setBounds(35, 48, 86, 20);
				panel.add(txtIdFuncionario);
				txtIdFuncionario.setColumns(10);
			}
			{
				txtNombres = new JTextField();
				txtNombres.setColumns(10);
				txtNombres.setBounds(135, 48, 140, 20);
				panel.add(txtNombres);
			}
			{
				txtApellidos = new JTextField();
				txtApellidos.setColumns(10);
				txtApellidos.setBounds(291, 48, 140, 20);
				panel.add(txtApellidos);
			}
			
			JLabel lblTipoDeContrato = new JLabel("Tipo De Contrato");
			lblTipoDeContrato.setBounds(35, 79, 109, 14);
			panel.add(lblTipoDeContrato);
			
			JRadioButton optAuxiliar = new JRadioButton("Auxiliar");
			buttonGroup.add(optAuxiliar);
			optAuxiliar.setBounds(35, 100, 109, 23);
			panel.add(optAuxiliar);
			
			JRadioButton optAsistente = new JRadioButton("Asistente");
			buttonGroup.add(optAsistente);
			optAsistente.setBounds(166, 100, 109, 23);
			panel.add(optAsistente);
			
			JRadioButton optAsociado = new JRadioButton("Asociado");
			buttonGroup.add(optAsociado);
			optAsociado.setBounds(291, 100, 109, 23);
			panel.add(optAsociado);
			
			JRadioButton optTitular = new JRadioButton("Titular");
			buttonGroup.add(optTitular);
			optTitular.setBounds(420, 100, 109, 23);
			panel.add(optTitular);
			
			JComboBox cmbGenero = new JComboBox();
			cmbGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
			cmbGenero.setBounds(723, 48, 80, 20);
			panel.add(cmbGenero);
			
			JLabel lblCategoria = new JLabel("Categoria");
			lblCategoria.setBounds(449, 23, 80, 14);
			panel.add(lblCategoria);
			
			txtCategoria = new JTextField();
			txtCategoria.setBounds(449, 48, 109, 20);
			panel.add(txtCategoria);
			txtCategoria.setColumns(10);
			
			txtAreaFormacion = new JTextField();
			txtAreaFormacion.setBounds(563, 101, 130, 22);
			panel.add(txtAreaFormacion);
			txtAreaFormacion.setColumns(10);
			
			txtTituloProfesional = new JTextField();
			txtTituloProfesional.setBounds(583, 48, 110, 20);
			panel.add(txtTituloProfesional);
			txtTituloProfesional.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("T\u00EDtulo Profesional");
			lblNewLabel.setBounds(583, 23, 110, 14);
			panel.add(lblNewLabel);
			
			JLabel lblAreaFormacion = new JLabel("Area de formaci\u00F3n");
			lblAreaFormacion.setBounds(563, 79, 130, 14);
			panel.add(lblAreaFormacion);
			
			
			
			JButton btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int puntos=0;
					double valorDevengado=0;
					double salarioBase=0;
					double eps=0;
					double pension=0;
					
					
										
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
						puntos=178;
					}
					if(optAsistente.isSelected()) {
						puntos=200;
					}
					if(optAsociado.isSelected()) {
						puntos=300;
					}
					if(optTitular.isSelected()) {
						puntos=400;
					}
					
					salarioBase=cuentaTiempoCompleto.calcularSueldo(puntos);
					eps=cuentaTiempoCompleto.calcularEPS(salarioBase);				
					pension=cuentaTiempoCompleto.calcularPension(salarioBase);	
					salarioBase=salarioBase-eps-pension;	
										
							
					cuentaTiempoCompleto= new TiempoCompleto(idFuncionario,nombres,apellidos,genero,salarioBase,areaFormacion,tituloProfesional,categoria,puntos);
					
										
					datosTiempoCompleto.add(cuentaTiempoCompleto);
					
					//for(int j=0; j<datosProfesoresTiempoCompleto.size();j++) {
					//System.out.println(datosProfesoresTiempoCompleto.get(j));
					//}
					
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getFuncionario(),i, 0);
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getNombres(),i, 1);
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getApellidos(),i, 2);
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getGenero(),i, 3);
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getSalarioBase(),i, 4);
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getAreaFormacion(),i, 5);
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getTituloProfesional(),i, 6);
					tablaTiempoCompleto.setValueAt(cuentaTiempoCompleto.getCategoria(),i, 7);
					tablaTiempoCompleto.setValueAt(eps,i, 8);
					tablaTiempoCompleto.setValueAt(pension,i, 9);				
				
					i++;
					
					}catch(IllegalArgumentException e1) {
						JOptionPane.showMessageDialog(null,e1.getMessage(),"Error en el ingreso de datos",JOptionPane.ERROR_MESSAGE);
						
					}	
					
					
					
				}
			});
			btnCalcular.setBounds(759, 100, 89, 23);
			panel.add(btnCalcular);
			
			
			
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 148, 885, 362);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 865, 340);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		tablaTiempoCompleto = new JTable();
		tablaTiempoCompleto.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
			int row=tablaTiempoCompleto.getSelectedRow();
			String info=datosTiempoCompleto.get(row).mostrarDatosDocente(); 
			JOptionPane.showMessageDialog(null, info,"Informacion Profesor Tiempo Completo",JOptionPane.INFORMATION_MESSAGE);
							
				
			}
		});
		scrollPane.setViewportView(tablaTiempoCompleto);
		tablaTiempoCompleto.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
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
				"Id Funcionario", "Nombres", "Apellidos", "Genero", "SalarioBase", "T\u00EDtulo Profesional", "Area Formaci\u00F3n", "Categoria", "Eps", "Pensi\u00F3n"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablaTiempoCompleto.getColumnModel().getColumn(0).setPreferredWidth(92);
		tablaTiempoCompleto.getColumnModel().getColumn(1).setPreferredWidth(80);
		tablaTiempoCompleto.getColumnModel().getColumn(2).setPreferredWidth(81);
		tablaTiempoCompleto.getColumnModel().getColumn(4).setPreferredWidth(107);
		tablaTiempoCompleto.getColumnModel().getColumn(5).setPreferredWidth(104);
		tablaTiempoCompleto.getColumnModel().getColumn(6).setPreferredWidth(97);
		tablaTiempoCompleto.getColumnModel().getColumn(7).setPreferredWidth(78);
	}
}
