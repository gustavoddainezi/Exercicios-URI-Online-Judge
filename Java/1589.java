import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int t = leitor.nextInt();
		for(int i = 0; i < t; i++){
			int r1 = leitor.nextInt();
			int r2 = leitor.nextInt();
			System.out.println(r1 + r2);
		}
    }
}