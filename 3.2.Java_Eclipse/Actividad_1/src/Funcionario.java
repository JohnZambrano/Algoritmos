
public class Funcionario {
	
	protected int idFuncionario;
	protected String nombres;
	protected String apellidos;
	protected char genero;
	protected double salarioBase;
	
	
	public Funcionario(int idFuncionario, String nombres, String apellidos, char genero, double salarioBase) {
		this.idFuncionario = idFuncionario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
		this.salarioBase = salarioBase;
	}
	
	public Funcionario() {
		this.idFuncionario = 0;
		this.nombres = "";
		this.apellidos = "";
		this.genero = ' ';
		this.salarioBase = 0;
	}
	


	public int getFuncionario() {
		return idFuncionario;
	}


	public void setFuncionario(int funcionario) {
		this.idFuncionario = funcionario;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularEPS() {
		double eps=0;
		return eps;
	}
	
	public double calcularSueldo(double tiempo, double valorSueldo) {
		double sueldo=0;
		sueldo=valorSueldo*tiempo;		
		return sueldo;
	}
	
	
	public double calcularPension(double valorDevengado) {
		double eps=0;
		eps=valorDevengado*0.04;
		return eps;
	}
	
	
	
		
	
}
