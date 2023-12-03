package _02_CONDICIONALES_;

import java.util.*;

public class _11_SWITCH_CON_NUMEROS_JUNTOS_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int valor;
		
		do {
			System.out.println("\nINTRODUCE UN NUMERO DEL 1 AL 9");
			valor=in.nextInt();
			
			switch (valor) {
				case 1: 
				case 2:
				case 3:
						System.out.println("EL VALOR ES 1, 2 O 3");break;
				case 4:
				case 5:
				case 6:
						System.out.println("EL VALOR ES 4, 5 o 6");break;
				case 7:
				case 8:
				case 9:
						System.out.println("EL VALOR ES 7, 8 o 9");break;
				default: 
						System.out.println("EL VALOR Mayor que 9");break;
			}
			
		} while(valor>=0);
			System.out.println("SE ACABO. ADIOS");

	}

}
