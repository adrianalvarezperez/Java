package _01_NORMALES_;

public class _05_CONCATENA_SUMA_ {

	public static void main(String[] args) {
		
		
		int a= 25;
		int b= 5;
		
		System.out.println("a+b= "+a+b);					//TRAMPA ASÍ CONCATENA
		System.out.println("a+b= "+(a+b));					//ASÍ SUMA
		
		
		
		System.out.println();
		
		
		
		int c= 5;
		int d= 3;
		
		System.out.println("La suma entre c y d es..."+c+d);	//TRAMPA ASÍ CONCATENA
		System.out.println("La suma entre c y d es..."+(c+d));	//ASÍ SUMA
	}

}
