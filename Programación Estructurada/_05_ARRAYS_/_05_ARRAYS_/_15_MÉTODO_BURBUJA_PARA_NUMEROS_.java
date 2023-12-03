package _05_ARRAYS_;

public class _15_MÉTODO_BURBUJA_PARA_NUMEROS_ {

	public static void main(String[] args) {
		
		int num[]= new int[10];
		
		num[0]= 10;
		num[1]= 20;
		num[2]= 1;
		num[3]= 5;
		num[4]= 758;
		num[5]= 1034;
		num[6]= 9;
		num[7]= 78;
		num[8]= 24;
		num[9]= 235;

		//_MÉTODO_BURBUJA_DE_ORDENACIÓN_
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1;j++) {
				
				if(num[i]<num[j]) {
					int aux= num[i];
					num[i]= num[j];
					num[j]= aux;
				}
			}
		}
		
		//IMPRIMIMOS LOS NUMEROS ORDENADOS
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
