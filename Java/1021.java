import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0;
        double centavos, valor, m100 = 0, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
        valor = leitor.nextDouble();
        
        centavos = valor * 100;
        n100 = valor / 100.0;
        valor %= 100;
        n50 = valor / 50.0;
        valor %= 50;
        n20 = valor / 20.0;
        valor %= 20;
        n10 = valor / 10.0;
        valor %= 10;
        n5 = valor / 5.0;
        valor %= 5;
        n2 = valor / 2.0;
        valor %= 2;
        m100 = valor / 1.0;
        valor %= 1;
        centavos = centavos % 100;
        m50 = centavos / 50;
        centavos %= 50;
        m25 = centavos / 25;
        centavos %= 25;
        m10 = centavos / 10;
        centavos %= 10;
        m5 = centavos / 5;
        centavos %= 5;
        m1 = centavos;
        
        System.out.println("NOTAS:" + "\n" +
                          (int)n100 + " nota(s) de R$ 100.00\n" +
                          (int) n50 + " nota(s) de R$ 50.00\n" +
                          (int) n20 + " nota(s) de R$ 20.00\n" +
                          (int) n10 + " nota(s) de R$ 10.00\n" +
                          (int) n5 + " nota(s) de R$ 5.00\n" +
                          (int) n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:" + "\n" +
                          (int) m100 + " moeda(s) de R$ 1.00\n" +
                          (int) m50 + " moeda(s) de R$ 0.50\n" + 
                          (int) m25 + " moeda(s) de R$ 0.25\n" +
                          (int) m10 + " moeda(s) de R$ 0.10\n" +
                          (int) m5 + " moeda(s) de R$ 0.05\n" +
                          (int) m1 + " moeda(s) de R$ 0.01");
    }
 
}