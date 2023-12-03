package _02_CONDICIONALES_;

import java.util.*;

public class _09_ELSE_IF_ANIDADO_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int edad;
		
		do {
			System.out.println("INTRODUCE UNA EDAD...");
			edad=in.nextInt();
			
			if(edad>=0 && edad<13) {
				System.out.println("INFANTIL\n");
			} else if(edad>=13 && edad<18) {
				System.out.println("ADOLESCENTE\n");
			} else if(edad>=18 && edad<40) { 
				System.out.println("JOVEN MAYOR DE EDAD\n");
			} else if(edad>=40 && edad<65) {
				System.out.println("ADULTO MAYOR DE EDAD\n");
			} else if(edad>=65) {
				System.out.println("JUBILADO\n");
			}
			
		} while(edad>=0);
		System.out.println("SE ACABO. ADIOS");

	}

}
