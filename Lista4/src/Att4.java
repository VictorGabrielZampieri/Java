

public class Att4 {

	public static void main(String[] args) {
		
		
		
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int B[] = {11,12,13,14,15,16,17,18,19,20};
		int C[] = new int [A.length + B.length];
		
 
		for(int i = 0; i < A.length; i++) 
			C[i] = A[i];
			
		for(int i = 0; i < A.length; i++)
		C[i + A.length] = B[i];
		
		
	}

}
