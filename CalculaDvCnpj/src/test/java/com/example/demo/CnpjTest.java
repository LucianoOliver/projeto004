package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CnpjTest {

	//@Test
	public void test() {
	Cnpj validadorCnpj = new Cnpj();
	String cnpjCemFormatacao = "03.014.284/0001-63";
	String cnpjSemFormatacao = "03014284000163";
	
	System.out.println(validadorCnpj.isValidCNPJ(cnpjSemFormatacao));
	
	
	
	
	}
	
	@Test
	public void valida_cnpj_com_formatacao() {
	ValidaCnpj validadorCnpj = new ValidaCnpj();
	String cnpjValidado = null;
	String cnpjComFormatacao = "03.014.284/0001-63";
	assertEquals("true", ""+validadorCnpj.isCNPJ(cnpjComFormatacao));
	String cnpjEsperado = "03.014.284/0001-63";
	boolean isValid =  validadorCnpj.isCNPJ(cnpjComFormatacao);
	if(isValid) {
		cnpjValidado = validadorCnpj.retiraFormatacaoCnpj(cnpjEsperado);
	}
	String cnpjRetornado = validadorCnpj.formataCnpj(cnpjValidado);
	
	assertEquals(cnpjEsperado, cnpjRetornado);
	System.out.println("E para retornar um boolean: "+validadorCnpj.isCNPJ(cnpjComFormatacao));
	//System.out.println("E para retornar o CNPJ Formatado"+validadorCnpj.mascaraCnpj(cnpjSemFormatacao));
	
	
	
	
	}
	
	@Test
	public void valida_cnpj_sem_formatacao() {
		ValidaCnpj validadorCnpj = new ValidaCnpj();
		String cnpjSemFormatacao = "03014284000163";
		assertEquals("true", ""+validadorCnpj.isCNPJ(cnpjSemFormatacao));
		assertEquals("03.014.284/0001-63", ""+validadorCnpj.formataCnpj(cnpjSemFormatacao));
	
	System.out.println(validadorCnpj.isCNPJ(cnpjSemFormatacao));
	System.out.println(validadorCnpj.formataCnpj(cnpjSemFormatacao));
	
	
	}
	
	@Test
	public void valida_cnpj_com_zeros_a_frente_formatacao() {
		ValidaCnpj validadorCnpj = new ValidaCnpj();
		String cnpjSemFormatacao = "00000000000191";
		assertEquals("true", ""+validadorCnpj.isCNPJ(cnpjSemFormatacao));
		assertEquals("00.000.000/0001-91", ""+validadorCnpj.formataCnpj(cnpjSemFormatacao));
	
	System.out.println(validadorCnpj.isCNPJ(cnpjSemFormatacao));
	System.out.println(validadorCnpj.formataCnpj(cnpjSemFormatacao));
	
	
	}
	
	@Test
	public void valida_conversao_cnpj_para_inteiro() {
		ValidaCnpj validadorCnpj = new ValidaCnpj();
		String cnpjValidado = null;
		String cnpjSemFormatacao = "00000000000191";
		boolean isValid =  validadorCnpj.isCNPJ(cnpjSemFormatacao);
		if(isValid) {
			cnpjValidado = cnpjSemFormatacao;
		}
		
	 Integer cnpjEsperado = 191;
		
		//assertEquals(00000000000191L, validadorCnpj.converteCnpjParaNumerico(cnpjValidado), 0.0);
		assertEquals(cnpjEsperado, validadorCnpj.converteCnpjParaNumerico(cnpjValidado));
	
	
	
	
	}

}
