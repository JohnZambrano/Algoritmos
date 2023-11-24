
public class Vehiculo {
	protected String placa;
	protected double velocidad;
	protected int cambio;
	

	public Vehiculo(String placa) {
	setPlaca(placa);
		velocidad = 0;
		cambio = 0;
	}
	
	public String getPlaca() {
		return placa;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public int getCambio() {
		return cambio;
	}
	public void setPlaca(String placa) {
		if(placa.length()<=0)
			throw new IllegalArgumentException("Placa en Blanco");
		this.placa = placa;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public void setCambio(int cambio) {
		this.cambio = cambio;
	}
	
	public void acelerar(int cuanto) {
		if(cuanto < 0)
			frenar(-cuanto);
		else
			velocidad += cuanto;
	}
	
	public void frenar(int cuanto) {
		if(cuanto < 0)
			acelerar(-cuanto);
		else {
			velocidad -= cuanto;
			if(velocidad < 0);
			velocidad = 0;
		}
	  }
	public String toString() {
		return String.format("Placa %6s Velocidad %03.1f Cambio %1d",placa,velocidad,cambio);
		
	}
	
	
}
	
