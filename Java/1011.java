import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double r = leitor.nextDouble();
        double vol = (4.0 / 3) * 3.14159 * Math.pow(r, 3);
        
        System.out.printf("VOLUME = %.3f\n", vol);
    }
 
}