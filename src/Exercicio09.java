import java.util.Scanner;

public class Exercicio09 {
    static void main() {
        Scanner ler = new Scanner(System.in);

        int[] R = new int[5];
        int[] S = new int[10];
        int[] X = new int[15];

        for (int i = 0; i < 5; i++) {
            R[i] = ler.nextInt();
            X[i] = R[i];
        }

        for (int i = 0; i < 10; i++) {
            S[i] = ler.nextInt();
            X[i + 5] = S[i];
        }

        for (int i : X) {
            System.out.print(i + " ");
        }
    }
}
