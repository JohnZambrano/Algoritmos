
public class TiempoCompleto extends Docentes{
	
	protected String categoria;
	protected int puntos;
	
	
					
	public TiempoCompleto(int idFuncionario, String nombres, String apellidos, char genero, double salarioBase,
			String areaFormacion, String tituloProfesional,String categoria, int puntos) {
		super(idFuncionario, nombres, apellidos, genero, salarioBase, areaFormacion, tituloProfesional);
		this.categoria=categoria;
		this.puntos=puntos;
	}
	
	public TiempoCompleto(int idFuncionario, String nombres, String apellidos, char genero, double salarioBase,
			String areaFormacion, String tituloProfesional) {
		super(idFuncionario, nombres, apellidos, genero, salarioBase, areaFormacion, tituloProfesional);
		this.categoria="";
		this.puntos=0;
	}

	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public double calcularSueldo(int puntos) {
		double pago =0;
		pago = Double.valueOf(puntos)*14938;
		return pago;
			
	}
	
	public double calcularPension(double valorDevengado) {
		double pension=0;
		pension=valorDevengado*0.04;
		return pension;
	}
	
	public double calcularEPS(double valorDevengado) {
		double eps=0;
		eps=valorDevengado*0.04;
		return eps;
	}

	

	
}
