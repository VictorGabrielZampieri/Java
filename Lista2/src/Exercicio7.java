import java.util.Scanner;

public class Exercicio7 {
   public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.println("Qual a idade do nadador: ");
		short idade = R.nextShort();
		
		R.close();
		
		if (idade >= 5)
			if (idade <= 7)
			  System.out.println("Classificado para a categoria: Infantil A");
		
			else
				if (idade <= 10)
					System.out.println("Classificado para a categoria: Infantil B");
		
				else
					if (idade <= 13)
						System.out.println("Classificado para a categoria: Juvenil A");
		             
					else
						if(idade <= 17)
							System.out.println("Classificado para a categoria: Juvenil B");
		
		                      if(idade >= 18)
		                    	  
                               System.out.println("Classificado para a categoria: Adulto");
		
		                         else
		                        	 if(idade <= 4)
		                             System.out.println(" Idade inválida");
		   
		     

}
}