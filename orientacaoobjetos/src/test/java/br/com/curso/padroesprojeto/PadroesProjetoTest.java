package br.com.curso.padroesprojeto;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.curso.orientacaoobjetos.Cliente;

public class PadroesProjetoTest {

	
	
	@Test
	public void testProduto() {
				
		PadroesProjeto padroesProjeto = new PadroesProjeto();
		Pagamento aPagar = new Pagamento();
		aPagar.valor  =301;
		aPagar.isService();
		aPagar.desejaReceberConfirmacao();
		padroesProjeto.processa(aPagar);
		//assertEquals(7000, padroesProjeto.processa(aPagar));
	}
}
