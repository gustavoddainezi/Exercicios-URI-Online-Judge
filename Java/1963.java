import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		System.out.printf("%.2f%%\n", (((b - a) * 100) / a));
    }
}