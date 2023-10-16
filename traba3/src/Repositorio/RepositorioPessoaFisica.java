package Repositorio;

import java.util.ArrayList;
import java.util.List;

import traba3.Pessoa;
import traba3.PessoaFisica;

public class RepositorioPessoaFisica implements RepositorioCRUD {

	List<PessoaFisica> listaPF = new ArrayList<PessoaFisica>();

	@Override
	public boolean atualiza(Pessoa pessoa) {
		boolean ok = false;
		PessoaFisica pf = (PessoaFisica) pessoa;
		try {
			for (int i = 0; i < listaPF.size(); i++) {
				if (listaPF.get(i).getCpf().equals(pf.getCpf())) {
					listaPF.get(i).setNome(pf.getNome());
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}

		return ok;
	}

	@Override
	public boolean inseri(Pessoa pessoa) {
		boolean ok = false;
		try {
			listaPF.add((PessoaFisica) pessoa);
			ok = true;
		} catch (Exception e) {
			ok = false;
		}
		// TODO Auto-generated method stub
		return ok;
	}

	@Override
	public boolean apaga(String identificador) {
		boolean ok = false;
		try {
			for (int i = 0; i < listaPF.size(); i++) {
				if (listaPF.get(i).getCpf().equals(identificador)) {
					listaPF.remove(i);
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}

		return ok;
	}

	@Override
	public List<?> retornaLista() {
		return listaPF;
	}

}