package br.example.projeto001;

import java.util.List;

public interface IRepositorioPessoa {

	public boolean inserirPessoa(Pessoa pessoa);
	public boolean deletePessoa(Pessoa pessoa);
	public boolean alterarPessoa(Pessoa pessoa);
	public List<Pessoa> mostrarPessoa();
	
}
