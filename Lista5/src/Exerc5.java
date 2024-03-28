import java.util.Scanner;

public class Exerc5 {

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
		
		double SalarioF = salario(comissao, vendas, carros,salarioF);
		
		System.out.println(SalarioF);

	}
	public static double salario(double salarioF,double carros,double vendas,double comissao) {
		double Salario = salarioF + (comissao*carros) + (vendas*0.05);
		return Salario;
	}

}
