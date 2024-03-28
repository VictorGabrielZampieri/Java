import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos graus Fahrenheit está?" );
		double Fº = leitor.nextDouble();
		
		leitor.close();
		
		double celsius = (Fº - 32)/1.8;
		
		System.out.println("Em graus celsius fica " + celsius + "º");
		
 }
}