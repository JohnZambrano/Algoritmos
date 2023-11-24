
public class Equipos {
	private String nombre;
	private int pGanados;
	private int pPerdidos;
	private int pEmpatados;
	private int puntos;
	public Equipos(String nombre, int pGanados, int pPerdidos, int pEmpatados) {
		this.nombre = nombre;
		this.pGanados = pGanados;
		this.pPerdidos = pPerdidos;
		this.pEmpatados = pEmpatados;
		puntos = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getpGanados() {
		return pGanados;
	}
	public void setpGanados(int pGanados) {
		this.pGanados = pGanados;
	}
	public int getpPerdidos() {
		return pPerdidos;
	}
	public void setpPerdidos(int pPerdidos) {
		this.pPerdidos = pPerdidos;
	}
	public int getpEmpatados() {
		return pEmpatados;
	}
	public void setpEmpatados(int pEmpatados) {
		this.pEmpatados = pEmpatados;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos() {
		puntos = (pGanados*3)+pEmpatados;
	}
	
	
	
	

}
