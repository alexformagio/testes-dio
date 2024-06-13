package com.formagio.FirstJUnit;

import java.util.logging.Logger;

public class BancoDeDados {
	private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
	
	public static void iniciarConexao() {
		LOGGER.info("Iniciou Conexão ....");
	}
	
	public static void finalizarConexao() {
		LOGGER.info("Finalizou Conexão ....");
	}
	
	public static void insereDados() {
		LOGGER.info("Inseriu dados no DB ....");
	}
	
	public static void removeDados() {
		LOGGER.info("remove Dados no DB ....");
	}	

}
