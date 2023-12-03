package _05_ARRAYS_;

public class _09_NUMERO_DE_COLUMNAS_ {

	public static void main(String[] args) {
		
		
		int datos[][]= {
			{1,5,7,78,45},
			{3,4,5},
			{34,38,87,1,4,12,125},
			{2},
			{2,5,98,65,32},
		};

		
		for(int i=0;i<datos.length;i++) {
			for(int j=0;j<datos[i].length;j++) {
				
				System.out.print(datos[i][j]+",");
			}
				System.out.println();
		}
	}

}
