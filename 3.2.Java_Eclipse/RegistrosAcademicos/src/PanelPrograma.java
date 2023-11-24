import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class PanelPrograma extends JPanel {
	private JPanel panelDatos, panelListado;
	private JLabel lblCodigo, lblNombre, lblTitulo, lblFacultad;
	public JTextField txtCodigo, txtNombre;
	public JTextArea txtPrograma;
	public JScrollPane scroll;
	
	public JComboBox<String>cmbFacultad;
	public ArchivoFacultad datosFac;
	ArrayList<String> combo;
	
	 public PanelPrograma() {
	    	setSize(600,200);
	    	setOpaque(false);
	    	initComponents();
	    }
	   
	    public void initComponents() {
	    	lblCodigo = new JLabel("Codigo");
	    	lblNombre = new JLabel("Nombre");
	    	lblFacultad = new JLabel("Facultad");
	    	lblTitulo = new JLabel("Registro Programas",SwingConstants.CENTER);
	    	lblTitulo.setFont(new Font("Curier",Font.BOLD+Font.ITALIC,16));
	    	
	    	txtCodigo = new JTextField();
	    	txtNombre = new JTextField();
	    	txtPrograma = new JTextArea();
	    	scroll = new JScrollPane();
	    	scroll.setViewportView(txtPrograma);
	    	
	        datosFac = new ArchivoFacultad();
	        datosFac.abrirLectura();
	    	combo = new ArrayList<String>();
	    	cmbFacultad= new  JComboBox<String>();
	    	cmbFacultad.removeAllItems();
	    	
	    	combo = datosFac.cargarDatos();
	    	
	    	for(String iterador:combo) {
	    		cmbFacultad.addItem(iterador);
	    	}
	    	
	    	datosFac.cerrar();
	    	
	    	panelDatos = new JPanel( new GridLayout(3,2,0,5));
	    	panelDatos.setOpaque(false);
	    	panelDatos.setPreferredSize(new Dimension(250,100));
	    	panelListado = new JPanel(new BorderLayout());
	    	
	    	panelDatos.add(lblCodigo);
	    	panelDatos.add(txtCodigo);
	    	panelDatos.add(lblNombre);
	    	panelDatos.add(txtNombre);
	    	panelDatos.add(lblFacultad);
	    	panelDatos.add(cmbFacultad);
	    	
	    	panelListado.add(scroll, BorderLayout.CENTER);
	    	
	    	setLayout(new BorderLayout());
	    	add(lblTitulo,BorderLayout.NORTH);
	    	add(panelDatos,BorderLayout.WEST);
	    	add(panelListado,BorderLayout.CENTER);	
	   }
	    
	    public void limpiar() {
	    	txtCodigo.setText("");
	    	txtNombre.setText("");
	    	txtPrograma.setText("");
	    }

}
