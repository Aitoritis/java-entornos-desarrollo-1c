package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Models.Persona;

class TestPersona2 {

	@Test
	void testPersonaEdad0() {

		Persona p = new Persona("Ay", "Miguel", 0);

		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();

		assertEquals(esperado, obtenido);

	}

	@Test
	void testPersonaEdad17() {

		Persona p = new Persona("Ay", "Miguel", 17);

		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();

		assertEquals(esperado, obtenido);

	}

	@Test
	void testPersonaEdad18() {

		Persona p = new Persona("Ay", "Miguel", 18);

		String esperado = "Mayor de edad";
		String obtenido = p.mostrarEdad();

		assertEquals(esperado, obtenido);

	}
	
	@Test
	void testPersonaEdad65() {

		Persona p = new Persona("Ay", "Miguel", 65);

		String esperado = "Jubilado";
		String obtenido = p.mostrarEdad();

		assertEquals(esperado, obtenido);

	}
	
	@Test
	void testPersonaEdadInvalidaMenos1() {
		
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				() -> new Persona("Ay", "Miguel", -1));
		
		String esperado = "La edad debe estar entre 0 y 130.";
		String obtenido = excepcion.getMessage();
		
		assertEquals(esperado, obtenido);
		
	}

}
