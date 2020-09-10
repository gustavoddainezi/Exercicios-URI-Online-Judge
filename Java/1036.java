import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);
        double r1;
        double r2;
        
        if (a == 0 || delta <= 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            r1 = (- b + Math.sqrt(delta)) / (2 * a);
            r2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n" +
                              "R2 = %.5f\n" , r1, r2);
        }
    }
 
}