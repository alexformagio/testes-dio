package com.formagio.FirstJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsultarDadosTest {
	
	@BeforeAll
	static void configurarConexao() {
		BancoDeDados.iniciarConexao();
		
	}
	
	@BeforeEach
	void insereDados() {
		BancoDeDados.insereDados();
	}
	
	@AfterEach
	void removeDados() {
		BancoDeDados.removeDados();
	}

	@Test
	void validarDadosRetorno() {
		Assertions.assertTrue(true);
		System.out.println("rodou teste 1");
	}
	
	@Test
	void validarDadosRetorno2() {
		Assertions.assertTrue(true);
		System.out.println("rodou teste 2");
	}	
	
	@AfterAll
	static void fecharConexao() {
		BancoDeDados.finalizarConexao();
		
	}

}
