import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);	
		
		System.out.print("Digite a primeira nota: ");	
		float nota1 = leitor.nextFloat();
		final byte PESO_1 = 2;
		
		System.out.print("\nDigite a segunda nota: ");	
		float nota2 = leitor.nextFloat();
		final byte PESO_2 = 3;
		
		System.out.print("\nDigite a terceira nota: ");	
		float nota3 = leitor.nextFloat();
		final byte PESO_3 = 5;
		
		leitor.close();
		
		float resu = media(nota1, nota2, nota3, PESO_1, PESO_2,PESO_3);
		
		System.out.println(resu);

	}
	
		public static float media(float nota1,float nota2, float nota3,byte PESO_1,byte PESO_2,byte PESO_3) {
		float media = (nota1 * PESO_1 + nota2 * PESO_2 + nota3 * PESO_3) /(PESO_1 + PESO_2 + PESO_3);
		return media;
	}

}
