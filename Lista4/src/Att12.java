
public class Att12 {

	public static void main(String[] args) {
		int A[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int somatorio = 0;
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 4; j++) {
				
				somatorio = somatorio + A[i][j] + A[i][j+1];
			}
		}
		
		System.out.print(somatorio);

	}

}
