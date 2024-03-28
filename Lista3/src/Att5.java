
public class Att5 {

	public static void main(String[] args) {
		
		double chico = 1.50;
		double ze = 1.10;
		int anos = 0;
		
		while (chico >= ze) {
			chico += 0.02;
			ze += 0.03;
			anos ++;
		}
System.out.println("levaram " + anos + " anos para o ze ficar maior que o chico");
	}

}
