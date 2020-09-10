import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        String f1 = leitor.next();
        String f2 = leitor.next();
        String f3 = leitor.next();
        
        if ("vertebrado".equals(f1)) {
            if ("ave".equals(f2)) {
                if ("carnivoro".equals(f3)) {
                    System.out.println("aguia");
                }
                else if ("onivoro".equals(f3)) {
                    System.out.println("pomba");
                }
            }
            else if ("mamifero".equals(f2)) {
                if ("onivoro".equals(f3)) {
                    System.out.println("homem");
                }
                else if ("herbivoro".equals(f3)) {
                    System.out.println("vaca");
                }
            }
        }
        else if ("invertebrado".equals(f1)) {
            if ("inseto".equals(f2)) {
                if ("hematofago".equals(f3)) {
                    System.out.println("pulga");
                }
                else if ("herbivoro".equals(f3)) {
                    System.out.println("lagarta");
                }
            }
            else if ("anelideo".equals(f2)) {
                if ("hematofago".equals(f3)) {
                    System.out.println("sanguessuga");
                }
                else if ("onivoro".equals(f3)) {
                    System.out.println("minhoca");
                }
            }
        }
    }
 
}