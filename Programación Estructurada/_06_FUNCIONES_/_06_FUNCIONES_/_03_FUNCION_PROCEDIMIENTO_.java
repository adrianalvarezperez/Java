package _06_FUNCIONES_;

import java.util.*;

public class _03_FUNCION_PROCEDIMIENTO_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in); 
		
		System.out.println("INTRODUCE UN NUMERO...");
		int num1=in.nextInt();
		
		System.out.println("INTRODUCE UN NUMERO...");
		int num2=in.nextInt();
		
		suma1(num1,num2);
		
		System.out.println(suma2(num1,num2));
		
	}
	
	
	//FUNCION SIN RETORNO -----> PROCEDIMIENTO
	static void suma1(int c, int d) {
		int result= c+d;
		System.out.println(result);
	}
	
	
	
	//FUNCION CON RETORNO ------> FUNCION
	static int suma2(int a, int b) {
		int result= a+b;
		return result;
	}

}
