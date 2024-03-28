import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {

		Scanner R = new Scanner(System.in);
		System.out.print("Entre com o valor:");
		int valor = R.nextInt();

		System.out.println("Notas de 100: " + valor / 100);
		System.out.println("Notas de 50 : " + (valor % 100) / 50);
		System.out.println("Notas de 20 : " + ((valor % 100) % 50) / 20);
		System.out.println("Notas de 10 : " + (((valor % 100) % 50) % 20) / 10);
		System.out.println("Notas de 5  : " + ((((valor % 100) % 50) % 20) % 10) / 5);
		System.out.println("Notas de 2  : " + (((((valor % 100) % 50) % 20) % 10) % 5) / 2);
		System.out.println("Notas de 1  : " + ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1);
		
		R.close();

}
}