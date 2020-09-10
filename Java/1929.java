import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if ((a < (b + c)) && (a > Math.abs(b - c))
                || (a < (b + d)) && (a > Math.abs(b - d))
                || (a < (c + d)) && (a > Math.abs(c - d))
                || (b < (a + c)) && (b > Math.abs(a - c))
                || (b < (a + d)) && (b > Math.abs(a - d))
                || (b < (c + d)) && (b > Math.abs(c - d))
                || (c < (a + b)) && (c > Math.abs(a - b))
                || (c < (a + d)) && (c > Math.abs(a - d))
                || (c < (b + d)) && (c > Math.abs(b - d))
                || (d < (a + b)) && (d > Math.abs(a - b))
                || (d < (a + c)) && (d > Math.abs(a - c))
                || (d < (b + c)) && (d > Math.abs(b - c))) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}