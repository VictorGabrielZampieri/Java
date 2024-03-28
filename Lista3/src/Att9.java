import java.util.Scanner;

public class Att9 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.println("Informe o limite: ");
		int limite = R.nextInt();
		
		R.close();
		
		double e = 1;
		int fatorial = 1;
		
		for(int i = 1; i<=limite; i++) {
			
			fatorial =1;
			
			for(int j = i; j > 1; j--) 
				
				fatorial *=j;
			
			e += 1 / (double)fatorial;
		}
		System.out.println("O valor de e foi " + e);
		
	}

}
