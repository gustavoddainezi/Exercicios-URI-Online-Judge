import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int w[] = new int[10];
		int prim = leitor.nextInt();
		for (int j = 0; j < 10; j++){
			w[j] = prim;
			prim *= 2;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("N[%d] = %d\n", i, w[i]);		
		}
    }
}