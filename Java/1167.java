import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qntd = leitor.nextInt();
        while (qntd != 0) {
            String lista[][] = new String[qntd][qntd];
            if (qntd != 1) {
                for (int i = qntd - 1; i != -1; i--) {
                    String nom = leitor.next();
                    String num = leitor.next();
                    lista[i][0] = nom;
                    lista[i][1] = num;
                }
                int i = lista.length - 1;
                int n = Integer.parseInt(lista[i][1]);
                int a = lista.length;

                while (a != 1) {
                    if (n % 2 == 0) {
                        i = ((n + i) % a);
                        n = Integer.parseInt(lista[i][1]);
                        for (int j = i; j < a - 1; j++) {
                            lista[j][0] = lista[j + 1][0];
                            lista[j][1] = lista[j + 1][1];
                        }
                        if (n % 2 == 0) {
                            i -= 1;
                        }
                    } else {
                        i = ((i - (n % a)) + a) % a;
                        n = Integer.parseInt(lista[i][1]);
                        for (int j = i; j < a - 1; j++) {
                            lista[j][0] = lista[j + 1][0];
                            lista[j][1] = lista[j + 1][1];
                        }
                        if (n % 2 == 0) {
                            i -= 1;
                        }
                    }
                    a--;
                }
            } else {
                String nome = leitor.next();
                String num = leitor.next();
                lista[0][0] = nome;
            }
            System.out.println("Vencedor(a): " + lista[0][0]);
            qntd = leitor.nextInt();
        }
    }
}
