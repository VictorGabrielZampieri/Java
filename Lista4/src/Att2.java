
public class Att2 {

	public static void main(String[] args) {
		int primo[] = new int[10];
		boolean isPrimo;

		int quantidadePrimos = 0;
		int numero = 2;

		while (quantidadePrimos < 10) {

			isPrimo = true;

			for (int i = 2; i < numero; i++) {

				if (numero % i == 0) {

					isPrimo = false;
					break;

				}

			}

			if (isPrimo) {

				primo[quantidadePrimos] = numero;
				quantidadePrimos++;

			}

			numero++;

		}
		
		for (int i : primo) {
			
			System.out.println(i);
		}

	}

}
