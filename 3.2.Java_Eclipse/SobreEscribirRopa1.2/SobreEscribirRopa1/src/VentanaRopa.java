import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class VentanaRopa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRopa frame = new VentanaRopa();
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
	public VentanaRopa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaRopa.class.getResource("/ImagenesRopa/calcetines48.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 620);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(20, 11, 997, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JDesktopPane escritorio = new JDesktopPane();
		escritorio.setBounds(20, 95, 997, 475);
		contentPane.add(escritorio);
		escritorio.setLayout(null);
						
		JButton btnCamisetas = new JButton("Camisetas");
		btnCamisetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCamisetas vCamisetas = new VentanaCamisetas();
				escritorio.add(vCamisetas);
				vCamisetas.reshape(0, 0, 840, 500);
				vCamisetas.show();
			}
		});
		
		btnCamisetas.setIcon(new ImageIcon(VentanaRopa.class.getResource("/ImagenesRopa/camiseta48.png")));
		btnCamisetas.setBounds(10, 11, 158, 50);
		panel.add(btnCamisetas);
		
		JButton btnPantalones = new JButton("Pantalones");
		btnPantalones.setIcon(new ImageIcon(VentanaRopa.class.getResource("/ImagenesRopa/pantalon48.png")));
		btnPantalones.setBounds(211, 11, 173, 50);
		panel.add(btnPantalones);
		
		JButton btnCalcetines = new JButton("Calcetines");
		btnCalcetines.setIcon(new ImageIcon(VentanaRopa.class.getResource("/ImagenesRopa/calcetines48.png")));
		btnCalcetines.setBounds(419, 11, 158, 50);
		panel.add(btnCalcetines);
		
		JButton btnAcerca = new JButton("Acerca de");
		btnAcerca.setIcon(new ImageIcon(VentanaRopa.class.getResource("/ImagenesRopa/info.png")));
		btnAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnAcerca.setBounds(608, 11, 137, 50);
		panel.add(btnAcerca);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(VentanaRopa.class.getResource("/ImagenesRopa/exit.png")));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(778, 11, 147, 50);
		panel.add(btnSalir);
		
		
	}
}
