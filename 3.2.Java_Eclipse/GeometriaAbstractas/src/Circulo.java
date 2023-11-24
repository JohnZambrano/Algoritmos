
public class Circulo extends Geometria {
	protected double x;
	protected double y;
	protected double r;
	
	public Circulo(double x, double y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public Circulo(double r) {
		x = 0;
		y = 0;
		this.r = r;
	}
	
	public Circulo() {
		x = 0;
		y = 0;
		r = 1;
	}
	
	public double perimetro() {
		return 2*Math.PI*r;
	}
	
	public double area() {
		return Math.PI*Math.pow(r, 2);
	}

}
