
public class Exerc13 {

	public static void main(String[] args) {
		
		int A[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int somatorio = 0;
		
		int resultado = diagonal(A, somatorio);
		
		System.out.print(resultado);

	}
	public static int diagonal(int A[][],int somatorio) {

		for(int i = 0; i < 5; i++) {
			
			somatorio = somatorio + A[i][i];
		}
		
		return somatorio;
	}

}
