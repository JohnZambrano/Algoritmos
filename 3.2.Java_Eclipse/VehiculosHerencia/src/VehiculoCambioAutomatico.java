
public class VehiculoCambioAutomatico extends Vehiculo{

	public VehiculoCambioAutomatico(String placa) {
		super(placa);
	}

public void acelerar(int cuanto) {
	super.acelerar(cuanto);
	if(velocidad < 10)
		setCambio(1);
	else if(velocidad <30)
		setCambio(2);
	else if(velocidad <50)
		setCambio(3);
	else if(velocidad <80)
		setCambio(4);
	else
		setCambio(5);
    }
    public void frenar(int cuanto) {
    	super.frenar(cuanto);
    	if(velocidad < 5)
    		setCambio(1);
    	else if(velocidad <20)
    		setCambio(2);
    	else if(velocidad <40)
    		setCambio(3);
    	else if(velocidad <50)
    		setCambio(4);
    	else
    		setCambio(5);
    }
    	
}
