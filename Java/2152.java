import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int qntd = leitor.nextInt();
		int h, m, porta;
		for(int i = 0; i < qntd; i++){
			h = leitor.nextInt();
			m = leitor.nextInt();
			porta = leitor.nextInt();
			if(porta == 1) {
				System.out.printf("%02d:%02d - A porta abriu!\n", h, m);
			}
			else {
				System.out.printf("%02d:%02d - A porta fechou!\n", h, m);				
			}
		}
    }
}