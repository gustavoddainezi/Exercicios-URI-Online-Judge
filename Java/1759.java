import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("Ho ");
		}
		System.out.println("Ho!");
    }
}