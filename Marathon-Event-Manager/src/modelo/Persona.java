package modelo;

import java.time.LocalDate;

public class Persona {

	private int idPersona;
	private int dni;
	private String apellido;
	private String nombre; 
	private LocalDate fNacimiento;
	
	public Persona(int idPersona, int dni, String apellido, String nombre, LocalDate fNacimiento) {
		super();
		this.idPersona = idPersona;
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fNacimiento = fNacimiento;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", fNacimiento=" + fNacimiento + "\n]";
	}
	
	public int traerEdad(LocalDate fechaCarrera) {
		int edad = 0;
		
		if(getfNacimiento().isBefore(fechaCarrera)) {
			edad = fechaCarrera.getYear()-getfNacimiento().getYear();
		}else if(getfNacimiento().isAfter(fechaCarrera)){
			edad = (fechaCarrera.getYear()-getfNacimiento().getYear()+1);
		}		
		
		return edad;
	}

}
