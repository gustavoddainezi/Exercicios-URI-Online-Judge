import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int escolha = leitor.nextInt();
		int jogada1 = leitor.nextInt();
		int jogada2 = leitor.nextInt();
		int roubou = leitor.nextInt();
		int acusa = leitor.nextInt();
		
		if (roubou == 1 && acusa == 0) {
			System.out.println("Jogador 1 ganha!");
		}
		else if (roubou == 0 && acusa ==1) {
			System.out.println("Jogador 1 ganha!");
		}
		else if (roubou == 1 && acusa ==1) {
			System.out.println("Jogador 2 ganha!");
		}
		else {
			if (escolha == 1) {
				if ((jogada1 + jogada2) %2 ==0) {
					System.out.println("Jogador 1 ganha!");
				}
				else 
					System.out.println("Jogador 2 ganha!");
			}
			else if (escolha == 0) {
				if ((jogada1 + jogada2) %2 != 0) {
					System.out.println("Jogador 1 ganha!");
				}
				else {
					System.out.println("Jogador 2 ganha!");
				}
			}
		}
    }
}