package com.example.demo;

import br.gov.serpro.quitacao.dominio.modelo.erro.ErrosQuitacao.CnpjInvalido;

public class Cnpj {

	private static final int[] pesoCNPJ = { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };
	private String cnpjTexto;
	private String cnpj;
	
	public static Cnpj novo(String cnpj) {
		if (isValidCNPJ(cnpj)) {
			Cnpj instancia = new Cnpj();
			instancia.cnpj = cnpj;
			return instancia;
		} else {
			throw new CnpjInvalido(cnpj);
		}
	}

	@Override
	public String toString() {
		//return cnpj;
		return (cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"
				+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14));
	}
	
	private static int calcularDigito(String str, int[] peso) {
		int soma = 0;
		for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
			digito = Integer.parseInt(str.substring(indice, indice + 1));
			soma += digito * peso[peso.length - str.length() + indice];
		}
		soma = 11 - soma % 11;
		return soma > 9 ? 0 : soma;
	}

	public static boolean isValidCNPJ(String cnpj) {
		cnpj = retiraFormatacaoCnpj(cnpj);
		if ((cnpj == null) || (cnpj.length() != 14) || cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222")
				|| cnpj.equals("33333333333333") || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
				|| cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888")
				|| cnpj.equals("99999999999999"))
			return false;

		Integer digito1 = calcularDigito(cnpj.substring(0, 12), pesoCNPJ);
		Integer digito2 = calcularDigito(cnpj.substring(0, 12) + digito1, pesoCNPJ);
		return cnpj.equals(cnpj.substring(0, 12) + digito1.toString() + digito2.toString());
	}
	
	public static String retiraFormatacaoCnpj(String doc) {
		if (doc.contains(".")) {
			doc = doc.replace(".", "");
		}
		if (doc.contains("-")) {
			doc = doc.replace("-", "");
		}
		if (doc.contains("/")) {
			doc = doc.replace("/", "");
		}
		return doc;
	}

	
	public  String formataCnpj(String CNPJ) {
		return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." + CNPJ.substring(5, 8) + "/"
				+ CNPJ.substring(8, 12) + "-" + CNPJ.substring(12, 14));
	}
	
	public Integer converteCnpjParaNumerico(String CNPJ) {
		return Integer.parseInt(CNPJ);
	}

	public String converteCnpjParaString(Long CNPJ) {
		cnpjTexto = String.format("%014d", CNPJ);
		return formataCnpj(cnpjTexto);
	}
	


	public static void main(String[] args) {
		System.out.printf("CNPJ Valido:%s \n", Cnpj.isValidCNPJ("03.014.284/0001-63"));
	}

}
