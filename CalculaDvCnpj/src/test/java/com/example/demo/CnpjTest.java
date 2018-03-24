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
	public void test2() {
	ValidaCnpj validadorCnpj = new ValidaCnpj();
	String cnpjCemFormatacao = "03.014.284/0001-63";
	String cnpjSemFormatacao = "00000000000000";
	
	
	System.out.println(validadorCnpj.isCNPJ(cnpjSemFormatacao));
	System.out.println(validadorCnpj.imprimeCNPJ(cnpjSemFormatacao));
	
	
	
	
	}

}
