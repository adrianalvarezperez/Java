package _03_BUCLES_;

public class _10_BUCLE_FOR_WHILE_Y_DO_WHILE_ {

	public static void main(String[] args) {
		
		
		for(int i=50;i>=10;i-=5) {
			System.out.print(i+", ");
		}
		
		
		System.out.println();
		
		int c=50;
		while(c>=15) {
			c-=5;
			System.out.println(c+", ");
		}
		
		
		int j=50;
		do {
			System.out.print(j+", ");
			j-=5;
		} while(j>=10);

	}

}
