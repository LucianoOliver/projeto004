package br.com.curso.banco;

public class Programa {
	public static void main(String[] args) {
               
		 Conta minhaConta;
	        minhaConta = new Conta();

//	        // alterando os valores de minhaConta
//	        minhaConta.titular = "Duke";
//	        minhaConta.saldo = 1000;
//
//	        // saca 200 reais
//	        minhaConta.saca(200);
//
//	        // deposita 500 reais
//	      //  minhaConta.deposita(500);
//	        System.out.println(minhaConta.saldo);
	        
//	        minhaConta.saldo = 1000;
//	        boolean consegui = minhaConta.saca(2000);
//	        if (consegui) {
//	            System.out.println("Consegui sacar");
//	        } else {
//	            System.out.println("Não consegui sacar");
//	        }
	        
	        
//	        
//	        minhaConta.saldo = 1000;
//	        if (minhaConta.saca(2000)) {
//	            System.out.println("Consegui sacar");
//	        } else {
//	            System.out.println("Não consegui sacar");
//	        }
	        
	        
	        
	        Conta minhaConta2;
	        minhaConta = new Conta();
	        minhaConta.saldo = 1000;

	        Conta meuSonho;
	        meuSonho = new Conta();
	        meuSonho.saldo = 1500000;
	        
	        
	        
	        
//	        Conta c1 = new Conta();
//            c1.deposita(100);
//
//            Conta c2 = c1;  // linha importante!
//            c2.deposita(200);
//
//            System.out.println(c1.saldo);
//             System.out.println(c2.saldo);
             
             
             
////             Conta c1 = new Conta();
////             c1.titular = "Duke";
////             c1.saldo = 227;
////
////             Conta c2 = new Conta();
////             c2.titular = "Duke";
////             c2.saldo = 227;
//
//             if (c1 == c2) {
//                 System.out.println("Contas iguais");
//             }
//             else {
//            	 System.out.println("Contas não são iguais");
//            	 System.out.println(c1 +" - "+ c2);
//             }
//             
//             Conta  conta1 = new Conta();
//             Conta  conta2 = new Conta();
//			conta1.transferePara(conta2, 50);
			
			
//			    Conta minhaConta = new Conta();
//	            Cliente c = new Cliente();
//	            minhaConta.titular = c;
//	            
	            Conta conta = new Conta();
	            Cliente cliente = new Cliente();
	            conta.titular = cliente;
	            conta.titular.nome = "lalaland";
	            
	         //   Cliente clienteDaMinhaConta = minhaConta.titular;
	           // clienteDaMinhaConta.nome = "Duke";
	            
	           // minhaConta.titular.nome = "Duke";
	            
	            
	            System.out.println( conta.titular.nome);
	           // System.out.println(minhaConta.titular.nome);
	            
	    }
        
    }


