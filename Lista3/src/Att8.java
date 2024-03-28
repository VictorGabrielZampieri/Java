

public class Att8 {

	public static void main(String[] args) {
		
				long produto = 1;
		boolean isPrimo;
		
		
		for (int i =92; i <= 107; i++) {
			
			isPrimo = true;
		
		for(int j = 2; j < i; j++) {
			
			if(i % j == 0) {
				
				isPrimo = false;
				break;
			}
		}
        
		if (isPrimo)
			produto*=i;
		}
		
		System.out.println(produto);
	}

}
