import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos anos essa pessoa tem? ");
		int anos = leitor.nextInt();
		
		System.out.print("Quantos meses essa pessoa tem? ");
		int meses = leitor.nextInt();
		
		System.out.print("Quantos dias essa pessoa tem? ");
		int dias = leitor.nextInt();
		 
		leitor.close();
		
		final int ano = 365;
		final int mes = 30;
		

		int dias_totais = (ano*anos) + (mes*meses) + dias;
		
		
		System.out.println("\n Essa pessoa tem de vida " + dias_totais + " dias");
		
	}

}
