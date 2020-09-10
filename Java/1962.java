import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            int t = leitor.nextInt();

            if (t < 2015) {
                System.out.printf("%s D.C.\n", (2015 - t));
            } 
            else {
                System.out.printf("%s A.C.\n", (t - 2014));
            }
        }
    }
}