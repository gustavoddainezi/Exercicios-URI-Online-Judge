import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X, Y;
        while (((X = leitor.nextInt()) > 0 ) && ((Y = leitor.nextInt()) > 0 )) {
            int soma = 0;
            if (X > Y) {
                for (Y = Y; Y <= X; Y++) {
                    soma += Y;
                    System.out.print(Y + " ");
                }
                System.out.print("Sum=" + soma + "\n");
            }
            else {
                for (X = X; X <= Y; X++) {
                    soma+=X;
                    System.out.print(X + " ");
                }
                System.out.print("Sum=" + soma + "\n");
            }
        }
    }
}