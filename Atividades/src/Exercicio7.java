import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual � o sal�rio que ser� reajustado? ");
		float salario = leitor.nextFloat();
		
		System.out.print("Qual ser� o percentual? ");
		float reajust = leitor.nextFloat();
		
		leitor.close();
		
		Float novo_salario = salario*(reajust/100);
		
		System.out.println("O novo salario � de " + novo_salario);
		
 }
}