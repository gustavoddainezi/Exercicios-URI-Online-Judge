import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		String fr[] = new String[34];
		fr = frase.split("");
		int n = leitor.nextInt();
		for(int i = 0 ; i < n; i++) {
			System.out.printf("%s", fr[i]);
		}
		System.out.println("");
    }
}