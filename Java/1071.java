import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int X = input.nextInt();
        int Y = input.nextInt();
        int tot = 0;

        if (X > Y) {
            for (int i = X - 1; i > Y; i--) {
                if (i % 2 != 0) {
                    tot += i;
                }
            }
        } 
        else {
            for (int i = Y - 1; i > X; i--) {
                if (i % 2 != 0) {
                    tot += i;
                }
            }
        }

        System.out.println(tot);
    }
 
}