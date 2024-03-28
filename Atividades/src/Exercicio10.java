import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual será o salario fixo? ");
		float salarioF = leitor.nextFloat();
		
		System.out.print("Quantos carros foram vendidos? ");
		float carros = leitor.nextFloat();
		
		System.out.print("Qual era o valor total de vendas? ");
		float vendas = leitor.nextFloat();
		
		System.out.print("Qual é o valor por carro vendido? ");
		float comissao = leitor.nextFloat();
		
		leitor.close();

		double Salario = salarioF + (comissao*carros) + (vendas*0.05);
		
		System.out.println("\nO salário do vendedor é de: " + Salario + "R$");
 }
} 