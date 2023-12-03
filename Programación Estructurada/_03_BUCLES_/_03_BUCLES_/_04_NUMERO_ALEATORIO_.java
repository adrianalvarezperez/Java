package _03_BUCLES_;

public class _04_NUMERO_ALEATORIO_ {

	public static void main(String[] args) {
		
		
		int c=0;
		int num;
		
		do {
			c++;
			int ale=(int)(Math.random()*20+1);
			System.out.println("EL NUMERO ALEATORIO ES..."+ale);
			
			if(ale>=5 && ale<=15) {
				num= ale+15;
				System.out.println("LA VARIABLE NUM VALE..."+num+"\n\n");
			} else {
				num=ale+5;
				System.out.println("LA VARIABLE NUM VALE..."+num+"\n\n");
			}
			
			
		} while(c<5);

	}

}
