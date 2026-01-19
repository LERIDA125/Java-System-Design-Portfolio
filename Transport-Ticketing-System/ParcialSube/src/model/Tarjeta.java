package model;

public class Tarjeta {
    private Usuario usuario;
    private String codigo;

    public Tarjeta(Usuario usuario, String codigo) throws Exception {
        this.usuario = usuario;
        setCodigo(codigo);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        if (!validarCodigo(codigo)) {
            throw new Exception("El código ingresado no puede tener menos de 10 dígitos");
        }
        this.codigo = codigo;
    }

    private boolean validarCodigo(String codigo) {
        return codigo != null && codigo.length() >= 10;
    }

    @Override
    public String toString() {
        return "Tarjeta [Usuario=" + usuario.getNombre() + ", Codigo=" + codigo + "]";
    }
}