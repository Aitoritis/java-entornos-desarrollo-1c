package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Algoritmos;

class TestAlgoritmos {

	static Algoritmos s1;

	@Test
	void sumatorio1() {

		int factorialEsperado = 120;
		int factorialObtenido = s1.factorial(5);
		assertEquals(factorialEsperado, factorialObtenido);

	}
	
	@Test
	void sumatorioParamIncorrecto() {
		
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
				() -> Algoritmos.sumatorio(-1));
		
		String esperado = "El número debe ser igual o superior a 0";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
		
	}

}