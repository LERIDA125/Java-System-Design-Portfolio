package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.AerolineasArgentinas;
import modelo.Aeropuerto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AerolineasArgentinas aerolinea = new AerolineasArgentinas();
	
	try { 
		
	aerolinea.agregarAeropuerto("CRD", "Comodoro Rivadavia");
	aerolinea.agregarAeropuerto("BRC", "bariloche");
	aerolinea.agregarAeropuerto("3JUJ", "jujuy");	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println(aerolinea.getListaAeropuertos().toString());
	
	
	System.out.println(aerolinea.traerAeropuerto("CRD"));
	
	
	aerolinea.agregarPasajero("nano", "boca", 42111111, false);
	aerolinea.agregarPasajero("como tan", "muchacho", 40123123, true);
	
	System.out.println(aerolinea.getListaPasajeros().toString());
	
	
	System.out.println(aerolinea.traerPasajero(40123123));
	
	try {
		
		aerolinea.agregarVuelo(LocalDate.of(2024, 9, 28), LocalTime.of(10, 30), LocalTime.of(12, 30), aerolinea.traerAeropuerto("CRD"), aerolinea.traerAeropuerto("BRC"));
		aerolinea.agregarVuelo(LocalDate.of(2024, 10, 2), LocalTime.of(9, 30), LocalTime.of(14, 30), aerolinea.traerAeropuerto("BRC"), aerolinea.traerAeropuerto("CRD"));
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	System.out.println(aerolinea.getListaVuelos().toString());
	
	
	System.out.println(aerolinea.traerVuelo(2));
	
	
	System.out.println(aerolinea.traerVuelo(2).calcularTiempoVuelo());
	

}
