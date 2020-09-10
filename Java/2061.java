import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();
		int M = leitor.nextInt();
		leitor.nextLine();
		if (N > 0 && M < 500){
			String acao = "";
			int abas = N;
			for (int i = 0 ; i < M; i++){
				acao = leitor.nextLine();
				if (acao.equals("fechou")) {
					abas++;
				}
				if (acao.equals("clicou")) {
					abas--;
				}
			}
			System.out.println(abas);
		}
    }
 
}