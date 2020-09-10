import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int n, x, y, aux, soma;
		n = leitor.nextInt();
		while (n > 0){
			x = leitor.nextInt();
			y = leitor.nextInt();
			soma = 0;
			
			if (x > y) {
				aux = x;
				x = y+1;
				y = aux;
			}
			else {
				x = x + 1;
			}
			
			while (x < y) {
				if (x % 2 != 0) {
					soma = soma + x;
				}
				x = x + 1;
			}
			n -= 1;
			System.out.println(soma);	
		}
    }
}