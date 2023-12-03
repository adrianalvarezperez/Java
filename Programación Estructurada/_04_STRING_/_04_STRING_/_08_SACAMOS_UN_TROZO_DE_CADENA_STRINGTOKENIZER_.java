package _04_STRING_;

import java.util.StringTokenizer;

public class _08_SACAMOS_UN_TROZO_DE_CADENA_STRINGTOKENIZER_ {

	public static void main(String[] args) {
		
		String cadena1= "Lunes, Martes, Miercoles, Jueves";
		
		StringTokenizer cadena2= new StringTokenizer(cadena1,",");
		
		String cadena3= cadena2.nextToken();
		System.out.println(cadena3);

	}

}
