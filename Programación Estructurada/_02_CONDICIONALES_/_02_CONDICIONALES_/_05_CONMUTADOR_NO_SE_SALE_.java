package _02_CONDICIONALES_;

public class _05_CONMUTADOR_NO_SE_SALE_ {

	public static void main(String[] args) {
		
		int c=0;
		boolean conmu= false;
		
		do {
			c++;
			int ale=(int)(Math.random()*10+1);
			System.out.println(ale);
			
			if(ale==10) {
				conmu= true;
			}
		} while(c<10);
		System.out.println("¿Se ha encontrado un 10? --------------> "+conmu);

	}

}
