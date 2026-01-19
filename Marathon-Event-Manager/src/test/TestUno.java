package test;

import java.time.LocalDate;

import modelo.SistemaLanusCorre;

public class TestUno {

	public static void main(String[] args) {
		
		SistemaLanusCorre sis = new SistemaLanusCorre();

		System.out.println("\n\ntest 1");
		try {
			
			sis.agregarGeneral("de 18 a 25", 7, 18, 25);
			sis.agregarGeneral("de 26 a 35", 7, 26, 35);
			sis.agregarGeneral("de 36 a 45", 7, 36, 45);
			sis.agregarGeneral("de 46 a 99", 7, 46, 99);
			
			sis.agregarDiscapacidad("vision reducida", 7, true, false);
			sis.agregarDiscapacidad("movilidad reducida", 7, false, true);
			
			System.out.println(sis.getLstCategorias());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 2");
		try {
			
			sis.agregarPersona(11111111, "Rodriguez", "Paula", LocalDate.of(1990, 12, 19));
			sis.agregarPersona(22222222, "Perez", "Rodrigo", LocalDate.of(1999, 12, 24));
			
			System.out.println(sis.getLstPersonas());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 3");
		try {
			
			System.out.println(sis.traerPersona(11111111));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 4");
		try {
			
			System.out.println(sis.traerPersona(11111111).traerEdad(LocalDate.of(2024, 12, 19)));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 5");
		try {
			
			System.out.println(sis.traerCategoria(1));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 6");
		try {
			
			sis.agregarInscripcion(sis.traerPersona(22222222), sis.traerCategoria(1), LocalDate.of(2024, 12, 19));
			
			System.out.println(sis.getLstInscripcion());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 7");
		try {
			
			sis.agregarInscripcion(sis.traerPersona(11111111), sis.traerCategoria(2), LocalDate.of(2024, 12, 19));
			
			System.out.println(sis.getLstInscripcion());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 8");
		try {
			
			System.out.println(sis.traerInscripcion(sis.traerPersona(11111111), sis.traerCategoria(2), LocalDate.of(2024, 12, 19)));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 9");
		try {
			
			sis.agregarInscripcion(sis.traerPersona(11111111), sis.traerCategoria(1), LocalDate.of(2024, 12, 19));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\ntest 10");
		try {
			
			sis.agregarInscripcion(sis.traerPersona(11111111), sis.traerCategoria(2), LocalDate.of(2024, 12, 19));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
