import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.println("Qual é o valor A: ");
		float valorA = R.nextFloat();
		
		System.out.println("Qual é o valor B: ");
		float valorB = R.nextFloat();
		
		System.out.println("Qual é o valor C: ");
		float valorC = R.nextFloat();
		
		R.close();
		
		if (valorA > valorB + valorC)
			System.out.println("Não forma nenhum triângulo");
		else
			System.out.println("Forma um triângulo");
	}

}
