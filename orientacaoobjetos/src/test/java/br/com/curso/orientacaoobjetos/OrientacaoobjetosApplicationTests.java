package br.com.curso.orientacaoobjetos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrientacaoobjetosApplicationTests {

	@Test
	public void contextLoads() {
		Cliente cliente = new Cliente();
		cliente.cpf = "33333333333";
		cliente.nome = "Luciano";
		cliente.profissao = "Analista de Testes";
		
		System.out.println("Dados do cliente: " + cliente);
		System.out.println("Nome: "+ cliente.nome);
		
		Conta conta = new Conta();
		
		conta.agencia = 123456;
		conta.numero = 147896;
		conta.saldo = 5000;
		conta.titular = cliente;
		
		System.out.println("Titular da conta: "+ conta.titular.nome);
		
	}
	
	
	@Test
	public void testaSaldodaconta() {
		Conta conta = new Conta();
		conta.saldo = 500L;
		
		conta.deposita(1000L);
		System.out.println("Saldo da conta: "+conta.saldo);

		
		assertEquals(15000, conta.saldo, 0.0);
		
		
				
	}

}
