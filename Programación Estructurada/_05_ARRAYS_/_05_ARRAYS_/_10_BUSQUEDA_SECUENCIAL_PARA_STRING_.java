package _05_ARRAYS_;

public class _10_BUSQUEDA_SECUENCIAL_PARA_STRING_ {

	public static void main(String[] args) {
		
		
		String nombre[]= new String[10];
		
			nombre[0]= "Pepe";
			nombre[1]= "Juan";
			nombre[2]= "Luis";
			nombre[3]= "Alicia";
			nombre[4]= "Rosa";
			nombre[5]= "Carlos";
			nombre[6]= "Pedro";
			nombre[7]= "Lucas";
			nombre[8]= "Maria";
			nombre[9]= "Carlota";
			
			String buscar= "Alicia";
			
			int i;
			
			//RECORRES EL VECTOR HASTA EL FINAL Y SI HAY UN NOMBRE EN VECTOR IGUAL A BUSCAR
			for(i=0;i<nombre.length && !nombre[i].equalsIgnoreCase(buscar);i++) {
			}
	
			if(i!=nombre.length) {
				System.out.println("ENCONTRADO EN LA POSICION -----> "+(i+1));
			} else {
				System.out.println("NO ENCONTRADO");
			}
	}

}
