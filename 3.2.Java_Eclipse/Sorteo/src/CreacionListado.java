import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreacionListado extends JFrame {
	private JToolBar barra;
	private JToolBar barraMov;
	private String titulos[]= {"Agregar","Buscar","Listar","Sorteo","Salir",
			"Primero","Anterior","Siguiente","Último"};
	private String imagenNombre[]= {"agregar.png","buscar.png","listar.png","ruleta.png","salir.png",
			"primero.png","anterior.png","siguiente.png","ultimo.png"};
	private ImageIcon imagen[];
	private JButton botones[];
	private JButton botonesMov[];
	private JLabel lblCodigo, lblCedula, lblTelefono;
	private JTextField txtCodigo, txtCedula, txtTelefono;
	private JPanel panelDatos, panelListado;
	private JTextArea txtListado;
	private JScrollPane scrollPane;
	
	int i;
	RegistroUsuarios lista;
	
	public CreacionListado() {
		setTitle("Sorteo");
		setSize(540,550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	public void initComponents() {
		lista = new RegistroUsuarios();
		botones = new JButton[5];
		botonesMov = new JButton[4];
		imagen = new ImageIcon[9];
		
		barra = new JToolBar();
		for(i = 0; i<botones.length; i++) {
			botones[i]= new JButton();
			imagen[i]= new ImageIcon(CreacionListado.class.getResource("iconos/"+imagenNombre[i]));
			botones[i].setIcon(imagen[i]);
			botones[i].setToolTipText(titulos[i]);
			barra.add(botones[i]);
		}
		
		barraMov = new JToolBar();
		for(i=0; i<botonesMov.length; i++) {
			botonesMov[i]= new JButton();
			imagen[i+4] = new ImageIcon(CreacionListado.class.getResource("iconos/"+imagenNombre[i+5]));
			botonesMov[i].setIcon(imagen[i+4]);
			botonesMov[i].setToolTipText(titulos[i+5]);
			botonesMov[i].addActionListener(this);
			barraMov.add(botonesMov[i]);
		}
		
		panelDatos = new JPanel(new GridLayout(3,2,0,5));
		panelDatos.setBackground(new Color(41,167,217));
		panelListado = new JPanel(new BorderLayout());
		
		lblCedula = new JLabel("Cedula");
		lblTelefono = new JLabel("Telefono");
		lblCodigo = new JLabel("Código generado automáticamente ==>");
		
		txtCedula = new JTextField();
		txtTelefono = new JTextField();
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		
		txtListado= new JTextArea();
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(txtListado);
		
		panelDatos.add(lblCedula);
		panelDatos.add(txtCedula);
		panelDatos.add(lblTelefono);
		panelDatos.add(txtTelefono);
		panelDatos.add(lblCodigo);
		panelDatos.add(txtCodigo);
		
		panelListado.add(scrollPane,BorderLayout.CENTER);
		
		Box caja = Box.createVerticalBox();
		caja.add(panelDatos);
		caja.add(panelListado);
		
		
		Container contenedor = getContentPane();
		contenedor.setLayout(new BorderLayout());
		contenedor.add(barra,BorderLayout.NORTH);
		contenedor.add(caja,BorderLayout.CENTER);
		contenedor.add(barraMov,BorderLayout.SOUTH);
		
	}
	
	
	public static void main(String[] args) {
		new CreacionListado().setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		txtListado.setText("");
		if(e.getSource()==botones[0])
			agregar();
		if(e.getSource()==botones[1])
			buscar();
		if(e.getSource()==botones[2])
			txtListado.append(lista.todos());
		if(e.getSource()==botones[3])
			sorteo();
		if(e.getSource()==botones[4])
			System.exit(0);
		if(e.getSource()==botonesMov[0])
			txtListado.append(lista.movimientos(1));
		if(e.getSource()==botonesMov[1])
		    txtListado.append(lista.movimientos(3));
		if(e.getSource()==botonesMov[1])
		    txtListado.append(lista.movimientos(3));
		if(e.getSource()==botonesMov[2])
		    txtListado.append(lista.movimientos(3));
		if(e.getSource()==botonesMov[3])
		    txtListado.append(lista.movimientos(2));
		
			
		
	}
	
	public void agregar() {
		try {
			Usuario nuevo;
			txtCodigo.setText(Long.toString(lista.numeroRegistros()+1));
			JOptionPane.showMessageDialog(this, "Número asignado para el sorteo" +txtCodigo.getText(),"Sorteo",
					JOptionPane.INFORMATION_MESSAGE);
			nuevo = new Usuario(Integer.parseInt(txtCodigo.getText()),Long.parseLong(txtCedula.getText()),
					Long.parseLong(txtTelefono.getText()));
			lista.agragarUsuario(nuevo);
			JOptionPane.showMessageDialog(this, "RegistroExitoso","Sorteo",JOptionPane.INFORMATION_MESSAGE);
			
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(this,"Ingrese solo números enteros "+ex.getMessage(),"Sorteo",
			JOptionPane.ERROR_MESSAGE);
		}
		txtCodigo.setText("");
		txtCedula.setText("");
		txtTelefono.setText("");
	}
	
	public void buscar() {
		try {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el código a buscar", "Sorteo", 
					JOptionPane.QUESTION_MESSAGE));
			String resultado = lista.buscar(codigo);
			if(!resultado.isEmpty())
				txtListado.append(resultado);
			else
				txtListado.append("eL código no esta registrado");
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(this,"Ingrese solo números enteros "+ex.getMessage(),"Sorteo",
			JOptionPane.ERROR_MESSAGE);
	      }
		}
	
	public void sorteo() {
		int ganador = lista.sorteo();
		txtListado.append("El ganador del sorteo es \n");
		txtListado.append("*************************************\n");
		txtListado.append(lista.buscar(ganador));
		txtListado.append("*************************************\n");
	}

}
