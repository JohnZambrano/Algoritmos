import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
	
	private JTabbedPane fichas;
	
	private PanelFacultad vFacultad;
	private PanelPrograma vPrograma;
	private PanelEstudiante vEstudiante;
	
	private JToolBar  barra;
	private JButton botones[];
	private String nombre[] = {"nuevo.png","disquete.png","buscar.png","listado.png","salir.png"};
	private ImageIcon imagen[];
	
	private JLabel lblTitulo;
	private ArchivoFacultad registroFac;
	private ArchivoPrograma registroPro;
	
	public Principal() {
		setTitle("Archivo Academico");
		setSize(600,250);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	initComponents();
	}
	
	public void initComponents(){
		
		registroFac = new ArchivoFacultad();
		registroPro = new ArchivoPrograma();
		
		lblTitulo = new  JLabel("Registro Academico ", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Curier",Font.BOLD+Font.ITALIC,16));
		
		fichas = new JTabbedPane();
		fichas.setBackground(new Color(179,65,128));
		
		vFacultad = new PanelFacultad();
		vPrograma = new PanelPrograma();
		vEstudiante = new PanelEstudiante();
		
		botones= new JButton[5];
		imagen = new ImageIcon[5];
		barra = new JToolBar();
		for(int i = 0; i < botones.length; i++) {
			botones[i] = new JButton();
			imagen[i] = new ImageIcon(java.security.Principal.class.getResource("Imagenes /"+nombre[i]));
			botones[i].setIcon(imagen[i]);
			botones[i].addActionListener(this);
			barra.add(botones[i]);
		}
		
		fichas.add("Facultades ", vFacultad);//0
		fichas.add("Programas ", vPrograma );//1
		fichas.add("Estudiantes", vEstudiante);//2
		
		Container contenedor = getContentPane();
		contenedor.setBackground(new Color(227, 107, 174));
		contenedor.setLayout(new BorderLayout());
		
		contenedor.add(lblTitulo, BorderLayout.NORTH);
		contenedor.add(fichas, BorderLayout.CENTER);
		contenedor.add(barra, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new Principal().setVisible(true);
  
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == botones[0])
			nuevo();
		if(e.getSource() == botones[1])
			guardar();
		if(e.getSource() == botones[2])
			buscar();
		if(e.getSource() == botones[3])
			reporte();
		if(e.getSource() == botones[4])
			System.exit(0);
		
	}
	public void nuevo() {
		switch(fichas.getSelectedIndex()) {
		case 0:
			vFacultad.limpiar();
			break;
			
		case 1:
			vPrograma.limpiar();
			break;
		}
		
		
		
	}
	
	public void guardar() {
		switch(fichas.getSelectedIndex()) {
		case 0:
			Facultad nuevo = new Facultad();
			nuevo.setCodigo(vFacultad.txtCodigo.getText());
			nuevo.setNombre(vFacultad.txtNombre.getText());
			registroFac.abrirLectura();
			if(!registroFac.validar(nuevo.getCodigo())) {
				registroFac.abrirEscritura();
				registroFac.agregar(nuevo);
			}
			else
			JOptionPane.showMessageDialog(null, "Código de Facultad ya existe","Registro Académico",JOptionPane.ERROR_MESSAGE);	
			registroFac.cerrar();
			break;
		case 1:
			Programa nuevoP = new Programa();
			nuevoP.setCodigo(vPrograma.txtCodigo.getText());
			nuevoP.setNombre(vPrograma.txtCodigo.getText());
			nuevoP.setFacultad(vPrograma.cmbFacultad.getSelectedItem().toString());
			registroPro.abrirEscritura();
			registroPro.agregar(nuevoP);
			registroPro.cerrar();
			break;
			
		
	  }
	      }
	
	public void buscar() {
		switch(fichas.getSelectedIndex()) {
		case 0:
			String resultado = "";
			vFacultad.txtFacultad.setText("");
			registroFac.abrirLectura();
			resultado = registroFac.buscar(vFacultad.txtCodigo.getText());
			vFacultad.txtFacultad.append(resultado);
			registroFac.cerrar();
			break;
			
		case 1:
			String resultadoP = "";
			vPrograma.txtPrograma.setText("");
			registroPro.abrirLectura();
			resultadoP = registroPro.buscar(vPrograma.txtCodigo.getText());
			vPrograma.txtPrograma.append(resultadoP);
			registroFac.cerrar();
			break;
		}
			}
	
	public void reporte() {
		switch(fichas.getSelectedIndex()) {
		case 0:
			String resultado = "";
			vFacultad.txtFacultad.setText("");
			registroFac.abrirLectura();
			resultado = registroFac.listado();
			vFacultad.txtFacultad.append(resultado);
			registroFac.cerrar();
			break;
			
		case 1:
			String resultadoP = "";
			vPrograma.txtPrograma.setText("");
			registroPro.abrirLectura();
			resultadoP = registroPro.listado();
			registroPro.cerrar();
			break;
		}
			}

	

}
