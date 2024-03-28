import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.print("Qual o saldo médio da pessoa: ");
		int saldoM = R.nextInt();
		
		R.close();
		
		float credito = 0;
		
		if (saldoM >= 0 && saldoM <= 200)
		{
			credito = saldoM*0/100;
			System.out.println("O saldo médio é de: " + saldoM + " é o credito é de: " + credito);
		}
		
		else
			if (saldoM >= 201 && saldoM <= 400) 
			{
				credito = saldoM*20/100;
		       System.out.println("O saldo médio é de: " + saldoM + " é o credito é de: " + credito);
		       }
		       else
		    	   if (saldoM >= 401 && saldoM <= 600) 
					{
						credito = saldoM*30/100;
				       System.out.println("O saldo médio é de: " + saldoM + " é o credito é de: " + credito);
				       }
		    	   else
		    		   if (saldoM >= 601) 
		   			{
		   				credito = saldoM*40/100;
		   		       System.out.println("O saldo médio é de: " + saldoM + " é o credito é de: " + credito);
		   		       }
		    		   else
		    			   System.out.println("Saldo inválido");
}
}