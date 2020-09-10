import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int t = Integer.parseInt(leitor.nextLine());
		for (int i = 0; i < t; i++) {
			String viloes = leitor.nextLine();
			if (!viloes.equals("Batman") && !viloes.equals("batman") && !viloes.equals("Batmain")) {
				System.out.println("Y");
			}
			else {
				System.out.println("N");
			}
		}
    }
}