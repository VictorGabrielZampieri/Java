import java.util.Scanner;

public class Exerc3 {

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
		
		int resu = dias(ano,mes,dias,meses,anos);
		
		System.out.println(resu);
	}
	public static int dias(int anos, int meses,int dias, int ano,int mes) {
		int dias_totais = (ano*anos) + (mes*meses) + dias;
		return dias_totais;
	}

}
