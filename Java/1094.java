import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

		int n, conta = 0, quantia, somaC = 0, somaR = 0, somaS = 0;
		double total, perC, perR, perS;
		n = leitor.nextInt();

		while (conta < n) {
			quantia = leitor.nextInt();
			String tipo = leitor.next();
			if (tipo.equals("C")) {
				somaC += quantia;
			}
			else if (tipo.equals("R")) {
				somaR += quantia;
			}
			else if (tipo.equals("S")) {
				somaS += quantia;
			}
			conta = conta + 1;
		}
		
		total = somaC + somaR + somaS;
		perC = somaC * 100 / total;
		perR = somaR * 100 / total;
		perS = somaS * 100 / total;
		
		System.out.printf("Total: %.0f cobaias\n", total);
		System.out.printf("Total de coelhos: %d\n", somaC);
		System.out.printf("Total de ratos: %d\n", somaR);
		System.out.printf("Total de sapos: %d\n", somaS);
		System.out.printf("Percentual de coelhos: %.2f %%\n", perC);
		System.out.printf("Percentual de ratos: %.2f %%\n", perR);
		System.out.printf("Percentual de sapos: %.2f %%\n", perS);
    }
}