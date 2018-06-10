package br.com.curso.orientacaoobjetos;

public class TestaBanco {

	public static void main(String[] args) {

		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Sliveira";
		paulo.cpf = "222.333.666.66";
		paulo.profissao = "analista";

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		// essa linha que faz a composição da OO.
		contaDoPaulo.titular = paulo;

		// System.out.println(contaDoPaulo.titular.nome);
		// -----------------------------------------------------------------------------
		Cliente maria = new Cliente();
		maria.nome = "Maria";
		maria.cpf = "222.333.666.66";
		maria.profissao = "analista";

		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(200);
		// essa linha que faz a composição da OO.
		// contaDoPaulo.titular = paulo;
		contaDaMaria.titular = new Cliente();
		System.out.println(contaDaMaria.titular);
		contaDaMaria.titular.nome = "Maria";

		System.out.println(contaDaMaria.titular.nome);
		
		Cliente luc = new Cliente();
		luc.nome = "Luciano Rocha";
		luc.cpf = "111.111.111.11";
		luc.profissao = "analista";
		
		Conta contaLuciano = new Conta();
		contaLuciano.deposita(1500);
		contaLuciano.titular = luc;
		
		System.out.println(contaLuciano.titular.nome);

	}

}
