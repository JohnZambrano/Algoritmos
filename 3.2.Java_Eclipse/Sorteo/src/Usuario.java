
public class Usuario {
	private int codigo;
	private long cedula;
	private long telefono;
	
	public Usuario(int codigo, long cedula, long telefono) {
		this.codigo = codigo;
		this.cedula = cedula;
		this.telefono = telefono;
	}
	public Usuario() {
		codigo = 0;
		cedula = 0;
		telefono = 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public String estado() {
		return String.format("Código %4d Cédula %12d Teléfono %12d\n",
				codigo, cedula, telefono);
	}
	
	

}
