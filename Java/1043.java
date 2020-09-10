import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        
        if (a + b > c && b + c > a && a + c > b) {
            System.out.printf("Perimetro = %.1f\n", (a + b + c));
        }
        else {
            System.out.printf("Area = %.1f\n", (c * (a + b) / 2));
        }
    }
 
}