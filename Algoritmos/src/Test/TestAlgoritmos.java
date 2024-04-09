package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Algoritmos;

class TestAlgoritmos {

	static Algoritmos s1;

	@Test
	void sumatorioAlgoritmos() {

		int factorialEsperado = 120;
		int factorialObtenido = s1.factorial(5);
		assertEquals(factorialEsperado, factorialObtenido);

	}

}