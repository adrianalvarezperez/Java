package _01_NORMALES_;

public class _04_CAST_FLOAT_ {

	public static void main(String[] args) {
		
		
		double x= 1.5; 
		int y= 4;
		
		float z= (float)x*y;				//SOLO DA BIEN METIENDO UN CAST DE FLOAT...//CON CAST INT O DOUBLE NO FUNCIONA
		
		System.out.println(z);

	}

}
