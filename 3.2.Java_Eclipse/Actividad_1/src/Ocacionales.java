public class Ocacionales extends Docentes{
	
	private int mesesContrato;
	private double valorContrato;
	
	
	public Ocacionales(int idfuncionario, String nombres, String apellidos, char genero, double salarioBase,
			String areaFormacion, String tituloProfesional, double valorContrato, int mesesContrato) {
		super(idfuncionario, nombres, apellidos, genero, salarioBase, areaFormacion, tituloProfesional);
		this.mesesContrato = mesesContrato;
		this.valorContrato = valorContrato;
	}


	public int getMesesContrato() {
		return mesesContrato;
	}


	public void setMesesContrato(int mesesContrato) {
		this.mesesContrato = mesesContrato;
	}


	public double getValorContrato() {
		return valorContrato;
	}


	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	public double calcularSueldo(double valorContrato, int meses) {
			double pago = 0;
			pago = valorContrato * meses;
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
	
	
		
		public String mostrarDatosDocente() {
			String cad = super.mostrarDatosDocente();
			cad = cad +"\nMeses del contrato: "+mesesContrato;
			cad = cad +"\n:Valor del contrato: "+valorContrato;
			return cad;
			
		}
		
				
		
}