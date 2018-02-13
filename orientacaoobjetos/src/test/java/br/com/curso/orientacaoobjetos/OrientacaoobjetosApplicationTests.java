package br.com.curso.orientacaoobjetos;

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
		
	}

}
