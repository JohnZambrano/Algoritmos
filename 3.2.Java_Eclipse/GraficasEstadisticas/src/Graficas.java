import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graficas extends JFrame {

	private JPanel contentPane;
	private JTextField txtUno;
	private JTextField txtDos;
	private JTextField txtTres;
	private final ButtonGroup grpGrafico = new ButtonGroup();
	private boolean inicio = false;
	private int tipo = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graficas frame = new Graficas();
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
	public Graficas() {
		setTitle("Graficos Estadisticos");
		setBackground(new Color(100, 100, 550, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCandidato1 = new JLabel("Candidato 1");
		lblCandidato1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCandidato1.setBounds(10, 251, 105, 14);
		contentPane.add(lblCandidato1);
		
		JLabel lblCandidato2 = new JLabel("Candidato 2");
		lblCandidato2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCandidato2.setBounds(10, 282, 105, 14);
		contentPane.add(lblCandidato2);
		
		JLabel lblCandidato3 = new JLabel("Candidato 3");
		lblCandidato3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCandidato3.setBounds(10, 313, 105, 14);
		contentPane.add(lblCandidato3);
		
		txtUno = new JTextField();
		txtUno.setBounds(125, 249, 86, 20);
		contentPane.add(txtUno);
		txtUno.setColumns(10);
		
		txtDos = new JTextField();
		txtDos.setColumns(10);
		txtDos.setBounds(125, 280, 86, 20);
		contentPane.add(txtDos);
		
		txtTres = new JTextField();
		txtTres.setColumns(10);
		txtTres.setBounds(125, 311, 86, 20);
		contentPane.add(txtTres);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Tipos de Gr\u00E1fico", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(248, 266, 326, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton optCircular = new JRadioButton("Circular");
		optCircular.addActionListener(new ActionListener() {
			//---------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				inicio = true;
				tipo = 1;
				repaint();
			}
		});
		grpGrafico.add(optCircular);
		optCircular.setBounds(6, 20, 85, 23);
		panel.add(optCircular);
		
		JRadioButton optBarras = new JRadioButton("Barras");
		optBarras.addActionListener(new ActionListener() {
			//-------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				inicio = true;
				tipo = 2;
				repaint();
			}
		});
		grpGrafico.add(optBarras);
		optBarras.setBounds(111, 20, 85, 23);
		panel.add(optBarras);
		
		JRadioButton optPorcentaje = new JRadioButton("Porcentaje");
		optPorcentaje.addActionListener(new ActionListener() {
			//---------------------------------------------------
		
			public void actionPerformed(ActionEvent arg0) {
				inicio = true;
				tipo = 3;
				repaint();
				
			}
		});
		grpGrafico.add(optPorcentaje);
		optPorcentaje.setBounds(219, 20, 85, 23);
		panel.add(optPorcentaje);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		if(inicio) {
			int largo1;
			int largo2;
			int largo3;
			int candidato1 = 0;
			int candidato2 = 0;
			int candidato3 = 0;
			try {
				candidato1 = Integer.parseInt(txtUno.getText());
				candidato2 = Integer.parseInt(txtDos.getText());
				candidato3 = Integer.parseInt(txtTres.getText());
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(this,"Ingrese números enteros "+ex.getMessage(),"Graficos Estadisticos",JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			int totalVotos= candidato1 + candidato2 + candidato3;
			int porc1 = candidato1 * 100 / totalVotos;
			int porc2 = candidato2 * 100 / totalVotos;
			int porc3 = candidato3 * 100 / totalVotos;
			switch(tipo) {
			case 1:
				int grados1 = candidato1 * 360 / totalVotos;
				int grados2 = candidato2 * 360 / totalVotos;
				int grados3 = candidato3 * 360 / totalVotos;
			
				g.setColor(Color.RED);
				g.fillArc(25, 80, 200, 200, 0,grados1);
				//x,y,ancho,alto,anguloInicial, anguloFinal
				g.fillRect(250, 120, 20, 20);
				g.drawString("Candidato 1 "+ porc1 + "%",275,135);
				
				g.setColor(Color.BLUE);
				g.fillArc(25, 80, 200, 200, grados1, grados2 );
				//x,y,ancho,alto,anguloInicial, anguloFinal
				g.fillRect(250, 150, 20, 20);
				g.drawString("Candidato 2 "+porc2 + "%", 275, 165);
				
				g.setColor(Color.GREEN);
				g.fillArc(25, 80, 200, 200, grados1 + grados2, grados3);
				//x,y,ancho,alto,anguloInicial, anguloFinal
				g.fillRect(250, 180, 20, 20);
				g.drawString("Candidato 3" + porc3 + "%",275 ,195);
				break;
				
			case 2:
				int mayor = retornoMayor(candidato1, candidato2, candidato3);
				largo1 = candidato1 * 400 /mayor;
				largo2 = candidato2 * 400 /mayor;
				largo3 = candidato3 * 400 /mayor;
				
				g.setColor(Color.RED);
				g.fillRect(100,50,largo1,40);
				g.drawString("Candidato 1 ", 10, 70);
				g.drawString(porc1 + "%", largo1 + 100, 70);
				
				g.setColor(Color.BLUE);
				g.fillRect(100,100,largo2,40);
				g.drawString("Candidato 2 ", 10, 120);
				g.drawString(porc2 + "%", largo2 + 100, 120);
				
				g.setColor(Color.GREEN);
				g.fillRect(100,150,largo3,40);
				g.drawString("Candidato 3 ", 10, 170);
				g.drawString(porc3 + "%", largo3 + 100, 170);
				
				break;
				
			case 3:
				largo1 = candidato1 * 400 /totalVotos;
				largo2 = candidato2 * 400 /totalVotos;
				largo3 = candidato3 * 400 /totalVotos;
				
				g.setColor(Color.RED);
				g.fillRect(50, 150, largo1, 50);
				g.drawString("Candidato 1",55, 140 );
				g.setColor(Color.WHITE);
				g.drawString(porc1 + "%", 55, 170);
				
				g.setColor(Color.BLUE);
				g.fillRect(50 +largo1, 150,largo2, 50);
				g.drawString("Candidato 2",55 + largo1, 210 );
				g.setColor(Color.WHITE);
				g.drawString(porc2 + "%", 55 + largo1, 170);
				
				g.setColor(Color.GREEN);
				g.fillRect(50 + largo1 + largo2, 150, largo3, 50);
				g.drawString("Candidato 3",55 + largo1 + largo2,140 );
				g.setColor(Color.WHITE);
				g.drawString(porc3 + "%", 55 + largo1 + largo2, 170);
				
				break;
				
			}
		}
	}
	private int retornoMayor(int c1, int c2, int c3) {
		if(c1 > c2 && c1 > c3)
			return c1;
		else
			if(c2 > c3)
				return c2;
			else
				return c3;
	}
}
