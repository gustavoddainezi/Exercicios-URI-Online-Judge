import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int senha = 2002;

        while (true) {
            int teste = leitor.nextInt();
            if (teste != senha) {
                System.out.println("Senha Invalida");
            } 
            else if (teste == senha) {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}