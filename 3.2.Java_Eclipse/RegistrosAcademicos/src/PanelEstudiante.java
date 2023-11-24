import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class PanelEstudiante extends JPanel {
	
	private JPanel panelDatos, panelListado;
	private JLabel lblCodigo, lblNombre, lblApellido, lblTitulo, lblPrograma;
	public JTextField txtCodigo, txtNombre,txtApellido;
	public JTextArea txtEstudiante;
	public JScrollPane scroll;
	
	public JComboBox<String>cmbPrograma;
	public ArchivoFacultad datosFac;
	ArrayList<String> combo;
	public ArchivoPrograma datosPro;
	
	public PanelEstudiante() {
		setSize(600,200);
    	setOpaque(false);
    	initComponents();
	}
	
	 public void initComponents() {
	    	lblCodigo = new JLabel("Codigo");
	    	lblNombre = new JLabel("Nombre");
	    	lblNombre = new JLabel("Apellido");
	    	lblPrograma = new JLabel("Programa");
	    	lblTitulo = new JLabel("Registro Estudiantes",SwingConstants.CENTER);
	    	lblTitulo.setFont(new Font("Curier",Font.BOLD+Font.ITALIC,16));
	    	
	    	txtCodigo = new JTextField();
	    	txtNombre = new JTextField();
	    	txtApellido = new JTextField();
	    	txtEstudiante = new JTextArea();
	    	scroll = new JScrollPane();
	    	scroll.setViewportView(txtEstudiante);
	    	
	    	 datosPro = new ArchivoPrograma();
		        datosPro.abrirLectura();
		    	combo = new ArrayList<String>();
		    	cmbPrograma= new  JComboBox<String>();
		    	cmbPrograma.removeAllItems();
		    
		    	combo = datosPro.cargarDatos();
		    	
		    	for(String iterador : combo) {
		    		cmbPrograma.addItem(iterador);
		    	}
		    	
		    	datosPro.cerrar();
		    	
		    	panelDatos = new JPanel( new GridLayout(3,2,0,5));
		    	panelDatos.setOpaque(false);
		    	panelDatos.setPreferredSize(new Dimension(250,100));
		    	panelListado = new JPanel(new BorderLayout());
		    	
		    	panelDatos.add(lblCodigo);
		    	panelDatos.add(txtCodigo);
		    	panelDatos.add(lblNombre);
		    	panelDatos.add(txtNombre);
		    	panelDatos.add(lblApellido);
		    	panelDatos.add(txtApellido);
		    	panelDatos.add(lblPrograma);
		    	panelDatos.add(cmbPrograma);
		    	
		    	panelListado.add(scroll, BorderLayout.CENTER);
		    	
		    	setLayout(new BorderLayout());
		    	add(lblTitulo,BorderLayout.NORTH);
		    	add(panelDatos,BorderLayout.WEST);
		    	add(panelListado,BorderLayout.CENTER);	

		    	
	 }
	 
	  public void limpiar() {
	    	txtCodigo.setText("");
	    	txtNombre.setText("");
	    	txtApellido.setText("");
	    	txtEstudiante.setText("");
	    }

	    	
}
