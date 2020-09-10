import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double m = ((a * 2) + (b * 3) + (c * 5)) / 10;
        
        System.out.printf("MEDIA = %.1f\n", m);
    }
 
}