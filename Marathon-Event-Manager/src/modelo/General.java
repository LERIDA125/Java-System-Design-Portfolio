package modelo;

public class General extends ICategoria{

	private int edadDesde;
	private int edadHasta;
	public General(int idCategoria, String caetgoria, int distancia, int edadDesde, int edadHasta) {
		super(idCategoria, caetgoria, distancia);
		this.edadDesde = edadDesde;
		this.edadHasta = edadHasta;
	}
	public int getEdadDesde() {
		return edadDesde;
	}
	public void setEdadDesde(int edadDesde) {
		this.edadDesde = edadDesde;
	}
	public int getEdadHasta() {
		return edadHasta;
	}
	public void setEdadHasta(int edadHasta) {
		this.edadHasta = edadHasta;
	}
	@Override
	public String toString() {
		return super.toString() + "General [edadDesde=" + edadDesde + ", edadHasta=" + edadHasta + "]\n";
	}
	
	
	
}
