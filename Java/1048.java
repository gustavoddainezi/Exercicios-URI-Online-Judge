import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double sal = leitor.nextDouble();

        if (sal <= 400) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.15));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.15));
            System.out.println("Em percentual: 15 %");
        }
        
        if (sal > 400 && sal <= 800) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.12));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.12));
            System.out.println("Em percentual: 12 %");
        }
        
        if (sal > 800 && sal <= 1200) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.10));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.10));
            System.out.println("Em percentual: 10 %");
        }
        
        if (sal > 1200 & sal <= 2000) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.07));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.07));
            System.out.println("Em percentual: 7 %");
        }
        
        if (sal > 2000) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.04));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.04));
            System.out.println("Em percentual: 4 %");
        }
    }
 
}