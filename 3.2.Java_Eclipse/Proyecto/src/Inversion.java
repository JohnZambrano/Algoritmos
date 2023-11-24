
public class Inversion {
	protected double inversion;
	protected double financiamiento;
	protected int periodos;
	protected double porcentaje;
	protected double pago;
	
	public Inversion() {
		inversion = 0;
		financiamiento = 0;
		periodos = 0;
		porcentaje = 0;
		pago = 0;
	}
	

	//public Inversion(double financiamiento) {
	//	setFinanciamiento(financiamiento);
	//}
	
	
	public Inversion(double inversion, double financiamiento, int periodos, double porcentaje, double pago) {
		this.inversion = inversion;
		this.financiamiento = financiamiento;
		this.periodos = periodos;
		this.porcentaje = porcentaje;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getFinanciamiento() {
		return financiamiento;
	}

	

	public int getPeriodos() {
		return periodos;
	}

	public void setPeriodos(int periodos) {
		this.periodos = periodos;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public double calculoFinanciamiento(double inversion,double financiamiento) {
		
		financiamiento = inversion * financiamiento;
		return financiamiento;
		
	}

	public double calculoPago(double financiamiento, double periodos) {
		//Amortizacion variable
		pago = financiamiento / periodos;
		return pago;
	}
	
	

}
