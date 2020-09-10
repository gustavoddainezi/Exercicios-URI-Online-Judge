import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int n, menor, pos = 0;
		n = leitor.nextInt();
		int[] t = new int[n];
		
		for (int i = 0; i < n; i++) {
			t[i] = leitor.nextInt();
		}
		
		menor = t[0];
		for (int i = 0; i < n; i++) {
			if (menor > t[i]){
				menor = t[i];
				pos = i;
			}
		}
		System.out.println(pos + 1);
    }
}