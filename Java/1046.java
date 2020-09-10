import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int hInicio = leitor.nextInt();
        int hFim = leitor.nextInt();
        int tempo;
        
        if (hInicio > hFim) {
            tempo = 24 + hFim - hInicio;
        }
        else if (hFim > hInicio) {
            tempo = hFim - hInicio;
        }
        else {
            tempo = 24;
        }
        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
    }
 
}