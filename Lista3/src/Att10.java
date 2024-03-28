
public class Att10 {

	public static void main(String[] args) {
		
		byte quantidadePerfeitos = 0;
		int numero = 1;
		int somaDivisores = 0;
		
		while(quantidadePerfeitos <=5) {
			
			somaDivisores = 0;
			for(int i =1; i < numero; i++) {
				if(numero % i == 0)
					somaDivisores += i;
			}
			if(somaDivisores == numero) {
				quantidadePerfeitos++;
				System.out.println(numero);
			}
			
			numero ++;
		}
		
	}

}
