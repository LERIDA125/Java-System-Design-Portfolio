package modelo;

public abstract class ICategoria {

	private int idCategoria;
	private String caetgoria;
	private int distancia;
	
	
	public ICategoria(int idCategoria, String caetgoria, int distancia) {
		super();
		this.idCategoria = idCategoria;
		this.caetgoria = caetgoria;
		this.distancia = distancia;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public String getCaetgoria() {
		return caetgoria;
	}
	public void setCaetgoria(String caetgoria) {
		this.caetgoria = caetgoria;
	}
	@Override
	public String toString() {
		return "ICategoria [idCategoria=" + idCategoria + ", caetgoria=" + caetgoria + ", distancia=" + distancia + "]";
	}
	
	
	
}
