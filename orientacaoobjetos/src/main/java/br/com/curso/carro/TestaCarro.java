package br.com.curso.carro;

public class TestaCarro {
	
	public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        // liga o carro
        meuCarro.liga();

        // acelera o carro
        meuCarro.acelera(100);
        System.out.println(meuCarro.velocidadeAtual);
        
        System.out.println(meuCarro.pegaMarcha());
    }

}
