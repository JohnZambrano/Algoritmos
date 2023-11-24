
public class Programa {
	
	private String codigo;
	private String nombre;
	private String facultad;
	
	public Programa() {
		this.codigo = codigo;
		this.nombre = nombre;
		this.facultad = facultad;
	}

	public void Programa() {
		codigo = "";
		nombre = "";
		facultad = "";
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

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String escribir() {
		return String.format("Código %-6s Programa %-20s Facultad %-20s",
				codigo, nombre, facultad);
		
	}
	
	public String escribirCombo() {
		return String.format("%-6s %-20s",
				codigo, nombre);
		
	}
}
