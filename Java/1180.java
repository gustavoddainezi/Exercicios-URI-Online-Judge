import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);	

		int n = leitor.nextInt();
		int menor = 0, pos = 0;
		int x[] = new int[n];
		
		for (int i = 0; i < n; i++){
			x[i] = leitor.nextInt();
		}
		
		for (int j = 0; j < n; j++){
			if (x[j] < menor){
				menor = x[j];
				pos = j;
			}
		}
    	System.out.printf("Menor valor: %d\n", menor);
    	System.out.printf("Posicao: %d\n", pos);
    }
}