import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            int x = leitor.nextInt();
            int y = leitor.nextInt();

            if (x > y) {
                System.out.println("Decrescente");
            } 
            else if (x < y) {
                System.out.println("Crescente");
            } 
            else if (x == y) {
                break;
            }
        }
    }
 
}