import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int qntd = leitor.nextInt();

		for(int i = 0; i < qntd; i++){
			int valores = leitor.nextInt();
				if(valores % 2 == 0) {
					System.out.println("0");
				}
				else {	
					System.out.println("1");
				}
		}
    }
}