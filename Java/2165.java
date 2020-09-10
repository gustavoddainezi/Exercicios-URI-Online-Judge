import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		String texto = leitor.nextLine();
		if (texto.length() <= 140) {
			System.out.println("TWEET");
                }
        else {
			System.out.println("MUTE");
        }
    }
}