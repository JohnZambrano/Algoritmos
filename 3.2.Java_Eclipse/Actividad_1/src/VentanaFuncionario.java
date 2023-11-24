import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;

public class VentanaFuncionario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFuncionario frame = new VentanaFuncionario();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaFuncionario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaFuncionario.class.getResource("/ImagenesAct/Icono.png")));
		setTitle("Calculo del salario de funcionarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 652);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 11, 862, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btnDocentes = new JButton("Docentes");
		btnDocentes.setIcon(new ImageIcon(VentanaFuncionario.class.getResource("/ImagenesAct/Docente.png")));
		btnDocentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TiposProfesores vTiposProfesores = new TiposProfesores();
				vTiposProfesores.setVisible(true);
				vTiposProfesores.setLocationRelativeTo(null);
			}
		});
		btnDocentes.setBounds(10, 11, 174, 66);
		panel.add(btnDocentes);
		
		JButton btnAcercaDe = new JButton("Acerca De");
		btnAcercaDe.setIcon(new ImageIcon(VentanaFuncionario.class.getResource("/ImagenesAct/Acerca de.png")));
		btnAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vAcercaDe acerca = new vAcercaDe();
				acerca.setVisible(true);
				acerca.setLocationRelativeTo(null);
				
				
			}
		});
		btnAcercaDe.setBounds(194, 11, 185, 66);
		panel.add(btnAcercaDe);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(VentanaFuncionario.class.getResource("/ImagenesAct/Salir11.png")));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(389, 11, 185, 66);
		panel.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon(VentanaFuncionario.class.getResource("/ImagenesAct/fondo.png")));
		lblNewLabel.setBounds(10, 110, 894, 490);
		contentPane.add(lblNewLabel);
		
		
	}
}
