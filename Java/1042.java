import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int x, y, z, m1, m2 = 0, m3 = 0;
        x = leitor.nextInt();
        y = leitor.nextInt();
        z = leitor.nextInt();

        m1 = Math.min(x, Math.min(y, z));
        if (m1 == x) {
            m2 = Math.min(y, z);
            m3 = Math.max(y, z);
        }
        if (m1 == y) {
            m2 = Math.min(x, z);
            m3 = Math.max(x, z);
        }
        if (m1 == z) {
            m2 = Math.min(x, y);
            m3 = Math.max(x, y);
        }
        System.out.print(m1 + "\n" + m2 + "\n" + m3 + "\n");
        System.out.print("\n" + x + "\n" + y + "\n" + z + "\n");
    }
 
}