
public class Docentes extends Funcionario {
	
	protected String areaFormacion;
	protected String tituloProfesional;
	
	
	public Docentes(int idfuncionario, String nombres, String apellidos, char genero, double salarioBase,	String areaFormacion, String tituloProfesional) {
		super(idfuncionario, nombres, apellidos, genero, salarioBase);
		this.areaFormacion = areaFormacion;
		this.tituloProfesional = tituloProfesional;
	}
	
	public Docentes(int idfuncionario, String nombres, String apellidos, char genero, double salarioBase) {
		super(idfuncionario, nombres, apellidos, genero, salarioBase);
		this.areaFormacion = "";
		this.tituloProfesional = "";
	}
	
	public String getAreaFormacion() {
		return areaFormacion;
	}


	public void setAreaFormacion(String areaFormacion) {
		this.areaFormacion = areaFormacion;
	}


	public String getTituloProfesional() {
		return tituloProfesional;
	}


	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String mostrarDatosDocente() {
		String docente = "";
		docente = docente +"\n ID: " + getFuncionario();
		docente = docente +"\n Nombre : " + getNombres();
		docente = docente +"\n Apellidos: " + getApellidos();
		docente = docente +"\n Genero : " + getGenero();
		docente = docente +"\n Salario Base : " + getSalarioBase();
		docente = docente +"\n Area Formaci�n : " + areaFormacion;
		docente = docente +"\n tituloProfecional: " + tituloProfesional;
		return docente;
		
	}
	
	
}
