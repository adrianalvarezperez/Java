package _02_CONDICIONALES_;

import java.util.*;

public class _01_SUMAR_VARIOS_NUMEROS_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int num;
		int sum=0;
		
		do {
			System.out.println("Introduce varios numeros...");
			num=in.nextInt();
			
			if(num>=0) {						//SI LA CONDICION ES CIERTA ENTRA AL IF
				sum= sum+num;					//SUMA TODOS LOS NUMEROS QUE INTRODUZCAS
			} 
			
		} while(num>=0);						//CONDICION TIENE QUE SER CIERTA PARA QUE SIGA EN BUCLE
		
		System.out.println("LA SUMA DE TODOS LOS NUMEROS ES "+sum);

	}

}
