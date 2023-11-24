
public class Camiseta extends Ropa{
	private String corte;

	public Camiseta(String id, double precio, String talla, String color, String corte) {
		super(id, precio, talla, color);
		this.corte = corte;
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}
	
	public String mostrarDatos() {
		String cad=super.mostrarDatos();
		cad=cad+"\nCorte: "+getCorte();
		return cad;
	}
	
}
