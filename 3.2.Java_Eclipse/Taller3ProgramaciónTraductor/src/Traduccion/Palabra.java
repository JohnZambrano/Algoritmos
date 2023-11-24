package Traduccion;

public class Palabra {
	protected String palabraIngles;
	protected String palabraEspa�ol;
	
	public Palabra(String palabraIngles, String palabraEspa�ol) {
		this.palabraIngles = palabraIngles;
		this.palabraEspa�ol = palabraEspa�ol;
	}
	
	public Palabra() {
		palabraIngles = "";
		palabraEspa�ol = "";
		
	}

	public String getPalabraIngles() {
		return palabraIngles;
	}

	public void setPalabraIngles(String palabraIngles) {
		this.palabraIngles = palabraIngles;
	}

	public String getPalabraEspa�ol() {
		return palabraEspa�ol;
	}

	public void setPalabraEspa�ol(String palabraEspa�ol) {
		this.palabraEspa�ol = palabraEspa�ol;
	}

}