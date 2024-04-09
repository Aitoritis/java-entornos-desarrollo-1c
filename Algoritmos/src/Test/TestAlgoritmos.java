package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Algoritmos;

class TestAlgoritmos {

	static Algoritmos s1;

	@Test
	void sumatorioAlgoritmos() {

		int sumatorioEsperado = 10;
		int sumatorioObtenido = s1.sumatorio(4);
		assertEquals(sumatorioEsperado, sumatorioObtenido);

	}

}