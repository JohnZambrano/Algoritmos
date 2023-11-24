import java.awt.*;
import javax.swing.*;
public class Figuras extends JFrame {
    public Figuras() {
    	setTitle("Ejemplo de figuras básicas");
    	setBounds(100,100,600,650);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g) {
    	super.paint(g);
    	g.setColor(Color.BLUE);
    	g.drawLine(0, 70, 100, 70);
    	g.drawRect(150,70,50,70);
    	g.drawRoundRect(150,70,50,70,16,16);
    	g.drawOval(350,70,50,70);
    	int[] vx1 = {500,550,450};
    	int[] vy1 = {70,120,120};
    	g.drawPolygon(vx1,vy1,3);
    	
    	g.setColor(Color.RED);
    	g.fillRect(150,270,50,70);
    	g.fillRoundRect(250,270,50,70,16,16);
    	g.fillOval(350, 270, 50, 70);
    	int[] vx2 = {500,550,450};
    	int[] vy2 = {270,320,320};
    	g.drawPolygon(vx2,vy2,3);
    	
    	g.setColor(Color.GREEN);
    	g.setFont(new Font("Curier",Font.BOLD,24));
    	g.drawString("Primer Linea",10,200);
    	g.drawString("Segunda Linea",50,250);
    	
    
    }
    
    public static void main(String[] args) {
    	new Figuras().setVisible(true);
    }
}
