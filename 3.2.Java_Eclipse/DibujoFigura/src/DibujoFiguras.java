import java.awt.*;
import javax.swing.*;

public class DibujoFiguras extends JFrame {
	
    public DibujoFiguras() {
    	setTitle("Dibujo con figuras");
    	setBounds(100,100,600,650);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g) {
    	super.paint(g);
    	//Jugador 1
    	
    	g.setColor(Color.BLACK);
    	g.drawOval(250,70,55,60);
    	g.drawLine(278, 130, 278, 150);
    	g.setColor(Color.YELLOW);
    	g.fillRoundRect(250,150,50,70,16,16);
    	g.setColor(Color.BLACK);
    	g.drawLine(190, 180, 250, 180);
    	g.drawLine(300, 180, 370, 180);
    	g.drawLine(250, 220, 300, 220);
    	g.drawLine(250, 220, 230, 300);
    	g.drawLine(300, 220, 300, 300);	
    	
    	//Juagador 2
    	
    	g.setColor(Color.BLACK);
    	g.drawOval(350,400,55,60);
    	g.drawLine(378, 460, 378, 480);
    	g.setColor(Color.RED);
    	g.fillRoundRect(350,480,50,70,16,16);
    	g.setColor(Color.BLACK);
    	g.drawLine(290, 510, 350, 510);
    	g.drawLine(400, 510, 470, 510);
    	g.drawLine(350, 550, 400, 550);
    	g.drawLine(350, 550, 300, 630);
    	g.drawLine(400, 550, 400, 630);	
    	
    	//Balon
    	
    	g.setColor(Color.BLACK);
    	g.fillOval(230,550,70,70);
    	
    	//Texto
    	
    	g.setColor(Color.BLACK);
    	g.setFont(new Font("Curier",Font.BOLD,24));
    	g.drawString("Vaamos equipoo",150,430);
    	g.drawString("A por ellos",100,100);
    	
    	//Cancha
    	g.setColor(Color.GREEN);
    	g.drawLine(15, 40, 580, 40);
    	g.drawLine(15, 40, 15, 630);
    	g.drawLine(15, 630, 580, 630);
    	g.drawLine(580, 40, 580, 630);
    	g.drawLine(15, 335, 580, 335);
    	g.drawOval(275,305,60,60);
    	
    	//Tiros de esquina
    	g.setColor(Color.BLUE);
    	//Derecha1
    	int[] vx1 = {580,580,530};
    	int[] vy1 = {40,90,40};
    	g.drawPolygon(vx1,vy1,3);
    	//Izquierda1
    	int[] vx2= {15,15,65};
    	int[] vy2 = {40,90,40};
    	g.drawPolygon(vx2,vy2,3);
    	//Derecha 2
    	int[] vx3 = {15,15,65};
    	int[] vy3 = {630,580,630};
    	g.drawPolygon(vx3,vy3,3);
    	//Izquierda 2
    	int[] vx4 = {580,580,530};
    	int[] vy4 = {630,580,630};
    	g.drawPolygon(vx4,vy4,3);	
    	
    		
    }
    
    public static void main(String[] args) {
    	new DibujoFiguras().setVisible(true);
    }
    
}