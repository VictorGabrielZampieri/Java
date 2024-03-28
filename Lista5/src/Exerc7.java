import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		

		Scanner R = new Scanner(System.in);
		
		System.out.println("Informe o limite: ");
		double limite = R.nextInt();
		
		R.close();
		
		double e = 1;
		double fatorial = 1;
		
		double valorE = E(fatorial, e, limite);
		
		System.out.println(valorE);

	}
	public static double E(double e, double limite, double fatorial) {
		
	for(int i = 1; i<=limite; i++) {
				
				fatorial =1;
				
				for(int j = i; j > 1; j--) 
					
					fatorial *=j;
				
				e += 1 / (double)fatorial;
			}
	
		return e;
	}

}
