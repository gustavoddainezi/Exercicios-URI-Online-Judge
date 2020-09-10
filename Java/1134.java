import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int X = 0, fuel = 0, alc = 0, gasol = 0, diesel = 0;
		while (X != 4) {
			X = leitor.nextInt();
			if (X == 1) {
				alc+=1;
			}
			else if (X == 2) {
				gasol += 1;
			}
			else if (X == 3) {
				diesel += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gasol);
		System.out.println("Diesel: " + diesel);
    }
}