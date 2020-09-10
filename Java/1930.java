import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

	    int a = leitor.nextInt()-1;
	    int b = leitor.nextInt()-1;
	    int c = leitor.nextInt()-1;
	    int d = leitor.nextInt();
	    System.out.println(a + b + c + d);
    }
}