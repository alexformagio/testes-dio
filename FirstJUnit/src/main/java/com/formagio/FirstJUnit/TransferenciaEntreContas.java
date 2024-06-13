package com.formagio.FirstJUnit;

public class TransferenciaEntreContas {
	
	public void transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("Valor deve ser maior que zero!");
		}
	}

}
