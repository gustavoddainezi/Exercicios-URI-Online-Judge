import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int L = leitor.nextInt();
        char T = leitor.next().charAt(0);
        double som = 0, med = 0;
        double[][] n = new double[12][12];

        for (int l = 0; l < 12; l++) {
            for (int c = 0; c < 12; c++) {
                n[l][c] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            som += n[L][i];
            if (n[L][i] != 0) {
                med++;
            }
        }

        if (T == 'S') {
            System.out.println(som);
        }
        if (T == 'M') {
            System.out.println(som / med);
        }
    }
}