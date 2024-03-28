
public class Att10 {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int B[] = new int[4];
		int quantidadeP = 0;
		int D = 0;
		boolean isPrimo;
		
		
		while( quantidadeP <= B.length) {
		isPrimo = true;

		for (int i = 2; i < A.length; i++) {

			if (A[i] % i == 0) {

				isPrimo = false;
				break;

			}
			D = A[i];

		}

		if (isPrimo) {

			B[quantidadeP] = D;
			quantidadeP++;

		}
		}
		for ( int i = 0; i <= B.length; i++) {
		System.out.println(B[i]);
     
	}

}
}