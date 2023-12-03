package _05_ARRAYS_;

import java.util.*;

public class _11_BUSQUEDA_BINARIA_DICOTOMICA_PARA_STRING_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		String nombre[]= new String[10];
		
		nombre[0]= "Alicia";
		nombre[1]= "Carlos";
		nombre[2]= "Carlota";
		nombre[3]= "Juan";
		nombre[4]= "Lucas";
		nombre[5]= "Luis";
		nombre[6]= "Maria";
		nombre[7]= "Pedro";
		nombre[8]= "Pepe";
		nombre[9]= "Rosa";
		
		
		System.out.println("INTRODUCE UN NOMBRE...");
		String buscar=in.nextLine();
		
		
		int inicio=0;
		int fin= nombre.length-1;
		int posicion= -1;
		
		
		while(posicion==-1 && inicio<=fin) {					//SOLO SE USA EN VECTORES ORDENADOS
			
			int medio= (int)((inicio+fin)/2);
			
			if(nombre[medio].equalsIgnoreCase(buscar)) {
				posicion= medio;
			} else {
				if(buscar.compareTo(nombre[medio])<0) {
					fin= medio-1;
				} else {
					inicio= medio+1;
				}
			}
		}
		
		if (posicion>=0 && posicion<10) {
			System.out.println("ENCONTRADO EN LA POSICIÓN  ----> "+posicion);
		} else {
			System.out.println("NO ENCONTRADO");
		}
		
		
	}

}
