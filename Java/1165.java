import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int n, x, testaSoma = 0;
		
		n = leitor.nextInt();
		while (n > 0) {
			x = leitor.nextInt();
			for (int aux = 2; aux < x; aux++){
				if (x % aux == 0){
					testaSoma += aux;
				}
			}
			if (testaSoma == 0){
				System.out.printf("%d eh primo\n", x);
			}
			else {
				System.out.printf("%d nao eh primo\n", x);
			}
			n -= 1;
			testaSoma = 0;
		}
    }
}