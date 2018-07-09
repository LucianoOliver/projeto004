package br.com.curso.formato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	        
	        
	        String strDate = "2012-05-20T09:00:00.000Z";

	        try {
	            // create SimpleDateFormat object with source string date format
	            SimpleDateFormat sdfSource = new SimpleDateFormat(
	                    "yyyy-MM-dd'T'hh:mm:ss'.000Z'");

	            // parse the string into Date object
	            Date date = sdfSource.parse(strDate);

	            // create SimpleDateFormat object with desired date format
	            SimpleDateFormat sdfDestination = new SimpleDateFormat(
	                    "dd/MM/yyyy, ha");

	            // parse the date into another format
	            strDate = sdfDestination.format(date);

	            System.out
	                    .println("Date is converted from yyyy-MM-dd'T'hh:mm:ss'.000Z' format to dd/MM/yyyy, ha");
	            System.out.println("Converted date is : " + strDate.toLowerCase());

	        } catch (ParseException pe) {
	            System.out.println("Parse Exception : " + pe);
	        }
	    }

}
