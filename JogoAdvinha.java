package controle;

import java.util.Random;
import java.util.Scanner;
 
public class JogoAdvinha { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
		 System.out.println("sorteando um n�mero entre 0 e 100...\n");
		Random numeroAleatorio = new Random();
		numeroSorteado = numeroAleatorio.nextInt(101);
		
		System.out.println("Come�ou o jogo...");
		tentativas = 0;
		
		do {
			tentativas++;
			System.out.printf("tentativa %d: ", tentativas);
			numero = scanner.nextInt();
			
			if (numero  > numeroSorteado) {
				System.out.printf("o numero � menor que %d\n\n", numero);
			} else if (numero < numeroSorteado) { 
				System.out.printf("o numero � maior que %d\n\n", numero);
			} else {
				System.out.printf("\n parab�ns vc acertou em %d tentativas", tentativas);
			       }
		}while (numero != numeroSorteado);
			System.out.println(" digite 0 para sair ou qualquer outro n�mero para continuar!");
			continuar = scanner.nextInt();
			
		}while (continuar !=0);
			scanner.close();
	}
		
}	
