
public class VehiculoCambioManual extends Vehiculo{

	public VehiculoCambioManual(String placa) {
		super(placa);
		
	}
public void setCambio(int cambio) {
	if (cambio < 0)
		throw new IllegalArgumentException("Valor Cambio Negativo");
	this.cambio = cambio;
  }
    
	
}
