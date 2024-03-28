
public class Exerc8 {

	public static void main(String[] args) {
		
		int quantidadePerfeitos = 0;
		int numero = 1;
		int somaDivisores = 0;
		
		int perfec = perfeitos(quantidadePerfeitos, numero, somaDivisores);
		
		System.out.println("quantidades de perfitos" + perfec);

	}
	public static int perfeitos(int quantidadePerfeitos,int numero,int somaDivisores) {
		
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
	return quantidadePerfeitos;
	}

}
