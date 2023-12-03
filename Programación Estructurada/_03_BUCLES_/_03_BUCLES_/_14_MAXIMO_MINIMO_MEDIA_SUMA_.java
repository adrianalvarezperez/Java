package _03_BUCLES_;

import java.util.*;

public class _14_MAXIMO_MINIMO_MEDIA_SUMA_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int num;
		double media=0;
		int cont=0;
		int suma=0;
		int min= 2147483647;
		int max=0;
		
		do {
			System.out.println("INTRODUCE UN NUMERO HASTA QUE TECLEES EL 0");
			num=in.nextInt();
			
			if(num>0) {
				if(num>max) {
					max=num;
				}
				if(num<min) {
					min=num;
				}
				if(num>0) {
					suma= suma+num;
					cont++;
					media=suma/cont;				}
			}
			
		} while(num>0);
		
		System.out.println("EL NUMERO MAXIMO INTRODUCIDO ES "+max);
		System.out.println("EL NUMERO MINIMO INTRODUCIDO ES "+min);
		System.out.println("LA MEDIA DE TODOS LOS NUMEROS ES "+media);
		System.out.println("LA SUMA DE TODOS LOS NUMEROS ES "+suma);
		
	}

}
