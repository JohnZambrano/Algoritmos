import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaCuentas extends JFrame {
	JLabel lblCuenta, lblNombre, lblApellido, lblSaldo;
	JTextField txtCuenta, txtNombre, txtApellido, txtSaldo;
	JButton btnAbrir, btnRegistrar, btnListar;
	JTextArea txtListado;
	JScrollPane scrollPane;
	JPanel panelDatos, panelBotones,panelListado;
	
	public VentanaCuentas() {
		setSize(390,500);
		setTitle("Registro de Cuentas por Cobrar");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	public void initComponents() {
		lblCuenta = new JLabel("Cuenta Número");
		lblNombre = new JLabel("Primer Nombre");
		lblApellido = new JLabel("Primer Apellido");
		lblSaldo= new JLabel("Saldo Inicial");
		
		txtCuenta = new JTextField();
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		txtSaldo = new JTextField();
		
		btnAbrir = new JButton("Abrir");
		btnRegistrar = new JButton("Registrar");
		btnListar = new JButton("Listado");
		btnRegistrar.setEnabled(false); 
		
		txtListado = new JTextArea();
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(txtListado);
		
		panelDatos = new JPanel(new GridLayout(4,2,10,0));
		panelBotones = new JPanel(new GridLayout(1,3,10,0));
		panelListado = new JPanel(new BorderLayout());
		
		panelDatos.setBackground(new Color(224,248,247));
		panelBotones.setBackground(new Color(224,248,247));
		
		panelDatos.add(lblCuenta);
		panelDatos.add(txtCuenta);
		panelDatos.add(lblNombre);
		panelDatos.add(txtNombre);
		panelDatos.add(lblApellido);
		panelDatos.add(txtApellido);
		panelDatos.add(lblSaldo);
		panelDatos.add(txtSaldo);
		
		panelBotones.add(btnAbrir);
		panelBotones.add(btnRegistrar);
		panelBotones.add(btnListar);
		
		panelListado.add(scrollPane,BorderLayout.CENTER);
		
		panelDatos.setBounds(10, 10,300,100);
		panelBotones.setBounds(10, 120, 350, 30 );
		panelListado.setBounds(10, 160, 350, 300);
		
		Container contenedor = getContentPane();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(224,248,247));
		
		contenedor.add(panelDatos);
		contenedor.add(panelBotones);
		contenedor.add(panelListado);			
		
	}
	
	public static void main (String[] args) {
		new VentanaCuentas().setVisible(true);
	}

}
