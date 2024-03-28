
public class Att15 {

	public static void main(String[] args) {
		
		int A[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int menor = 0;
		boolean Menor;
		
		for (int i = 0; i < 5; i++) {
			
			Menor = true;
			
			for(int j = 0 ; j < 5; j++) {
				
				if(A[i][i] > A [j][j]) {
					Menor = false;
					break;
				}
			}
			if(Menor) {
			menor = A[i][i];
		}
		
		}
		System.out.print(menor);

	}

}
