import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos dias essa pessoa tem? ");
		int dias = leitor.nextInt();
		 
		leitor.close();
		
		final int ano = 365;
		final int mes = 30;

		int anos = dias/ano;
		int meses = (dias%ano)/mes;
		int dia =  (dias%ano)%30;
		
		System.out.println("\n Essa pessoa tem de vida " + anos + " anos");
		System.out.println("\n  de meses ela tem " + meses);
		System.out.println("\n e de dias ela possui " + dia);
	}
}