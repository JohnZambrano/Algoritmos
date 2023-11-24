import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class vAcercaDe extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			vAcercaDe dialog = new vAcercaDe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public vAcercaDe() {
		setTitle("Acerca de");
		setBounds(100, 100, 826, 562);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Creditos:");
		lblNewLabel.setFont(new Font("News701 BT", Font.PLAIN, 30));
		lblNewLabel.setBounds(32, 11, 152, 68);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Daniel Sebastian Perez Vallejo");
		lblNewLabel_1.setBounds(191, 189, 190, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("John Jairo Zambrano Yela");
		lblNewLabel_1_1.setBounds(526, 189, 266, 14);
		contentPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Jos\u00E9 Gabriel Nastul Narv\u00E1ez");
		lblNewLabel_1_1_1.setBounds(191, 336, 266, 14);
		contentPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Desarrolladora: Colsoft");
		lblNewLabel_2.setBounds(90, 72, 249, 20);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contacto: Colsoft@udenar.edu.co");
		lblNewLabel_3.setBounds(32, 459, 340, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(vAcercaDe.class.getResource("/ImagenesAct/3.png")));
		lblNewLabel_4.setBounds(90, 132, 94, 108);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(vAcercaDe.class.getResource("/ImagenesAct/2.png")));
		lblNewLabel_4_1.setBounds(422, 132, 94, 114);
		contentPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(vAcercaDe.class.getResource("/ImagenesAct/1.png")));
		lblNewLabel_4_1_1.setBounds(87, 285, 97, 114);
		contentPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Grupo:");
		lblNewLabel_5.setBounds(90, 103, 106, 14);
		contentPanel.add(lblNewLabel_5);
	}
}
