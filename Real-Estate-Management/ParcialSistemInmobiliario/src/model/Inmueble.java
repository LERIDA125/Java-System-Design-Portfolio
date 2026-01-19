package model;

public abstract class Inmueble {
  protected int idInmueble;
  protected int cantAmbientes;
  protected String localidad;

  public Inmueble(int idInmueble, int cantAmbientes, String localidad) {
    this.idInmueble = idInmueble;
    this.cantAmbientes = cantAmbientes;
    this.localidad = localidad;
  }

  public int getIdInmueble() { return idInmueble; }
  public void setIdInmueble(int idInmueble) { this.idInmueble = idInmueble; }
  public int getCantAmbientes() { return cantAmbientes; }
  public void setCantAmbientes(int cantAmbientes) { this.cantAmbientes = cantAmbientes; }
  public String getLocalidad() { return localidad; }
  public void setLocalidad(String localidad) { this.localidad = localidad; }

  @Override
  public String toString() {
    return "Inmueble [id=" + idInmueble + ", amb=" + cantAmbientes + ", loc=" + localidad + "]";
  }
}