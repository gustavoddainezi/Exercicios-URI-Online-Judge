import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int C = leitor.nextInt();
		char T = leitor.next().charAt(0);
		double soma = 0, media = 0;
		double[][] n = new double[12][12];

		for(int l = 0; l < 12; l++) {
			for(int c = 0; c < 12; c++) {
				n[l][c] = leitor.nextDouble();
			}
		}

		for(int i = 0; i < 12; i++){
			soma += n[i][C];
			if (n[i][C] != 0) {
				media++;
			}
		}
			
		if (T == 'S') {
			System.out.printf("%.1f\n", soma);
		}
		if (T == 'M') {
			System.out.printf("%.1f\n", soma / media);		
		}
    }
}