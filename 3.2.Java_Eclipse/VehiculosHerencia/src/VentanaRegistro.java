import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Label;
import javax.swing.ImageIcon;

public class VentanaRegistro extends JInternalFrame {
	private JTextField txtPlaca;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	Vehiculo Carro;
	
	private JTextField txtCambio;
	private JTextField txtCuanto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
	public VentanaRegistro() {
		setFrameIcon(null);
		getContentPane().setBackground(new Color(220, 220, 220));
		setBackground(new Color(220, 220, 220));
		setBorder(new TitledBorder(new EmptyBorder(4, 0, 0, 0), "Registro Vehiculos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 205)));
		setBounds(0, 0, 690, 390);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(127, 255, 212));
		panel.setBounds(70, 46, 217, 195);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Placa");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Velocidad");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(60, 179, 113));
		lblNewLabel_1.setBounds(10, 42, 60, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cambio");
		lblNewLabel_2.setBounds(10, 74, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo");
		lblNewLabel_3.setBounds(10, 109, 46, 14);
		panel.add(lblNewLabel_3);
		
		Label lblRegistro = new Label(":");
		lblRegistro.setBackground(Color.PINK);
		lblRegistro.setBounds(73, 272, 556, 62);
		getContentPane().add(lblRegistro);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(77, 8, 99, 20);
		panel.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JRadioButton optManual = new JRadioButton("Manual");
		buttonGroup.add(optManual);
		optManual.setBounds(67, 100, 109, 23);
		panel.add(optManual);
		
		JRadioButton optAutomatico = new JRadioButton("Autom\u00E1tico");
		buttonGroup.add(optAutomatico);
		optAutomatico.setBounds(67, 126, 109, 23);
		panel.add(optAutomatico);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
		//---------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
		try{
				String Placa = txtPlaca.getText();
				if(optManual.isSelected());
				Carro = new VehiculoCambioManual(Placa);
				if(optAutomatico.isSelected());
				Carro = new VehiculoCambioAutomatico(Placa);
				lblRegistro.setText(Carro.toString());
	    	}
		catch(IllegalArgumentException ex) {
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Registro Vehiculos",JOptionPane.ERROR_MESSAGE);
		txtPlaca.requestFocus();
		
		     }	
				
			}
		});
		btnRegistrar.setBounds(67, 161, 89, 23);
		panel.add(btnRegistrar);
		
		Label lblVelocidad = new Label(":");
		lblVelocidad.setBackground(Color.PINK);
		lblVelocidad.setBounds(76, 34, 99, 22);
		panel.add(lblVelocidad);
		
		Label lblCambio = new Label(":");
		lblCambio.setBackground(Color.PINK);
		lblCambio.setBounds(76, 66, 99, 22);
		panel.add(lblCambio);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setLayout(null);
		panel_1.setBounds(352, 46, 277, 195);
		getContentPane().add(panel_1);
		
		JButton btnAcelar = new JButton("Acelerar");
		btnAcelar.addActionListener(new ActionListener() {
		//-------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
			try {
				int cuanto = Integer.parseInt(txtCuanto.getText());
				Carro.acelerar(cuanto);
				lblRegistro.setText(Carro.toString());
				lblVelocidad.setText(Carro.getVelocidad()+"Km/h");
				lblCambio.setText(Carro.getCambio()+"");
			 }
			catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,ex.getMessage(), "Registro Vehiculos" ,
				JOptionPane.ERROR_MESSAGE);
				txtCuanto.requestFocus();
		
			 }
			}
		});
		btnAcelar.setBounds(10, 21, 89, 23);
		panel_1.add(btnAcelar);
		
		JButton btnFrenar = new JButton("Frenar");
		btnFrenar.addActionListener(new ActionListener() {
			//----------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
				try {
					int cuanto = Integer.parseInt(txtCuanto.getText());
					Carro.frenar(cuanto);
					lblRegistro.setText(Carro.toString());
					lblVelocidad.setText(Carro.getVelocidad()+"Km/h");
					lblCambio.setText(Carro.getCambio()+"");
				 }
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,ex.getMessage(), "Registro Vehiculos" ,
					JOptionPane.ERROR_MESSAGE);
					txtCuanto.requestFocus();
			
				 }
				
			}
		});
		btnFrenar.setBounds(10, 74, 89, 23);
		panel_1.add(btnFrenar);
		
		JButton btnPonerCambio = new JButton("Poner Cambio");
		btnPonerCambio.addActionListener(new ActionListener() {
			//------------------------------------------------
			public void actionPerformed(ActionEvent arg0) {
			try {
				int cambio = Integer.parseInt(txtCambio.getText());
				if(Carro instanceof VehiculoCambioManual)
					((VehiculoCambioManual)Carro).setCambio(cambio);
				lblRegistro.setText(Carro.toString());
				lblCambio.setText(Carro.getCambio()+"");
			 }
			
			catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Registro Vehiculos",
						JOptionPane.ERROR_MESSAGE);
				
			}catch (IllegalArgumentException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Registro Vehiculos",
						JOptionPane.ERROR_MESSAGE);
				
			}
		}
		
		});
		btnPonerCambio.setBounds(10, 123, 116, 23);
		panel_1.add(btnPonerCambio);
		
		txtCambio = new JTextField();
		txtCambio.setBounds(158, 124, 99, 20);
		panel_1.add(txtCambio);
		txtCambio.setColumns(10);
		
		txtCuanto = new JTextField();
		txtCuanto.setBounds(158, 75, 99, 20);
		panel_1.add(txtCuanto);
		txtCuanto.setColumns(10);
		
		Label lblAcelerar = new Label(":");
		lblAcelerar.setBackground(Color.PINK);
		lblAcelerar.setBounds(158, 21, 99, 22);
		panel_1.add(lblAcelerar);
		
	
	
	}
}
