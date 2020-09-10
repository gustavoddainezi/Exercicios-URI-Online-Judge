import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int dist = leitor.nextInt();
        int temp = dist * 2;
        
        System.out.println(temp + " minutos");
    }
 
}