import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int w[] = new int[10];
		Vector<String> v = new Vector<String>(10);
		
		for (int aux = 0; aux < 10; aux++){
			w[aux] = leitor.nextInt();
			if (w[aux] <= 0) {
				w[aux] = 1;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("X[%d] = %d\n", i, w[i]);		
		}
    }
}