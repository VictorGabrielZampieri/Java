import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.print("Insira o �ndice de polui��o de polui��o: ");
		float Indice = R.nextFloat();
		
		R.close();
		
		if (Indice > 0) {
			if (Indice <= 0.3) {
				System.out.println("O primeiro grupo ir� suspender suas atividades");
				
			}
				if(Indice > 0.3 && Indice <= 0.4) {
					System.out.println("O primeiro e segundo grupo deveram suspender suas atividades");
				}
				if (Indice > 0.4 && Indice >= 0.5) {
					System.out.println("Todos os grupos ir�o suspender suas atividades");
				}
		}
		else
			System.out.println("O Indice est� aceit�vel");
		
		
	}

}
