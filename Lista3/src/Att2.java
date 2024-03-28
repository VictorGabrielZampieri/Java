
public class Att2 {

	public static void main(String[] args) {
		
		int com = 1000;
		int fim = 2000;
		
		float resul = 0;

		for (int i = com; i < fim; i++) {
			resul = i%11;
			
			if (resul == 5)
					System.out.println(i);
			
		}

	}

}
