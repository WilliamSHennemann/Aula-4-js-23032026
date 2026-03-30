import java.util.Scanner;

public class Exercicio08 {
    static void main() {
        Scanner ler = new Scanner(System.in);

        int[] X = new int[10];
        int[] R = new int[10];
        int j = 0;

        for (int i = 0; i < 10; i++) {
            X[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (X[i] < 0) {
                R[j++] = X[i];
            }
        }

        System.out.println("Vetor X:");
        for (int i : X) {
            System.out.print(i + " ");
        }

        System.out.println("\nVetor R:");
        for (int i = 0; i < j; i++) {
            System.out.print(R[i] + " ");
        }
    }
}
