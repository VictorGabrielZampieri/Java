import java.util.Scanner;

public class Att7 {

	public static void main(String[] args) {
		
		int A[] = new int [20];
		int somatorio;
		
		Scanner R = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			System.out.print("\n Informe um valor: ");
			A[i] = R.nextInt();
		}
		R.close();
		
		somatorio = (A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] + A[7] + A[8] + A[9] + A[10] + A[11] + A[12] + A[13] + A[14] + A[15] + A[16] + A[17] + A[18] + A[19]);
		
       System.out.println(somatorio);
	}

}
