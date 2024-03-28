import java.util.Scanner;

public class Att6 {

	public static void main(String[] args) {
		
		int A[] = new int [15];
		int valor;
		
		Scanner R = new Scanner(System.in);
		
		for(int i = 0; i < 15; i++) {
			System.out.print("Informe um valor: ");
			A[i] = R.nextInt();
		}
		R.close();
		
		
		for(int i = 0; i < 15; i++) {
			
			valor = (A[i]%2);
			
			if (valor == 0) {
				
				System.out.print("\n" + A[i]);
			}
			
		}
		

	}

}
