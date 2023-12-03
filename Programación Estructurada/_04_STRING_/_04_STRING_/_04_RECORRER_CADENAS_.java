package _04_STRING_;

public class _04_RECORRER_CADENAS_ {

	public static void main(String[] args) {
		
		
		String texto1= "Buenas tardes";
		
		for(int i=0;i<texto1.length();i++) {
			System.out.println(texto1.charAt(i));		//RECORREMOS LA CADENA CARACTER A CARACTER 
		}
		
		for(int i=texto1.length()-1;i>0;i--) {
			System.out.println(texto1.charAt(i));		//RECORREMOS LA CADENA CARACTER A CARACTER AL REVES
		}
		
		for(int i=0;i<texto1.length();i++) {
			System.out.println((int)texto1.charAt(i));	//RECORREMOS LA CADENA CARACTER A CARACTER Y LO SACA EN CODIGO BINARIO 
		}
		
		for(int i=0;i<texto1.length();i++) {
			System.out.println(texto1.codePointAt(i));	//RECORREMOS LA CADENA CARACTER A CARACTER Y SACAMOS EL CODIGO BINARIO
		}

	}

}
