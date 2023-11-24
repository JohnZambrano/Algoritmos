import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculo frame = new VentanaCalculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCalculo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Algoritmos\\ExcepcionesEcuaci\u00F3nCuadr\u00E1tica\\src\\ImagenesEcuaci\u00F3n\\Matem\u00E1tica2020-11-28 171835.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ax^2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(70, 81, 86, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("bx");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(229, 81, 61, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("c");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(407, 81, 69, 26);
		contentPane.add(lblNewLabel_3);
		
		txtA = new JTextField();
		txtA.setBounds(70, 118, 86, 36);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(219, 118, 95, 36);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(390, 118, 86, 36);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JLabel lblSolución = DefaultComponentFactory.getInstance().createTitle("Soluci\u00F3n");
		lblSolución.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblSolución.setBackground(new Color(255, 255, 255));
		lblSolución.setBounds(70, 204, 88, 26);
		contentPane.add(lblSolución);
		
		Label lblRaiz = new Label(":");
		lblRaiz.setBackground(new Color(255, 255, 255));
		lblRaiz.setBounds(164, 194, 217, 36);
		contentPane.add(lblRaiz);
		
		Label txtTitulo = new Label("              Soluci\u00F3n ecuaci\u00F3n cuadr\u00E1tica");
		txtTitulo.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 22));
		txtTitulo.setForeground(new Color(0, 0, 128));
		txtTitulo.setBackground(new Color(255, 255, 255));
		txtTitulo.setBounds(52, 24, 449, 36);
		contentPane.add(txtTitulo);
		
		Button btnCalcular = new Button("Calcular");
		btnCalcular.setForeground(new Color(0, 0, 139));
		btnCalcular.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnCalcular.setBackground(new Color(240, 255, 255));
		btnCalcular.addActionListener(new ActionListener() {
		//--------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
			try {
				double a = Double.parseDouble(txtA.getText());
				double b = Double.parseDouble(txtB.getText());
				double c = Double.parseDouble(txtC.getText());
				RaicesEcuacion calculo = new RaicesEcuacion(a,b,c);
				calculo.raices();
				lblRaiz.setText(calculo.escribir());
			}
			catch(IllegalArgumentException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Solución Ecuación Cuadrática",JOptionPane.ERROR_MESSAGE);
				txtA.requestFocus();
			}
			catch(ArithmeticException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Solución Ecuación Cuadrática",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnCalcular.setBounds(70, 272, 99, 36);
		contentPane.add(btnCalcular);
		
		Button btnLimpiar = new Button("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
		//-----------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				Component[] componentes = contentPane.getComponents();
				for(int i = 0; i < componentes.length; i++ ) {
					if(componentes[i] instanceof JTextField)
						((JTextField)componentes[i]).setText("");
				}
				lblRaiz.setText("");
			}
		});
		btnLimpiar.setForeground(new Color(0, 0, 139));
		btnLimpiar.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnLimpiar.setBackground(new Color(240, 255, 255));
		btnLimpiar.setBounds(219, 272, 95, 36);
		contentPane.add(btnLimpiar);
		
		Button btnTerminar = new Button("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
		//---------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de cerrar la aplicación?", "Solución Ecuación Cuadrática", 
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(respuesta == 0)
					System.exit(0);
			}
		});
		btnTerminar.setForeground(new Color(0, 0, 139));
		btnTerminar.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnTerminar.setBackground(new Color(240, 255, 255));
		btnTerminar.setBounds(366, 272, 95, 36);
		contentPane.add(btnTerminar);
	}
}
