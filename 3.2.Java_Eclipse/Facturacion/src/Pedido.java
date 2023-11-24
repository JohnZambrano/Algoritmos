import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pedido  extends JFrame implements ActionListener {
	private JLabel lblTitulo;
	private JList<String> lstDisponible;
	private JTextArea txtCuenta;
	private JScrollPane scrollPane;
	private JButton btnCompleto, btnNuevo, btnSalir;
	private JPanel pBotones, pCuenta;

	private String[] disponible = { "Cafe con leche $1500", "Pan de Maiz    $500 ", "Gelatina       $600 ",
			"Cacerola       $3000", "Salchipapa     $1500", "Aromatica      $800 ", "Papa Rellena   $3000",
			"Hamburguesa    $5000", "Pan con Queso  $1300", "Chocolate      $2000", "Empanada       $1000", };

	private int[] precios = { 1500, 500, 600, 3000, 1500, 800, 3000, 5000, 1300, 2000, 1000 };

	public Pedido() {
		setSize(500, 340);
		setTitle("Cafeteria un buen tinto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}

	public void initComponents() {
		pBotones = new JPanel();
		pCuenta = new JPanel();

		lblTitulo = new JLabel("Menu a la carta");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 22));
		
		lstDisponible = new JList(disponible);
		lstDisponible.setFont(new Font("Courier",Font.PLAIN,12));
		
		txtCuenta = new JTextArea();
		txtCuenta.setFont(new Font("Curier",Font.PLAIN,12));
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(txtCuenta);
		pCuenta.setLayout(new BorderLayout());
		pCuenta.add(scrollPane,BorderLayout.CENTER);
		
		btnCompleto = new JButton("Selección Completa");
		btnNuevo = new JButton("Nuevo Pedido");
		btnSalir = new JButton("Terminar");
		
		btnCompleto.addActionListener(this);
		btnNuevo.addActionListener(this);
		btnSalir.addActionListener(this);
		
		
		pBotones.setBackground(new Color(201,218,248));//Color(r,g,b) red(0-225), green(0-255), blue(0-255)
		pBotones.setLayout(new FlowLayout());
		pBotones.add(btnCompleto);
		pBotones.add(btnNuevo);
		pBotones.add(btnSalir);
		
		Container contenedor = getContentPane();
		setContentPane(contenedor);
		contenedor.setLayout(new BorderLayout(10,10));
		contenedor.setBackground(new Color(201,218,248));
		
		contenedor.add(lblTitulo, BorderLayout.NORTH);
		contenedor.add(lstDisponible, BorderLayout.WEST);
		contenedor.add(pCuenta, BorderLayout.CENTER);
		contenedor.add(pBotones, BorderLayout.SOUTH);
	
	  }
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==btnCompleto)
			mostrarCuenta();
		
			
		if(evento.getSource()==btnNuevo)
			txtCuenta.setText("");
			
		//if(evento.getSource()==btnSalir)
		//Preguntarle al usuario si deasea finalizar la aplicación	
		//si el usuario indica que va finalizar antes de cerrar la aplicación hay que mostrar
		//en un JOptionPane el número de pedidos realizados, y el total de dinero recaudado, sin
		//tener en cuenta el valor del impuesto
			
	
		
	}
	
	
    public void mostrarCuenta() {
		int[] listArray = lstDisponible.getSelectedIndices();
		double iva = 0.06;
		double impuesto = 0, subtotal = 0, total = 0;
		txtCuenta.setEditable(false);
		txtCuenta.setText("");
		
		for(int i= 0; i<listArray.length; i++) {
			subtotal += precios[listArray[i]];
			impuesto = iva * subtotal;
			total = subtotal + impuesto;
			txtCuenta.append("\nCafeteria Un Buen tinto\n");
			//adicionar una nueva linea que muestre el número de factura
			//el número de factura comienza en cero y es un número cosecutivo
			txtCuenta.append("\n------------Bienvenido--------------------------------------------------\n");
			for(int i1 = 0; i1<listArray.length; i1++) {
				txtCuenta.append(disponible[listArray[i1]]+"\n");
				
			txtCuenta.append("--------------------------------------------------------------------------\n");
			txtCuenta.append("\nSub total     $"+String.format("%.2f", subtotal)+"\n");
			txtCuenta.append("\nImpuesto     $"+String.format("%.2f", impuesto)+"\n");
			//txtCuenta.append("\n------------------------------------------------------------------------\n");
			txtCuenta.append("\nTotal    $"+String.format("%.2f", total)+"\n");
			txtCuenta.append("\nGracias por su compra, que tenga buen día\n");
			
			lstDisponible.clearSelection();
			repaint();
			}// fin for 1
		}//fin for 2
		
	}
	
	public static void main(String arg[]) {
		new Pedido().setVisible(true);
	}
}

