package _03_BUCLES_;

public class _18_TRAMPA_GRAVE_ {

	public static void main(String[] args) {
		
		int c=1;
		int d=1;
		
		while(c<4) {
			System.out.println(c+"-"+d);
			c=c+1;
			switch(c) {
				case 1: d=d+1;break;
				case 2: d=d+2;break;
				case 3: d=d+3;break;
			}
		}

	}

}
