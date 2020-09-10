import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor =  new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int PROD = A * B;
        
        System.out.println("PROD = "+PROD);
    }
 
}