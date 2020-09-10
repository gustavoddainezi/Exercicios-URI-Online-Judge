import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        double b = 1, c, soma = 0;
        for(double i = 1; i < 101; i++)
        {
            c = 1 / i;
            soma += c;
        }
        System.out.printf("%.2f\n", soma);
    }
}