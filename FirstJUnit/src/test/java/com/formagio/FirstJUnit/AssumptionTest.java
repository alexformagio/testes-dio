package com.formagio.FirstJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionTest {

	@Test
	void validarAlgoSomenteNesseUsuario() {
		Assumptions.assumeTrue("formagio".equals(System.getenv("USER")));
	}

}
