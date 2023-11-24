import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaGraficas extends JFrame {

	private JPanel contentPane;
	Color elegido;
	CirculoGrafico circulo;
	RectanguloGrafico rectangulo;
	private JTextField txtX1;
	private JTextField txtY1;
	private JTextField txtX2;
	private JTextField txtY2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGraficas frame = new VentanaGraficas();
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
	public VentanaGraficas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaGraficas.class.getResource("/imagenes/pencil.png")));
		setTitle("Dibujar rectangulos y circulos");
		setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(31, 23, 747, 189);
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Opciones de dibujo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chkCirculo = new JCheckBox("Circulo");
		chkCirculo.setBounds(17, 25, 81, 23);
		panel_1.add(chkCirculo);
		
		JCheckBox chkRectangulo = new JCheckBox("Rectangulo");
		chkRectangulo.setBounds(17, 54, 81, 23);
		panel_1.add(chkRectangulo);
		
		Label lblCirculo = new Label("");
		lblCirculo.setBackground(new Color(64, 224, 208));
		lblCirculo.setBounds(17, 113, 335, 22);
		panel_1.add(lblCirculo);
		
		Label lblRectangulo = new Label("");
		lblRectangulo.setBackground(new Color(64, 224, 208));
		lblRectangulo.setBounds(17, 144, 335, 22);
		panel_1.add(lblRectangulo);
		
		txtX1 = new JTextField();
		txtX1.setBounds(114, 55, 52, 20);
		panel_1.add(txtX1);
		txtX1.setColumns(10);
		
		txtY1 = new JTextField();
		txtY1.setColumns(10);
		txtY1.setBounds(176, 55, 52, 20);
		panel_1.add(txtY1);
		
		txtX2 = new JTextField();
		txtX2.setColumns(10);
		txtX2.setBounds(238, 55, 52, 20);
		panel_1.add(txtX2);
		
		txtY2 = new JTextField();
		txtY2.setColumns(10);
		txtY2.setBounds(300, 55, 52, 20);
		panel_1.add(txtY2);
		
		JLabel lblNewLabel = new JLabel("X1");
		lblNewLabel.setBounds(114, 29, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblY = new JLabel("Y1");
		lblY.setBounds(176, 29, 46, 14);
		panel_1.add(lblY);
		
		JLabel lblX = new JLabel("X2(radio)");
		lblX.setBounds(238, 29, 59, 14);
		panel_1.add(lblX);
		
		JLabel lblY_1 = new JLabel("Y2");
		lblY_1.setBounds(300, 29, 46, 14);
		panel_1.add(lblY_1);
		
		JPanel PanelDibujo = new JPanel();
		PanelDibujo.setBounds(31, 223, 747, 317);
		PanelDibujo.setBackground(new Color(255, 255, 255));
		PanelDibujo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.add(PanelDibujo);
		
		JButton btnDibujar = new JButton("Dibujar");
		btnDibujar.addActionListener(new ActionListener() {
			//----------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				int x1,x2,y1,y2;
				x1=Integer.parseInt(txtX1.getText());
				x2=Integer.parseInt(txtX2.getText());
				y1=Integer.parseInt(txtY1.getText());
				y2=Integer.parseInt(txtY2.getText());
				if(chkCirculo.isSelected()) {
					circulo = new CirculoGrafico(x1,y1,x2,elegido);
					circulo.dibujar(PanelDibujo);
				}
				if(chkRectangulo.isSelected()) {
					rectangulo = new RectanguloGrafico(x1,y1,x2,y2,elegido);
					rectangulo.dibujar(PanelDibujo);
				}
			}
		});
		btnDibujar.setBackground(new Color(127, 255, 212));
		btnDibujar.setIcon(new ImageIcon(VentanaGraficas.class.getResource("/imagenes/pencil.png")));
		btnDibujar.setBounds(387, 37, 141, 54);
		panel_1.add(btnDibujar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			//---------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				Graphics grafico = PanelDibujo.getGraphics();
				grafico.create();
				grafico.clearRect(0, 0, 750, 400);
			}
		});
		btnLimpiar.setBackground(new Color(127, 255, 212));
		btnLimpiar.setIcon(new ImageIcon(VentanaGraficas.class.getResource("/imagenes/eraser1.png")));
		btnLimpiar.setBounds(387, 112, 141, 54);
		panel_1.add(btnLimpiar);
		
		JButton btnColores = new JButton("Colores");
		btnColores.addActionListener(new ActionListener() {
			//--------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
		        elegido = JColorChooser.showDialog(null, "Elija el color",Color.PINK);
			}
		});
		btnColores.setBackground(new Color(127, 255, 212));
		btnColores.setIcon(new ImageIcon(VentanaGraficas.class.getResource("/imagenes/colors.png")));
		btnColores.setBounds(564, 37, 141, 54);
		panel_1.add(btnColores);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(127, 255, 212));
		btnCalcular.setIcon(new ImageIcon(VentanaGraficas.class.getResource("/imagenes/calculator_full.png")));
		btnCalcular.setBounds(564, 112, 141, 54);
		panel_1.add(btnCalcular);
		
		
	}
}
