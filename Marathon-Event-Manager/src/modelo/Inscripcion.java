package modelo;

import java.time.LocalDate;

public class Inscripcion {

	private int idInscripcion;
	private Persona persona;
	private ICategoria categoria;
	private LocalDate fechaCarrera;
	
	public Inscripcion(int idInscripcion, Persona persona, ICategoria categoria, LocalDate fechaCarrera) {
		super();
		this.idInscripcion = idInscripcion;
		this.persona = persona;
		this.categoria = categoria;
		this.fechaCarrera = fechaCarrera;
	}

	public int getIdInscripcion() {
		return idInscripcion;
	}

	public void setIdInscripcion(int idInscripcion) {
		this.idInscripcion = idInscripcion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public ICategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ICategoria categoria) {
		this.categoria = categoria;
	}

	public LocalDate getFechaCarrera() {
		return fechaCarrera;
	}

	public void setFechaCarrera(LocalDate fechaCarrera) {
		this.fechaCarrera = fechaCarrera;
	}

	@Override
	public String toString() {
		return "Inscripcion [idInscripcion=" + idInscripcion + ", persona=" + persona + "]";
	}

}
