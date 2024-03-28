import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);	
		
		System.out.print("Qual o codígo do aluno: ");
		int aluno = leitor.nextInt();
		
		System.out.print("\nDigite a primeira nota: ");	
		float nota1 = leitor.nextFloat();
		
		
		System.out.print("Digite a segunda nota: ");	
		float nota2 = leitor.nextFloat();
		
		
		System.out.print("Digite a terceira nota: ");	
		float nota3 = leitor.nextFloat();
		
		
		leitor.close();
		
		
		float media = (nota1  + nota2  + nota3) /3;
		
		float MA = (nota1 +nota2*2 + nota3*3 + media)/7;
		
		if (MA >= 9.0)
		
		 System.out.println("\nO aluno " + aluno + " teve a media de: " + media + ", e um aproveitamento A");
		
		else
			if (MA >= 7.5 && MA <= 9.0)
				System.out.println("\nO aluno " + aluno + " teve a media de: " + media + ", e um aproveitamento B");
		
			else
				if (MA >= 6.0 && MA <= 7.5)
					System.out.println("\nO aluno " + aluno + " teve a media de: " + media + ", e um aproveitamento C");
					
				else
					if (MA >= 4.0 && MA <=6.0)
						System.out.println("\nO aluno " + aluno + " teve a media de: " + media + ", e um aproveitamento D");
		
					else
						if(MA < 4.0)
							System.out.println("\nO aluno " + aluno + " teve a media de: " + media + ", e um aproveitamento E");
						
		
		if (media >= 7) 
			
	          System.out.println("\nEle foi aprovado");
		else 
	        	  
	          System.out.println("\nEle foi reprovado");
		
	 

	}

}
