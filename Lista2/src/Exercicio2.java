import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		
        
Scanner R = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int numero1 = R.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int numero2 = R.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		int numero3 = R.nextInt();
		
		R.close();
		
		if (numero1 >= numero2) {
		    if (numero1 > numero3)
				System.out.println(numero1 + " � maior");
		    else
				System.out.println(numero3 + " � maior");
		}
		else
			if (numero2 > numero3) 
			System.out.println(numero2 + " � maior" );
			
			else
				System.out.println(numero3 +" � maior");
		
		}
			
	}


