import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Creditos extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Creditos dialog = new Creditos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Creditos() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Creditos.class.getResource("/Imagenes/Acerca de1.png")));
		setTitle("Acerca de");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(255, 255, 240));
		contentPanel.setBounds(0, 0, 434, 261);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Angie Gabriela L\u00F3pez Arias");
			lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			lblNewLabel.setBounds(49, 75, 257, 24);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("David Alejandro Rodr\u00EDguez Acosta");
			lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			lblNewLabel_1.setBounds(24, 110, 282, 24);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Daniel Sebasti\u00E1n Perez Vallejo");
			lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			lblNewLabel_2.setBounds(34, 145, 272, 24);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("John Jairo Zambrano Yela");
			lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			lblNewLabel_3.setBounds(45, 180, 261, 24);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Andr\u00E9s Felipe Vel\u00E1squez Araujo");
			lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			lblNewLabel_4.setBounds(34, 215, 272, 24);
			contentPanel.add(lblNewLabel_4);
		}
		
		JLabel lblProgramadoresdiseadores = new JLabel("Programadores Y Dise\u00F1adores");
		lblProgramadoresdiseadores.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblProgramadoresdiseadores.setBounds(24, 26, 282, 24);
		contentPanel.add(lblProgramadoresdiseadores);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(24, 26, 272, 24);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Version 2.0");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBounds(329, 223, 73, 14);
		contentPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Creditos.class.getResource("/Imagenes/grupo1.jpg")));
		lblNewLabel_6.setBounds(306, 34, 120, 140);
		contentPanel.add(lblNewLabel_6);
	}
}
