
public class Facultad {
	protected String codigo;
	protected String nombre;
	
	public Facultad(String  codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Facultad() {
		codigo = "";
		nombre = "";
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
	
	public String escribir() {
		return String.format("Código: %-6s Facultad: %-20s\n", codigo,nombre);
	}
	
	
	
	

}
