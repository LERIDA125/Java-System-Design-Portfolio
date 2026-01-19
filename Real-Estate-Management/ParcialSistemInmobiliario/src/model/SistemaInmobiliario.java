package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaInmobiliario {
  private List<Operacion> operaciones;
  private List<Inmueble> inmuebles;

  public SistemaInmobiliario() {
    this.operaciones = new ArrayList<>();
    this.inmuebles = new ArrayList<>();
  }

  public List<Inmueble> getInmuebles() {
    return inmuebles;
  }

  // --- Funciones o casos de uso ---

  public boolean AgregarVenta(int cantAmbientes, String localidad, double precioVenta, boolean enDolares) {
    int idNuevo = inmuebles.size() + 1;
    Venta nuevaVenta = new Venta(idNuevo, cantAmbientes, localidad, enDolares, precioVenta);
    return inmuebles.add(nuevaVenta);
  }

  // CAMBIO: Se agregan parametros necesarios para crear un Alquiler valido (frecuencia, ICL, fechaUlt)
  public boolean AgregarAlquiler(int cantAmbientes, String localidad, LocalDate fechaInicio,
      int cantMeses, double alquilerMensual,
      int frecuenciaActualizacion, float iclInicial) {
    int idNuevo = inmuebles.size() + 1;

    // Asumimos que la fecha de última actualización inicial es la misma que la de inicio
    Alquiler nuevoAlquiler = new Alquiler(idNuevo, cantAmbientes, localidad,
        fechaInicio, cantMeses,
        frecuenciaActualizacion, iclInicial, fechaInicio, alquilerMensual);

    return inmuebles.add(nuevoAlquiler);
  }

  // Método para registrar operación (Opcional, basado en tu clase Operacion)
  public void registrarOperacion(Inmueble inmueble, String detalle, double monto) {
    // Usamos LocalDateTime.now() para la fecha actual
    Operacion op = new Operacion(java.time.LocalDateTime.now(), inmueble, detalle, monto);
    operaciones.add(op);
  }
}