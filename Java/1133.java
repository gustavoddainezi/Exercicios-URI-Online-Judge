import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
		int X, Y;
		X = leitor.nextInt();
		Y = leitor.nextInt();
		
		if (X > Y) {
			for (int i = Y + 1; i < X; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		}
		else if(Y > X) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		}
    }
}