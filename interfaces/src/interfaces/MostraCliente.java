package interfaces;

import java.util.function.Consumer;

public class MostraCliente implements Consumer<Cliente> {

	@Override
	public void accept(Cliente c) {
		System.out.println(c.getNome());  
	     System.out.println(c.getSenha());  
		
	}

}
