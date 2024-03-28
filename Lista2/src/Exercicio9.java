import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.print("Informe o codigo do item: ");
		int cod = R.nextInt();
		
		System.out.print("Quantidade comprada: ");
		int mult = R.nextInt();
		
		R.close();
		
		double cachorro = 1.20;
		double bauruS = 1.30;
		double bauruOvo = 1.50;
		double Ham = 1.20;
		double misto = 1.30;
		double Refri = 1.00;
		double valor = 0;
		
		if (cod >= 100 && cod <= 105)
			
		
		switch (cod) {
		
		case 100:
			valor = (cachorro*mult);
			System.out.println("\nO preço total será de " + valor + " R$");
		break;
		
		case 101:
		    valor = (bauruS*mult);
		    System.out.println("\nO preço total será de " + valor + " R$");
		break;
		
		case 102:
			valor = (bauruOvo*mult);
			System.out.println("\nO preço total será de " + valor + " R$");
		break;
		
		case 103:
		    valor = (Ham*mult);
		    System.out.println("\nO preço total será de " + valor + " R$");
		break;
		
		case 104:
			valor = (misto*mult);
			System.out.println("\nO preço total será de " + valor + " R$");
		break;
		
		case 105:
		    valor = (Refri*mult);
		    System.out.println("\nO preço total será de " + valor + " R$");
		break;
		
		
		}
			else
		
		System.out.println("\nO codigo " + cod + " é inválido");
 }
}
