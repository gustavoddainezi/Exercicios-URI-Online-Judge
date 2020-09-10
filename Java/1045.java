import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double aux, a2, bMc2;

        if (b > a) {
            aux = a;
            a = b;
            b = aux;
        }
        if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }
        
        a2 = Math.pow(a, 2);
        bMc2 = Math.pow(b, 2) + Math.pow(c, 2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            if (a2 > bMc2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (a2 < bMc2) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            else {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }  
    }
 
}