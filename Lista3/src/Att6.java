import java.util.Scanner;

public class Att6 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int num = R.nextInt();
		
		R.close();
		
		int fatorial = 1;

		for(int i = num; i > 1; i --)
			
			fatorial *= i;
		System.out.println("\nO fatorial de " + num +" é de " +fatorial);
		
	}

}
