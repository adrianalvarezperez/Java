package _05_ARRAYS_;

public class _05_PLAZAS_LIBRE_TUNEADO_ {

	public static void main(String[] args) {
		
		
		String nombre[][]= new String[10][7];
		for(int i=0;i<nombre.length;i++) {
			for(int j=0;j<nombre[i].length;j++) {
				nombre[i][j]= "Libre  ";
			}
		}
		
		
			nombre[0][0]= "1234BVC";
			nombre[0][1]= "9876RTF";
			nombre[4][3]= "7654ABJ";
			
			
			for(int i=0;i<nombre.length;i++) {
				for(int j=0;j<nombre[i].length;j++) {
					System.out.print(nombre[i][j]+"          ");
				}
				System.out.println();
			}

	}

}
