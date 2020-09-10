import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
 		Scanner leitor = new Scanner(System.in);
        int x, y;
        x = leitor.nextInt(); 
        y = leitor.nextInt();
        for(int i = 1, j = 1; i <= y; i++, j++){
            if(j != x) {
                System.out.print(i + " ");
            }
            else {
                System.out.println(i);
                j = 0;
            }
        }
    }
}