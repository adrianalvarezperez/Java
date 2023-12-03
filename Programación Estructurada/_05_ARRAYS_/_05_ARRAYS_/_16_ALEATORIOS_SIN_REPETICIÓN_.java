package _05_ARRAYS_;

public class _16_ALEATORIOS_SIN_REPETICIÓN_ {

	public static void main(String[] args) {
		
		
		int num[]= new int[10];
		
		for(int i=0;i<num.length;i++) {
			num[i]= (int)(Math.random()*99+1);			//RELLENAMOS EL VECTOR DE ALEATORIOS SIN REPETICIÓN
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					i--;
				}
			}
		}
		for (int i=0;i<num.length;i++) {				//IMPRIMIMOS EL VECTOR
			System.out.println(num[i]);
		}

	}

}
