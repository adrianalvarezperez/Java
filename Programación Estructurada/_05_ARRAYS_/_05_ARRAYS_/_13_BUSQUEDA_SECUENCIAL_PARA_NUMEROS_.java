package _05_ARRAYS_;

import java.util.*;

public class _13_BUSQUEDA_SECUENCIAL_PARA_NUMEROS_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);

		int num1[] = new int[10];

			num1[0] = 10;
			num1[1] = 20;
			num1[2] = 1;
			num1[3] = 5;
			num1[4] = 758;
			num1[5] = 1034;
			num1[6] = 9;
			num1[7] = 78;
			num1[8] = 24;
			num1[9] = 235;

			int num2;
			
			do {
				System.out.println("\nINTRODUCE UN NUMERO A BUSCAR ");
				num2=in.nextInt();
				
				boolean buscar= false;
				int i;
				
				for(i=0;i<num1.length && !buscar;i++) {
					if(num1[i]==num2) {
						buscar= true;
					}
				}
				if(buscar) {
					System.out.println("ENCONTRADO EN POSICION ----> "+(i)+"\n");
				} else {
					System.out.println("NO ENCONTRADO");
				}
			} while(num2>=0);
	
	}

}
