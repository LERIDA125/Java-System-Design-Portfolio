package model;

import java.time.LocalDateTime;

public class Viaje {
    private Tarjeta tarjeta;
    private String linea;
    private LocalDateTime fechaHoraViaje;
    private double precio;

    // Constructor adaptado a tu lógica
    public Viaje(Tarjeta tarjeta, String linea, LocalDateTime fechaHoraViaje, double precio) {
        this.tarjeta = tarjeta;
        this.linea = linea;
        this.fechaHoraViaje = fechaHoraViaje;
        this.precio = precio;
    }

    // Este método es necesario porque lo llamas en SistemaSube
    public double totalAPagar() {
        // Aquí podrías agregar lógica de descuentos si quisieras
        return this.precio;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public LocalDateTime getFechaHoraViaje() {
        return fechaHoraViaje;
    }

    public void setFechaHoraViaje(LocalDateTime fechaHoraViaje) {
        this.fechaHoraViaje = fechaHoraViaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Viaje [Tarjeta=" + tarjeta.getCodigo() + ", Linea=" + linea +
                ", Fecha=" + fechaHoraViaje + ", Precio=$" + precio + "]";
    }
}