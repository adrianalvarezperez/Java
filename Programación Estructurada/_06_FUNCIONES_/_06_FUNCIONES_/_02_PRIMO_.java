package _06_FUNCIONES_;

import java.util.*;

public class _02_PRIMO_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("INTRODUCE UN NUMERO...");
			num=in.nextInt();
			
			boolean flag= primo(num);
			
			if(flag==true) {
				System.out.println("ES PRIMO");
			} else {
				System.out.println("NO ES PRIMO");
			}
			
		} while(num>=0);
}
	
	
	public static boolean primo(int num) {
		
		boolean primo= true;
		int i=2;
		
		while(i<num && primo==true) {
			if(num%i==0) {
				primo= false;
			}
			
			i++;
		}
		
		return primo;
}

}
