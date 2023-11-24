import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class TiposProfesores extends JDialog {

	private final JPanel tipos = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TiposProfesores dialog = new TiposProfesores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TiposProfesores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TiposProfesores.class.getResource("/ImagenesAct/Icono.png")));
		setTitle("Calculo del salario de  docentes");
		setBounds(100, 100, 507, 487);
		getContentPane().setLayout(new BorderLayout());
		tipos.setBackground(SystemColor.desktop);
		tipos.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(tipos, BorderLayout.CENTER);
		tipos.setLayout(null);
		
		JPanel panelTiposProfesores = new JPanel();
		panelTiposProfesores.setBackground(new Color(173, 216, 230));
		panelTiposProfesores.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Seleccione el tipo de docente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelTiposProfesores.setBounds(66, 38, 357, 361);
		tipos.add(panelTiposProfesores);
		panelTiposProfesores.setLayout(null);
		
		JButton btnTiempoCompleto = new JButton("Tiempo Completo");
		btnTiempoCompleto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pTiempoCompleto vTiempoCompleto = new pTiempoCompleto();
				vTiempoCompleto.setVisible(true);
				vTiempoCompleto.setLocationRelativeTo(null);
				
				
			}
		});
		btnTiempoCompleto.setBounds(69, 25, 199, 74);
		panelTiposProfesores.add(btnTiempoCompleto);
		
		JButton btnHoraCatedra = new JButton("Hora C\u00E1tedra");
		btnHoraCatedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pHoraCatedra vHoraCatedra = new pHoraCatedra();
				vHoraCatedra.setVisible(true);
				vHoraCatedra.setLocationRelativeTo(null);
							
			}
		});
		btnHoraCatedra.setBounds(69, 138, 199, 74);
		panelTiposProfesores.add(btnHoraCatedra);
		
		JButton btnContratoOcacional = new JButton("Contrato Ocacional");
		btnContratoOcacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pOcacionales vOcacionales = new pOcacionales();
				vOcacionales.setVisible(true);
				vOcacionales.setLocationRelativeTo(null);
							
			}
		});
		btnContratoOcacional.setBounds(69, 254, 199, 74);
		panelTiposProfesores.add(btnContratoOcacional);
	}

}
