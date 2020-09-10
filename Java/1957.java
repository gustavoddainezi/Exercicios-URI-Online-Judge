import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String hexa = "";
        int n = leitor.nextInt();
        
        while (n != 0) {
            if (n % 16 < 10) {
                hexa = Integer.toString(n % 16) + hexa;
            } 
            else {
                hexa = (char) ((n % 16) + 55) + hexa;
            }
            n /= 16;
        }
        System.out.printf("%s\n", hexa);
    }
}