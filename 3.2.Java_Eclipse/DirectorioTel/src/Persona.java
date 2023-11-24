
public class Persona {
    private String nombre;
    private String direccion;
    private long telefono;
    
	public Persona(String nombre, String direccion, long telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Persona() {
		nombre = "";
		direccion = "";
		telefono = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public String estado() {
		return String.format("%-20s %-40s %12d",nombre, direccion, telefono);
	}
    
    
}
