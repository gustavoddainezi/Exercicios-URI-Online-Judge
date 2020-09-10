import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int qntd = leitor.nextInt();
        int n1[] = new int[qntd];
        int n2[] = new int[qntd];
        
        for (int i = 0; i < qntd; i++) {
            n1[i] = leitor.nextInt();
            n2[i] = leitor.nextInt();
            
            if (n2[i] != 0) {
                System.out.println((double)n1[i] / n2[i]);
            } 
            else {
                System.out.println("divisao impossivel");
            }
        }
    }
 
}