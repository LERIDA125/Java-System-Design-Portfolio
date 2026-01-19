package test;

import modelo.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestMensajes {

  public static void main(String[] args) {

    try {
      // --- SMS ---
      SMS sms = new SMS(
          LocalDate.now(),
          LocalTime.now(),
          1122334455,
          1198765432,
          "Hola, esto es un SMS",
          false
      );

      System.out.println(sms);
      sms.cambiarDeEstado(true);
      System.out.println("SMS visto: " + sms.isVisto());

      System.out.println("------------------------------------------------");

      // --- Email ---
      Email email = new Email(
          LocalDate.now(),
          LocalTime.now(),
          "juan@mail.com",
          "ana@mail.com",
          "Reunion",
          "Tenemos reunion mañana a las 10"
      );

      Adjunto adj1 = new Adjunto("archivo", "pdf");
      Adjunto adj2 = new Adjunto("imagen", "jpg");

      email.agregarAdjunto(adj1);
      email.agregarAdjunto(adj2);

      System.out.println(email);
      email.cambiarDeEstado(true);
      System.out.println("Email leido: " + email.isLeido());

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
