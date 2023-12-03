package _03_BUCLES_;

import java.util.*;

public class _11_BUCLE_CON_CONMUTADOR_ {

	public static void main(String[] args) {
		
		
		Scanner in= new Scanner(System.in);
		
		int sum=0;
		int c=0;
		int num;
		
		do {
			System.out.println("INTRODUZCA VARIOS NUMEROS...");
			num=in.nextInt();
			
			if(num>=0) {
				sum= sum+num;
				c++;
			}
			
		} while(num>=0);
			System.out.println("SE HAN SUMADO..."+c+" NUMEROS.");
			System.out.println("LA SUMA DE TODOS LOS NUMEROS ES..."+sum);
	}

}
