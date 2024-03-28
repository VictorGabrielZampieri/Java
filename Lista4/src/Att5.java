
public class Att5 {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int B[] = {10,12,13,14,15,16,17,18,19,20};
		
		int quantidade = 0;
		int indice = 0;
		
		for(int i = 0; i < A.length; i++) {
			
			for(int J = 0; J < B.length; J++) {
				
				if(A[i] == B[J])
					quantidade++;
			}
		}
		int C[] = new int[quantidade];
		
for(int i = 0; i < A.length; i++) {
			
			for(int J = 0; J < B.length; J++) {
				
				if(A[i] == B[J]) {
					C[indice] = A[i];
				indice++;
				}
			}	
			
         }
         for(int i : C)
          System.out.println(i);
	}

}
