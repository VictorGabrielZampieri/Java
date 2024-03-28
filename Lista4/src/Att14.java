
public class Att14 {

	public static void main(String[] args) {
		
		int A[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int soma = 0;
		
		for(int i = 0; i < 5; i++) {
			
			soma = soma + A[4][i];
			
		}
		
          for(int i = 0; i < 5; i++) {
			
			soma = soma + A[i][4];
		
          }
		
		
		System.out.print(soma);

	}

}
