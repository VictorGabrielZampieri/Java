import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.print("Qual o saldo m�dio da pessoa: ");
		int saldoM = R.nextInt();
		
		R.close();
		
		float credito = 0;
		
		if (saldoM >= 0 && saldoM <= 200)
		{
			credito = saldoM*0/100;
			System.out.println("O saldo m�dio � de: " + saldoM + " � o credito � de: " + credito);
		}
		
		else
			if (saldoM >= 201 && saldoM <= 400) 
			{
				credito = saldoM*20/100;
		       System.out.println("O saldo m�dio � de: " + saldoM + " � o credito � de: " + credito);
		       }
		       else
		    	   if (saldoM >= 401 && saldoM <= 600) 
					{
						credito = saldoM*30/100;
				       System.out.println("O saldo m�dio � de: " + saldoM + " � o credito � de: " + credito);
				       }
		    	   else
		    		   if (saldoM >= 601) 
		   			{
		   				credito = saldoM*40/100;
		   		       System.out.println("O saldo m�dio � de: " + saldoM + " � o credito � de: " + credito);
		   		       }
		    		   else
		    			   System.out.println("Saldo inv�lido");
}
}