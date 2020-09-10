import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		double x, aux;
		double n[] = new double[101];
		x = leitor.nextDouble();
		aux = x;
		for(int i = 0; i < 100; i++){
			n[i] = aux;
			aux = aux / 2; 
		}
				
		for (int j = 0; j < 100; j++) {
			System.out.printf("N[%d] = %.4f\n", j, n[j]);		
		}
    }
}