package traba3;

import Repositorio.RepositorioPessoaFisica;
import Repositorio.RepositorioPessoaJurdica;

public class Testando {

	public static void main(String[] args) {
		testaPF();
		testaPJ();

	}

	private static void testaPF() {
		RepositorioPessoaFisica cpf = new RepositorioPessoaFisica();
		String cpfApagar="92185624288";

		PessoaFisica aluno1 = new PessoaFisica();
		aluno1.setCpf("12235340733");
		aluno1.setNome("Ryan");

		PessoaFisica aluno2 = new PessoaFisica();
		aluno2.setCpf("92485424338");
		aluno2.setNome("Andre");

		cpf.inseri(aluno1);
		cpf.inseri(aluno2);

		System.out.println("Lista");
		for (int i = 0; i < cpf.retornaLista().size(); i++) {
			PessoaFisica pf = (PessoaFisica) cpf.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pf.getCpf() + "\n");
			System.out.println("nome: " + pf.getNome() + "\n");
		}

		aluno1.setNome("Ryan Alves");

		if (cpf.atualiza(aluno1)) {
			for (int i = 0; i < cpf.retornaLista().size(); i++) {
				PessoaFisica pf = (PessoaFisica) cpf.retornaLista().get(i);
				System.out.println("------------------------");
				System.out.println("cpf: " + pf.getCpf() + "\n");
				System.out.println("nome: " + pf.getNome() + "\n");
			}
		}

		
		if (cpf.apaga(cpfApagar)) {
			System.out.println("pessoa fisica apagada - cpf: " + cpfApagar );
		} else {
			System.out.println("pessoa fisica não encontrada");
		}

		System.out.println("Lista Atualizada");
		for (int i = 0; i < cpf.retornaLista().size(); i++) {
			PessoaFisica pf = (PessoaFisica) cpf.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pf.getCpf() + "\n");
			System.out.println("nome: " + pf.getNome() + "\n");
		}

	}

	private static void testaPJ() {
		RepositorioPessoaJurdica cnpj = new RepositorioPessoaJurdica();
		String cnpjApagar="28.272.613/0001-05";

		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setCnpj("27.458.181/0001-05");
		pj1.setNome("Empresa 01");

		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setCnpj("33.171.713/0001-05");
		pj2.setNome("Empresa 02");

		cnpj.inseri(pj1);
		cnpj.inseri(pj2);

		System.out.println("Lista");
		for (int i = 0; i < cnpj.retornaLista().size(); i++) {
			PessoaJuridica pj = (PessoaJuridica) cnpj.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pj.getCnpj() + "\n");
			System.out.println("nome: " + pj.getNome() + "\n");
		}

		pj1.setNome("Empresa 01 - Atualizada");

		if (cnpj.atualiza(pj1)) {
			for (int i = 0; i < cnpj.retornaLista().size(); i++) {
				PessoaJuridica pj = (PessoaJuridica) cnpj.retornaLista().get(i);
				System.out.println("------------------------");
				System.out.println("cpf: " + pj.getCnpj() + "\n");
				System.out.println("nome: " + pj.getNome() + "\n");
			}
		}

		// existe este cnpj
		if (cnpj.apaga(cnpjApagar)) {
			System.out.println("pessoa juridica apagada - cnpj: "+ cnpjApagar);
		} else {
			System.out.println("pessoa juridica não encontrada");
		}

		System.out.println("\n\n\n Lista Atualizada");
		for (int i = 0; i < cnpj.retornaLista().size(); i++) {
			PessoaJuridica pj = (PessoaJuridica) cnpj.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pj.getCnpj() + "\n");
			System.out.println("nome: " + pj.getNome() + "\n");
		}

	}

}