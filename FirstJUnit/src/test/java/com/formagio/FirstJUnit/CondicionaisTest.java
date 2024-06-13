package com.formagio.FirstJUnit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CondicionaisTest {

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void validarAlgoSomenteNesseOS() {
		Assumptions.assumeTrue("formagio".equals(System.getenv("USER")));
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named="USER",matches = "formagio")
	void validarAlgoSomenteNesseUsuario() {
		Assumptions.assumeTrue("formagio".equals(System.getenv("USER")));
	}
	
	@Test
	@EnabledOnJre(value = JRE.JAVA_8)
	void validarAlgoSomenteNessaJRE() {
		Assumptions.assumeTrue("formagio".equals(System.getenv("USER")));
	}	
	
}
