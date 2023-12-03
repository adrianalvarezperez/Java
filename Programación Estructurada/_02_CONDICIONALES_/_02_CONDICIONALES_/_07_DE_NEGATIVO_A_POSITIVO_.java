package _02_CONDICIONALES_;

public class _07_DE_NEGATIVO_A_POSITIVO_ {

	public static void main(String[] args) {
		
		
		int cont1=0;
		int cont2= -1;
		
		do {
			cont1++;
			cont2= -cont2;							//PASA DE POSITIVO A NEGATIVO  //CONT2 VALE 1 Y A LA PASADA SIGUIENTE -1 Y ASÍ HASTA ACABAR EL BUCLE
			
			if(cont2==1) {							//CONT2 ES IGUAL A 1
				System.out.println("HOLA");
			} else {
				System.out.println("ADIOS");
			}
		} while(cont1<10);
	}

}
