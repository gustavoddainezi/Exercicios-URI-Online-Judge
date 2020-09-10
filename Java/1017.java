import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int temp = leitor.nextInt();
        int vm = leitor.nextInt();
        double litros = (temp * vm) / 12.0;
        
        System.out.printf("%.3f\n", litros);
    }
 
}