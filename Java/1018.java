import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int valor = leitor.nextInt();
        int cem = valor / 100;
        int cinq = (valor % 100)/ 50;
        int vinte = ((valor % 100) % 50) / 20;
        int dez = (((valor % 100) % 50) % 20) / 10;
        int cinco = ((((valor % 100) % 50) % 20) % 10) / 5;
        int dois = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        int um = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        
        System.out.println(valor + "\n" +
                             cem + " nota(s) de R$ 100,00\n" +
                            cinq + " nota(s) de R$ 50,00\n" +
                           vinte + " nota(s) de R$ 20,00\n" +
                             dez + " nota(s) de R$ 10,00\n" +
                           cinco + " nota(s) de R$ 5,00\n" +
                            dois + " nota(s) de R$ 2,00\n" +
                              um + " nota(s) de R$ 1,00");
    }
 
}