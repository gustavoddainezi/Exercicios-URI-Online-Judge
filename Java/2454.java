import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int p = leitor.nextInt();
        int r = leitor.nextInt();
        if (p == 0) {
            System.out.println("C");
        }
        else if (p == 1 && r == 0) {
            System.out.println("B");
        }
        else if (p == 1 && r == 1) {
            System.out.println("A");
        }
    }
}