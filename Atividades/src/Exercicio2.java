import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);	
	
	System.out.print("Digite a primeira nota: ");	
	float nota1 = leitor.nextFloat();
	
	
	System.out.print("\nDigite a segunda nota: ");	
	float nota2 = leitor.nextFloat();
	
	
	System.out.print("\nDigite a terceira nota: ");	
	float nota3 = leitor.nextFloat();
	
	System.out.print("\nQual foi a frequencia do aluno: ");
	float frequencia = leitor.nextFloat();
	
	leitor.close();
	
	
	
	float media = (nota1 + nota2 + nota3)/3;
    System.out.println("\nA média foi de: " + media);
    
     
    
    if(media >= 7 && frequencia >= 75) {
    	
    	if(media<=9.9)
         System.out.println("O aluno foi aprovado");
    	   
    	else
    		System.out.println("O aluno foi aprovado com louvor");
	}else 
		
        if(frequencia <= 74) {
		System.out.println("O aluno foi reprovado por frequencia");
    
        } else
        	System.out.println("O aluno foi reprovado por nota");
        
 }

}
