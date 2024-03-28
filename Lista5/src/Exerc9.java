import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.print("Digite um numero n: ");
		int N = R.nextInt();
		
		System.out.print("Digite o primeiro termo: ");
		int a1 = R.nextInt();
		
		System.out.print("Digite a razao da progreçao: ");
		int r = R.nextInt();
		
		R.close();
	
		int an = PA(N, a1, r);
		
		System.out.println(an);

	}
	public static int PA(int N, int a1, int r) {
		int An = a1 + (N - 1) *  r;
		return An;
	}

}
