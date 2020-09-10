import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int qntd = leitor.nextInt();
        for (int i = 0; i < qntd; i++) {
            String jog1 = leitor.next();
            String acao1 = leitor.next();
            String jog2 = leitor.next();
            String acao2 = leitor.next();
            String res;
            
            int val1 = leitor.nextInt();
            int val2 = leitor.nextInt();
            
            if ((val1 + val2) % 2 == 0) {
                res = "PAR";
            } 
            else {
                res = "IMPAR";
            }
            if (acao1.equals(res)) {
                System.out.println(jog1);
            } 
            else if (acao2.equals(res)) {
                System.out.println(jog2);
            } 
            else {
                System.out.println("EMPATE");
            }
        }
    }
}