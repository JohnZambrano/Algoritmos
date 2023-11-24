
public class Estudiante {
	
	private String codigo;
	private String nombre;
	private String apellido;
	private String programa;
	
	public Estudiante() {
		codigo = "";
		nombre = "";
		apellido = "";
		programa = "";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	public String escribir() {
		return String.format("Código %-6s Nombre %-20s Apellido %-20s Programa %-20s", codigo, nombre, apellido, programa);
	}

}
