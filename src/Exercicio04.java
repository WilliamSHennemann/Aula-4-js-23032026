import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Scanner ler = new Scanner(System.in);

        int[] A = new int[10];
        int[] M = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = ler.nextInt();
        }

        int X = ler.nextInt();

        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }

        for (int i : M) {
            System.out.print(i + " ");
        }
    }
}
