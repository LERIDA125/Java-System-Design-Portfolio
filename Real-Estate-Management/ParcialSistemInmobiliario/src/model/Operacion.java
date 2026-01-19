package model;

import java.time.LocalDateTime;

public class Operacion {
  private int idOperacion; // CAMBIO: Ya no es static
  private LocalDateTime fecha;
  private Inmueble inmueble; // CAMBIO: minúscula para la variable, Mayúscula para la Clase
  private String detalle;
  private double monto;

  private static int idContador = 1; // Este mantiene la cuenta global

  // Constructor automático que asigna ID
  public Operacion(LocalDateTime fecha, Inmueble inmueble, String detalle, double monto) {
    this.idOperacion = idContador++; // Asigna y luego incrementa
    this.fecha = fecha;
    this.inmueble = inmueble;
    this.detalle = detalle;
    this.monto = monto;
  }

  public int getIdOperacion() { return idOperacion; }

  // Normalmente no deberías permitir setear el ID manualmente si es autoincremental
  // public void setIdOperacion(int idOperacion) { this.idOperacion = idOperacion; }

  public LocalDateTime getFecha() { return fecha; }
  public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

  public Inmueble getInmueble() { return inmueble; }
  public void setInmueble(Inmueble inmueble) { this.inmueble = inmueble; }

  public String getDetalle() { return detalle; }
  public void setDetalle(String detalle) { this.detalle = detalle; }

  public double getMonto() { return monto; }
  public void setMonto(double monto) { this.monto = monto; }

  @Override
  public String toString() {
    return "Operacion [id=" + idOperacion + ", fecha=" + fecha + ", inmueble=" + inmueble.getIdInmueble() +
        ", detalle=" + detalle + ", monto=" + monto + "]";
  }
}