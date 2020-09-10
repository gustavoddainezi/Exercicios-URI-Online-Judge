import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int prod1 = leitor.nextInt();
        int qntd1 = leitor.nextInt();
        double preco1 = leitor.nextDouble();
        int prod2 = leitor.nextInt();
        int qntd2 = leitor.nextInt();
        double preco2 = leitor.nextDouble();
        double tot = (qntd1 * preco1) + (qntd2 * preco2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", tot);
    }
 
}