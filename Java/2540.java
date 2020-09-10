import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		while(leitor.hasNext()) {
			double doisterços;
			double cont = 0;
			int total = leitor.nextInt();
			for (int i = 0 ; i < total; i++) {
				if (leitor.nextInt() == 1) {
					cont++;
				}
			}
			doisterços = total * 0.6666666666666667;
			if(cont >= doisterços) {
				System.out.println("impeachment");
			}
			else {
				System.out.println("acusacao arquivada");
			}
		}
    }
}