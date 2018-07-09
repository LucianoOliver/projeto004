package br.com.curso.orientacaoobjetos;

import br.com.curso.padroesprojeto.Pagamento;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public void deposita(double valor) {
		this.saldo += valor;
	}


	public static void executa(Pagamento aPagar) {
		// TODO Auto-generated method stub
		
	}
}
