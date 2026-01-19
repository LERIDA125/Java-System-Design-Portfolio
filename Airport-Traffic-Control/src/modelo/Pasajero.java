package modelo;

public class Pasajero {
	
	private int idPasajero;
	private String apellidoString;
	private String nombreString;
	private int dni;
	private boolean viajeroFrecuente;
	
public Pasajero(int idPasajero, String apellidoString, String nombreString, int dni, boolean viajeroFrecuente) {
		super();
		this.idPasajero = idPasajero;
		this.apellidoString = apellidoString;
		this.nombreString = nombreString;
		this.dni = dni;
		this.viajeroFrecuente = viajeroFrecuente;
	}

public int getIdPasajero() {
	return idPasajero;
}

public void setIdPasajero(int idPasajero) {
	this.idPasajero = idPasajero;
}

public String getApellidoString() {
	return apellidoString;
}

public void setApellidoString(String apellidoString) {
	this.apellidoString = apellidoString;
}

public String getNombreString() {
	return nombreString;
}

public void setNombreString(String nombreString) {
	this.nombreString = nombreString;
}

public int getDni() {
	return dni;
}

public void setDni(int dni) {
	this.dni = dni;
}

public boolean isViajeroFrecuente() {
	return viajeroFrecuente;
}

public void setViajeroFrecuente(boolean viajeroFrecuente) {
	this.viajeroFrecuente = viajeroFrecuente;
}

@Override
public String toString() {
	return "Pasajero [idPasajero=" + idPasajero + ", apellidoString=" + apellidoString + ", nombreString="
			+ nombreString + ", dni=" + dni + ", viajeroFrecuente=" + viajeroFrecuente + "]";
}
	


}
