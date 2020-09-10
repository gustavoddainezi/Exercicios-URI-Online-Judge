import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        String nome = leitor.next();
        double salF = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double tot = salF + ((15 * vendas)/ 100);
        
        System.out.printf("TOTAL = R$ %.2f\n", tot);
    }
 
}