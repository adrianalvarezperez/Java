package _02_CONDICIONALES_;

import java.util.*;

public class _12_SWITCH_CON_CHAR_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		
		String valor;
		int num;
		
		
		do {
			System.out.println("\nINTRODUCE UN CARACTER DE LA A-Z");
			valor=in.nextLine();
			
			if(!valor.equalsIgnoreCase("0")) {
			switch(valor) {
				case "a": System.out.println("EL CARACTER ES A");break;
				case "b": System.out.println("EL CARACTER ES B");break;
				case "c": System.out.println("EL CARACTER ES C");break;
				case "d": System.out.println("EL CARACTER ES D");break;
				
				default: System.out.println("El valor es distinto a -----> a, b, c, d");
			}
			}
		} while(!valor.equalsIgnoreCase("0"));
		
		System.out.println("SE ACABO. ADIOS");

	}

}
