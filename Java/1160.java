import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int qntd = leitor.nextInt();
        for (int i = 0; i < qntd; i++) {
            int pa = leitor.nextInt();
            int pb = leitor.nextInt();
            double g1 = leitor.nextDouble();
            double g2 = leitor.nextDouble();
            int anos = 0;

            while (pa <= pb) {
                int cpa = (int) (pa * (g1 / 100));
                int cpb = (int) (pb * (g2 / 100));
                anos += 1;
                pa += cpa;
                pb += cpb;

                if (anos > 100) {
                    break;
                }
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } 
            else {
                System.out.printf("%d anos.\n", anos);
            }
        }
    }
 
}