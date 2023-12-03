package _02_CONDICIONALES_;

public class _06_CONMUTADOR_SE_SALE_ {

	public static void main(String[] args) {
		
		int c=0;
		boolean conmu=false;
		int ale;
		
		
		do {
			ale=(int)(Math.random()*10+1);
			System.out.println(ale);
			
			if(ale==10) {
				conmu=true;
			}
		} while(ale!=10);
		
		System.out.println("¿SE HA ENCONTRADO UN 10? ---------->"+conmu);

	}

}
