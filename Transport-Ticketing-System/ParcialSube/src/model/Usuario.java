package model;

public class Usuario {

    private int id;
    private boolean tieneDescuento;
    private String nombre;
    private String apellido;
    private long dni;

    public Usuario(int id, boolean tieneDescuento, String nombre, String apellido, long dni) {
        this.id = id;
        this.tieneDescuento = tieneDescuento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    @Override
    public String toString() {
        return "Usuario [ id =" + id  + ", dni =" + dni + ", nombre =" +nombre + " apellido = "+ apellido + ", tiene descuento = " + tieneDescuento + "]";
    }
}
