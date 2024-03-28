import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		
	Scanner R = new Scanner(System.in);
			
			System.out.print("Informe um valor: ");
			int num1 = R.nextInt();
			
			System.out.print("Informe outro valor: ");
			int num2 = R.nextInt();
			R.close();
			
			int fatorial1 = 1;
			int fatorial2 = 1;
			
			int correspondente = fatorial(num1, num2, fatorial1, fatorial2);
			
			correspondente =  correspondente + 0;
		

	}
	public static int fatorial(int num1, int num2, int fatorial1, int fatorial2) {
		for (int i = num1; i > 1; i --)
			fatorial1 *= i;

		for (int j = num2; j > 1; j --)
			fatorial2 *=j;
		
		if (fatorial1 == fatorial2)
			System.out.println("\nSão correspondentes");
		else
			System.out.println("\nNão são correspondentes");
		
		return fatorial1;
	}

}
