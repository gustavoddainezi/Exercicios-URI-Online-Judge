import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double vet[] = new double[6];
        int positivo = 0;
        
        for (int i = 0; i < 6; i++) {
            vet[i] = leitor.nextDouble();
        }
        
        for (int i = 0; i < 6; i++) {
            if (vet[i] > 0) {
                positivo++;
            }
        }
        System.out.println(positivo + " valores positivos");
    }
 
}