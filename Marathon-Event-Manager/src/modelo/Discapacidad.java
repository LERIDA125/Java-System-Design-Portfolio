package modelo;

public class Discapacidad extends ICategoria{

	private boolean ciego;
	private boolean movilidadReducida;
	public Discapacidad(int idCategoria, String caetgoria, int distancia, boolean ciego, boolean movilidadReducida) {
		super(idCategoria, caetgoria, distancia);
		this.ciego = ciego;
		this.movilidadReducida = movilidadReducida;
	}
	public boolean isCiego() {
		return ciego;
	}
	public void setCiego(boolean ciego) {
		this.ciego = ciego;
	}
	public boolean isMovilidadReducida() {
		return movilidadReducida;
	}
	public void setMovilidadReducida(boolean movilidadReducida) {
		this.movilidadReducida = movilidadReducida;
	}
	@Override
	public String toString() {
		return super.toString() + "Discapacidad [ciego=" + ciego + ", movilidadReducida=" + movilidadReducida + "]\n";
	}
	
	
	
}
