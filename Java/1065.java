import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int vet[] = new int[5];
        int somaPar = 0;
        
        for (int i = 0; i < 5; i++) {
            vet[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (vet[i] % 2 == 0) {
                somaPar++;
            }
        }
        System.out.println(somaPar + " valores pares");
    }
 
}