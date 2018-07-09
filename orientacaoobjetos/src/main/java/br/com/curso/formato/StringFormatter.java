package br.com.curso.formato;

import java.util.Formatter;
import java.util.Locale;

public class StringFormatter {
	
	  public static void main (String[] args) {
	        int x = 10000;
	        Locale brasil = new Locale ("pt", "BR");
	        System.out.println (String.format (brasil, "%,d", x)); // prints 10.000
	        System.out.println (String.format (Locale.US, "%,d", x)); // prints 10,000
	        double y = 1234567.890123;
	        System.out.println (String.format (brasil, "%,.6f", y)); // prints 1.234.567,890123
	        System.out.println (String.format (Locale.US, "%,.6f", y)); // prints 1,234,567.890123
	        
	        
	        String output = String.format("%s = %d", "joe", 35);
	        System.out.println(output);
	        
	        
	        StringBuilder sbuf = new StringBuilder();
	        Formatter fmt = new Formatter(sbuf);
	        fmt.format("PI = %f%n", Math.PI);
	        System.out.print(sbuf.toString());
	    }

}
