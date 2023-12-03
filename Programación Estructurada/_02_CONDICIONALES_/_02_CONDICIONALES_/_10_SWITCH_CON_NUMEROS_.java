package _02_CONDICIONALES_;

import java.util.*;

public class _10_SWITCH_CON_NUMEROS_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int dia;
		
		do {
			System.out.println("\nINTRODUCE UN NUMERO DEL 1 AL 7");
			dia=in.nextInt();
			
			if(dia>=1 && dia<=7) {
				switch(dia) {
				case 1: System.out.println("LUNES");break;
				case 2: System.out.println("MARTES");break;
				case 3: System.out.println("MIERCOLES");break;
				case 4: System.out.println("JUEVES");break;
				case 5: System.out.println("VIERNES");break;
				case 6: System.out.println("SABADO");break;
				case 7: System.out.println("DOMINGO");break;
				
				}
			} else {
				System.out.println("NUMERO INCORRECTO");
			} 
		} while(dia>=0);
		System.out.println("SE ACABO. ADIOS");
		

	}

}
