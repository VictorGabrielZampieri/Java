import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner R = new Scanner(System.in);
		
		System.out.println("Que horas o jogo come�ou: ");
		int horaI = R.nextInt();
		
		System.out.println("que horas o jogo terminou: ");
		int horaF = R.nextInt();
		
		R.close();
		
		byte duracao = (byte) (horaI - horaF);
		System.out.println("A dura��o do jogo foi de" + duracao + "horas");
		
 }
}