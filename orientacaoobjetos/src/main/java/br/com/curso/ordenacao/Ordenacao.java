package br.com.curso.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(2, "Phillip Lahm");
		Conta conta2 = new Conta(1, "Lucas Podolski");
		Conta conta3 = new Conta(3, "Arne Friedrich");

		List lista = new ArrayList();
		lista.add(conta1);
		lista.add(conta2);
		lista.add(conta3);
		
	   ArrayList a = new ArrayList();
	   
	   System.out.println("Sem Ordenacao: " +lista); 
	   Collections.sort(lista);
	   
	   Collections.reverse(lista);
	   System.out.println("Reverse antes de ordenar: " +lista); 
	   
	   System.out.println("Sort: " +lista); 
	   
	   Collections.reverse(lista);
	   System.out.println("Reverse: " +lista); 
	   
	  Collections.sort(lista, Collections.reverseOrder());
	  System.out.println("ReverseOrder: " +lista); 
	 
		
	  List<String> lista1 = new ArrayList<>();
	   lista1.add("Sérgio");
	   lista1.add("Paulo");
	   lista1.add("Guilherme");
	   lista1.add("Luciano");
	   lista1.add("Regiane");
	   lista1.add("Azure");
	   

	   // repare que o toString de ArrayList foi sobrescrito:
	   System.out.println(lista1); 

	   Collections.sort(lista1);

	   System.out.println(lista1);
	   
	   Collections.sort(lista1, Collections.reverseOrder());
	   
	   System.out.println(lista1);
	}
	

}
