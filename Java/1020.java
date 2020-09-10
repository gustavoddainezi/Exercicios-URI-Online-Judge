import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int idadeDias = leitor.nextInt();
        int ano = idadeDias / 365;
        int mes = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;
        
        
        System.out.println(ano + " ano(s)\n" +
                           mes + " mes(es)\n" +
                          dias + " dia(s)");
    }
 
}