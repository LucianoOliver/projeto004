package br.com.curso.banco;

public class Conta {
	int numero;
    double saldo;
    Cliente titular;
    
    
//    void saca(double quantidade) {
//        double novoSaldo = this.saldo - quantidade; 
//        this.saldo = novoSaldo;
//    }
//
    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
    
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    
    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            // não deu pra sacar!
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }
}
