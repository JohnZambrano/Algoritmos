import java.awt.*;
import javax.swing.*;

public class CirculoGrafico extends Circulo implements Dibujable {
    protected Color color;

	public CirculoGrafico(double x, double y, double r,Color color) {
		super(x, y, r);
		this.color = color;
	}
	
	public void dibujar(JPanel p) {
		Graphics grafico = p.getGraphics();
		grafico.create();
		grafico.setColor(color);
		grafico.drawOval((int)(x-r), (int)(y-r), (int)(r*2), (int)(r*2));
	}
	public void setPosicion(double x, double y) {
		
	}  
}
