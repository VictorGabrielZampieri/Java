import java.util.Scanner;

public class Att4 {
	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		int valor[] = new int [10];
		int maior[] = new int [1];
		int menor[] = new int [1];
		int media[] = new int [1];
		int gurda[] = new int [1];
		
		for (int i = 0; i < 10; i++) {
		System.out.print("Informe um numero inteiro: ");
		valor[i] = R.nextInt();
		}
		
		R.close();
		
	
		
		for (int i = 0; i < 10; i++) {
			
			if ( valor[i] > valor[i+1] && valor[i] > valor[i+2] && valor[i] > valor[i+3] && valor[i] > valor[i+4] && valor[i] > valor[i+5] && valor[i] > valor[i+6] && valor[i] > valor[i+7] && valor[i] > valor[i+8] && valor[i] > valor[i+9] && valor[i] > valor[i+10] ) {
				maior[1] = valor[i];
			}
			if (valor[i] < valor[i+1] && valor[i] < valor[i+2] && valor[i] < valor[i+3] && valor[i] < valor[i+4] && valor[i] < valor[i+5] && valor[i] < valor[i+6] && valor[i] < valor[i+7] && valor[i] < valor[i+8] && valor[i] < valor[i+9] && valor[i] < valor[i+10]) {
				menor[1] = valor[i];
			}
			gurda[1] = gurda[1] + valor[i] + valor[i+1];
			
		}
		
		 
		System.out.println(maior[1] + menor[1] + media[1]);
		
		
	}

}
