import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos graus Fahrenheit est�?" );
		double F� = leitor.nextDouble();
		
		leitor.close();
		
		double celsius = (F� - 32)/1.8;
		
		System.out.println("Em graus celsius fica " + celsius + "�");
		
 }
}