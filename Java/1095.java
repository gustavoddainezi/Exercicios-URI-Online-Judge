import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int I = 1, J = 60; J >= 0; I += 3, J -= 5) {
            System.out.print("I=" + I + " J=" + J + "\n");
        }
    }
}