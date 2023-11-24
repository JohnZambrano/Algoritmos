
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rectangulo extends JFrame {
	private JLabel lblAlto,lblAncho,lblPerimetro,lblArea,
	lblRPerimetro,lblRArea;
	
	private  JTextField txtAlto,txtAncho;
	
	private JButton btnCalcular, btnSalir;
	
	private AccionCalcular eventoCalcular;
	private AccionSalir eventoSalir;
	
	
	//Constructor
	public Rectangulo() {
		setSize(380,250);
		setTitle("Perimetro y Área del Rectángulo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	private  void initComponents() {
		lblAlto = new JLabel("Alto del rectangulo",SwingConstants.RIGHT);
		lblAncho = new JLabel("Ancho del rectangulo",SwingConstants.RIGHT);
		lblArea = new JLabel("Área =",SwingConstants.RIGHT);
		lblPerimetro = new JLabel("Perimetro =",SwingConstants.RIGHT);
		lblRArea = new JLabel("0,0",SwingConstants.RIGHT);
		lblRPerimetro = new JLabel("0,0",SwingConstants.RIGHT);
	
	
	txtAlto = new JTextField(10);
	txtAncho = new JTextField(10);
	
	btnCalcular =new JButton("Calcular");
	eventoCalcular = new AccionCalcular();
	btnCalcular.addActionListener(eventoCalcular);
	
	btnSalir = new JButton("Salir");
	eventoSalir = new AccionSalir();
	btnSalir.addActionListener(eventoSalir);
	
	Container contenedor = getContentPane();
	setContentPane(contenedor);
	contenedor.setLayout(new GridLayout(5,2,5,7) );
	
	contenedor.add(lblAlto);
	contenedor.add(txtAlto);
	contenedor.add(lblAncho);
	contenedor.add(txtAncho);
	contenedor.add(lblPerimetro);
	contenedor.add(lblRPerimetro);
	contenedor.add(lblArea);
	contenedor.add(lblRArea);
	contenedor.add(btnCalcular);
	contenedor.add(btnSalir);
	
	
	}
	
	private class AccionCalcular implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
			double alto = Double.parseDouble(txtAlto.getText());
			double ancho = Double.parseDouble(txtAncho.getText());
			double area = alto*ancho;
			double perimetro = 2*(alto + ancho);
			lblRArea.setText("" + area);
			lblRPerimetro.setText("" + perimetro);
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(getContentPane(), "Error en el ingreso de Datos \n"+ ex.getMessage(),
						"Operaciones Rectángulo", JOptionPane.ERROR_MESSAGE);
			}
			
		}
	}
	
	private class AccionSalir implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int res = JOptionPane.showConfirmDialog(getContentPane(), "¿Finalizar la Aplicación?","Operaciones Rectangulo",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(res == 0) {
				System.exit(NORMAL);
			}
				
		}
	}
	
	public static void main(String[] arg) {
		new Rectangulo().setVisible(true);
		
	}
	
	

}
