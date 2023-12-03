package _05_ARRAYS_;

import java.util.*;

public class _18_STRING_BURBUJA_SECUENCIAL_FUNCIONES_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		String nombre[]= new String[10];
		
		nombre[0]= "Pepe";
		nombre[1]= "Juan";
		nombre[2]= "Luis";
		nombre[3]= "Alicia";
		nombre[4]= "Rosa";
		nombre[5]= "Carlos";
		nombre[6]= "Pedro";
		nombre[7]= "Lucas";
		nombre[8]= "Maria";
		nombre[9]= "Carlota";
		
		Burbuja(nombre);
		
		System.out.println("INTRODUCE UN NOMBRE A BUSCAR");
		String buscar=in.nextLine();
		Secuencial(nombre,buscar);

	}
	
	
	static void Burbuja(String nombre[]) {
		
		for(int i=0;i<nombre.length;i++) {
			for(int j=0;j<nombre.length-1;j++) {							//-1
				
				if(nombre[i].compareToIgnoreCase(nombre[j])<0) {			//DE MAYOR A MENOR O MENOR A MAYOR
					String aux= nombre[i];
					nombre[i]= nombre[j];
					nombre[j]= aux;
				}
			}
		}
		for(int i=0;i<nombre.length;i++) {
			System.out.println(nombre[i]);
		}
	}
	
	
	static void Secuencial(String nombre[], String buscar) {
		
		int i;
		
		for(i=0;i<nombre.length && !nombre[i].equalsIgnoreCase(buscar);i++) {
		}

		if(i!=nombre.length) {
			System.out.println("ENCONTRADO EN LA POSICION -----> "+(i+1));
		} else {
			System.out.println("NO ENCONTRADO");
		}
	}

}
