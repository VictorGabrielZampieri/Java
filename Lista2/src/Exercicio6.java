import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.println("Qual é o valor do primeiro lado: ");
		float lado1 = R.nextFloat();
		
		System.out.println("Qual é o valor do segundo lado: ");
		float lado2 = R.nextFloat();
		
		System.out.println("Qual é o valor do terceiro lado: ");
		float lado3 = R.nextFloat();
		
		R.close();
		
		if (lado1 == lado2)
			if (lado1 == lado3)
		   System.out.println("É um triângulo equilatero");
		
		else
		     System.out.println("É um triângulo Isóceles");
		 else
		     System.out.println("É um triângulo Escaleno");

 }
}