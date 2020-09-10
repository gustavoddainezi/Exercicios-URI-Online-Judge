import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        int result;
        
        for (int i = 1; i <= 10; i++) {
            result = i * n;
            System.out.println(i + " x " + n + " = " + result);
        }
    }
 
}