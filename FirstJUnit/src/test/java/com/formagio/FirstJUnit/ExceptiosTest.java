package com.formagio.FirstJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptiosTest {

	@Test
	void testarException() {
		Conta contaOrigem = new Conta(new Cliente("Alexandre"));
		Conta contaDestino = new Conta(new Cliente("Thais"));
		TransferenciaEntreContas tec = new TransferenciaEntreContas();
		Assertions.assertThrows(IllegalArgumentException.class, () -> tec.transferencia(contaOrigem, contaDestino, 0));
		
		Assertions.assertDoesNotThrow( () -> tec.transferencia(contaOrigem, contaDestino, 1));
	
		
	}

}
