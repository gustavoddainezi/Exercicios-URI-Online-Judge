import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int n, cont = 1;
		n = leitor.nextInt();

		while (cont < 10000) {
			if (cont % n == 2){
				System.out.println(cont);
			}
			cont += 1;
		}
    }
}