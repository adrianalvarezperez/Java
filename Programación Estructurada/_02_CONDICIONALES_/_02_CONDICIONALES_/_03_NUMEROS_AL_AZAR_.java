package _02_CONDICIONALES_;

public class _03_NUMEROS_AL_AZAR_ {

	public static void main(String[] args) {
		
		
		int c=0;
		int mayor=0, menor=0;
		
		do {
			int ale=(int)(Math.random()*10+1);
			System.out.println(ale);
			if(ale>5) {
				mayor++;
			}
			if(ale<=5) {
				menor++;
			}
			c++;
			
		} while(c<10);
		System.out.println("\n"+mayor+" --------> MAYORES DE 5 AÑOS");
		System.out.println(menor+" --------> MENOR O IGUAL A 5 AÑOS");

	}

}
