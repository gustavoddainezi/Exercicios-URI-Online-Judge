import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int mes = leitor.nextInt();
        
        if (mes == 1) {
            System.out.println("January");
        }
        else if (mes == 2) {
            System.out.println("February");
        }
        else if (mes == 3) {
            System.out.println("March");
        }
        else if (mes == 4) {
            System.out.println("April");
        }
        else if (mes == 5) {
            System.out.println("May");
        }
        else if (mes == 6) {
            System.out.println("June");
        }
        else if (mes == 7) {
            System.out.println("July");
        }
        else if (mes == 8) {
            System.out.println("August");
        }
        else if (mes == 9) {
            System.out.println("September");
        }
        else if (mes == 10) {
            System.out.println("October");
        }
        else if (mes == 11) {
            System.out.println("November");
        }
        else if (mes == 12) {
            System.out.println("December");
        }
    }
 
}