
public class CuentaAhorros extends Cuentas {
	protected double porcentaje;

	public CuentaAhorros() {
		super("", "", 0); // constructor clase cuentas
		porcentaje = 0;
	}

	public CuentaAhorros(String numero, String cliente, double saldo, double porcentaje) {
		super(numero, cliente, saldo);
		setPorcentaje(porcentaje);
	}
	
	public void interes() {
		double incremento = saldo * (porcentaje / 100);
		saldo += incremento;
	}
  

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		if (porcentaje >= 0 && porcentaje <= 100)
			this.porcentaje = porcentaje;
		else
			throw new IllegalArgumentException("El porcentaje debe ser un valor entre 0 y 100");
	}
  
}
