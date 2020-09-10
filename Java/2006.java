import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int tipocha = leitor.nextInt();
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		int d = leitor.nextInt();
		int e = leitor.nextInt();
		
		int certos = 0;
		
		if (a == tipocha) {
			certos++;
		}
		if (b == tipocha) {
			certos++;
		}
		if (c == tipocha) {
			certos++;
		}
		if (d == tipocha) {
			certos++;
		}
		if (e == tipocha) {
			certos++;
		}
		System.out.println(certos);
    }
}