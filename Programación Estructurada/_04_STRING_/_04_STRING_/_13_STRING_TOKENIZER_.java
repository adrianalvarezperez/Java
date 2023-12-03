package _04_STRING_;

import java.util.*;

public class _13_STRING_TOKENIZER_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		String texto;
	    StringBuilder texto1 = new StringBuilder();
	    String fin = "FIN";
	        
	        do
	        {
	         System.out.println("===Escribe un texto: ");
	         texto=in.nextLine().toUpperCase();
	     
	            if(!texto.equals(fin)){ 
	               int longitud = texto.length();
	               System.out.println("=== Longitud de una cadena es: " + longitud );
	          
	               texto1.append(texto).append(";") ;
	            }
	        }  
	        while (!texto.equals(fin));
	        
	        System.out.println(texto1);
	    
	    

	}

}
