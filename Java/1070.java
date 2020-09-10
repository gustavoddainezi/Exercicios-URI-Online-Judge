import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        
        for (int i = n; i <= (n + 11); i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
 
}