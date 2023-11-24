package Traduccion;

public class Palabra {
	protected String palabraIngles;
	protected String palabraEspañol;
	
	public Palabra(String palabraIngles, String palabraEspañol) {
		this.palabraIngles = palabraIngles;
		this.palabraEspañol = palabraEspañol;
	}
	
	public Palabra() {
		palabraIngles = "";
		palabraEspañol = "";
		
	}

	public String getPalabraIngles() {
		return palabraIngles;
	}

	public void setPalabraIngles(String palabraIngles) {
		this.palabraIngles = palabraIngles;
	}

	public String getPalabraEspañol() {
		return palabraEspañol;
	}

	public void setPalabraEspañol(String palabraEspañol) {
		this.palabraEspañol = palabraEspañol;
	}

}