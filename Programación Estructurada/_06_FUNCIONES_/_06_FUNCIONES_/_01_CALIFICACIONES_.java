package _06_FUNCIONES_;

import java.util.*;

public class _01_CALIFICACIONES_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		double cali;
		
		do {
			System.out.println("\nINTRODUZCA UNA CALIFICACION...");
			cali=in.nextDouble();
			
			calificacion(cali);
			
		} while(cali>=0 && cali<=10);
		System.out.println("HASTA PRONTO...");
	}
	
	public static void calificacion(double cali) {
		
		if(cali>=0 && cali<3) {
			System.out.println("MUY DEFICIENTE...");
		} else if(cali>=3 && cali<5) {
			System.out.println("INSUFICIENTE...");
		} else if(cali>=5 && cali<7) {
			System.out.println("BIEN");
		} else if(cali>=7 && cali<9) {
			System.out.println("NOTABLE");
		} else if(cali>=9 && cali<=10) {
			System.out.println("SOBRESALIENTE");
		} else {
			System.out.println("HAS INTRODUIDO UNA CALIFICAION INCORRECTA...");
		}
	}

}
