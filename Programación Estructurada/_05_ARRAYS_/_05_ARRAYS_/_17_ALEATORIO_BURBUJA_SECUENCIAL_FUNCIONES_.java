package _05_ARRAYS_;

import java.util.*;

public class _17_ALEATORIO_BURBUJA_SECUENCIAL_FUNCIONES_ {

	public static void main(String[] args) {
		
		
		Scanner in= new Scanner(System.in);
		
		int num[]= new int[10];
		
		Aleatorio(num);
		Burbuja(num);
		
		System.out.println("INTRODUCE UN NUMERO A BUSCAR");
		int num2=in.nextInt();
		Secuencial(num,num2);
	}
	
	
	static void Aleatorio(int num[]) {
		for (int i=0;i<num.length;i++) {
			num[i]= (int)(Math.random()*99+1);
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					i--;
				}
			}
		}
	}
	
	
	static void Burbuja(int num[]) {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1;j++) {
				
				if(num[i]<num[j]) {
					int aux= num[i];
					num[i]= num[j];
					num[j]= aux;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
	
	
	static void Secuencial(int num[], int num2) {
		boolean buscar= false;
		int i;
		for (i=0;i<num.length && !buscar;i++) {
			if(num[i]==num2) {
				buscar= true;
			}
		}
		if(buscar) {
			System.out.println("ENCONTRADO EN POSICIÓN "+i);
		} else {
			System.out.println("NO ENCONTRADO");
		}
		
	}

}
