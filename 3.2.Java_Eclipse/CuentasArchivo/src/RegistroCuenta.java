
public class RegistroCuenta {
    private int cuenta;
    private String nombre;
    private String apellido;
    private double saldo;
    
    public RegistroCuenta() {
    	cuenta = 0;
    	nombre = "";
    	apellido = "";
    	saldo = 0;
    }

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
}
