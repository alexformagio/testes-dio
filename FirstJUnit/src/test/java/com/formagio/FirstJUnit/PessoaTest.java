package com.formagio.FirstJUnit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
	
	@Test
	public void testarSeEMaiorDeIdade() {
		Pessoa pessoa = new Pessoa("Alexandre", LocalDate.of(2020, 1, 1));
		Assertions.assertFalse(pessoa.isUpper18());
	}
	
	@Test
	public void testarIdade() {
		Pessoa pessoa = new Pessoa("Alexandre", LocalDate.of(2020, 1, 1));
		Assertions.assertEquals(4, pessoa.getIdade());
	}

}
