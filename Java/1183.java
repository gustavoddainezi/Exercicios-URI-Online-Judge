import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int media = 0, l, c;
        char op = scn.next().charAt(0);
        double soma = 0.0;
        double[][] n = new double[12][12];

        for (l = 0; l < 12; l++) {
            for (c = 0; c < 12; c++) {
                n[l][c] = scn.nextDouble();
            }
        }

        for (l = 0; l < 12; l++) {
            for (c = 0; c < 12; c++) {
                if (c > l) {
                    soma += n[l][c];
                    if (n[l][c] != 0) {
                        media++;
                    }
                }
            }
        }

        if (op == 'S') {
            System.out.printf("%.1f\n", soma);
        }
        if (op == 'M') {
            System.out.printf("%.1f\n", soma / media);
        }

        scn.close();
    }
}
