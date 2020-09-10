import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		while(leitor.hasNext()) {
			int total = leitor.nextInt();
			int conta = 0;
			while(total != 1) {
				if (total % 2 == 0) {
					total /= 2;
					conta++;
				}
				else {
					return;
				}
			}
			System.out.println(conta);
		}
    }
}