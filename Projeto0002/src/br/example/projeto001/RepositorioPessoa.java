package br.example.projeto001;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoa implements IRepositorioPessoa {

	public static  List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

	public boolean inserirPessoa(Pessoa pessoa) {

		try {

			listaPessoa.add(pessoa);

		} catch (Exception e) {

			return false;

		}

		return true;
	}

	public boolean deletePessoa(Pessoa pessoa) {

		try {

			listaPessoa.remove(pessoa);

		} catch (Exception e) {

			return false;

		}

		return true;
	}

	public boolean alterarPessoa(Pessoa pessoa) {

		return false;
	}

	public List<Pessoa> mostrarPessoa() {

		return listaPessoa;
	}


}
