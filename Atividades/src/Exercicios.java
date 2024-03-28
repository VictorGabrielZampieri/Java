import java.util.Scanner;

public class Exercicios {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		float base = leitor.nextFloat();
		
		System.out.print("\nDigite a altura: ");
		float altura = leitor.nextFloat();
		
		leitor.close();
		
		float area =  base*altura;
		
		System.out.println("\n A area do retangulo é de " + area);
		
	}
}
