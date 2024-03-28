
public class Exerc11 {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,16,15};
		int maior = 0;
		
		int M = MaiordoA(A, maior);
		
		System.out.println(M);
	}
	public static int MaiordoA(int A[], int maior) {
		
boolean Maior;
		
		for (int i = 0; i < 15; i++) {
			
			Maior = true;
			
			for (int j = 0; j < 15; j++) {
				
				if (A[i] < A[j]) {
					
					Maior = false;
					break;
				}
			}
			
			if(Maior) {
				maior = A[i];
			}
			
		}
		
		return maior;
	}

}
