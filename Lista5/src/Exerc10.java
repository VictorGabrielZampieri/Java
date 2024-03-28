import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
	Scanner R = new Scanner(System.in);
			
			int A [] = new int [10];
			int B [] = new int [10];
			int S = 0;
			
			for(int i = 0; i < 10; i++) {
				System.out.println("Informe um numero: ");
				A[i] = R.nextInt();
			}
	          R.close();
	          
	          int retorno = fatorial(A, B, S);
	          
	          System.out.println(retorno);

	}
	public static int fatorial(int A[], int B[], int S) {
		
		for (int i = 0; i < 10; i++) {
      	  S = 1;
      	  
      	  for (int j = 1; j < A[i]; j++) {
      		  S = S*j;
      	  }
      	  B[i] = S;
      	  
      	  System.out.print(" \n " + i + A[i] + B[i]);
        }
		return S;
	}

}
