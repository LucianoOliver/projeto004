package br.com.curso.ordenacao;

public class Conta implements Comparable<Conta> {

	private int numero;
	private String titular;

	public Conta(int numero, String titular) {

		this.numero = numero;
		this.titular = titular;

	}

	@Override
	public String toString() {
		return "numero=" + numero + "";
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		if (this.numero < outraConta.numero) {
			return -1;
		}
		if (this.numero > outraConta.numero) {
			return 1;
		}
		return 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	

}
