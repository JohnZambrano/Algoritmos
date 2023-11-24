
public class Liquidacion {
	protected String Nombres;
	protected String Apellidos;
	protected double sueldo;
	protected String Riesgo;
	protected double pago;
	protected int diferenciames;


	public Liquidacion() {
		this.Nombres="";
		this.Apellidos="";
		this.sueldo=0;	
	}

	
	public Liquidacion(String nombres, String apellidos, double sueldo, String Riesgo, double pago, int diferenciames) {
		Nombres = nombres;
		Apellidos = apellidos;
		this.sueldo = sueldo;
		this.pago = pago;
		this.Riesgo = Riesgo;
		this.diferenciames=diferenciames;
	}
		public String getNombres() {
		return Nombres;
	}


	public void setNombres(String nombres) {
		Nombres = nombres;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getRiesgo() {
		return Riesgo;
	}


	public void setRiesgo(String riesgo) {
		Riesgo = riesgo;
	}
	
		public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public int Transporte() {
		int transporte;
		if(sueldo<=1817052) {
			 transporte=106454;
		}else {
			 transporte=0;
		}
		return transporte;
	}
		public double CalcularSalud() {
			double salud=sueldo*0.085;
			return salud;
		}
		
		public double CalcularPension() {
			double pension=sueldo*0.12;
			return pension;
		}
		
		public double CalcularParafiscales() {
			double paraficales=sueldo*0.09;
			return paraficales;
		}
		
		public double CalcularPrima() {
			double prima=sueldo*0.0833;
			return prima;
		}
		
		public double CalcularCesantias() {
			double cesantias=sueldo*0.0833;
			return cesantias;
		}
		
		public double CalcularInteCesantias() {
			double intecesantias=CalcularCesantias()*0.12;
			return intecesantias;
		}
		
		public double CalcularVacaciones() {
			double vacaciones=sueldo*0.0417;
			return vacaciones;
		}
		
		public double CalcularDotacion() {
			double dotacion=sueldo*0.05;
			return dotacion;
		}
		public double calcularRiesgo() {
			double riesgo=sueldo*pago;
			return riesgo;
		}
	
		public double total() {
			double total=(sueldo+CalcularSalud()+CalcularPension()+CalcularParafiscales()+CalcularPrima()+CalcularCesantias()+CalcularInteCesantias()+CalcularVacaciones()+CalcularDotacion()+calcularRiesgo()+Transporte())*diferenciames;
			return total;
		}
		
		public double total1() {
			double total=sueldo+Transporte();
			return total;
		}
		public String MostrarDatos1() {
			return String.format("Pago Empresa ==> %.2f",total());
		}
		
		public String MostrarDatos2() {
			return String.format("Sueldo Empleado ==> %.2f",total1());
		}
	}
	
	


