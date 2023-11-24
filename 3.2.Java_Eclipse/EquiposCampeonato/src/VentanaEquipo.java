import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class VentanaEquipo extends JFrame {
	
	private JLabel[] etiquetas = new JLabel[7];
	private String[] titulos = {" Registro de Equipos Campeonato",
			"Equipo", "Partidos Ganados", "Partidos Empatados",
			" Partidos Perdidos", "Puntos", "0"
			};
	
	private String[] columnas = {"Equipo", "P.Ganados", "P. Empatados", "P. Perdidos", "Puntos"};
	
	private Object[][] datos = new Object[0][5];
	
	
	private JTextField txtNombre, txtPGanados, txtPEmpatados, txtPPerdidos;
	
	private JButton btnGuardar, btnCampeon, btnSalir;
	
	private JPanel pEquipos, pBotones,pTabla;
	
	private JTable listado;
	private DefaultTableModel dtm;
	
	private ArrayList<Equipos> arreglo = new ArrayList<Equipos>();
	private Equipos registro;
	
	private AccionGuardar eventoGuardar;
	private VentanaEquipo.AccionCampeon eventoCampeon;
	private AccionSalir eventoSalir;
	
	
	public VentanaEquipo() {
		setSize(800,250);
		setTitle("Campeonato Balon Feliz");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		
	}
	
	private void  initComponents() {
		for(int i = 0; i < etiquetas.length; i++) {
			etiquetas[i] = new JLabel(titulos[i]);
		}
		
		txtNombre = new JTextField(8);
		txtPGanados = new JTextField(8);
		txtPEmpatados= new JTextField(8);
		txtPPerdidos = new JTextField(8);
		
		btnGuardar = new JButton("Guardar");
		eventoGuardar = new AccionGuardar();
		btnGuardar.addActionListener(eventoGuardar);
		
		btnCampeon = new JButton("Campeon");
		eventoCampeon = new AccionCampeon();
		btnCampeon.addActionListener(eventoCampeon);
		
		btnSalir = new JButton("Salir");
		eventoSalir = new AccionSalir();
		btnSalir.addActionListener(eventoSalir);
		
		pEquipos = new JPanel();
		pBotones = new JPanel();
		pTabla = new JPanel();
		
		pEquipos.setLayout(new GridLayout(5,2,7,7));
		pEquipos.add(etiquetas[1]);
		pEquipos.add(txtNombre);
		pEquipos.add(etiquetas[2]);
		pEquipos.add(txtPGanados);
		pEquipos.add(etiquetas[3]);
		pEquipos.add(txtPEmpatados);
		pEquipos.add(etiquetas[4]);
		pEquipos.add(txtPPerdidos);
		pEquipos.add(etiquetas[5]);
		pEquipos.add(etiquetas[6]);
		
		pBotones.setLayout(new FlowLayout());
		pBotones.add(btnGuardar);
		pBotones.add(btnCampeon);
		pBotones.add(btnSalir);
		
		pTabla.setLayout(new BorderLayout());
		dtm = new DefaultTableModel(datos, columnas);
		listado = new JTable(dtm);
		listado.setPreferredScrollableViewportSize(new Dimension(450,100));
		JScrollPane scrollPane = new JScrollPane(listado);
		pTabla.add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(listado);
		
		Container contenedor = getContentPane();
		setContentPane(contenedor);
		contenedor.setLayout(new BorderLayout());
		
		contenedor.add(etiquetas[0], BorderLayout.NORTH);
		contenedor.add(pEquipos, BorderLayout.CENTER);
		contenedor.add(pBotones, BorderLayout.SOUTH);
		contenedor.add(pTabla, BorderLayout.EAST);
	}
	
	private class AccionGuardar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
			registro = new Equipos(txtNombre.getText(),
					  Integer.parseInt(txtPGanados.getText()),
                      Integer.parseInt(txtPPerdidos.getText()),
                      Integer.parseInt(txtPEmpatados.getText()));      
			registro.setPuntos();
			etiquetas[6].setText(registro.getPuntos()+"");
			arreglo.add(registro);
		    JOptionPane.showMessageDialog(getContentPane(), "Equipo registrado Exitosamente",
		    		"Campeonato Balón Feliz", JOptionPane.INFORMATION_MESSAGE);
		    Object[] dato = {registro.getNombre(), registro.getpGanados(), registro.getpEmpatados(),
		    		         registro.getpPerdidos(), registro.getPuntos()  };
		    dtm.addRow(dato);
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(getContentPane(), "Error en el registro\n"+ex.getMessage(),
						"Campeonato Balon Feliz", JOptionPane.ERROR_MESSAGE);
			}
			
		}
	}
	
	private class AccionCampeon implements ActionListener{
		int mayor = 0;
		String nombre = "";
		public void actionPerformed(ActionEvent e) {
			Iterator<Equipos> recorrer = arreglo.iterator();
			while(recorrer.hasNext()) {
				registro = recorrer.next();
				if(registro.getPuntos()>mayor) {
				   mayor = registro.getPuntos();
				   nombre = registro.getNombre();
				}//fin if
			}//fin while
			JOptionPane.showMessageDialog(getContentPane(), "El equipo campeon es "+nombre,"Campeon Balón Feliz",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private class AccionSalir implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int res = JOptionPane.showConfirmDialog(getContentPane(), "¿Finalizar la Aplicación?","Campeon Balón Feliz",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(res == 0) {
				System.exit(NORMAL);
			}
				
		}
	}
	
	

	public static void main(String[] args) {
		new VentanaEquipo().setVisible(true);

	}

}
