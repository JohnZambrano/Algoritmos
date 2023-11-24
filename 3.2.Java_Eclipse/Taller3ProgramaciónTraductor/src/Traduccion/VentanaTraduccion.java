package Traduccion;

import javax.swing.*;
import java.util.HashMap.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class VentanaTraduccion extends JFrame{
	
    private JLabel lblPalabra, lblTraduccion, lblTraducida;
    
    private JTextField txtPalabra;
    
    private JButton btnNueva, btnSalir;
    
    private JPanel panelVentana;
    
    private AccionNueva eventoNueva;
    private AccionSalir eventoSalir;
    
    private JRadioButton optEspañol, optIngles;
   
    private final ButtonGroup btgIdioma = new ButtonGroup();
    
    
   

	public VentanaTraduccion() {
		setBounds(100,100,450,300);
		setTitle("Traductor Sencillo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panelVentana = new JPanel();
		setContentPane(panelVentana);
		panelVentana.setLayout(null);
		initComponents();
		
	}
	private void initComponents() {
		
		lblPalabra = new JLabel("Ingrese Palabra");
		lblPalabra.setBounds(10, 11, 126, 24);
		lblPalabra.setFont(new Font("Arial", Font.BOLD, 14));
		panelVentana.add(lblPalabra);
		
		txtPalabra= new JTextField();
		txtPalabra.setBounds(207,13,217,33);
		txtPalabra.setFont(new Font("Arial", Font.BOLD, 14));
        txtPalabra.addKeyListener(new KeyListener() {
    		
		public void keyTyped(KeyEvent e) {
			char caracter = e. getKeyChar();
		    if(Character.isLowerCase(caracter)){
		       e.setKeyChar(Character.toUpperCase(caracter));
		    }
		}
		public void keyReleased(KeyEvent e) {}
		public void keyPressed(KeyEvent e) {}
	    });
        panelVentana.add(txtPalabra);
        txtPalabra.setColumns(10);
        
       optIngles = new JRadioButton("Inglés");
       btgIdioma.add(optIngles);
       optIngles.setBounds(6,87,109,23);
       optIngles.setFont(new Font("Arial", Font.BOLD, 14));
       panelVentana.add(optIngles);
        
       optEspañol= new JRadioButton("Español");
       btgIdioma.add(optEspañol);
       optEspañol.setBounds(207,87,109,23);
       optEspañol.setFont(new Font("Arial", Font.BOLD, 14));
       panelVentana.add(optEspañol);
       
       lblTraduccion = new JLabel("Traducción ");
       lblTraduccion.setBounds(10, 150, 126, 24);
       lblTraduccion.setFont(new Font("Arial", Font.BOLD, 14));
       panelVentana.add(lblTraduccion);
       
	   lblTraducida = new JLabel(":");
	   lblTraducida.setFont(new Font("Arial", Font.BOLD, 14));
	   lblTraducida.addKeyListener(new KeyListener() {
		   public void keyTyped(KeyEvent e) {}
		   public void keyReleased(KeyEvent e) {}
		   public void keyPressed(KeyEvent e) {}   
		   
		   
	   });
	   lblTraducida.setBounds(207, 150, 205, 24);
	   panelVentana.add(lblTraducida);
        
		
		btnNueva = new JButton("Nueva");
		eventoNueva = new AccionNueva();
		btnNueva.addActionListener(eventoNueva);
		btnNueva.setBounds(10,216,89,34);
		btnNueva.setFont(new Font("Arial", Font.BOLD, 14));
		panelVentana.add(btnNueva);
		
		btnSalir = new JButton("Salir");
		eventoSalir = new AccionSalir();
		btnSalir.addActionListener(eventoSalir);
		btnSalir.setBounds(123,216,89,34);
		btnSalir.setFont(new Font("Arial", Font.BOLD, 14));
		panelVentana.add(btnSalir);
	
        
	}

	public JTextField getTxtPalabra() {
		return txtPalabra;
	}
	public void setTxtPalabra(JTextField txtPalabra) {
		this.txtPalabra = txtPalabra;
	}
	public JLabel getLblTraducida() {
		return lblTraducida;
	}
	public void setLblTraducida(JLabel lblTraducida) {
		this.lblTraducida = lblTraducida;
	}
	public JRadioButton getOptEspañol() {
		return optEspañol;
	}
	public void setOptEspañol(JRadioButton optEspañol) {
		this.optEspañol = optEspañol;
	}
	public JRadioButton getOptIngles() {
		return optIngles;
	}
	public void setOptIngles(JRadioButton optIngles) {
		this.optIngles = optIngles;
	}

	private class AccionNueva implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			txtPalabra.setText("");
		}
	}
	
	private class AccionSalir implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int res = JOptionPane.showConfirmDialog(getContentPane(), "¿Esta Seguro de Finalizar la Aplicación?","Finalizar la Aplicación",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(res == 0) {
				System.exit(NORMAL);
			}
		}
	}
	
	
	
    
}
