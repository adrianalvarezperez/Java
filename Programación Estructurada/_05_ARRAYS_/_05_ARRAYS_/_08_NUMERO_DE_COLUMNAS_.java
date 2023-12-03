package _05_ARRAYS_;

import java.util.*;

public class _08_NUMERO_DE_COLUMNAS_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int num2;
		
		int datos[][]= new int[5][];
		
		int num[]= new int[5];
		
		
			for (int i=0;i<num.length;i++) {
				System.out.println("INTRODUCE UN NUMERO");
				num2=in.nextInt();
				num[i]=num2;	
			}
			
			datos[0]= new int[num[0]];
			datos[1]= new int[num[1]];
			datos[2]= new int[num[2]];
			datos[3]= new int[num[3]];
			datos[4]= new int[num[4]];
	
			
			for(int i=0;i<datos.length;i++) {
				for(int j=0;j<datos[i].length;j++) {
					datos[i][j]=(int)(Math.random()*9+0);
					System.out.print(datos[i][j]);
				}
				System.out.println();
			}

	}

}
