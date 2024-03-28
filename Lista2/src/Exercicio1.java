import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	Scanner R = new Scanner(System.in);
	
	System.out.print("Informe o primeiro valor: ");
	short valorA = R.nextShort();
	
	System.out.print("Informe o segundo valor: ");
	short valorB = R.nextShort();
	
	R.close();
	
	int multi = (valorA%valorB);
	
	if(multi == 0)
		System.out.println("É multiplo");
		
	else 
		 System.out.println("Não é multiplo");
	 
	
		
		

	}

}
