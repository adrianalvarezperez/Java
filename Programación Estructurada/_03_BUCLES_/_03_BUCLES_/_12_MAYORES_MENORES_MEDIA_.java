package _03_BUCLES_;

import java.util.*;

public class _12_MAYORES_MENORES_MEDIA_ {
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		double cont1=0;
		double cont2=0;
		double sum=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("INTRODUCE LA EDAD DE 10 PERSONAS...");
			int edad=in.nextInt();
			
			sum= sum+edad;
			
			if(edad>=18) {
				cont1++;
			} else {
				cont2++;
			}
		}
		
		double media=(sum/(cont1+cont2));
		
		
		System.out.println("LA SUMA DE TODAS LA EDADES ES..."+sum);
		System.out.println("MAYORES DE EDAD..."+cont1);
		System.out.println("MENORES ED EDAD..."+cont2);
		System.out.println("LA MEDIA DE TODAS LAS EDADES ES..."+media);
	}

}
