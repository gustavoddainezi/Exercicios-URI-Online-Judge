import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int N = 100, X, maior = 0, pos = 0;
		for (int i = 1; i <= N; i++) {
			X = leitor.nextInt();
			
			if (maior > X) {
				maior = maior;
				pos = pos;
			}
			else {
				maior = X;
				pos = i;
			}
		}
		System.out.println(maior + "\n" + pos);
    }
}