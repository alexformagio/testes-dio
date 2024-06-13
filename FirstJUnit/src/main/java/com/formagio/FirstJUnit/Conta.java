package com.formagio.FirstJUnit;

import java.util.Objects;

public class Conta {
	private static final int AGENCIA=1;
	private static int sequencial = 1;
	
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    

	protected Conta(Cliente cliente) {
		this.agencia=AGENCIA;
		this.numero=getSequencial();
		this.cliente = cliente;
	}
	
	public static int getSequencial() {
		return sequencial++;
	}


	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return agencia == other.agencia && numero == other.numero;
	}
	
	
	public double sacar(double valor) {
		this.saldo-= valor;
		return this.saldo;
	}
	
	public double depositar(double valor) {
        this.saldo += valor;
        return this.saldo;
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
	public double transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		return this.saldo;
	}
	

	
	public void visualizarExtrato() {
		System.out.println(String.format("Titular : %s", cliente.getNome()));
		System.out.println(String.format("Agencia : %d", agencia));
		System.out.println(String.format("Numero : %d", numero));
		System.out.println(String.format("Saldo : %.2f", saldo));
	}
	
	
   
}
