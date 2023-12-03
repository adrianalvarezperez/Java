package _05_ARRAYS_;

import java.util.*;

public class _07_GUARDAR_LOS_NOMBRES_DE_UNA_VARIABLE_EN_EL_VECTOR_ {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		
		String nombre[]= new String[5];
		
		
		
		
		
		for(int i=0; i<nombre.length; i++) {
			System.out.println("INTRODUCE UN NOMBRE");
			String nombre2=in.nextLine();
			
			nombre[i]= nombre2;			//GUARDAMOS LOS NOMBRES METIDOS EN "NOMBRE2" EN CADA PASADA DEL BUCLE EN EL VECTOR
		}
		
		
		
		for(int i=0;i<nombre.length;i++) {
			System.out.println(nombre[i]);
		}
		
System.out.println(nombre[2]);
	}

}
