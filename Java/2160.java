import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		String frase = leitor.nextLine();
		if (frase.length() <= 80) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
    }
}