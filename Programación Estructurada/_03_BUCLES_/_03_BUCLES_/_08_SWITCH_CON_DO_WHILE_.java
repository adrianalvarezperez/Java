package _03_BUCLES_;

import java.util.*;

public class _08_SWITCH_CON_DO_WHILE_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int ale;
		
		do {
			ale=(int)(Math.random()*5+1);
			switch(ale) {
			case 1: System.out.println("NO TENDRAS NADA DE SUERTE.");break;
			case 2: System.out.println("NO TENDRAS SUERTE.");break;
			case 3: System.out.println("PUEDES TENER SUERTE, COMO NO TENER SUERTE.");break;
			case 4: System.out.println("HOY TENDRAS SUERTE");break;
			case 5: System.out.println("HOY TENDRAS MUCHAS SUERTE");break;
			
			}
		} while(ale>=0);
		

	}

}
