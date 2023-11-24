
public class Rectangulo extends Geometria {
	protected double x1;
	protected double y1;
	protected double x2;
	protected double y2;
	
	public Rectangulo(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Rectangulo() {
		x1 = 0;
		y1 = 0;
		x2 = 1;
		y2 = 1;
	}
    public double perimetro() {
    	return 2*((x2-x1)+(y2-y1));
    }
    public double area() {
    	return (x2-x1)*(y2-y1);
    }
}
