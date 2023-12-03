package _02_CONDICIONALES_;

import java.util.*;

public class _02_TRIPLE_IF_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int edad;
		int cont1=0, cont2=0;
		int sum= 0;
		
		do {
			System.out.println("Introduce varias edades...");
			edad=in.nextInt();
			
			
			if(edad>=18) {
				cont1++;							//CONTADOR DE MAYORES
			} 
			
			
			if(edad<18 && edad>=0) {
				cont2++;							//CONTADOR DE MENORES
			}
			
			
			if(edad>=0) {
				sum= sum+edad;						//SUMA DE TODOS LOS NUMEROS INTRODUCIDOS
			}
			
		} while(edad>=0);
		
		double media=sum/(cont1+cont2);				//LA MEDIA DE TODAS LAS EDADES
		
		System.out.println(cont1+" MAYORES DE EDAD.");
		System.out.println(cont2+" MENORES DE EDAD.");
		System.out.println("LA SUMA DE TODAS LAS EDADES ES..."+sum);
		System.out.println("LA MEDIA DE TODAS LAS EDADES ES..."+media);
			
	}

}
