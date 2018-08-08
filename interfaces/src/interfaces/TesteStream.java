package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream {
	public static void main(String[] args){

        Cliente c1 = new Cliente("michelli", true, "123", 5);
        Cliente c2 = new Cliente("maria", true, "456", 10);
        Cliente c3 = new Cliente("josé", true, "789", 20);
        Cliente c4 = c3;//new Cliente("roberto", true, "789", 20);

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4);
      // clientes.forEach(c -> System.out.println(c.getPontos()));
       //clientes.forEach(c -> System.out.println(c.getNome()));

        Set<Cliente> stream = clientes.stream().filter(c -> c.getPontos()>5).collect(Collectors.toSet());
        
        Stream<Cliente> listaClientes = clientes.stream().filter(c -> c.getPontos()>5);

       // List<Cliente> pontosMaiorCinco = stream.collect(Collectors.toList()); 

       // stream.forEach(c -> System.out.println(c.getPontos()));
        listaClientes.forEach(c -> System.out.println(c.getPontos()));
        

    }
	

}
