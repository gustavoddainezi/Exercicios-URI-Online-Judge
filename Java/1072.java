import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int v = leitor.nextInt();
        int val[] = new int[v];
        int in = 0;
        int out = 0;
        
        for (int i = 0; i < v; i++) {
            val[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < v; i++) {
            if (val[i] >= 10 && val[i] <= 20) {
                in++;
            }
            else {
                out++;
            }
        }
        System.out.println(in + " in\n"
                        + out + " out");
    }
 
}