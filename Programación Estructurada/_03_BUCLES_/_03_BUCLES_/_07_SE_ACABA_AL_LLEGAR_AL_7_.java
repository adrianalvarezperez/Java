package _03_BUCLES_;

public class _07_SE_ACABA_AL_LLEGAR_AL_7_ {

	public static void main(String[] args) {
		
		
		int c=-1;
		int ale;
		
		do {
			c++;
			ale=(int)(Math.random()*10+1);
			System.out.println(ale);
		} while(ale!=7);
		
		System.out.println("SE ACABO. PARA LLEGAR AL 7 HA PASADO POR "+c+" NUMEROS");

	}

}
