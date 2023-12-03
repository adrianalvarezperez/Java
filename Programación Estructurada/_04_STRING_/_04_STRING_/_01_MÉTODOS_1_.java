package _04_STRING_;

public class _01_MÉTODOS_1_ {

	public static void main(String[] args) {
		
		
		String texto1= new String("LA CRIPTA MAGICA");
		String texto2= "THE MAGIC CRIPTA";
		
		
		
		
		System.out.println(texto1.length());			//LONGITUD
		
		System.out.println(texto2.toUpperCase());		//MAYUSCULAS
		
		System.out.println(texto1.toLowerCase());		//MINUSCULAS
		
		
		
		
		
		System.out.println(texto2.equals(texto1));		//COMPARA UNA CADENA CON OTRA 
		
		boolean cade= texto1.equals("Hola");
		System.out.println(cade);
		
		System.out.println(texto2.equalsIgnoreCase(texto1));		//COMPARA UNA CADENA CON OTRA Y NO DIFERENCIA ENTRE MAYUSCULAS Y MINUSCULAS
		
		
		
		
		System.out.println(texto1.compareTo(texto2));				//0 SI SON IGUALES  //-1 CADENA ES MENOR EN ORDEN ALFABETICO  // 1 CADENA ES MAYOR EN ORDEN ALFABETICO
		
		System.out.println(texto2.compareToIgnoreCase(texto1));		//LO MISMO QUE EL DE ARRIBA PERO NO DIFERENCIA ENTRE MAYUSCULAS Y MINUSCULAS  
		
		
	}

}
