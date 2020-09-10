import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		int i = 1;
		while (i <= 9){
			System.out.printf("I=%d J=7\n", i);
			System.out.printf("I=%d J=6\n", i);
			System.out.printf("I=%d J=5\n", i);
			i += 2;
		}
    }
}