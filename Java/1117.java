import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double somaNotas = 0;
        double nota = 0;
        
        while (cont < 2) {
            nota = leitor.nextDouble();
            if (nota > 10.0 || nota < 0.0) {
                System.out.println("nota invalida");
            } 
            else {
                cont++;
                somaNotas += nota;
            }
        }
        System.out.printf("media = %.2f\n", (somaNotas / 2));
    }
 
}