import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Circulos extends JFrame implements ActionListener {
    private JButton btnDerecha;
    private JButton btnIzquierda;
    private JButton btnSaltar;
    
    private JPanel pBotones;
    private int columna = 250;
    private int fila = 250;
    
    public Circulos(){
    	setTitle("Mover Circulo");
    	setBounds(150,100,600,400);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	initComponents();
    }
    public void initComponents(){
    	btnDerecha = new JButton("Derecha");
    	btnIzquierda = new JButton("Izquierda");
    	btnSaltar = new JButton("Saltar");
    	
    	btnDerecha.addActionListener(this);
    	btnIzquierda.addActionListener(this);
    	btnSaltar.addActionListener(this);
    	
    	pBotones = new JPanel();
    	pBotones.setBackground(Color.BLACK);
    	pBotones.setLayout(new FlowLayout());
    	
    	pBotones.add(btnIzquierda);
    	pBotones.add(btnDerecha);
    	pBotones.add(btnSaltar);
    	
    	Container contenedor = getContentPane();
    	setContentPane(contenedor);
    	contenedor.setLayout(new BorderLayout());
    	contenedor.add(pBotones,BorderLayout.NORTH);
    	
    }
    	
    	public void paint(Graphics g) {
    		super.paint(g);
    		int red,green,blue;
    		red =(int)(Math.random()*256);
    		green =(int)(Math.random()*256);
    		blue =(int)(Math.random()*256);
    		
    		//g.setColor(Color.RED);
    		g.setColor(new Color(red,green,blue));
    		g.fillOval(columna, fila, 100, 100);
    		
    			
    	}
    	
    	public void actionPerformed(ActionEvent evento){
    		if(evento.getSource()== btnDerecha)
    		columna += 20;
    		if(evento.getSource()== btnIzquierda)
    		columna -= 20;
    		
    		  if(evento.getSource()== btnSaltar)
    		  columna = (int)(Math.random()*256);
    		  if(evento.getSource()== btnSaltar)
    		  fila= (int) (Math.random()*256);
    	repaint();
    	}

    
    
    public static void main(String[] args) {
    	new Circulos().setVisible(true);
    }
}
