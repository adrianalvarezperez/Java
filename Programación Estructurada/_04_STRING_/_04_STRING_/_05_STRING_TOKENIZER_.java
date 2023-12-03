package _04_STRING_;

import java.util.StringTokenizer;

public class _05_STRING_TOKENIZER_ {

	public static void main(String[] args) {
		
		StringTokenizer texto= new StringTokenizer("Hola buenas tardes");
		
		
			System.out.println("Numero de token..."+texto.countTokens());		//CONTADOR DE PALABRAS
		
			
			
			while(texto.hasMoreTokens()) {						//EL PROCESO TERMINA CUANDO NO HAYA MAS TOKENS PARA LEER
				System.out.println(texto.nextToken());			//LEE Y IMPRIME LOS TOKENS
			}
	}

}
