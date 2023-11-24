import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class VentanaEmpleados extends JFrame {

	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtSalario;
	private JTable tblEmpleados;
	
	private DataOutputStream salida;
	private DataInputStream entrada;
	private Empleado registro;

	/**
	 * Launch the application.
	 */
	public void abrirArchivoEscritura() {
		try {
			salida = new DataOutputStream(new FileOutputStream("datos.dat",true));
			
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(this,"Error al abrir el archivo", "Manejo de archivos", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
			
		}
	}
	
	public void abrirArchivoLectura() {
		try {
			entrada = new DataInputStream(new FileInputStream("datos.dat"));
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(this, "Error al abrir el archivo", "Manejo de Archivos", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}
	
	public void listado(int cedula, String nombre ,String apellido, double salario, int f) {
		modelo.addRow(datos);
		tblEmpleados.setValueAt(registro.getCedula(),i,0);
		tblEmpleados.setValueAt(registro.getNombre(),i,1);
		tblEmpleados.setValueAt(registro.getApellido(),i,2);
		tblEmpleados.setValueAt(registro.getSalario(),i,3);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEmpleados frame = new VentanaEmpleados();
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
	public VentanaEmpleados() {
		setTitle("Registro Inicial Empleados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 224, 197);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(10, 22, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 62, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 103, 46, 14);
		panel.add(lblApellido);
		
		JLabel lblSala = new JLabel("Salario");
		lblSala.setBounds(10, 145, 46, 14);
		panel.add(lblSala);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(10, 37, 86, 20);
		panel.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(10, 76, 86, 20);
		panel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(10, 118, 86, 20);
		panel.add(txtApellido);
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		txtSalario.setBounds(10, 161, 86, 20);
		panel.add(txtSalario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(269, 11, 202, 197);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			//---------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				try {
					abrirArchivoEscritura();
					registro = new Empleado();
					registro.setCedula(Integer.parseInt(txtCedula.getText()));
					registro.setNombre((txtNombre.getText()));
					registro.setApellido((txtApellido.getText()));
					registro.setSalario(Double.parseDouble(txtSalario.getText()));
					
					salida.writeInt(registro.getCedula());
					salida.writeUTF(registro.getNombre());
					salida.writeUTF(registro.getApellido());
					salida.writeDouble(registro.getSalario());
					JOptionPane.showMessageDialog(null, "Empleado Registrado", "Manejo de Archivos",JOptionPane.INFORMATION_MESSAGE);
					salida.close();
					
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Debe escribir números", "Manejo de Archivos", JOptionPane.ERROR_MESSAGE);
					
				}catch(IOException ex) {
					JOptionPane.showMessageDialog(null, "", "Manejo de Archivos", JOptionPane.ERROR_MESSAGE);
					System.exit(1);
				}
			}
		});
		btnGuardar.setBounds(45, 32, 89, 23);
		panel_1.add(btnGuardar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			//--------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				registro = new Empleado();
				borrarFilas();
				DefaultTableModel modelo = (DefaultTableModel)tblEmpleados.getModel();
				Object datos[]= {0,"","",0};
				int i;
				int filas = tblEmpleados.getRowCount();
				for(i=0; filas > i; i++) {
					modelo.removeRow(0);
				}
				try {
					abrirArchivoLectura();
					i=0;
					do {
						registro.setCedula(entrada.readInt());
						registro.setNombre(entrada.readUTF());
						registro.setApellido(entrada.readUTF());
						registro.setSalario(entrada.readDouble());
						
	
						i ++;
					}while(true);
				}catch(IOException ex) {
					JOptionPane.showMessageDialog(null, "Datos del Archivo en pantalla \n"+"Se muestran "+i+" Registros"," Manejo de Archivos",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnListar.setBounds(45, 88, 89, 23);
		panel_1.add(btnListar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			//---------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				boolean encontrado = false;
				registro = new Empleado();
				txtNombre.setText("");
				txtApellido.setText("");
				txtSalario.setText("");
				try {
					abrirArchivoLectura();
					do {
						registro.setCedula(entrada.readInt());
						registro.setNombre(entrada.readUTF());
						registro.setApellido(entrada.readUTF());
						registro.setSalario(entrada.readDouble());
						if(registro.setCedula() == Integer.parseInt(txtCedula.getText()))
							txtNombre.setText(registro.getNombre());
							txtApellido.setText(registro.getApellido());
							txtSalario.setText(Double.toString(registro.getSalario(registro.getSalario()));
							encontrado = true;
						
					}while(true);
				}catch(IOException ex) {
					if(encontrado)
						JOptionPane.showMessageDialog(null, "Datos Encontrados ","Buscar Registro ", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Datos No Encontrados", "Buscar registro",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnBuscar.setBounds(45, 151, 89, 23);
		panel_1.add(btnBuscar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 219, 462, 218);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		tblEmpleados = new JTable();
		tblEmpleados.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tblEmpleados.setBackground(new Color(211, 211, 211));
		tblEmpleados.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cedula", "Nombres", "Apellidos", "Salario"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tblEmpleados);
	}
}
