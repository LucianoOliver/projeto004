package br.com.curso.padroesprojeto;

public class Pagamento {
	int numero;
    String titular;
    double saldo;
    double valor;
    String intem;
    
    void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade; 
        this.saldo = novoSaldo;
    }

	public int getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isService() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isProduto() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getItem() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean desejaReceberConfirmacao() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
