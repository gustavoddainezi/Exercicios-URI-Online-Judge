import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		if (a == b || b == c || a == c) {
			System.out.println("S");
		} 
		else if (a + b == c || a + c == b || b + c == a) {
			System.out.println("S");
		} 
		else {
			System.out.println("N");
		}
    }
}