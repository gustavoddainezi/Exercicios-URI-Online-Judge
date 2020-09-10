import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        BigDecimal a = new BigDecimal(leitor.nextBigInteger());
        BigDecimal b = new BigDecimal(leitor.nextBigInteger());
        BigDecimal c = a.add(b);
        System.out.println(c);
    }
}