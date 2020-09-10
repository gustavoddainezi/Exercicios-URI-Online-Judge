import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int t = Integer.parseInt(leitor.nextLine());
		for(int i = 0; i < t; i++) {
			String sheldon = leitor.next();
			String raj = leitor.next();
			System.out.printf("Caso #%d: ", i + 1);
			if(sheldon.equals(raj)) {
				System.out.println("De novo!");
			}
			else if(sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) {
				System.out.println("Bazinga!");
			}
			else if(sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) {
				System.out.println("Bazinga!");
			}
			else if(sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) {
				System.out.println("Bazinga!");
			}
			else if(sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))) {
				System.out.println("Bazinga!");
			}
			else if(sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) {
				System.out.println("Bazinga!");
			}
			else {
				System.out.println("Raj trapaceou!");
			}
		}
    }
 
}