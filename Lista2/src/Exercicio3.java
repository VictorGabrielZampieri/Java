import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.println("digitem um numero: ");
		int numero = R.nextInt();
		
		R.close();
		
		int multi = (numero%2);
		if(multi == 0) 
			
			System.out.println("É par");
			
		else 
			 System.out.println("É impar");
		
		if(numero >= 0)
			System.out.println("positivo");
		else
			System.out.println("Negativo");
			
	}

}
