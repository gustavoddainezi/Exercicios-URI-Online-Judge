import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        do {
            int x = leitor.nextInt();
            int y = leitor.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            if (x >= 0 && y < 0) {
                System.out.println("quarto");
            }
            if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            if (x == 0 || y == 0) {
                break;
            }
        } while (leitor.nextLine() != null);
    }
}