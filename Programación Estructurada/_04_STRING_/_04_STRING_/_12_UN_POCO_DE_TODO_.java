package _04_STRING_;

import java.util.*;

public class _12_UN_POCO_DE_TODO_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("INTRODUCE UNA CADENA DE CARACTERES");
		String cade=in.nextLine();
		
		
		int longitud=cade.length();
		System.out.println("LONGITUD ----> "+longitud);
		
		
		
		String mayus= cade.toUpperCase();
		System.out.println("MAYUSCULAS ----> "+mayus);
		
		
		
		System.out.println("CADA PALABRA EN UNA LÍNEA ----> ");			//CONVERTIMOS LA CADENA EN UN VECTOR PALABRA A PALABRA
		String linea[]=cade.split(" ");
		for(int i=0;i<linea.length;i++) {
			System.out.println(linea[i]);
		}
		
		
		
		int c=0;
		char minus[]=cade.toCharArray();								//CONVERTIMOS LA CADENA EN UN VECTOR CARACTER A CARACTER
		System.out.print(minus);
		for(int i=0;i<minus.length;i++) {
			boolean mi= Character.isLowerCase(minus[i]);
			if(mi) {
				c++;
				
			}
		}
		System.out.println("En la cadena hay "+c+" minusculas");
		
		
		
		for(int i=cade.length();i>0;i--) {
			System.out.println(cade.substring(0,i));				//TRIANGULO
		}
			

	}

}
