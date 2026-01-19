package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Email extends Mensaje {

  private String remitente;
  private String destinatario;
  private String asunto;
  private String cuerpo;
  private boolean leido;
  private List<Adjunto> adjuntos;

  public Email(LocalDate fechaEnvio, LocalTime horaEnvio,
      String remitente, String destinatario,
      String asunto, String cuerpo) {

    super(fechaEnvio, horaEnvio);
    this.remitente = remitente;
    this.destinatario = destinatario;
    this.asunto = asunto;
    this.cuerpo = cuerpo;
    this.leido = false;
    this.adjuntos = new ArrayList<>();
  }

  public String getRemitente() {
    return remitente;
  }

  public void setRemitente(String remitente) {
    this.remitente = remitente;
  }

  public String getDestinatario() {
    return destinatario;
  }

  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

  public String getAsunto() {
    return asunto;
  }

  public void setAsunto(String asunto) {
    this.asunto = asunto;
  }

  public String getCuerpo() {
    return cuerpo;
  }

  public void setCuerpo(String cuerpo) {
    this.cuerpo = cuerpo;
  }

  public boolean isLeido() {
    return leido;
  }

  public List<Adjunto> getAdjuntos() {
    return adjuntos;
  }

  public void agregarAdjunto(Adjunto adjunto) {
    adjuntos.add(adjunto);
  }

  @Override
  public void cambiarDeEstado(boolean estadoNuevo) {
    this.leido = estadoNuevo;
  }

  @Override
  public String toString() {
    return "Email{" +
        "idMensaje=" + idMensaje +
        ", fechaEnvio=" + fechaEnvio +
        ", horaEnvio=" + horaEnvio +
        ", remitente='" + remitente + '\'' +
        ", destinatario='" + destinatario + '\'' +
        ", asunto='" + asunto + '\'' +
        ", leido=" + leido +
        ", adjuntos=" + adjuntos +
        '}';
  }
}
