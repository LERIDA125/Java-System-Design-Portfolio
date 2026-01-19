package model;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler extends Inmueble {
  // CAMBIO: LocalTime a LocalDate (necesitamos fecha, no hora)
  private LocalDate fechaInicioContrato;
  private int cantMesesContrato;
  private int frecuenciaMesesActualizacion;
  private float ICL0;
  private LocalDate fechaUltActualizacion;
  private double alquilerMensual;

  public Alquiler(int idInmueble, int cantAmbientes, String localidad,
      LocalDate fechaInicioContrato, int cantMesesContrato,
      int frecuenciaMesesActualizacion, float ICL0, LocalDate fechaUltActualizacion, double alquilerMensual) {
    super(idInmueble, cantAmbientes, localidad);
    this.fechaInicioContrato = fechaInicioContrato;
    this.cantMesesContrato = cantMesesContrato;
    this.frecuenciaMesesActualizacion = frecuenciaMesesActualizacion;
    this.ICL0 = ICL0;
    this.fechaUltActualizacion = fechaUltActualizacion;
    this.alquilerMensual = alquilerMensual;
  }

  public LocalDate getFechaInicioContrato() { return fechaInicioContrato; }
  public void setFechaInicioContrato(LocalDate fechaInicioContrato) { this.fechaInicioContrato = fechaInicioContrato; }

  public int getCantMesesContrato() { return cantMesesContrato; }
  public void setCantMesesContrato(int cantMesesContrato) { this.cantMesesContrato = cantMesesContrato; }

  public double getAlquilerMensual() { return alquilerMensual; }
  public void setAlquilerMensual(double alquilerMensual) { this.alquilerMensual = alquilerMensual; }

  public int getFrecuenciaMesesActualizacion() { return frecuenciaMesesActualizacion; }
  public void setFrecuenciaMesesActualizacion(int frecuenciaMesesActualizacion) { this.frecuenciaMesesActualizacion = frecuenciaMesesActualizacion; }

  public float getICL0() { return ICL0; }
  // CAMBIO: Corregido error de asignación (this.ICL0 = ICLB)
  public void setICL0(float ICL0) { this.ICL0 = ICL0; }

  public LocalDate getFechaUltActualizacion() { return fechaUltActualizacion; }
  public void setFechaUltActualizacion(LocalDate fechaUltActualizacion) { this.fechaUltActualizacion = fechaUltActualizacion; }

  // Lógica de actualización de alquiler
  public void actualizarAlquiler(LocalDate fecha, float ICL1) {
    Period periodo = Period.between(this.fechaUltActualizacion, fecha);
    // getYears * 12 + getMonths nos da la diferencia total en meses
    long diferenciaMeses = periodo.toTotalMonths();

    if (diferenciaMeses >= this.frecuenciaMesesActualizacion) {
      this.alquilerMensual = this.alquilerMensual * (ICL1 / this.ICL0);
      this.ICL0 = ICL1; // Actualizamos el ICL base al nuevo
      this.fechaUltActualizacion = fecha; // Actualizamos la fecha
    }
  }

  @Override
  public String toString() {
    return "Alquiler [" + super.toString() + ", inicio=" + fechaInicioContrato +
        ", meses=" + cantMesesContrato + ", frec=" + frecuenciaMesesActualizacion +
        ", precio=" + alquilerMensual + ", ICL0=" + ICL0 + ", ultAct=" +
        fechaUltActualizacion + "]";
  }
}