import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        int fat = 1;
        
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        System.out.println(fat);
    }
 
}