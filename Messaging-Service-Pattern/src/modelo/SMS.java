package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class SMS extends Mensaje {
    private int numeroOrigen;
    private int numeroDestino;
    private String texto;
    private boolean visto;

    public SMS(LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino, String texto, boolean visto) throws Exception {
        super(fechaEnvio, horaEnvio);
        this.numeroOrigen = numeroOrigen;
        this.setNumeroDestino(numeroDestino);
        this.texto = texto;
        this.visto = visto;
    }

    public int getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(int numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) throws Exception {
        if (validarNumeroDestino(numeroDestino)) {
            this.numeroDestino = numeroDestino;
        } else {
            throw new Exception("El numero de destino debe tener 10 digitos");
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public boolean validarNumeroDestino(int numeroDestino) {
        return String.valueOf(numeroDestino).length() == 10;
    }

    @Override
    public void cambiarDeEstado(boolean estadoNuevo) {
        this.visto = estadoNuevo;
    }

    @Override
    public String toString() {
        return "SMS{" +
                "idMensaje=" + idMensaje +
                ", fechaEnvio=" + fechaEnvio +
                ", horaEnvio=" + horaEnvio +
                ", numeroOrigen=" + numeroOrigen +
                ", numeroDestino=" + numeroDestino +
                ", texto='" + texto + '\'' +
                ", visto=" + visto +
                '}';
    }
}