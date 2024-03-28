
public class Att13 {

	public static void main(String[] args) {
		
		int A[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int somatorio = 0;
		
		for(int i = 0; i < 5; i++) {
			
			somatorio = somatorio + A[i][i];
		}
		
		System.out.print(somatorio);

	}

}
