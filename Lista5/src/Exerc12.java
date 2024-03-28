
public class Exerc12 {

	public static void main(String[] args) {
		
		int A[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int somatorio = 0;
		
		int resultado = elementos(A, somatorio);
		
		System.out.print(resultado);

	}
	public static int elementos(int A[][],int somatorio) {
		
	         for(int i = 0; i < 5; i++) {
				
				for(int j = 0; j < 4; j++) {
					
					somatorio = somatorio + A[i][j] + A[i][j+1];
				}
			}
	         
	         return somatorio;
	}

}
