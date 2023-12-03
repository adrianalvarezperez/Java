package _05_ARRAYS_;

public class _12_MÉTODO_BURBUJA_PARA_STRING_ {

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
			
			
			//_MÉTODO_BURBUJA_DE_ORDENACIÓN_
			for(int i=0;i<nombre.length;i++) {
				for(int j=0;j<nombre.length-1;j++) {					//-1
					
					if(nombre[i].compareToIgnoreCase(nombre[j])<0) {			//DE MAYOR A MENOR O MENOR A MAYOR
						String aux= nombre[i];
						nombre[i]= nombre[j];
						nombre[j]= aux;
					}
				}
			}
			
			//IMPRIMIMOS LOS NOMBRE ORDEANDOS
			for(int i=0;i<nombre.length;i++) {
				System.out.println(nombre[i]);
			}

	}

}
