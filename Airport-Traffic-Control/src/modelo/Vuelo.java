package modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Vuelo {
	
	private int idVuelo;
	private LocalDate fechaDate;
	private LocalTime horaSalidaLocalTime;
	private LocalTime horaLLegadaLocalTime;
	private Aeropuerto salidaAeropuerto;
	private Aeropuerto llegadAeropuerto;
	private List<Pasajero> pasajerosList;


public Vuelo(int idVuelo, LocalDate fechaDate, LocalTime horaSalidaLocalTime, LocalTime horaLLegadaLocalTime,
			Aeropuerto salidaAeropuerto, Aeropuerto llegadAeropuerto, List<Pasajero> pasajerosList) {
		super();
		this.idVuelo = idVuelo;
		this.fechaDate = fechaDate;
		this.horaSalidaLocalTime = horaSalidaLocalTime;
		this.horaLLegadaLocalTime = horaLLegadaLocalTime;
		this.salidaAeropuerto = salidaAeropuerto;
		this.llegadAeropuerto = llegadAeropuerto;
		this.pasajerosList = pasajerosList;
	}


public int getIdVuelo() {
	return idVuelo;
}


public void setIdVuelo(int idVuelo) {
	this.idVuelo = idVuelo;
}


public LocalDate getFechaDate() {
	return fechaDate;
}


public void setFechaDate(LocalDate fechaDate) {
	this.fechaDate = fechaDate;
}


public LocalTime getHoraSalidaLocalTime() {
	return horaSalidaLocalTime;
}


public void setHoraSalidaLocalTime(LocalTime horaSalidaLocalTime) {
	this.horaSalidaLocalTime = horaSalidaLocalTime;
}


public LocalTime getHoraLLegadaLocalTime() {
	return horaLLegadaLocalTime;
}


public void setHoraLLegadaLocalTime(LocalTime horaLLegadaLocalTime) {
	this.horaLLegadaLocalTime = horaLLegadaLocalTime;
}


public Aeropuerto getSalidaAeropuerto() {
	return salidaAeropuerto;
}


public void setSalidaAeropuerto(Aeropuerto salidaAeropuerto) {
	this.salidaAeropuerto = salidaAeropuerto;
}


public Aeropuerto getLlegadAeropuerto() {
	return llegadAeropuerto;
}


public void setLlegadAeropuerto(Aeropuerto llegadAeropuerto) {
	this.llegadAeropuerto = llegadAeropuerto;
}


public List<Pasajero> getPasajerosList() {
	return pasajerosList;
}


public void setPasajerosList(List<Pasajero> pasajerosList) {
	this.pasajerosList = pasajerosList;
}


@Override
public String toString() {
	return "\nVuelo [idVuelo=" + idVuelo + ", fechaDate=" + fechaDate + ", horaSalidaLocalTime=" + horaSalidaLocalTime
			+ ", horaLLegadaLocalTime=" + horaLLegadaLocalTime + ", salidaAeropuerto=" + salidaAeropuerto
			+ ", llegadAeropuerto=" + llegadAeropuerto + ", pasajerosList=" + pasajerosList + "]";
}
	
public int calcularTiempoVuelo () {
	
	int horaDeSalida = horaSalidaLocalTime.getHour()*60 + horaSalidaLocalTime.getMinute();
	int horaDeLLegada = horaLLegadaLocalTime.getHour()*60 + horaLLegadaLocalTime.getMinute();
	
	return (horaDeLLegada - horaDeSalida);
}


}
