import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double triang = (a * c) / 2;
        double circ = (3.14159 * Math.pow(c, 2));
        double trap = ((a + b) / 2) * c;
        double quad = b * b;
        double ret = b * a;
        
        System.out.printf("TRIANGULO: %.3f\n"
                        + "CIRCULO: %.3f\n"
                        + "TRAPEZIO: %.3f\n"
                        + "QUADRADO: %.3f\n"
                        + "RETANGULO: %.3f\n", triang, circ, trap, quad, ret);
    }
 
}