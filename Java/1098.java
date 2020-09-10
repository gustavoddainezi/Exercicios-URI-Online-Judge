import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		double i = 0, j = 1;
		
		while (i <= 2.1){
			if (i == 0.0 || i == 1.0 || i > 1.8) {
				System.out.printf("I=%.0f J=%.0f\n", i, j);
				System.out.printf("I=%.0f J=%.0f\n", i, j+1);
				System.out.printf("I=%.0f J=%.0f\n", i, j+2);
			}
			else {
				System.out.printf("I=%.1f J=%.1f\n", i, j);
				System.out.printf("I=%.1f J=%.1f\n", i, j+1);
				System.out.printf("I=%.1f J=%.1f\n", i, j+2);
			}

			i = (i + 0.2);
			j = (j + 0.2);
		}
    }
}