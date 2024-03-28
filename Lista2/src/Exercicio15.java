import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.print("Insira o índice de poluição de poluição: ");
		float Indice = R.nextFloat();
		
		R.close();
		
		if (Indice > 0) {
			if (Indice <= 0.3) {
				System.out.println("O primeiro grupo irá suspender suas atividades");
				
			}
				if(Indice > 0.3 && Indice <= 0.4) {
					System.out.println("O primeiro e segundo grupo deveram suspender suas atividades");
				}
				if (Indice > 0.4 && Indice >= 0.5) {
					System.out.println("Todos os grupos irão suspender suas atividades");
				}
		}
		else
			System.out.println("O Indice está aceitável");
		
		
	}

}
