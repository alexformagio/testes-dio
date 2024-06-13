package com.formagio.FirstJUnit;

import java.time.LocalDate;
//import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	private String nome;
	private LocalDate nascimento;
	
	public Pessoa(String nome, LocalDate nascimento) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public boolean isUpper18() {
		//Period period = Period.between(this.nascimento, LocalDate.now());
		//return (period.getYears() >= 18);
		return (this.getIdade() >= 18);
	}
	
	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
	}
	
	

}
