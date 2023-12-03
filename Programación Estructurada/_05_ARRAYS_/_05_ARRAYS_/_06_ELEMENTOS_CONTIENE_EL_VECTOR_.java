package _05_ARRAYS_;

public class _06_ELEMENTOS_CONTIENE_EL_VECTOR_ {

	public static void main(String[] args) {
		
		
		String nombre[]= new String[3];
		
			nombre[0]= "Pepe";
			nombre[1]= "Adrián";
			nombre[2]= "Raúl";
			
			System.out.println("EL VECTOR CONTIENE..."+nombre.length+" ELEMENTOS.\n");

			
			for (int i=0;i<nombre.length;i++) {
				System.out.println(nombre[i]);
			}
	}

}
