package Videojuego;
public class Videojuego {
	String usu;
	int pnts;

	public Videojuego(String usu, int pts) {
		super();
		this.usu = usu;
		this.pnts = pts;
	}
	
	public String getUsu() {
		return usu;
	}
	public void setUsu(String usu) {
		this.usu = usu;
	}
	public int getPnts() {
		return pnts;
	}
	public void setPnts(int pts) {
		this.pnts = pnts;
	}
}
