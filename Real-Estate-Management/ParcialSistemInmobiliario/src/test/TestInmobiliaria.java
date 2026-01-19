package test;

import model.*;
import java.time.LocalDate;
import java.util.List;

public class TestInmobiliaria {

  public static void main(String[] args) {
    System.out.println("=== INICIANDO TEST DEL SISTEMA INMOBILIARIO ===");

    // 1. Instanciamos el sistema
    SistemaInmobiliario sistema = new SistemaInmobiliario();

    // 2. Cargamos una VENTA (Departamento en Lomas)
    // Params: Ambientes, Localidad, Precio, esDolares
    sistema.AgregarVenta(3, "Lomas de Zamora", 120000.0, true);
    System.out.println("[OK] Venta agregada.");

    // 3. Cargamos un ALQUILER (Casa en Banfield)
    // Datos para el alquiler:
    LocalDate fechaInicio = LocalDate.of(2025, 1, 1);
    double precioInicial = 500000.0;
    int frecuencia = 6; // Se actualiza cada 6 meses
    float iclBase = 1.0f;

    // Params: Ambientes, Loc, FechaInicio, MesesContrato, Precio, Frecuencia, ICL_Base
    sistema.AgregarAlquiler(4, "Banfield", fechaInicio, 36, precioInicial, frecuencia, iclBase);
    System.out.println("[OK] Alquiler agregado.");

    System.out.println("\n=== LISTADO DE INMUEBLES (Probando toString) ===");
    List<Inmueble> lista = sistema.getInmuebles();
    for (Inmueble i : lista) {
      System.out.println(i.toString());
    }

    System.out.println("\n=== PROBANDO ACTUALIZACIÓN DE ALQUILER ===");
    // Buscamos el alquiler (sabemos que es el segundo elemento, índice 1)
    // En un sistema real buscaríamos por ID, aquí lo hacemos directo para testear.
    Inmueble inm = lista.get(1);

    if (inm instanceof Alquiler) {
      Alquiler alq = (Alquiler) inm; // Hacemos casting para usar métodos de Alquiler

      System.out.println("Precio Enero 2025: $" + alq.getAlquilerMensual());

      // CASO A: Pasaron 3 meses (No debería actualizar porque la frecuencia es 6)
      LocalDate fechaAbril = LocalDate.of(2025, 4, 1);
      float iclAbril = 1.2f;
      alq.actualizarAlquiler(fechaAbril, iclAbril);
      System.out.println("Precio Abril 2025 (No debió cambiar): $" + alq.getAlquilerMensual());

      // CASO B: Pasaron 6 meses (Ahora SÍ debería actualizar)
      // Lógica: 500.000 * (1.5 / 1.0) = 750.000
      LocalDate fechaJulio = LocalDate.of(2025, 7, 1);
      float iclJulio = 1.5f;
      alq.actualizarAlquiler(fechaJulio, iclJulio);
      System.out.println("Precio Julio 2025 (Debió cambiar): $" + alq.getAlquilerMensual());

      // Verificamos que se haya actualizado el ICL base y la fecha
      System.out.println("Nuevo ICL Base guardado: " + alq.getICL0());
      System.out.println("Fecha última act.: " + alq.getFechaUltActualizacion());
    }

    System.out.println("\n=== PROBANDO REGISTRO DE OPERACIÓN ===");
    // Registramos una reserva sobre la venta (índice 0)
    Inmueble venta = lista.get(0);
    sistema.registrarOperacion(venta, "Reserva de propiedad", 1000.0);

    // Nota: Asegurate de tener un getter de operaciones en SistemaInmobiliario para imprimir esto
    // Si no lo tenés, agregá: public List<Operacion> getOperaciones() { return operaciones; }
    // System.out.println("Operaciones registradas: " + sistema.getOperaciones().size());

    System.out.println("\n=== TEST FINALIZADO ===");
  }
}