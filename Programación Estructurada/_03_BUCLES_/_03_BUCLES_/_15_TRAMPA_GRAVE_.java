package _03_BUCLES_;

public class _15_TRAMPA_GRAVE_ {

	public static void main(String[] args) {
	
		int c=5;
		int d= 3;
		
		do {
			c=c+d;
			System.out.println(c);			//8+4+5+6+7
			d++;	
			
		} while(c<30);

	}

}
