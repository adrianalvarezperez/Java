package _02_CONDICIONALES_;

import java.util.*;

public class _13_SWITCH_CON_STRING_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		String name;
		
		String nums[]= {"-1", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		int i;
		
		
		do {
			System.out.println("\nINTRODUZCA UN NOMBRE");
			name=in.nextLine();
			
			
			for(i=0;i<nums.length && !nums[i].equalsIgnoreCase(name);i++) {			//BUSCA EL NOMBRE EN EL ARRAY
			}
			
			if(i==nums.length) {
			switch(name) {
				case "Pepe": System.out.println("HOLA PEPE, BIENVENIDO");break;
				case "Juan": System.out.println("HOLA JUAN, BIENVENIDO");break;
				case "Luis": System.out.println("HOLA LUIS, BIENVENIDO");break;
				
				default: System.out.println("LO SIENTO \""+name+"\" NO ESTAS REGISTRADO");
			}
			}
			
		} while(i==nums.length);
		
		System.out.println("SE ACABO. ADIOS");
		

	}

}
