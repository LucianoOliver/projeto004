package br.com.curso.padroesprojeto;

import br.com.curso.orientacaoobjetos.Conta;

public class PadroesProjeto {
	
	private static final int TAXA_A_RETER = 10;

	public void processa(Pagamento aPagar) {
		if(aPagar.isService() && aPagar.getValor() > 300) {
			
			impostos.retem(aPagar.getValor() * TAXA_A_RETER);
		}else if(aPagar.isProduto()) {
			estoque.diminui(aPagar.getItem());
		}
		
		Conta.executa(aPagar);
		
		if (aPagar.desejaReceberConfirmacao()) {
			emails.enviaConfirmacao(aPagar);
		}
		
		
	}

}
