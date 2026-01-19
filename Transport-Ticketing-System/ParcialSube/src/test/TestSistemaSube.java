package test;

import model.SistemaSube;
import model.Tarjeta;
import model.Usuario;
import model.Viaje;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestSistemaSube {

    public static void main(String[] args) {
        SistemaSube sistema = new SistemaSube(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        try {
            sistema.agregarUsuario(11111111, "Fernando", "Gomez", false);
            sistema.agregarUsuario(22222222, "Ana", "Perez", true);

            System.out.println("Usuarios cargados:");
            for (Usuario u : sistema.getUsuarios()) {
                System.out.println(u);
            }

            Usuario u1 = sistema.traerUsuarioDni(11111111);

            try {
                sistema.agregarTarjeta(u1, "123");
            } catch (Exception e) {
                System.out.println("Error esperado: " + e.getMessage());
            }

            sistema.agregarTarjeta(u1, "111111111111");
            System.out.println("Tarjeta agregada correctamente.");

            Tarjeta t1 = sistema.traerTarjeta("111111111111");
            LocalDateTime ahora = LocalDateTime.now();

            sistema.agregarViaje(t1, "Linea 60", ahora, 500.0);
            sistema.agregarViaje(t1, "Subte B", ahora.plusHours(1), 300.0);

            System.out.println("Viajes realizados:");
            for (Viaje v : sistema.getViajes()) {
                System.out.println(v);
            }

            double total = sistema.calcularTotalFacturadoEntreFechas(ahora.minusMinutes(10), ahora.plusHours(2));
            System.out.println("Total facturado: " + total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}