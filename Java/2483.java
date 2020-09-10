import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int q = leitor.nextInt();
        
        System.out.print("Feliz nat");
        for(int i = 0; i < q; i++){
            System.out.print("a");
        }
        System.out.println("l!");
    }
 
}