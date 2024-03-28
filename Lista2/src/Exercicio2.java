import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		
        
Scanner R = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = R.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int numero2 = R.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		int numero3 = R.nextInt();
		
		R.close();
		
		if (numero1 >= numero2) {
		    if (numero1 > numero3)
				System.out.println(numero1 + " É maior");
		    else
				System.out.println(numero3 + " É maior");
		}
		else
			if (numero2 > numero3) 
			System.out.println(numero2 + " É maior" );
			
			else
				System.out.println(numero3 +" É maior");
		
		}
			
	}


