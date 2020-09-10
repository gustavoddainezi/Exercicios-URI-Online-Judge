import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = 0;
		
		if(a == b) {
			c = a;
		}
		else if(a > b) {
			c = a;
		}
		else {
			c = b;
		}
		
		System.out.println(c);
    }
}