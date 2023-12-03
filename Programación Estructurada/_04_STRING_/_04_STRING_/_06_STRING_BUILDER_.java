package _04_STRING_;

public class _06_STRING_BUILDER_ {

	public static void main(String[] args) {
		
		
		String texto1= "El perro de san Roque no tiene rabo";
		String texto2= "porque Ramon Ramirez se lo ha robado";
		
		//****************************************************************************************
		
		texto1.toUpperCase();
		texto1.concat("porque ramon Ramirez se lo ha robado");
		System.out.println(texto1);									//NO FUNCIONA 
		
		//****************************************************************************************
		
		texto1= texto1.toUpperCase();
		texto1= texto1.concat(texto2); 
		System.out.println(texto1);
		
		//****************************************************************************************
		
		StringBuilder texto3 = new StringBuilder(texto1);
		
			texto3.append(texto2);				//CONCATENA O UNE UNA CADENA
			System.out.println(texto3);
			
			
			texto3.delete(49,56);				//ELIMINA RAMIREZ
			System.out.println(texto3);
			
			
			texto3.insert(49,"Perez");			//INSERTAMOS EN LA POSICION 45 PEREZ
			System.out.println(texto3);
			
			
			System.out.println(texto3.toString());
	}

}
