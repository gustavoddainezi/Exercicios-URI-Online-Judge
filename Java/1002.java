import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double r, area;
        
        r = leitor.nextDouble();
        area = 3.14159 * Math.pow(r, 2);
            
        System.out.printf("A=%.4f\n", area);
    }
 
}