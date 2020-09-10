import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int x = leitor.nextInt();
        
        for (int i = 1; i <= x; i+=2) {
            System.out.println(i);
        }
    }
 
}