package _03_BUCLES_;

public class _17_TRAMPA_GRAVE_ {

	public static void main(String[] args) {
		
		int c=0;
		int i=1;
		
		while(c<10) {
			c=c+i;
			System.out.println(c);
			
			if(c%2==0) {
				i=i+1;
			} else {
				i=i+2;
			}
			
		}

	}

}
