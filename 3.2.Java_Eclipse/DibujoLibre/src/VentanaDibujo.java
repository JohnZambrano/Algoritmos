import javax.swing.*;
import java.awt.*;

public class VentanaDibujo extends JFrame {
	
	private PanelDibujo panel;
	public VentanaDibujo(){
		setTitle("Dibujo a mano alzada");
		setSize(500,500);
		initComponents();
	}
	
	public void initComponents(){
		panel = new PanelDibujo();
		Container contenedor = getContentPane();
		setContentPane(contenedor);
		contenedor.setLayout(new BorderLayout());
		contenedor.add(panel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new VentanaDibujo().setVisible(true);
	}

}
