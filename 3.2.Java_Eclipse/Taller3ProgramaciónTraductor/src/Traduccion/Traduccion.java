package Traduccion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Traduccion {
	
	
	public static void main(String[] args) {
		//----------------------------
	 VentanaIngresoPalabra ventanaIngresoPalabra = new VentanaIngresoPalabra();
	 VentanaTraduccion ventanaTraduccion = new VentanaTraduccion();
	 ventanaIngresoPalabra.show();
	 ventanaIngresoPalabra.getBtnSeguir().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ventanaTraduccion.show();
			ventanaIngresoPalabra.dispose();
		}
	});
	 

	//--------- Setup RadioButtons ---------------------------------------------
	 ventanaTraduccion.getOptIngles().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!ventanaTraduccion.getTxtPalabra().getText().equals("")) {
				
				String palabraBuscar = ventanaTraduccion.getTxtPalabra().getText();
				HashMap<String,String> diccionario = ventanaIngresoPalabra.getMapaPalabras();
				
				for(Map.Entry<String,String> entry : diccionario.entrySet()) {
					if(palabraBuscar.equals(entry.getValue())) {
					    ventanaTraduccion.getLblTraducida().setText(entry.getKey());
					    return;
					}else {
						ventanaTraduccion.getLblTraducida().setText("Palabra no registrada");
						
					}
					
				}
				
				
			}else {
			     JOptionPane.showMessageDialog(null,"Ingresa palabra para buscar");
			}
			
		}
	});
	//--------------------------------------------------------------------------------
	 ventanaTraduccion.getOptEspañol().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!ventanaTraduccion.getTxtPalabra().getText().equals("")) {
					
					String palabraBuscar = ventanaTraduccion.getTxtPalabra().getText();
					HashMap<String,String> diccionario = ventanaIngresoPalabra.getMapaPalabras();
					
					for(Map.Entry<String,String> entry : diccionario.entrySet()) {
						if(palabraBuscar.equals(entry.getKey())) {
							ventanaTraduccion.getLblTraducida().setText(entry.getValue());
							return;
						}else {
							ventanaTraduccion.getLblTraducida().setText("Palabra no registrada");
						}
					}
					
					
				}else {
				     JOptionPane.showMessageDialog(null,"Ingresa palabra para buscar");
				}
				
			}
		});
	//---------------------------------------------------------------------------
	
	}
}
