import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        Scanner ler = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        int[] R = new int[20];

        for (int i = 0; i < 10; i++) {
            X[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            Y[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            R[2 * i] = X[i];
            R[2 * i + 1] = Y[i];
        }

        for (int i : R) {
            System.out.print(i + " ");
        }
    }
}
