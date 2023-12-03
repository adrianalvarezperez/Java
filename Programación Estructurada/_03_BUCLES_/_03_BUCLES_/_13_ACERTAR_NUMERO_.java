package _03_BUCLES_;

import java.util.*;

public class _13_ACERTAR_NUMERO_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int ale=(int)(Math.random()*100+1);
		int num;
		
		do {
			System.out.println("\nINTRODUCE UN NUMERO...");
			num=in.nextInt();
			
			if(ale>num) {
				System.out.println("MAYOR");
			} else {
				System.out.println("MENOR");
			}
			
		} while(ale!=num);
		
		System.out.println("SE ACABO ESTE ES EL NUMERO CORRECTO "+ale);

	}

}
