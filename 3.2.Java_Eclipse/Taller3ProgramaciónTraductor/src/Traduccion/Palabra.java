package Traduccion;

public class Palabra {
	protected String palabraIngles;
	protected String palabraEspaņol;
	
	public Palabra(String palabraIngles, String palabraEspaņol) {
		this.palabraIngles = palabraIngles;
		this.palabraEspaņol = palabraEspaņol;
	}
	
	public Palabra() {
		palabraIngles = "";
		palabraEspaņol = "";
		
	}

	public String getPalabraIngles() {
		return palabraIngles;
	}

	public void setPalabraIngles(String palabraIngles) {
		this.palabraIngles = palabraIngles;
	}

	public String getPalabraEspaņol() {
		return palabraEspaņol;
	}

	public void setPalabraEspaņol(String palabraEspaņol) {
		this.palabraEspaņol = palabraEspaņol;
	}

}