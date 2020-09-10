import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
		
		int musica1, musica2;
		int n = leitor.nextInt();

		for (int i = 0; i < n; i++){
			musica1 = leitor.nextInt();
			musica2 = leitor.nextInt();

			if(musica1 + musica2 == 0) {
				System.out.println("PROXYCITY");
			}
			else if (musica1+musica2 == 1) {
				System.out.println("P.Y.N.G.");
			}
			else if (musica1+musica2 == 2) {
				System.out.println("DNSUEY!");
			}
			else if (musica1+musica2 == 3) {
				System.out.println("SERVERS");
			}
			else if (musica1+musica2 == 4) {
				System.out.println("HOST!");
			}
			else if (musica1+musica2 == 5) {
				System.out.println("CRIPTONIZE");
			}
			else if (musica1+musica2 == 6) {
				System.out.println("OFFLINE DAY");
			}
			else if (musica1+musica2 == 7) {
				System.out.println("SALT");
			}
			else if (musica1+musica2 == 8) {
				System.out.println("ANSWER!");
			}
			else if (musica1+musica2 == 9) {
				System.out.println("RAR?");
			}
			else if (musica1+musica2 == 10) {
				System.out.println("WIFI ANTENNAS");
			}
		}
    }
 
}