import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);	
		
		System.out.print("Qual o codígo do aluno: ");
		int aluno = leitor.nextInt();
		
		System.out.print("\nDigite a primeira nota: ");	
		float nota1 = leitor.nextFloat();
		final byte PESO_1 = 3;
		
		System.out.print("Digite a segunda nota: ");	
		float nota2 = leitor.nextFloat();
		final byte PESO_2 = 3;
		
		System.out.print("Digite a terceira nota: ");	
		float nota3 = leitor.nextFloat();
		final byte PESO_3 = 4;
		
		leitor.close();
		
		
		float media = (nota1 * PESO_1 + nota2 * PESO_2 + nota3 * PESO_3) /(PESO_1 + PESO_2 + PESO_3);
		
		 System.out.println("\nO aluno " + aluno + " teve a media de: " + media);
		
		if (media >= 7) 
			
	          System.out.println("\nEle foi aprovado");
		else 
	        	  
	          System.out.println("\nEle foi reprovado");
		
	 }
}
