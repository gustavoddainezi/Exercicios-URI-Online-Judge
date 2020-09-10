import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int dist = leitor.nextInt();
        double comb = leitor.nextDouble();
        double consumo = dist / comb;
        
        System.out.printf("%.3f km/l\n", consumo);
    }
 
}