
public class Indicadores {
	protected double inversion;
	protected double financiamiento;
	protected int años;
	protected double interes;
	protected double pagoex;
	protected double ingresos;
	protected double gastos;
	protected double valorrecu;
	protected double pr;
	protected double dtf;
	protected int periodo;
	
	public Indicadores(double inversion, double financiamiento, int años, double interes, double pagoex,
			double ingresos, double gastos, double valorrecu, double pr, double dtf, int periodo) {
		super();
		this.inversion = inversion;
		this.financiamiento = financiamiento;
		this.años = años;
		this.interes = interes;
		this.pagoex = pagoex;
		this.ingresos = ingresos;
		this.gastos = gastos;
		this.valorrecu = valorrecu;
		this.pr = pr;
		this.dtf = dtf;
		this.periodo = periodo;
	}
	
	public double pago() {
		double pago=0;
		int periodo1=periodo*años;
		double interes1=(interes/periodo)/100;
		if(financiamiento!=0) {
			double financiar=inversion*(financiamiento/100);
			pago=((financiar*interes1)*Math.pow((1+interes1), periodo1))/(Math.pow((1+interes1), periodo1)-1);
		}else {
			pago=((inversion*interes1)*Math.pow((1+interes1), periodo1))/(Math.pow((1+interes1), periodo1)-1);
		}
		return pago;
	}
	
	public String escribir() {
		return String.format("%.2f",pago());
	}
	
	public double tio() {
		double tio=0;
		pr=pr/100;
		dtf=dtf/100;
		pr=pr/periodo;
		tio=(pr+dtf)*100;
		return tio;
	}
	
	public String escribir2() {
		return String.format("%.2f",tio());
	}
	
	public double abonop() {
		double abonop=0;
		double financiar=0;
		if(financiamiento!=0) {
			financiar=inversion*(financiamiento/100);
		}else {
			financiar=inversion;
		}
		abonop=financiar/(periodo*años);
		return abonop;
	}
	
	public double p() {
		double p=0;
		double financiar = 0;
		if(financiamiento!=0) {
			financiar=inversion*(financiamiento/100);
		}else {
			financiar=inversion;
		}
		p=financiar-abonop();
		return p;
	}
	
	public double ia() {
		double ia=0;
		ia=(interes/periodo)/100;
		return ia;
	}
	
	
	public double pagoBancos() {
		double pagob=0;
		pagob=abonop()+ia();
		return pagob;
	}
	
	
	public double mostrarDatos0() {
		double financiar = 0;
		if(financiamiento!=0) {
			financiar=inversion*(financiamiento/100);
		}else {
			financiamiento=inversion;
			financiar=financiamiento;
		}
		return financiar;
	}
	
	public double mostrarDatos1() {
		double fila0=0;
		return fila0;
	}
	
	public String escribir8() {
		return String.format("%.2f",mostrarDatos1());
	}
}
