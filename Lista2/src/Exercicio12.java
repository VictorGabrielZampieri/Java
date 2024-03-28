import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.println("Informe o valor de I: ");
		int I = R.nextInt();
		
		System.out.println("Informe o valor de A: ");
		float A = R.nextFloat();
		
		System.out.println("Informe o valor de B: ");
		float B = R.nextFloat();
		
		System.out.println("Informe o valor de C: ");
		float C = R.nextFloat();
		
		R.close();

		if (I >= 0)
		
			if (A > B && A > C)
		       System.out.println(A);
	}

}
