import java.awt.*;
import javax.swing.*;

public class PanelFacultad extends JPanel {
    private JPanel panelDatos, panelListado;
    private JLabel lblCodigo;
	public JLabel lblNombre;
	public JLabel lblTitulo;
    public JTextField txtCodigo, txtNombre;
    public JTextArea txtFacultad;
    public JScrollPane scroll;
    
    public PanelFacultad() {
    	setSize(600,200);
    	setOpaque(false);
    	initComponents();
    }
    
    public void initComponents() {
    	lblCodigo = new JLabel("Codigo");
    	lblNombre = new JLabel("Nombre");
    	lblTitulo = new JLabel("RegistroFacultades",SwingConstants.CENTER);
    	lblTitulo.setFont(new Font("Curier",Font.BOLD+Font.ITALIC,16));
    	
    	txtCodigo = new JTextField();
    	txtNombre = new JTextField();
    	txtFacultad = new JTextArea();
    	scroll = new JScrollPane();
    	scroll.setViewportView(txtFacultad);
    	
    	panelDatos = new JPanel( new GridLayout(2,2,0,5));
    	panelDatos.setOpaque(false);
    	panelDatos.setPreferredSize(new Dimension(250,100));
    	panelListado = new JPanel(new BorderLayout());
    	
    	panelDatos.add(lblCodigo);
    	panelDatos.add(txtCodigo);
    	panelDatos.add(lblNombre);
    	panelDatos.add(txtNombre);
    	
    	panelListado.add(scroll, BorderLayout.CENTER);
    	
    	setLayout(new BorderLayout());
    	add(lblTitulo,BorderLayout.NORTH);
    	add(panelDatos,BorderLayout.WEST);
    	add(panelListado,BorderLayout.CENTER);
    	
    }
    
    public void limpiar() {
    	txtCodigo.setText("");
    	txtNombre.setText("");
    	txtFacultad.setText("");
    }
}
