import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
Scanner R = new Scanner(System.in);
		
		System.out.print("Qual o salario atual da pessoa: ");
		int salarioA = R.nextInt();
		
		System.out.println("Gerente: codigo 101\nEngenheiro: codigo 102\nT�cnico: codigo 103\nCaso n�o se encaxe nessa tabela digite qualquer codigo");
		
		System.out.print("\nQual o codigo do cargo: ");
		int cargo = R.nextInt();
		
		float salarioB = 0;
		float dif = 0;
		
		R.close();
		
        if (cargo >= 101 && cargo <= 103)
        {
        	switch(cargo) {
        	
        	case 101:
        	
        		salarioB = salarioA*100/10;
        		dif = salarioB - salarioA;
        		System.out.print("sal�rio antigo: " + salarioA+"R$" + "\nSal�rio novo: " + salarioB+"R$" + "\nDifere�a de: " + dif+"R$");
        		break;
        		
        	case 102:
        		
        		salarioB = salarioA*100/20;
        		dif = salarioB - salarioA;
        		System.out.print("sal�rio antigo: " + salarioA+"R$" + "\nSal�rio novo: " + salarioB+"R$" + "\n difere�a de: " + dif+"R$");
        		break;
        		
        	case 103:
        		
        		salarioB = salarioA*100/30;
        		dif = salarioB - salarioA;
        		System.out.print("sal�rio antigo: " + salarioA+"R$" + "\nSal�rio novo: " + salarioB+"R$" + "\n difere�a de: " + dif+"R$");
        		break;
        	}
        }
        else
        	salarioB = salarioA*100/40;
		dif =  salarioB - salarioA;
		System.out.println("sal�rio antigo: " + salarioA+ "R$"+ "\nSal�rio novo: " + salarioB+"R$" + "\n difere�a de: " + dif+"R$");
}
}