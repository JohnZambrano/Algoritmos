package Traduccion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

    public class VentanaIngresoPalabra extends JFrame  {
	
	public JButton getBtnSeguir() {
			return btnSeguir;
		}

	public void setBtnSeguir(JButton btnSeguir) {
			this.btnSeguir = btnSeguir;
		}

	public HashMap<String, String> getMapaPalabras() {
		return mapaPalabras;
	}

	public void setMapaPalabras(HashMap<String, String> mapaPalabras) {
		this.mapaPalabras = mapaPalabras;
	}

	private JLabel lblEspañol;
	private JLabel lblIngles;
            
	
	private String[] columnas = {" Español ", " Inglés "};
	
	private Object[][] datos = new Object[0][2];
	
	private JTextField txtEspañol, txtIngles;
	
	
	private JButton btnNueva, btnGrabar, btnSeguir;
	
	private JPanel pEntradaPalabras, pTabla, pBotones;
	
	private JTable tabla;
	private DefaultTableModel tablaPalabras;
	
	private AccionNueva eventoNueva;
	private AccionGrabar eventoGrabar;
	
	
	
	
	HashMap<String, String > mapaPalabras = new HashMap<String, String>();
	
	
	public VentanaIngresoPalabra() {
		setSize(450,400);
		setTitle("Ingreso Palabras Español-Inglés");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	private void initComponents() {
		
		
		
		lblEspañol = new JLabel("Español");
		lblEspañol.setFont(new Font("Arial", Font.BOLD, 14));
	    lblIngles = new JLabel("Ingles");
	    lblIngles.setFont(new Font("Arial", Font.BOLD, 14));
	    
		txtEspañol = new JTextField();
		txtEspañol.setFont(new Font("Arial", Font.PLAIN, 14));
		txtEspañol.addKeyListener(new KeyListener() {
		
		public void keyTyped(KeyEvent e) {
			char caracter = e. getKeyChar();
		    if(Character.isLowerCase(caracter)){
		       e.setKeyChar(Character.toUpperCase(caracter));
		    }
		}
		public void keyReleased(KeyEvent e) {}
		public void keyPressed(KeyEvent e) {}
	    });
        
		txtIngles = new JTextField();
		txtIngles.setFont(new Font("Arial", Font.PLAIN, 14));
		txtIngles.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e. getKeyChar();
			    if(Character.isLowerCase(caracter)){
			       e.setKeyChar(Character.toUpperCase(caracter));
			    }		
			}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
		});
		
		btnNueva = new JButton("Nueva");
		eventoNueva = new AccionNueva();
		btnNueva.setFont(new Font("Arial", Font.BOLD, 14));
		btnNueva.addActionListener(eventoNueva);
		
		btnGrabar = new JButton("Grabar");
		eventoGrabar = new AccionGrabar();
		btnGrabar.setFont(new Font("Arial", Font.BOLD, 14));
		btnGrabar.addActionListener(eventoGrabar);
		
		btnSeguir = new JButton("Seguir");
	;
		btnSeguir.setFont(new Font("Arial", Font.BOLD, 14));
		
		
		pEntradaPalabras = new JPanel();
		pTabla= new JPanel();
		pBotones= new JPanel();
		
		pEntradaPalabras.setLayout(new GridLayout(2,34,2,5));
		pEntradaPalabras.add(lblEspañol);
		pEntradaPalabras.add(txtEspañol);
		pEntradaPalabras.add(lblIngles);
		pEntradaPalabras.add(txtIngles);
		
		pBotones.setLayout(new GridLayout(1,1,8,5));
		pBotones.add(btnNueva);
		pBotones.add(btnGrabar);
		pBotones.add(btnSeguir);
		pTabla.setLayout(new BorderLayout());
		
		tablaPalabras = new DefaultTableModel(datos, columnas);
		tabla = new JTable(tablaPalabras);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(40, 40,400,200);
	
		Container contenedor = getContentPane();
		setContentPane(contenedor);
		contenedor.setLayout(new BorderLayout());
		
		contenedor.add(pEntradaPalabras, BorderLayout.NORTH);
		contenedor.add(pTabla, BorderLayout.CENTER);
		contenedor.add(pBotones, BorderLayout.SOUTH);
		
		contenedor.add(scrollPane);
		
	}
	
	
	private class AccionNueva implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			txtEspañol.setText("");
			txtIngles.setText("");
		}
	}
	
	private class AccionGrabar implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		     Palabra registro = new Palabra(txtEspañol.getText(),
		     txtIngles.getText());
		     mapaPalabras.put(registro.getPalabraEspañol(), registro.getPalabraIngles());
		     
		     Object[] dato = {registro.getPalabraIngles(),registro.getPalabraEspañol()};
		     tablaPalabras.addRow(dato);			
		}
	}
	
	
	
	
	
	
}
