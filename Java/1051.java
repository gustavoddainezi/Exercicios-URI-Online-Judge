import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double sal = leitor.nextDouble();
        double imp = 0;
        double dif;
        
        if (sal > 4500) {
            imp = 1000 * 0.08 + 1500 * 0.18;
            dif = sal - 4500;
            imp += dif * 0.28;
        }
        else if (sal > 3000){
            imp = 1000 * 0.08;
            dif = sal - 3000;
            imp += dif * 0.18;
        }
        else if (sal > 2000) {
            dif = sal - 2000;
            imp = dif * 0.08;
        }
        if (imp > 0){
            System.out.printf("R$ %.2f\n" , imp);
        }
        else {
            System.out.println("Isento");
        }
    }
 
}