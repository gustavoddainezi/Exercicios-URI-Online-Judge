import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
 
		String horaE = "";
		
		while(leitor.hasNext()){
			horaE = leitor.next();
			String[] entrada = horaE.split(":");
			int hora = Integer.parseInt(entrada[0]);
			int min = Integer.parseInt(entrada[1]);
			
			int total = hora * 60 + min;
			if (total <= 7 * 60) {
				System.out.println("Atraso maximo: 0");
			}
			else {
				System.out.printf("Atraso maximo: %d\n",((hora + 1) - 8) * 60 + min);
			}
		}
    }
}