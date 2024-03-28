import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
	
		int eleitor = 0;
		int brancos = 0;
		int nulos = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos eleitores? ");
		eleitor = leitor.nextInt();
		
		System.out.print("\nQuantos votaram branco? ");
		brancos = leitor.nextInt();
		
		System.out.print("\nE quantos votaram nulo ");
		nulos = leitor.nextInt();
		
		leitor.close();
		
		int validos = (eleitor - brancos) - nulos;
		float percebrancos = (brancos*100)/eleitor;
		float percenulos = (nulos*100)/eleitor;
		float percevalidos = (validos*100)/eleitor;
		
		System.out.println("\nO numero de votos validos foram de " + validos + " que representa " + percevalidos +"% ");
		System.out.println("\nO numero de votos brancos foram de " + brancos + " que representa " + percebrancos +"% ");
		System.out.println("\nO numero de votos nulo foram de " + nulos + " que representa " + percenulos +"%");
	}
}
