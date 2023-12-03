package _02_CONDICIONALES_;

import java.util.*;

public class _08_MAYOR_MENOR_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int edad;
		
		do {
			System.out.println("INTRODUCE UNA EDAD...");
			edad=in.nextInt();
			
			if(edad>=18) {
				System.out.println("ES MAYOR DE EDAD.\n\n");
			}
			if(edad<18 && edad>=0) {
				System.out.println("ES MENOR DE EDAD.\n\n");
			}
		} while(edad>=0);
		System.out.println("SE ACABO...ADIOS");
	}

}
