package _04_STRING_;

import java.util.*;

public class _03_INTRODUCIR_CADENAS_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("INTRODUCE UNA CADENA DE CARACTERES");
		String cade=in.nextLine();
		
		boolean cade1= cade.isEmpty();			//MIRA SI LA CADENA ESTA VACIA
		
		if(!cade1) {
			System.out.println("LONGITUD --------->"+cade.length());			//LONGITUD  
			System.out.println("MAYUSCULAS --------->"+cade.toUpperCase());		//MAYUSCULAS
		} else {
			System.out.println("ESTA VACIA LA CADENA");
		}
		

	}

}
