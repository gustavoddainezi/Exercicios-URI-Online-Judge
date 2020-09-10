import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
         Scanner input = new Scanner(System.in);
        float n1, n2, n3, n4, media, nExame, mFinal;
        n1 = input.nextFloat();
        n2 = input.nextFloat();
        n3 = input.nextFloat();
        n4 = input.nextFloat();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (media >= 7.0) {

            System.out.printf("Media: %.1f\n", media);
            System.out.print("Aluno aprovado.\n");

        } else if (media >= 5.0 && media <= 6.9) {

            System.out.printf("Media: %.1f\n", media);
            System.out.print("Aluno em exame.\n");
            nExame = input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", nExame);
            mFinal = (media + nExame) / 2;

            if (mFinal >= 5.0) {
                System.out.print("Aluno aprovado.\n");

            } else {
                System.out.print("Aluno reprovado.\n");

            }

            System.out.printf("Media final: %.1f\n", mFinal);

        } else if (media < 5.0) {

            System.out.printf("Media: %.1f\n", media);
            System.out.print("Aluno reprovado.\n");

        }
    }
 
}