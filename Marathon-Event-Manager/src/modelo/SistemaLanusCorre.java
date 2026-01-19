package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaLanusCorre {

	private List<ICategoria> lstCategorias;
	private List<Persona> lstPersonas;
	private List<Inscripcion> lstInscripcion;
	
	public SistemaLanusCorre() {
		super();
		this.lstCategorias = new ArrayList<ICategoria>();
		this.lstPersonas = new ArrayList<Persona>();
		this.lstInscripcion = new ArrayList<Inscripcion>();
	}
	public List<ICategoria> getLstCategorias() {
		return lstCategorias;
	}
	public void setLstCategorias(List<ICategoria> lstCategorias) {
		this.lstCategorias = lstCategorias;
	}
	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}
	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}
	public List<Inscripcion> getLstInscripcion() {
		return lstInscripcion;
	}
	public void setLstInscripcion(List<Inscripcion> lstInscripcion) {
		this.lstInscripcion = lstInscripcion;
	}
	@Override
	public String toString() {
		return "SistemaLanusCorre [lstCategorias=" + lstCategorias + ", lstPersonas=" + lstPersonas
				+ ", lstInscripcion=" + lstInscripcion + "]";
	}
	
	
	//metodos;
	
	public boolean agregarGeneral(String caetgoria, int distancia, int edadDesde, int edadHasta) {
		int id = 1;

		if (!lstCategorias.isEmpty()) {
			id = lstCategorias.get(lstCategorias.size() - 1).getIdCategoria() + 1;
		}
		return lstCategorias.add(new General(id, caetgoria, distancia, edadDesde, edadHasta));
	}
	
	public boolean agregarDiscapacidad(String caetgoria, int distancia, boolean ciego, boolean movilidadReducida) {
		int id = 1;

		if (!lstCategorias.isEmpty()) {
			id = lstCategorias.get(lstCategorias.size() - 1).getIdCategoria() + 1;
		}
		return lstCategorias.add(new Discapacidad(id, caetgoria, distancia, ciego, movilidadReducida));
	}
	
	public Persona traerPersona(int dni) {
		Persona aux = null;
		int index = 0;

		while (aux == null && index < getLstPersonas().size()) {
			if (getLstPersonas().get(index).getDni() == dni) {
				aux = getLstPersonas().get(index);
			}
			index++;
		}
		return aux;
	}
	
	public boolean agregarPersona(int dni, String apellido, String nombre, LocalDate fNacimiento) {
		int id = 1;

		if (!lstPersonas.isEmpty()) {
			id = lstPersonas.get(lstPersonas.size() - 1).getIdPersona() + 1;
		}
		return lstPersonas.add(new Persona(id, dni, apellido, nombre, fNacimiento));
	}
	
	public ICategoria traerCategoria(int idCategoria) {
		ICategoria aux = null;
		int index = 0;

		while (aux == null && index < getLstCategorias().size()) {
			if (getLstCategorias().get(index).getIdCategoria() == idCategoria) {
				aux = getLstCategorias().get(index);
			}
			index++;
		}
		return aux;
	}
	
	public boolean agregarInscripcion(Persona persona, ICategoria categoria, LocalDate fechaCarrera) throws Exception{
		
		if(traerInscripcion(persona, categoria, fechaCarrera) != null) {
			throw new Exception("ERROR: la persona ya esta inscripta");
		}
		if(categoria instanceof General ) {
			if(((General) categoria).getEdadDesde()>fechaCarrera.getYear()-persona.getfNacimiento().getYear() || ((General) categoria).getEdadHasta()<fechaCarrera.getYear()-persona.getfNacimiento().getYear()) {
				throw new Exception("ERROR: la edad de la persona no corresponde a la categoria");
			}
			
		}
		
		int id = 1;

		if (!lstInscripcion.isEmpty()) {
			id = lstInscripcion.get(lstInscripcion.size() - 1).getIdInscripcion() + 1;
		}
		return lstInscripcion.add(new Inscripcion(id, persona, categoria, fechaCarrera));
	}
	
	public Inscripcion traerInscripcion(Persona persona, ICategoria categoria, LocalDate fechaCarrera) {
		Inscripcion aux = null;
		int index = 0;

		while (aux == null && index < getLstInscripcion().size()) {
			if (getLstInscripcion().get(index).getPersona().equals(persona) &&
					getLstInscripcion().get(index).getCategoria().equals(categoria) &&
					getLstInscripcion().get(index).getFechaCarrera().equals(fechaCarrera))
			{
				aux = getLstInscripcion().get(index);
			}
			index++;
		}
		return aux;
	}
	
}






















