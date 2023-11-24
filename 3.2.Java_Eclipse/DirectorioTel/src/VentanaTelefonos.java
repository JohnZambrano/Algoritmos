import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VentanaTelefonos extends JFrame implements ActionListener {
    private JMenuBar mnuBarra;
    private JMenu mnuTelefonos;
    private JToolBar barra;
    
    private String titulos[] = {"Agregar","Buscar","Listar","Salir"};
    private JMenuItem items[];
    private JButton botones[];
    private ImageIcon imagen[];
    private String imagenNombre[] = {"agregar.png","buscar.png","listado.png","door.png"};
    
    private JLabel lblNombre, lblDireccion, lblTelefono;
    
    private JTextField txtNombre, txtDireccion, txtTelefono;
    
    private JPanel panelDatos, panelListado;
    
    private JTextArea txtListado;
    private JScrollPane scrollPane;
    int i;
   private ListadoTelefono lista;
    
     public VentanaTelefonos() {
    	setSize(440,450);
    	setTitle("DirectorioTelefonico");
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	initComponents();
    }
    
    public void initComponents(){
    	lista = new ListadoTelefono();
    	mnuBarra = new JMenuBar();
    	mnuTelefonos = new JMenu("Telefonos");
    	setJMenuBar(mnuBarra);
    	mnuBarra.add(mnuTelefonos);
    	items = new JMenuItem[4];
    	
    	for(i = 0; i < items.length; i++) {
    		items[i] = new JMenuItem(titulos[i]);
    		items[i].addActionListener(this);
    		mnuTelefonos.add(items[i]);
    	}
    	
    	barra = new JToolBar();
    	botones = new JButton[4];
    	imagen = new ImageIcon[4];
    	for(i = 0; i < botones.length; i++) {
    		botones[i]= new JButton();
    		imagen[i] = new ImageIcon(VentanaTelefonos.class.getResource("iconos/"+imagenNombre[i]));
    		botones[i].setIcon(imagen[i]);
    		botones[i].setToolTipText(titulos[i]);
    		botones[i].addActionListener(this);
    		barra.add(botones[i]);
    	}
    	
    	panelDatos = new JPanel(new GridLayout(4,2,0,5));
    	panelListado = new JPanel(new BorderLayout());
    	
    	lblNombre = new JLabel("Nombre");
    	lblDireccion = new JLabel("Dirección");
    	lblTelefono = new JLabel("Telefono");
    	
    	txtNombre = new JTextField();
    	txtDireccion = new JTextField();
    	txtTelefono  = new JTextField();
    	
    	txtListado = new JTextArea();
    	scrollPane = new JScrollPane();
    	
    	
    	panelDatos.add(lblNombre);
    	panelDatos.add(txtNombre);
    	panelDatos.add(lblDireccion);
    	panelDatos.add(txtDireccion);
    	panelDatos.add(lblTelefono);
    	panelDatos.add(txtTelefono);
    	panelDatos.setBackground(new Color(143,176,198));
    	
    	scrollPane.setViewportView(txtListado);
    	panelListado.add(scrollPane,BorderLayout.CENTER);
    	
    	Box caja = Box.createVerticalBox();
    	caja.add(panelDatos);
    	caja.add(panelListado);
    	
    	
    	Container contenedor = getContentPane();
    	contenedor.setLayout(new BorderLayout());
    	contenedor.add(barra, BorderLayout.NORTH);
    	contenedor.add(caja, BorderLayout.CENTER);
    }
    

	public static void main(String[] arg) {
    	new VentanaTelefonos().setVisible(true);
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
    	if((e.getSource() == items[0]) || (e.getSource() == botones[0]))
    		agregar();
    	if((e.getSource()==items[1]) || (e.getSource()==botones[1]))
    		buscar();
    	if((e.getSource()==items[2]) || (e.getSource()==botones[2]))
    		reporte();
    	if((e.getSource()==items[3]) || (e.getSource()==botones[3]))
    		System.exit(0);
    }
    
    public void agregar() {
    	Persona registro;
    	registro = new Persona(txtNombre.getText(), txtDireccion.getText(),Long.parseLong(txtTelefono.getText()));
    	lista.AbrirArchivoEscritura();
    	lista.agregarRegistro(registro);
    	lista.cerrarArchivo();
    }
    
    public void buscar() {
    	Persona registrar;
    	lista.abrirArchivoLectura();
    	try {
    		registrar = lista.buscarRegistro(txtNombre.getText());
    		txtNombre.setText(registrar.getNombre());
    		txtDireccion.setText(registrar.getDireccion());
    		txtTelefono.setText(Long.toString(registrar.getTelefono()));
    	}catch(NullPointerException ex ) {
    		JOptionPane.showMessageDialog(this, "Persona no registrada", "Directorio Telefonico", JOptionPane.ERROR_MESSAGE);
    	}
    	lista.cerrarArchivo();
    }
    
    public void reporte() {
    	lista.abrirArchivoLectura();
    	txtListado.setText("");
    	String encabezado = String.format("%-20s %-38s %-12s\n", "Nombre ", "Dirección ", "Telefono");
    	txtListado.append(encabezado);
    	txtListado.append(lista.listado());
    	lista.cerrarArchivo();
    }
    
  
 
    
}
