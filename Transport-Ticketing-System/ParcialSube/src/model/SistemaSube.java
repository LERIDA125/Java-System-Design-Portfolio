package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaSube {

    private List<Usuario> usuarios;
    private List<Viaje> viajes;
    private List<Tarjeta> tarjetas;

    public SistemaSube(List<Usuario> usuarios, List<Viaje> viajes, List<Tarjeta> tarjetas) {
        this.usuarios = usuarios;
        this.viajes = viajes;
        this.tarjetas = tarjetas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public boolean agregarUsuario(long dni, String nombre, String apellido, boolean tieneDescuento) throws Exception {
        if (traerUsuarioDni(dni) != null) {
            throw new Exception("El usuario ya existe");
        }
        int id = 1;
        if (!usuarios.isEmpty()) {
            id = usuarios.get(usuarios.size() - 1).getId() + 1;
        }
        return usuarios.add(new Usuario(id, tieneDescuento, nombre, apellido, dni));
    }

    public Usuario traerUsuarioDni(long dni) {
        for (Usuario u : usuarios) {
            if (u.getDni() == dni) {
                return u;
            }
        }
        return null;
    }

    public boolean agregarTarjeta(Usuario usuario, String codigo) throws Exception {
        return tarjetas.add(new Tarjeta(usuario, codigo));
    }

    public List<Viaje> traerViaje(LocalDateTime desde, LocalDateTime hasta) {
        List<Viaje> resultado = new ArrayList<>();
        for (Viaje v : viajes) {
            if (!v.getFechaHoraViaje().isBefore(desde) && !v.getFechaHoraViaje().isAfter(hasta)) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public double calcularTotalFacturadoEntreFechas(LocalDateTime desde, LocalDateTime hasta) {
        double total = 0;
        List<Viaje> viajesEnFecha = traerViaje(desde, hasta);
        for (Viaje v : viajesEnFecha) {
            total += v.totalAPagar();
        }
        return total;
    }

    public boolean agregarViaje(Tarjeta tarjeta, String linea, LocalDateTime fechaHoraViaje, double precio) {
        return viajes.add(new Viaje(tarjeta, linea, fechaHoraViaje, precio));
    }

    public Tarjeta traerTarjeta(String codigo) {
        for (Tarjeta t : tarjetas) {
            if (t.getCodigo().equals(codigo)) {
                return t;
            }
        }
        return null;
    }
}