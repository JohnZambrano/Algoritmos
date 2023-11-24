
public class Ropa {
	private String id;
	private double precio;
	private String talla;
	private String color;
		
	public Ropa(String id, double precio, String talla, String color) {
		this.id = id;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
	}
	
	public String getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}

	public String getTalla() {
		return talla;
	}

	public String getColor() {
		return color;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String mostrarDatos() {
		String ropa = "";
		ropa = ropa +"\nID: "+id;
		ropa = ropa +"\nPrecio: "+precio;
		ropa = ropa +"\nTalla: "+talla;
		ropa = ropa +"\nColor: "+color;
		return ropa;
	}	
	
	
}