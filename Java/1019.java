import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int valor = leitor.nextInt();
        int h = valor / 3600;
        int m = (valor % 3600) / 60;
        int s = (valor % 3600) % 60;

        
        System.out.printf("%d:%d:%d\n" , h, m, s);
    }
 
}