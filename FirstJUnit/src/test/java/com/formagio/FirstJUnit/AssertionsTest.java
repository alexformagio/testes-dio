package com.formagio.FirstJUnit;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

	@Test
	void validarLancamentos() {
		
		int[] primeiroLancamento = {10,11,12,13,14,15};
		//int[] segundoLancamento  = {10, 1, 2, 3, 4, 5};
		int[] segundoLancamento  = {10,11,12,13,14,15};
		
		assertArrayEquals(primeiroLancamento, segundoLancamento);
		
	}
	
	@Test
	void verificarSeNulo() {
		Pessoa pessoa = null;
		assertNull(pessoa, "Esta variavel está nula");
		Pessoa luciano = new Pessoa("Luciano", LocalDate.now());
		assertNotNull(luciano);
	}
	
	@Test
	void validarNumeroDeTiposDiferentes() {
		double valor = 5.0;
		int outroValor = 5;
		assertEquals(valor, outroValor);
	}

}
