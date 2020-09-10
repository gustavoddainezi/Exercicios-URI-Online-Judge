import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        
        int duracao;
        int hInicio = a * 60 + b;
        int hFinal = c * 60 + d;
        
        if (a <= c) {
            duracao = hFinal - hInicio;
            if (duracao == 0) {
                System.out.printf("O JOGO DUROU 24 HORA(S) E %d MINUTO(S)\n", (duracao % 60));
            }
            else {
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", ((duracao - duracao % 60) / 60), (duracao % 60));
            }
        }
        else{
            duracao = (24 * 60 - hInicio) + hFinal;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", ((duracao - duracao % 60) / 60), (duracao % 60));
        }
    }
 
}