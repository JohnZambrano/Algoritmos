import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDibujo extends JPanel implements MouseMotionListener{
	private int x;
	private int y;
	
	public PanelDibujo() {
		setSize(400,400);
		x = -1;
		y = -1;
		addMouseMotionListener(this);
	}
    public void pain(Graphics g) {
    	if (x >= 0 && y >= 0) {
    		g.setColor(Color.BLACK);
    		g.fillOval(x,y, 5, 5);
    	}
    }
	@Override
	public void mouseDragged(MouseEvent arg0) {
		x = arg0.getX();
		y = arg0.getY();
		updateUI();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

