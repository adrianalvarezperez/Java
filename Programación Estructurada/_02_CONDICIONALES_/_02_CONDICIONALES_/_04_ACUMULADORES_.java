package _02_CONDICIONALES_;

public class _04_ACUMULADORES_ {

	public static void main(String[] args) {
	
		int sum=0;
		long prod=1;
		int c=8;
		
		do {
			c+=2;
			sum= sum+c;							//ACUMULADORES
			System.out.println(sum);
			prod= prod*c;
		} while(c<30);
		
		System.out.println("\n"+prod);

	}

}
