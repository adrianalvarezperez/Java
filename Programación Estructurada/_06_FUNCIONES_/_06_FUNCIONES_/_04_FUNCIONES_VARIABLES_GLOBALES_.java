package _06_FUNCIONES_;

import java.util.*;

public class _04_FUNCIONES_VARIABLES_GLOBALES_ {
	
	static int suma10= 10*10;					//VARIABLE GLOBAL. SIN EL STATIC NO PUEDES ACCEDER A ELLA

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		
		System.out.println("INTRODUZCA UN ENTERO 1 POR TECLADO"); 
		int num=in.nextInt();

		
		System.out.println("INTRODUZCA UN ENTERO 1 POR TECLADO"); 
		int num2=in.nextInt();
		
		int result= suma(num,num2);
		System.out.println("SUMA ----> "+result);
		
		imprimir(result);
		
		System.out.println("LA VARIABLE GLOBAL VALE..."+suma10);
	}
	
	public static void imprimir(int a) {
		System.out.println("EL RESULTADO DE LA SUMA ES..."+a);
	}
	
	static int suma(int a, int b) {
		return a + b;
	}

}
