import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i, N;
        N = input.nextInt();
        System.out.print(n1 + " " + n2);
        for (i = 2; i < N; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("");
    }
 
}