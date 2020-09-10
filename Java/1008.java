import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int numF = leitor.nextInt();
        int horasT = leitor.nextInt();
        double valorPH = leitor.nextDouble();
        double sal = valorPH * horasT;
        
        System.out.printf("NUMBER = " + numF + "\nSALARY = U$ %.2f\n", sal);
    }
 
}