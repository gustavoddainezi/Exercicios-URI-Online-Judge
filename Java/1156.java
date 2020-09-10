import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        double soma = 1;
        double cont1 = 2;
        double cont2 = 3;
        while (cont2 < 40) {
            soma += (cont2 / cont1);
            cont1 *= 2;
            cont2 += 2;
        }
        System.out.printf("%.2f\n", soma);
    }
 
}