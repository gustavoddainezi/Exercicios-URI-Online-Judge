import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double val[] = new double[6];
        double valPo = 0;
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            val[i] = leitor.nextDouble();
        }
        
        for (int i = 0; i < 6; i++) {
            if (val[i] > 0) {
                valPo += val[i];
                cont++;
            }
        }
        
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", (valPo / cont));
    }
 
}