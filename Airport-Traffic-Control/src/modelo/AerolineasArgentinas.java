package modelo;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



public class AerolineasArgentinas {
	
	private List<Aeropuerto> listaAeropuertos;
	private List<Pasajero> listaPasajeros;
	private List<Vuelo> listaVuelos;

public AerolineasArgentinas() {
		super();
	this.listaAeropuertos = new ArrayList<Aeropuerto>();
	this.listaPasajeros = new ArrayList<Pasajero>();
	this.listaVuelos = new ArrayList<Vuelo>();
	
}

public List<Aeropuerto> getListaAeropuertos() {
	return listaAeropuertos;
}

public List<Pasajero> getListaPasajeros() {
	return listaPasajeros;
}


public List<Vuelo> getListaVuelos() {
	return listaVuelos;
}




	
public boolean agregarAeropuerto (String codAeropuerto, String aeropuerto) throws Exception{
	if (traerAeropuerto(codAeropuerto) != null) {
		throw new Exception("ya existe un aeropuerto con el mismo codigo");
	}
	
	int id = 1;
	if(this.listaAeropuertos.size()>0) {
		int tam = listaAeropuertos.size();
		id = listaAeropuertos.get(tam-1).getIdAeropuerto() + 1;
		//id = this.listaAeropuertos.get(this.listaAeropuertos.size()-1).getIdAeropuerto()
	}
	return this.listaAeropuertos.add(new Aeropuerto (id, codAeropuerto, aeropuerto));
}

public Aeropuerto traerAeropuerto (String codAeropuerto) {
	Aeropuerto aeropuertoEncontrado = null;
	int i = 0;
	while (i<listaAeropuertos.size() && aeropuertoEncontrado == null) {
		if(listaAeropuertos.get(i).getCodAeropuerto() == codAeropuerto) {
			aeropuertoEncontrado = listaAeropuertos.get(i);
		}
		i++;
	}
	return aeropuertoEncontrado;
}

public Boolean agregarPasajero (String apellido, String nombre, int dni, boolean viajeroFrecuente) {
	int id = 1;
	if (this.listaPasajeros.size()>0) {
		int tam = listaPasajeros.size();
		id = listaPasajeros.get(tam-1).getIdPasajero() + 1;
	}
	return this.listaPasajeros.add(new Pasajero(id, apellido, nombre, dni, viajeroFrecuente));
}

public Pasajero traerPasajero (int dni) {
	Pasajero pasajeroEncontrado = null;
	int i = 0;
	while (i<listaPasajeros.size() && pasajeroEncontrado == null) {
		if(listaPasajeros.get(i).getDni() == dni) {
			pasajeroEncontrado = listaPasajeros.get(i);
		}
		i++;
	}
	return pasajeroEncontrado;
}

public boolean agregarVuelo (LocalDate fecha, LocalTime horaSalida, LocalTime horaLLegada, Aeropuerto salidaAeropuerto, Aeropuerto llegadAeropuerto)throws Exception {
	if (salidaAeropuerto.getCodAeropuerto().equals(llegadAeropuerto.getCodAeropuerto())) {
		throw new Exception("es el mismo aeropuerto chinchulin");
	}
	
	int id = 1;
	if(this.listaVuelos.size()>0) {
		int tam = listaVuelos.size();
		id = listaVuelos.get(tam-1).getIdVuelo() + 1;
		//id = this.listaAeropuertos.get(this.listaAeropuertos.size()-1).getIdAeropuerto()
	}
	return this.listaVuelos.add(new Vuelo(id, fecha, horaSalida, horaLLegada, salidaAeropuerto, llegadAeropuerto, listaPasajeros));
}


public Vuelo traerVuelo (int idVuelo) {
	
	Vuelo vueloEncontrado = null;
	int i = 0;
	while (i<listaVuelos.size() && vueloEncontrado == null) {
		if(listaVuelos.get(i).getIdVuelo() == idVuelo) {
			vueloEncontrado = listaVuelos.get(i);
		}
		i++;
	}
	return vueloEncontrado;
	
}

public boolean agregarPasajeroAvuelo(Pasajero pasajero1) {
	
	return this.pasajerosList.add(pasajero1);
}


}

