import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int n = Integer.parseInt(leitor.next());
		String nome = "";
		double graudif = 0.0;
		List<Double> nota = new ArrayList<>();
		Double somanota = 0.0;
		for (int i = 0; i < n; i++) {
			nome = leitor.next();
			graudif = leitor.nextDouble();
			nota.add(leitor.nextDouble());
			nota.add(leitor.nextDouble());
			nota.add(leitor.nextDouble());
			nota.add(leitor.nextDouble());
			nota.add(leitor.nextDouble());
			nota.add(leitor.nextDouble());
			nota.add(leitor.nextDouble());
			Collections.sort(nota);
			nota.remove(0);
			nota.remove(5);
			for (Double valor:nota) {
				somanota += valor;
			}
			System.out.printf("%s %.2f\n", nome, somanota * graudif);
			somanota = 0.0;
			nota = new ArrayList<>();
		}
    }
}