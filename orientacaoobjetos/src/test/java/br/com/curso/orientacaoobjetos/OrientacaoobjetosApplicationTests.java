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
		Cliente c = new Cliente();
		c.cpf = "33333333333";
		c.nome = "Luciano";
		c.profissao = "Analista de Testes";
		
		System.out.println("Dados do cliente: " + c);
		System.out.println("Nome: "+ c.nome);
	
		
	}

}
