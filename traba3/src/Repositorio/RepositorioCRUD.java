package Repositorio;

import java.util.List;

import traba3.Pessoa;

public interface RepositorioCRUD {
	
	public boolean atualiza(Pessoa pessoa);
	public boolean inseri(Pessoa pessoa);
	public boolean apaga(String identificador);
	public List<?> retornaLista();
}