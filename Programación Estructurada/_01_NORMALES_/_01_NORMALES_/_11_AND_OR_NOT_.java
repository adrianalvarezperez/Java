package _01_NORMALES_;

public class _11_AND_OR_NOT_ {

	public static void main(String[] args) {
		
		
		int a= 3;
		int b= 5;
		
		boolean evaluacion;
		
		evaluacion= a>b && b>1;
		System.out.println(evaluacion);			//FALSE PORQUE TIENEN QUE SER LAS DOS VERDADERAS
		
		evaluacion= a>b || b>1;
		System.out.println(evaluacion);			//TRUE PORQUE UNA DE LAS DOS ES VERDADERA
		
		evaluacion= !(a>b);
		System.out.println(evaluacion);			//TRUE PORQUE EL ! CAMBIA EL FLASE A TRUE

	}

}
