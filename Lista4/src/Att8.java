
public class Att8 {

	public static void main(String[] args) {
		
		int A[] = {6,7,8,9,10,1,2,3,4,5};
		int temporario = 0;
		
		for(int i = 0; i < A.length; i++) {
			
			for(int j = 0; j < A.length -1; j++) {
				
				if(A[j] > A[j+1]) {
					
					temporario = A[j];
					A[j] = A[j+1];
					A[j+1] = temporario;
				}
			}
		}
		for(int i : A)
			System.out.println(i);

	}

}
