import java.awt.*;
import javax.swing.*;
public class RectanguloGrafico extends Rectangulo implements Dibujable{
	protected Color color;

	public RectanguloGrafico(double x1, double y1, double x2, double y2, Color color) {
		super(x1, y1, x2, y2);
		this.color = color;	
	}
	public void dibujar(JPanel p) {
		Graphics grafico = p.getGraphics();
		grafico.create();
		grafico.setColor(color);
		grafico.drawRect((int)x1,(int)y1, (int)(x2-x1), (int)(y2-y1));
	}
	public void setPosicion(double x, double y) {
		
	}
	
}
