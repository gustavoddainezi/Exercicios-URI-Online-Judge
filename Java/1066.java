import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int val[] = new int[5];
        int valPar = 0;
        int valImpar = 0;
        int valPo = 0;
        int valNeg = 0;
        
        for (int i = 0; i < 5; i++) {
            val[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (val[i] % 2 == 0) {
                valPar++;
            }
            if (val[i] % 2 != 0) {
                valImpar++;
            }
            if (val[i] > 0) {
                valPo++;
            }
            if (val[i] < 0) {
                valNeg++;
            }
        }
        
        System.out.println(valPar + " valor(es) par(es)");
        System.out.println(valImpar + " valor(es) impar(es)");
        System.out.println(valPo + " valor(es) positivo(s)");
        System.out.println(valNeg + " valor(es) negativo(s)");
    }
 
}