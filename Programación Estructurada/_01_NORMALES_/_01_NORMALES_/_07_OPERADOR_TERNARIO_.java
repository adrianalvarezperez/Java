package _01_NORMALES_;

public class _07_OPERADOR_TERNARIO_ {

	public static void main(String[] args) {
		
		
		float precio= 50.40f;
		
		float descuento= (precio>50f)? precio*0.10f : precio*0.05f;
		
		System.out.println("PRECIO DEL ARTICULO..."+precio);
		System.out.println("EL DESCUENTO ES DE..."+descuento);
		System.out.println("EL TOTAL ES DE..."+(precio-descuento));

	}

}
