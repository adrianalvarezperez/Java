package _04_STRING_;

public class _02_MÉTODOS_2_ {

	public static void main(String[] args) {
		
		String texto1= new String("La cripta magica");
		String texto2= "The magic cripta";
		
		
		
		System.out.println(texto1.charAt(0));			//SACAR EL CARACTER QUE LE DIGAS
		System.out.println(texto2.charAt(7));			
		
		
		System.out.println(texto1.concat(texto2));		//CONCATENA O UNE, UNA CADENA CON OTRA
		
		System.out.println(texto2.contains("ta"));		//EL TROZO QUE LE PASES TE DICE SI ESTA EN LA CADENA CON UN BOOLEANO
		
		System.out.println(texto1.startsWith("La c"));	//TE DICE SI LO QUE LE PASES ES POR LO QUE EMPIEZA LA CADENA CON UN BOOLEANO
		
		System.out.println(texto2.endsWith("ipta"));	//TE DICE SI LO QUE LE PASES ES POR LO QUE ACABA LA CADENA CON UN BOOLEANO
		
		System.out.println(texto1.indexOf('a'));		//POSICION DONDE SE ENCUENTRA LA PRIMERA 'a'
		
		System.out.println(texto1.replace('a','e'));	//CAMBIA TODAS LAS 'a' POR 'e'
		
		System.out.println(texto1.replaceFirst("magica","magic"));	//CAMBIA LA PRIMERA MAGICA POR MAGIC
		
		System.out.println(texto1.replaceAll("magica","magic"));	//CAMBIA TODAS LAS MAGICA POR MAGIC
		
		
		String cambio[]= texto1.split(" ");			//COVIERTE UNA CADENA EN UN ARRAY
		
			for(int i=0;i<cambio.length;i++) {		//RECORREMOS EL ARRAY
				System.out.println(cambio[i]);
			}
		
		
		System.out.println(texto1.trim());			//QUITA TODOS LOS ESPACIOS EN BLANCO
		
		System.out.println(texto2.substring(3));	//SACA LA CADENA DESDE LA POSICION 3 EN ADELANTE
		
		System.out.println(texto1.substring(0,texto1.length()));		//SACA LA CADENA DESDE LA POSICION 0, HASTA EL FINAL DE LA CADENA
	

	}

}
