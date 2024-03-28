import java.util.Scanner;

public class Att3 {

	public static void main(String[] args) {
		
Scanner R = new Scanner(System.in);
		
		System.out.println("Insira dois valores que serão a base;");
		System.out.println("Informe o menor valor, lembrando que ele deve positivo e inteiro porfavor:");
		int valorA = R.nextInt();
		
		System.out.println("Informe o maior valor, lembrando que ele deve positivo e inteiro porfavor:");
		int valorB = R.nextInt();
		R.close();
		
		int check1 = (valorA%2);
		int produ = 0;
		int i = valorB;
		int j = valorA;
			
		if(valorA < 0 || valorB < 0) {
			System.out.println("\nUm dos valores é invalido");
		}
			
			do {
			        if (check1 == 0)
			        	
			    produ = j*valorA;
				System.out.println(produ);
				i --;
				j -=2;
			}
			while( i > valorA || produ <0);
			System.out.println("0");
	}

}


