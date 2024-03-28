import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		float base = leitor.nextFloat();
		
		System.out.print("\nDigite a altura: ");
		float altura = leitor.nextFloat();
		
		leitor.close();
		
		float resultado = area(base,altura);
		
		System.out.println(resultado);
	}
	public static float area(float base, float altura) {
		float resultado = base * altura;
		return resultado;
	}
}
