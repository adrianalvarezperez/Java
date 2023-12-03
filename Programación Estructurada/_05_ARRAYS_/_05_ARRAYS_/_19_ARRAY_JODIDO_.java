package _05_ARRAYS_;

public class _19_ARRAY_JODIDO_ {

	public static void main(String[] args) {
		
		
		int t[][]= new int[8][6];
		
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[i].length;j++) {
				if(i==0 || i==7) {
					t[i][j]= 1;
				}
				if(j==0 || j==5) {
					t[i][j]=1;
				}
			}
		}
		
		for(int i=0;i<t.length;i++) {
			System.out.println();
			for(int j=0;j<t[i].length;j++) {
				System.out.print(t[i][j]);
			}
		}
		
			System.out.println();

	}

}
