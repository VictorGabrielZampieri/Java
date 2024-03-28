import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		final float distri = 28;
		final float imposto = 45;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual é o custo de fabrica? ");
		float fabrica = leitor.nextFloat();
		
		leitor.close();
		
		float custo = pay(fabrica, distri, imposto);
		
		System.out.println(custo);

	}
	public static float pay(float fabrica, float distri, float imposto) {
		float distribui = fabrica + (fabrica*distri/100);
		float vImposto = fabrica + (fabrica*imposto/100);
		
		float custo = fabrica + vImposto + distribui;
		
		return custo;
	}

}
