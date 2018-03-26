package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.gov.serpro.quitacao.dominio.modelo.erro.ErrosQuitacao.CnpjInvalido;

public class CnpjTest {

	@Test
	public void valida_cnpj_sem_formatacao() {
		String cnpjInformado = "03014284000163";
		String cnpjEsperado = "03.014.284/0001-63";
		System.out.println(Cnpj.novo(cnpjInformado).toString());
		System.out.println(Cnpj.novo(cnpjInformado));

		assertEquals(cnpjEsperado, ""+Cnpj.novo(cnpjInformado));
		
	}
	
	@Test(expected=CnpjInvalido.class)
	public void valida_cnpj_excecao() {
		String cnpjInformado = "03014284000162";
		String cnpjEsperado = "03.014.284/0001-63";
		assertEquals(cnpjEsperado, Cnpj.novo(cnpjInformado).toString());
		
	}

}
