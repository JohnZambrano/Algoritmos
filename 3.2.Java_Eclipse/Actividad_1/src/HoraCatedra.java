
public class HoraCatedra extends Docentes{
	
	private int numeroHoras;
	private int numeroMeses;
	private String categoria;
		
	public HoraCatedra(int funcionario, String nombres, String apellidos, char genero, double salarioBase,
			String areaFormacion, String tituloProfesional, int numeroHoras, int numeroMeses, String categoria) {
		super(funcionario, nombres, apellidos, genero, salarioBase, areaFormacion, tituloProfesional);
		this.numeroHoras = numeroHoras;
		this.numeroMeses = numeroMeses;
		this.categoria = categoria;
	}
	
	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public int getNumeroMeses() {
		return numeroMeses;
	}

	public void setNumeroMeses(int numeroMeses) {
		this.numeroMeses = numeroMeses;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
	
	public double calcularSueldo(double valorDevengado,double tiempo) {
		double pago=0;
		pago=valorDevengado*tiempo;
		return pago;
	}
		
	public String mostrarDatosDocente() {
		String cad = super.mostrarDatosDocente();
		cad = cad +"\nNúmero horas: "+numeroHoras;
		cad = cad +"\nNúmero horas: "+numeroMeses;
		cad = cad +"\nNúmero horas: "+categoria;
		return cad;
	}

	
	
	
}
