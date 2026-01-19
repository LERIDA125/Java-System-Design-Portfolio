package model;

public class Venta extends Inmueble {
  private boolean enDolares;
  private double precioVenta;


  public Venta(int idInmueble, int cantAmbientes, String localidad, boolean enDolares, double precioVenta) {
    super(idInmueble, cantAmbientes, localidad);
    this.enDolares = enDolares;
    this.precioVenta = precioVenta;
  }

  public boolean isEnDolares() { return enDolares; }
  public void setEnDolares(boolean enDolares) { this.enDolares = enDolares; }
  public double getPrecioVenta() { return precioVenta; }
  public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }

  @Override
  public String toString() {
    return "Venta [" + super.toString() + ", precio=" + precioVenta + ", USD=" + enDolares + "]";
  }
}