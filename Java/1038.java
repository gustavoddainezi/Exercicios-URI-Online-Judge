import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int cod = leitor.nextInt();
        int qntd = leitor.nextInt();
        double tot;
        
        if (cod == 1) {
            tot = qntd * 4.00;
            System.out.printf("Total: R$ %.2f\n", tot);
        }
        else if (cod == 2) {
            tot = qntd * 4.50;
            System.out.printf("Total: R$ %.2f\n", tot);
        }
        else if (cod == 3) {
            tot = qntd * 5.00;
            System.out.printf("Total: R$ %.2f\n", tot);
        }
        else if (cod == 4) {
            tot = qntd * 2.00;
            System.out.printf("Total: R$ %.2f\n", tot);
        }
        else if (cod == 5) {
            tot = qntd * 1.50;
            System.out.printf("Total: R$ %.2f\n", tot);
        }
    }
 
}